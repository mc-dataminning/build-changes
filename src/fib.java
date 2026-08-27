import com.mojang.blaze3d.systems.RenderSystem;
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

public abstract class fib implements uz {
   private static final te g = te.c("disconnect.lost");
   protected final eqn a;
   protected final sf b;
   @Nullable
   protected final fin c;
   @Nullable
   protected String d;
   protected final gdf e;
   @Nullable
   protected final exv f;
   private final List<fib.a> h = new ArrayList<>();

   protected fib(eqn $$0, sf $$1, fii $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(vc $$0) {
      this.a(new vi($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(vd $$0) {
      uy.a($$0, this, this.a);
      this.b(new vj($$0.a()));
   }

   @Override
   public void a(va $$0) {
      vo $$1 = $$0.a();
      if (!($$1 instanceof vp)) {
         uy.a($$0, this, this.a);
         if ($$1 instanceof vn $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(vo var1);

   protected abstract ht.b f();

   @Override
   public void a(ve $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(vk.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fin.a.a) {
            this.a(vk.a.d);
            this.a(this.a.ab().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fin.a.c && (!$$3 || this.c.b() != fin.a.b)) {
            this.a(vk.a.b);
            if ($$3) {
               this.b.a(te.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable te $$3) {
      exv $$4 = this.a.z;
      this.a
         .a(
            new ewo(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fin.a.a);
                     }

                     this.a(vk.a.d);
                     this.a(this.a.ab().a($$0, $$1, true));
                  } else {
                     this.a(vk.a.b);
                     if ($$2) {
                        this.b.a(te.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fin.a.b);
                     }
                  }

                  if (this.c != null) {
                     fio.b(this.c);
                  }
               },
               $$2 ? te.c("multiplayer.requiredTexturePrompt.line1") : te.c("multiplayer.texturePrompt.line1"),
               a($$2 ? te.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : te.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? td.i : td.f,
               (te)($$2 ? te.c("menu.disconnect") : td.g)
            )
         );
   }

   private static te a(te $$0, @Nullable te $$1) {
      return (te)($$1 == null ? $$0 : te.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(vk.a.a)).exceptionally($$0x -> {
         this.a(vk.a.c);
         return null;
      });
   }

   @Override
   public void a(vf $$0) {
      uy.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(aeo<? extends hs<? extends T>> $$0, aqb.a $$1) {
      if (!$$1.a()) {
         hs<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<apy<T>, List<hf<T>>> $$4 = new HashMap<>();
         aqb.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(vk.a $$0) {
      this.b.a(new vk($$0));
   }

   @Override
   public void a(vb $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fib.a> $$0 = this.h.iterator();

      while ($$0.hasNext()) {
         fib.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(uw<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(te $$0) {
      this.e.c();
      this.a.b(this.b($$0));
   }

   protected exv b(te $$0) {
      exv $$1 = Objects.requireNonNullElseGet(this.f, () -> new far(new eya()));
      return (exv)(this.c != null && this.c.e() ? new gdz($$1, g, $$0) : new ewx($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(uw<? extends sr> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.h.add(new fib.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(uw<? extends sr> a, BooleanSupplier b, long c) {
   }
}
