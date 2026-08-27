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

public abstract class fll implements wr {
   private static final uv g = uv.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final eti a;
   protected final tw b;
   @Nullable
   protected final flz c;
   @Nullable
   protected String d;
   protected final ggy e;
   @Nullable
   protected final faz f;
   private final List<fll.a> i = new ArrayList<>();

   protected fll(eti $$0, tw $$1, fls $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(wu $$0) {
      this.a(new xb($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(wv $$0) {
      wq.a($$0, this, this.a);
      this.b(new xc($$0.a()));
   }

   @Override
   public void a(ws $$0) {
      xh $$1 = $$0.a();
      if (!($$1 instanceof xi)) {
         wq.a($$0, this, this.a);
         if ($$1 instanceof xg $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(xh var1);

   protected abstract it.b f();

   @Override
   public void a(ww $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(xd.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == flz.a.a) {
            this.a(xd.a.d);
            this.a(this.a.ab().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != flz.a.c && (!$$3 || this.c.b() != flz.a.b)) {
            this.a(xd.a.b);
            if ($$3) {
               this.b.a(uv.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable uv $$3) {
      faz $$4 = this.a.y;
      this.a
         .a(
            new ezs(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(flz.a.a);
                     }

                     this.a(xd.a.d);
                     this.a(this.a.ab().a($$0, $$1, true));
                  } else {
                     this.a(xd.a.b);
                     if ($$2) {
                        this.b.a(uv.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(flz.a.b);
                     }
                  }

                  if (this.c != null) {
                     fma.b(this.c);
                  }
               },
               $$2 ? uv.c("multiplayer.requiredTexturePrompt.line1") : uv.c("multiplayer.texturePrompt.line1"),
               a($$2 ? uv.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : uv.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? uu.i : uu.f,
               (uv)($$2 ? uv.c("menu.disconnect") : uu.g)
            )
         );
   }

   private static uv a(uv $$0, @Nullable uv $$1) {
      return (uv)($$1 == null ? $$0 : uv.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(xd.a.a)).exceptionally($$0x -> {
         this.a(xd.a.c);
         return null;
      });
   }

   @Override
   public void a(wx $$0) {
      wq.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(agl<? extends is<? extends T>> $$0, asc.a $$1) {
      if (!$$1.a()) {
         is<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<arz<T>, List<ig<T>>> $$4 = new HashMap<>();
         asc.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(xd.a $$0) {
      this.b.a(new xd($$0));
   }

   @Override
   public void a(wt $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fll.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fll.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(wo<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(uv $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected faz b(uv $$0) {
      faz $$1 = Objects.requireNonNullElseGet(this.f, () -> new fdx(new fbe()));
      return (faz)(this.c != null && this.c.e() ? new ghs($$1, g, $$0) : new fab($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(wo<? extends ui> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fll.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(wo<? extends ui> a, BooleanSupplier b, long c) {
   }
}
