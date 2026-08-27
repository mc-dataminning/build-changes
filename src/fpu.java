import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fpu implements yd {
   private static final vq i = vq.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final exh a;
   protected final uo b;
   @Nullable
   protected final fqi c;
   @Nullable
   protected String d;
   protected final glx e;
   @Nullable
   protected final ffe f;
   protected boolean g;
   private final List<fpu.a> k = new ArrayList<>();
   protected final Map<aiy, byte[]> h;

   protected fpu(exh $$0, uo $$1, fqb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(yg $$0) {
      this.a(new yr($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(yh $$0) {
      ya.a($$0, this, this.a);
      this.b(new ys($$0.b()));
   }

   @Override
   public void a(ye $$0) {
      yy $$1 = $$0.b();
      if (!($$1 instanceof yz)) {
         ya.a($$0, this, this.a);
         if ($$1 instanceof yw $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(yy var1);

   protected abstract iw.b f();

   @Override
   public void a(yj $$0) {
      ya.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new yt($$1, yt.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fqi.a $$5 = this.c != null ? this.c.b() : fqi.a.c;
         if ($$5 != fqi.a.c && (!$$4 || $$5 != fqi.a.b)) {
            this.a.ac().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h()));
         }
      }
   }

   @Override
   public void a(yi $$0) {
      ya.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ac().a($$0x), () -> this.a.ac().e());
   }

   static vq a(vq $$0, @Nullable vq $$1) {
      return (vq)($$1 == null ? $$0 : vq.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(aab $$0) {
      ya.a($$0, this, this.a);
      this.b.a(new aae($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(yk $$0) {
      ya.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(yl $$0) {
      ya.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(vq.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         frk $$1 = new frk($$0.b(), $$0.e());
         fdy.a(Objects.requireNonNullElseGet(this.f, ffj::new), this.a, $$1, this.c, false, new fql(this.h));
      }
   }

   @Override
   public void a(ym $$0) {
      ya.a($$0, this, this.a);
      $$0.b().forEach(this::a);
   }

   private <T> void a(aix<? extends iv<? extends T>> $$0, aur.a $$1) {
      if (!$$1.a()) {
         iv<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<auo<T>, List<ij<T>>> $$4 = new HashMap<>();
         aur.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   @Override
   public void a(yf $$0) {
      this.b.a($$0.b());
   }

   protected void g() {
      Iterator<fpu.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fpu.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(xx<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vq $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected ffe b(vq $$0) {
      ffe $$1 = Objects.requireNonNullElseGet(this.f, () -> new fic(new ffj()));
      return (ffe)(this.c != null && this.c.e() ? new gmr($$1, i, $$0) : new feg($$1, i, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(xx<? extends vc> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fpu.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private ffe a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vq $$4) {
      ffe $$5 = this.a.y;
      return $$5 instanceof fpu.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fpu.b(this.a, $$5, List.of(new fpu.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(xx<? extends vc> a, BooleanSupplier b, long c) {
   }

   class b extends fdx {
      private final List<fpu.b.a> l;
      @Nullable
      private final ffe m;

      b(exh $$0, @Nullable ffe $$1, List<fpu.b.a> $$2, boolean $$3, @Nullable vq $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gji $$6 = $$0.ac();
               if ($$5) {
                  if (fpu.this.c != null) {
                     fpu.this.c.a(fqi.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fpu.this.b.a(vq.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fpu.this.c != null) {
                     fpu.this.c.a(fqi.a.b);
                  }
               }

               for (fpu.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fpu.this.c != null) {
                  fqj.b(fpu.this.c);
               }
            },
            $$3 ? vq.c("multiplayer.requiredTexturePrompt.line1") : vq.c("multiplayer.texturePrompt.line1"),
            fpu.a($$3 ? vq.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vq.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? vp.i : vp.f,
            $$3 ? vp.p : vp.g
         );
         this.l = $$2;
         this.m = $$1;
      }

      public fpu.b a(exh $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable vq $$5) {
         List<fpu.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.l.size() + 1).addAll(this.l).add(new fpu.b.a($$1, $$2, $$3)).build();
         return fpu.this.new b($$0, this.m, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
