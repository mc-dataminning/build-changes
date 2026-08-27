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

public abstract class fiw implements vi {
   private static final tn g = tn.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final eqx a;
   protected final so b;
   @Nullable
   protected final fjj c;
   @Nullable
   protected String d;
   protected final gef e;
   @Nullable
   protected final eym f;
   private final List<fiw.a> i = new ArrayList<>();

   protected fiw(eqx $$0, so $$1, fjd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(vl $$0) {
      this.a(new vs($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(vm $$0) {
      vh.a($$0, this, this.a);
      this.b(new vt($$0.a()));
   }

   @Override
   public void a(vj $$0) {
      vy $$1 = $$0.a();
      if (!($$1 instanceof vz)) {
         vh.a($$0, this, this.a);
         if ($$1 instanceof vx $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(vy var1);

   protected abstract hu.b f();

   @Override
   public void a(vn $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(vu.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fjj.a.a) {
            this.a(vu.a.d);
            this.a(this.a.ac().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fjj.a.c && (!$$3 || this.c.b() != fjj.a.b)) {
            this.a(vu.a.b);
            if ($$3) {
               this.b.a(tn.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable tn $$3) {
      eym $$4 = this.a.y;
      this.a
         .a(
            new exf(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fjj.a.a);
                     }

                     this.a(vu.a.d);
                     this.a(this.a.ac().a($$0, $$1, true));
                  } else {
                     this.a(vu.a.b);
                     if ($$2) {
                        this.b.a(tn.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fjj.a.b);
                     }
                  }

                  if (this.c != null) {
                     fjk.b(this.c);
                  }
               },
               $$2 ? tn.c("multiplayer.requiredTexturePrompt.line1") : tn.c("multiplayer.texturePrompt.line1"),
               a($$2 ? tn.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : tn.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? tm.i : tm.f,
               (tn)($$2 ? tn.c("menu.disconnect") : tm.g)
            )
         );
   }

   private static tn a(tn $$0, @Nullable tn $$1) {
      return (tn)($$1 == null ? $$0 : tn.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(vu.a.a)).exceptionally($$0x -> {
         this.a(vu.a.c);
         return null;
      });
   }

   @Override
   public void a(vo $$0) {
      vh.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(aex<? extends ht<? extends T>> $$0, aqm.a $$1) {
      if (!$$1.a()) {
         ht<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<aqj<T>, List<hg<T>>> $$4 = new HashMap<>();
         aqm.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(vu.a $$0) {
      this.b.a(new vu($$0));
   }

   @Override
   public void a(vk $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fiw.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fiw.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(vf<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(tn $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected eym b(tn $$0) {
      eym $$1 = Objects.requireNonNullElseGet(this.f, () -> new fbi(new eyr()));
      return (eym)(this.c != null && this.c.e() ? new gez($$1, g, $$0) : new exo($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(vf<? extends ta> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fiw.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(vf<? extends ta> a, BooleanSupplier b, long c) {
   }
}
