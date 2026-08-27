import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fqb implements yd {
   private static final vq i = vq.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final exo a;
   protected final uo b;
   @Nullable
   protected final fqq c;
   @Nullable
   protected String d;
   protected final gmf e;
   @Nullable
   protected final ffl f;
   protected boolean g;
   private final List<fqb.a> k = new ArrayList<>();
   protected final Map<aiy, byte[]> h;

   protected fqb(exo $$0, uo $$1, fqi $$2) {
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
         fqq.a $$5 = this.c != null ? this.c.b() : fqq.a.c;
         if ($$5 != fqq.a.c && (!$$4 || $$5 != fqq.a.b)) {
            this.a.ad().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h()));
         }
      }
   }

   @Override
   public void a(yi $$0) {
      ya.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ad().a($$0x), () -> this.a.ad().e());
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
         frs $$1 = new frs($$0.b(), $$0.e());
         fef.a(Objects.requireNonNullElseGet(this.f, ffq::new), this.a, $$1, this.c, false, new fqt(this.h));
      }
   }

   @Override
   public void a(yf $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fqb.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fqb.a $$1 = $$0.next();
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

   protected ffl b(vq $$0) {
      ffl $$1 = Objects.requireNonNullElseGet(this.f, () -> new fij(new ffq()));
      return (ffl)(this.c != null && this.c.e() ? new gmz($$1, i, $$0) : new fen($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(xx<? extends vc> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fqb.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private ffl a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vq $$4) {
      ffl $$5 = this.a.y;
      return $$5 instanceof fqb.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fqb.b(this.a, $$5, List.of(new fqb.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(xx<? extends vc> a, BooleanSupplier b, long c) {
   }

   class b extends fee {
      private final List<fqb.b.a> l;
      @Nullable
      private final ffl m;

      b(exo $$0, @Nullable ffl $$1, List<fqb.b.a> $$2, boolean $$3, @Nullable vq $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gjq $$6 = $$0.ad();
               if ($$5) {
                  if (fqb.this.c != null) {
                     fqb.this.c.a(fqq.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fqb.this.b.a(vq.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fqb.this.c != null) {
                     fqb.this.c.a(fqq.a.b);
                  }
               }

               for (fqb.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fqb.this.c != null) {
                  fqr.b(fqb.this.c);
               }
            },
            $$3 ? vq.c("multiplayer.requiredTexturePrompt.line1") : vq.c("multiplayer.texturePrompt.line1"),
            fqb.a($$3 ? vq.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vq.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? vp.i : vp.f,
            $$3 ? vp.p : vp.g
         );
         this.l = $$2;
         this.m = $$1;
      }

      public fqb.b a(exo $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable vq $$5) {
         List<fqb.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.l.size() + 1).addAll(this.l).add(new fqb.b.a($$1, $$2, $$3)).build();
         return fqb.this.new b($$0, this.m, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
