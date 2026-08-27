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
import java.util.concurrent.CompletableFuture;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fnh implements xg {
   private static final vd g = vd.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final eva a;
   protected final ue b;
   @Nullable
   protected final fnv c;
   @Nullable
   protected String d;
   protected final gje e;
   @Nullable
   protected final fct f;
   private final List<fnh.a> i = new ArrayList<>();

   protected fnh(eva $$0, ue $$1, fno $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(xj $$0) {
      this.a(new xq($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(xk $$0) {
      xf.a($$0, this, this.a);
      this.b(new xr($$0.a()));
   }

   @Override
   public void a(xh $$0) {
      xx $$1 = $$0.a();
      if (!($$1 instanceof xy)) {
         xf.a($$0, this, this.a);
         if ($$1 instanceof xv $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(xx var1);

   protected abstract iu.b f();

   @Override
   public void a(xl $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(xs.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fnv.a.a) {
            this.a(xs.a.d);
            this.a(this.a.ab().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fnv.a.c && (!$$3 || this.c.b() != fnv.a.b)) {
            this.a(xs.a.b);
            if ($$3) {
               this.b.a(vd.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable vd $$3) {
      fct $$4 = this.a.y;
      this.a
         .a(
            new fbm(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fnv.a.a);
                     }

                     this.a(xs.a.d);
                     this.a(this.a.ab().a($$0, $$1, true));
                  } else {
                     this.a(xs.a.b);
                     if ($$2) {
                        this.b.a(vd.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fnv.a.b);
                     }
                  }

                  if (this.c != null) {
                     fnw.b(this.c);
                  }
               },
               $$2 ? vd.c("multiplayer.requiredTexturePrompt.line1") : vd.c("multiplayer.texturePrompt.line1"),
               a($$2 ? vd.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vd.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? vc.i : vc.f,
               (vd)($$2 ? vd.c("menu.disconnect") : vc.g)
            )
         );
   }

   private static vd a(vd $$0, @Nullable vd $$1) {
      return (vd)($$1 == null ? $$0 : vd.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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

   private void a(CompletableFuture<?> $$0) {
      $$0.thenRun(() -> this.a(xs.a.a)).exceptionally($$0x -> {
         this.a(xs.a.c);
         return null;
      });
   }

   @Override
   public void a(xm $$0) {
      xf.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(ahc<? extends it<? extends T>> $$0, ast.a $$1) {
      if (!$$1.a()) {
         it<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<asq<T>, List<ih<T>>> $$4 = new HashMap<>();
         ast.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(xs.a $$0) {
      this.b.a(new xs($$0));
   }

   @Override
   public void a(xi $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fnh.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fnh.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(xd<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vd $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected fct b(vd $$0) {
      fct $$1 = Objects.requireNonNullElseGet(this.f, () -> new ffr(new fcy()));
      return (fct)(this.c != null && this.c.e() ? new gjy($$1, g, $$0) : new fbv($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(xd<? extends uq> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fnh.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(xd<? extends uq> a, BooleanSupplier b, long c) {
   }
}
