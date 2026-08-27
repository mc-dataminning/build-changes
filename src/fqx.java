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

public abstract class fqx implements yf {
   private static final vs i = vs.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final eyk a;
   protected final uq b;
   @Nullable
   protected final frn c;
   @Nullable
   protected String d;
   protected final gnd e;
   @Nullable
   protected final fgh f;
   protected boolean g;
   private final List<fqx.a> k = new ArrayList<>();
   protected final Map<ajc, byte[]> h;

   protected fqx(eyk $$0, uq $$1, fre $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(yi $$0) {
      this.a(new yt($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(yj $$0) {
      yc.a($$0, this, this.a);
      this.b(new yu($$0.b()));
   }

   @Override
   public void a(yg $$0) {
      za $$1 = $$0.b();
      if (!($$1 instanceof zb)) {
         yc.a($$0, this, this.a);
         if ($$1 instanceof yy $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(za var1);

   @Override
   public void a(yl $$0) {
      yc.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new yv($$1, yv.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         frn.a $$5 = this.c != null ? this.c.b() : frn.a.c;
         if ($$5 != frn.a.c && (!$$4 || $$5 != frn.a.b)) {
            this.a.ad().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(yk $$0) {
      yc.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ad().a($$0x), () -> this.a.ad().e());
   }

   static vs a(vs $$0, @Nullable vs $$1) {
      return (vs)($$1 == null ? $$0 : vs.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(aad $$0) {
      yc.a($$0, this, this.a);
      this.b.a(new aag($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(ym $$0) {
      yc.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(yn $$0) {
      yc.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(vs.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fsp $$1 = new fsp($$0.b(), $$0.e());
         ffb.a(Objects.requireNonNullElseGet(this.f, fgm::new), this.a, $$1, this.c, false, new frq(this.h));
      }
   }

   @Override
   public void a(yh $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fqx.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fqx.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(xz<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vs $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fgh b(vs $$0) {
      fgh $$1 = Objects.requireNonNullElseGet(this.f, () -> new fjf(new fgm()));
      return (fgh)(this.c != null && this.c.e() ? new gnx($$1, i, $$0) : new ffj($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(xz<? extends ve> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fqx.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fgh a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vs $$4) {
      fgh $$5 = this.a.y;
      return $$5 instanceof fqx.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fqx.b(this.a, $$5, List.of(new fqx.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(xz<? extends ve> a, BooleanSupplier b, long c) {
   }

   class b extends ffa {
      private final List<fqx.b.a> l;
      @Nullable
      private final fgh m;

      b(eyk $$0, @Nullable fgh $$1, List<fqx.b.a> $$2, boolean $$3, @Nullable vs $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gko $$6 = $$0.ad();
               if ($$5) {
                  if (fqx.this.c != null) {
                     fqx.this.c.a(frn.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fqx.this.b.a(vs.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fqx.this.c != null) {
                     fqx.this.c.a(frn.a.b);
                  }
               }

               for (fqx.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fqx.this.c != null) {
                  fro.b(fqx.this.c);
               }
            },
            $$3 ? vs.c("multiplayer.requiredTexturePrompt.line1") : vs.c("multiplayer.texturePrompt.line1"),
            fqx.a($$3 ? vs.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vs.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? vr.i : vr.f,
            $$3 ? vr.p : vr.g
         );
         this.l = $$2;
         this.m = $$1;
      }

      public fqx.b a(eyk $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable vs $$5) {
         List<fqx.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.l.size() + 1).addAll(this.l).add(new fqx.b.a($$1, $$2, $$3)).build();
         return fqx.this.new b($$0, this.m, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
