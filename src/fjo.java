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

public abstract class fjo implements we {
   private static final ui g = ui.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final ero a;
   protected final tj b;
   @Nullable
   protected final fkc c;
   @Nullable
   protected String d;
   protected final gez e;
   @Nullable
   protected final ezd f;
   private final List<fjo.a> i = new ArrayList<>();

   protected fjo(ero $$0, tj $$1, fjv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(wh $$0) {
      this.a(new wo($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(wi $$0) {
      wd.a($$0, this, this.a);
      this.b(new wp($$0.a()));
   }

   @Override
   public void a(wf $$0) {
      wu $$1 = $$0.a();
      if (!($$1 instanceof wv)) {
         wd.a($$0, this, this.a);
         if ($$1 instanceof wt $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(wu var1);

   protected abstract ip.b f();

   @Override
   public void a(wj $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(wq.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fkc.a.a) {
            this.a(wq.a.d);
            this.a(this.a.ac().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fkc.a.c && (!$$3 || this.c.b() != fkc.a.b)) {
            this.a(wq.a.b);
            if ($$3) {
               this.b.a(ui.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable ui $$3) {
      ezd $$4 = this.a.y;
      this.a
         .a(
            new exx(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fkc.a.a);
                     }

                     this.a(wq.a.d);
                     this.a(this.a.ac().a($$0, $$1, true));
                  } else {
                     this.a(wq.a.b);
                     if ($$2) {
                        this.b.a(ui.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fkc.a.b);
                     }
                  }

                  if (this.c != null) {
                     fkd.b(this.c);
                  }
               },
               $$2 ? ui.c("multiplayer.requiredTexturePrompt.line1") : ui.c("multiplayer.texturePrompt.line1"),
               a($$2 ? ui.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : ui.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? uh.i : uh.f,
               (ui)($$2 ? ui.c("menu.disconnect") : uh.g)
            )
         );
   }

   private static ui a(ui $$0, @Nullable ui $$1) {
      return (ui)($$1 == null ? $$0 : ui.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(wq.a.a)).exceptionally($$0x -> {
         this.a(wq.a.c);
         return null;
      });
   }

   @Override
   public void a(wk $$0) {
      wd.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(afv<? extends io<? extends T>> $$0, ark.a $$1) {
      if (!$$1.a()) {
         io<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<arh<T>, List<ib<T>>> $$4 = new HashMap<>();
         ark.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(wq.a $$0) {
      this.b.a(new wq($$0));
   }

   @Override
   public void a(wg $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fjo.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fjo.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(wb<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(ui $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected ezd b(ui $$0) {
      ezd $$1 = Objects.requireNonNullElseGet(this.f, () -> new fca(new ezi()));
      return (ezd)(this.c != null && this.c.e() ? new gft($$1, g, $$0) : new eyg($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(wb<? extends tv> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fjo.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(wb<? extends tv> a, BooleanSupplier b, long c) {
   }
}
