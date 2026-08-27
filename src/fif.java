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

public abstract class fif implements va {
   private static final tf g = tf.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final eqm a;
   protected final sg b;
   @Nullable
   protected final fis c;
   @Nullable
   protected String d;
   protected final gdk e;
   @Nullable
   protected final exz f;
   private final List<fif.a> i = new ArrayList<>();

   protected fif(eqm $$0, sg $$1, fim $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(vd $$0) {
      this.a(new vj($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(ve $$0) {
      uz.a($$0, this, this.a);
      this.b(new vk($$0.a()));
   }

   @Override
   public void a(vb $$0) {
      vp $$1 = $$0.a();
      if (!($$1 instanceof vq)) {
         uz.a($$0, this, this.a);
         if ($$1 instanceof vo $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(vp var1);

   protected abstract hs.b f();

   @Override
   public void a(vf $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(vl.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fis.a.a) {
            this.a(vl.a.d);
            this.a(this.a.ac().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fis.a.c && (!$$3 || this.c.b() != fis.a.b)) {
            this.a(vl.a.b);
            if ($$3) {
               this.b.a(tf.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable tf $$3) {
      exz $$4 = this.a.B;
      this.a
         .a(
            new ews(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fis.a.a);
                     }

                     this.a(vl.a.d);
                     this.a(this.a.ac().a($$0, $$1, true));
                  } else {
                     this.a(vl.a.b);
                     if ($$2) {
                        this.b.a(tf.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fis.a.b);
                     }
                  }

                  if (this.c != null) {
                     fit.b(this.c);
                  }
               },
               $$2 ? tf.c("multiplayer.requiredTexturePrompt.line1") : tf.c("multiplayer.texturePrompt.line1"),
               a($$2 ? tf.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : tf.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? te.i : te.f,
               (tf)($$2 ? tf.c("menu.disconnect") : te.g)
            )
         );
   }

   private static tf a(tf $$0, @Nullable tf $$1) {
      return (tf)($$1 == null ? $$0 : tf.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(vl.a.a)).exceptionally($$0x -> {
         this.a(vl.a.c);
         return null;
      });
   }

   @Override
   public void a(vg $$0) {
      uz.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(aeq<? extends hr<? extends T>> $$0, aqd.a $$1) {
      if (!$$1.a()) {
         hr<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<aqa<T>, List<he<T>>> $$4 = new HashMap<>();
         aqd.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(vl.a $$0) {
      this.b.a(new vl($$0));
   }

   @Override
   public void a(vc $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fif.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fif.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(ux<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(tf $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected exz b(tf $$0) {
      exz $$1 = Objects.requireNonNullElseGet(this.f, () -> new fav(new eye()));
      return (exz)(this.c != null && this.c.e() ? new gee($$1, g, $$0) : new exb($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(ux<? extends ss> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fif.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(ux<? extends ss> a, BooleanSupplier b, long c) {
   }
}
