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

public abstract class flg implements wn {
   private static final ur g = ur.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final etd a;
   protected final ts b;
   @Nullable
   protected final flu c;
   @Nullable
   protected String d;
   protected final ggt e;
   @Nullable
   protected final fau f;
   private final List<flg.a> i = new ArrayList<>();

   protected flg(etd $$0, ts $$1, fln $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(wq $$0) {
      this.a(new wx($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(wr $$0) {
      wm.a($$0, this, this.a);
      this.b(new wy($$0.a()));
   }

   @Override
   public void a(wo $$0) {
      xd $$1 = $$0.a();
      if (!($$1 instanceof xe)) {
         wm.a($$0, this, this.a);
         if ($$1 instanceof xc $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(xd var1);

   protected abstract ip.b f();

   @Override
   public void a(ws $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(wz.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == flu.a.a) {
            this.a(wz.a.d);
            this.a(this.a.ab().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != flu.a.c && (!$$3 || this.c.b() != flu.a.b)) {
            this.a(wz.a.b);
            if ($$3) {
               this.b.a(ur.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable ur $$3) {
      fau $$4 = this.a.y;
      this.a
         .a(
            new ezn(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(flu.a.a);
                     }

                     this.a(wz.a.d);
                     this.a(this.a.ab().a($$0, $$1, true));
                  } else {
                     this.a(wz.a.b);
                     if ($$2) {
                        this.b.a(ur.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(flu.a.b);
                     }
                  }

                  if (this.c != null) {
                     flv.b(this.c);
                  }
               },
               $$2 ? ur.c("multiplayer.requiredTexturePrompt.line1") : ur.c("multiplayer.texturePrompt.line1"),
               a($$2 ? ur.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : ur.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? uq.i : uq.f,
               (ur)($$2 ? ur.c("menu.disconnect") : uq.g)
            )
         );
   }

   private static ur a(ur $$0, @Nullable ur $$1) {
      return (ur)($$1 == null ? $$0 : ur.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(wz.a.a)).exceptionally($$0x -> {
         this.a(wz.a.c);
         return null;
      });
   }

   @Override
   public void a(wt $$0) {
      wm.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(agh<? extends io<? extends T>> $$0, ary.a $$1) {
      if (!$$1.a()) {
         io<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<arv<T>, List<ib<T>>> $$4 = new HashMap<>();
         ary.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(wz.a $$0) {
      this.b.a(new wz($$0));
   }

   @Override
   public void a(wp $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<flg.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         flg.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(wk<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(ur $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected fau b(ur $$0) {
      fau $$1 = Objects.requireNonNullElseGet(this.f, () -> new fds(new faz()));
      return (fau)(this.c != null && this.c.e() ? new ghn($$1, g, $$0) : new ezw($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(wk<? extends ue> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new flg.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(wk<? extends ue> a, BooleanSupplier b, long c) {
   }
}
