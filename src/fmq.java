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

public abstract class fmq implements wx {
   private static final vb g = vb.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final euk a;
   protected final uc b;
   @Nullable
   protected final fne c;
   @Nullable
   protected String d;
   protected final gin e;
   @Nullable
   protected final fcc f;
   private final List<fmq.a> i = new ArrayList<>();

   protected fmq(euk $$0, uc $$1, fmx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(xa $$0) {
      this.a(new xh($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(xb $$0) {
      ww.a($$0, this, this.a);
      this.b(new xi($$0.a()));
   }

   @Override
   public void a(wy $$0) {
      xo $$1 = $$0.a();
      if (!($$1 instanceof xp)) {
         ww.a($$0, this, this.a);
         if ($$1 instanceof xm $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(xo var1);

   protected abstract is.b f();

   @Override
   public void a(xc $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(xj.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fne.a.a) {
            this.a(xj.a.d);
            this.a(this.a.ab().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fne.a.c && (!$$3 || this.c.b() != fne.a.b)) {
            this.a(xj.a.b);
            if ($$3) {
               this.b.a(vb.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable vb $$3) {
      fcc $$4 = this.a.y;
      this.a
         .a(
            new fav(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fne.a.a);
                     }

                     this.a(xj.a.d);
                     this.a(this.a.ab().a($$0, $$1, true));
                  } else {
                     this.a(xj.a.b);
                     if ($$2) {
                        this.b.a(vb.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fne.a.b);
                     }
                  }

                  if (this.c != null) {
                     fnf.b(this.c);
                  }
               },
               $$2 ? vb.c("multiplayer.requiredTexturePrompt.line1") : vb.c("multiplayer.texturePrompt.line1"),
               a($$2 ? vb.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vb.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? va.i : va.f,
               (vb)($$2 ? vb.c("menu.disconnect") : va.g)
            )
         );
   }

   private static vb a(vb $$0, @Nullable vb $$1) {
      return (vb)($$1 == null ? $$0 : vb.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(xj.a.a)).exceptionally($$0x -> {
         this.a(xj.a.c);
         return null;
      });
   }

   @Override
   public void a(xd $$0) {
      ww.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(ags<? extends ir<? extends T>> $$0, asj.a $$1) {
      if (!$$1.a()) {
         ir<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<asg<T>, List<ie<T>>> $$4 = new HashMap<>();
         asj.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(xj.a $$0) {
      this.b.a(new xj($$0));
   }

   @Override
   public void a(wz $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fmq.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fmq.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(wu<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vb $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected fcc b(vb $$0) {
      fcc $$1 = Objects.requireNonNullElseGet(this.f, () -> new ffa(new fch()));
      return (fcc)(this.c != null && this.c.e() ? new gjh($$1, g, $$0) : new fbe($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(wu<? extends uo> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fmq.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(wu<? extends uo> a, BooleanSupplier b, long c) {
   }
}
