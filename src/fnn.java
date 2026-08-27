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

public abstract class fnn implements xi {
   private static final vf g = vf.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final evg a;
   protected final ug b;
   @Nullable
   protected final fob c;
   @Nullable
   protected String d;
   protected final gjp e;
   @Nullable
   protected final fcz f;
   private final List<fnn.a> i = new ArrayList<>();

   protected fnn(evg $$0, ug $$1, fnu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(xl $$0) {
      this.a(new xt($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(xm $$0) {
      xh.a($$0, this, this.a);
      this.b(new xu($$0.a()));
   }

   @Override
   public void a(xj $$0) {
      ya $$1 = $$0.a();
      if (!($$1 instanceof yb)) {
         xh.a($$0, this, this.a);
         if ($$1 instanceof xy $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(ya var1);

   protected abstract iu.b f();

   @Override
   public void a(xo $$0) {
      xh.a($$0, this, this.a);
      UUID $$1 = $$0.a();
      URL $$2 = a($$0.d());
      if ($$2 == null) {
         this.b.a(new xv($$1, xv.a.e));
      } else {
         String $$3 = $$0.e();
         boolean $$4 = $$0.f();
         if (this.c != null && this.c.b() != fob.a.c && (!$$4 || this.c.b() != fob.a.b)) {
            this.a.ac().a($$1, $$2, $$3);
         } else {
            this.a($$1, $$2, $$3, $$4, $$0.g());
         }
      }
   }

   @Override
   public void a(xn $$0) {
      xh.a($$0, this, this.a);
      $$0.a().ifPresentOrElse($$0x -> this.a.ac().a($$0x), () -> this.a.ac().e());
   }

   private void a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vf $$4) {
      fcz $$5 = this.a.y;
      this.a
         .a(
            new fbs(
               $$5x -> {
                  this.a.a($$5);
                  gha $$6 = this.a.ac();
                  $$6.a($$0, $$1, $$2);
                  if ($$5x) {
                     if (this.c != null) {
                        this.c.a(fob.a.a);
                     }

                     $$6.g();
                  } else {
                     $$6.h();
                     if ($$3) {
                        this.b.a(vf.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fob.a.b);
                     }
                  }

                  if (this.c != null) {
                     foc.b(this.c);
                  }
               },
               $$3 ? vf.c("multiplayer.requiredTexturePrompt.line1") : vf.c("multiplayer.texturePrompt.line1"),
               a($$3 ? vf.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vf.c("multiplayer.texturePrompt.line2"), $$4),
               $$3 ? ve.i : ve.f,
               (vf)($$3 ? vf.c("menu.disconnect") : ve.g)
            )
         );
   }

   private static vf a(vf $$0, @Nullable vf $$1) {
      return (vf)($$1 == null ? $$0 : vf.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(xp $$0) {
      xh.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(ahf<? extends it<? extends T>> $$0, asy.a $$1) {
      if (!$$1.a()) {
         it<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<asv<T>, List<ih<T>>> $$4 = new HashMap<>();
         asy.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   @Override
   public void a(xk $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fnn.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fnn.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(xf<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vf $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected fcz b(vf $$0) {
      fcz $$1 = Objects.requireNonNullElseGet(this.f, () -> new ffx(new fde()));
      return (fcz)(this.c != null && this.c.e() ? new gkj($$1, g, $$0) : new fcb($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(xf<? extends us> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fnn.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(xf<? extends us> a, BooleanSupplier b, long c) {
   }
}
