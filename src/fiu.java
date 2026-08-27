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

public abstract class fiu implements vg {
   private static final tl g = tl.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final eqv a;
   protected final sm b;
   @Nullable
   protected final fjh c;
   @Nullable
   protected String d;
   protected final ged e;
   @Nullable
   protected final eyk f;
   private final List<fiu.a> i = new ArrayList<>();

   protected fiu(eqv $$0, sm $$1, fjb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(vj $$0) {
      this.a(new vq($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(vk $$0) {
      vf.a($$0, this, this.a);
      this.b(new vr($$0.a()));
   }

   @Override
   public void a(vh $$0) {
      vw $$1 = $$0.a();
      if (!($$1 instanceof vx)) {
         vf.a($$0, this, this.a);
         if ($$1 instanceof vv $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(vw var1);

   protected abstract hu.b f();

   @Override
   public void a(vl $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(vs.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fjh.a.a) {
            this.a(vs.a.d);
            this.a(this.a.ac().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fjh.a.c && (!$$3 || this.c.b() != fjh.a.b)) {
            this.a(vs.a.b);
            if ($$3) {
               this.b.a(tl.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable tl $$3) {
      eyk $$4 = this.a.y;
      this.a
         .a(
            new exd(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fjh.a.a);
                     }

                     this.a(vs.a.d);
                     this.a(this.a.ac().a($$0, $$1, true));
                  } else {
                     this.a(vs.a.b);
                     if ($$2) {
                        this.b.a(tl.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fjh.a.b);
                     }
                  }

                  if (this.c != null) {
                     fji.b(this.c);
                  }
               },
               $$2 ? tl.c("multiplayer.requiredTexturePrompt.line1") : tl.c("multiplayer.texturePrompt.line1"),
               a($$2 ? tl.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : tl.c("multiplayer.texturePrompt.line2"), $$3),
               $$2 ? tk.i : tk.f,
               (tl)($$2 ? tl.c("menu.disconnect") : tk.g)
            )
         );
   }

   private static tl a(tl $$0, @Nullable tl $$1) {
      return (tl)($$1 == null ? $$0 : tl.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
      $$0.thenRun(() -> this.a(vs.a.a)).exceptionally($$0x -> {
         this.a(vs.a.c);
         return null;
      });
   }

   @Override
   public void a(vm $$0) {
      vf.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(aew<? extends ht<? extends T>> $$0, aql.a $$1) {
      if (!$$1.a()) {
         ht<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<aqi<T>, List<hg<T>>> $$4 = new HashMap<>();
         aql.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(vs.a $$0) {
      this.b.a(new vs($$0));
   }

   @Override
   public void a(vi $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fiu.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fiu.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(vd<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(tl $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected eyk b(tl $$0) {
      eyk $$1 = Objects.requireNonNullElseGet(this.f, () -> new fbg(new eyp()));
      return (eyk)(this.c != null && this.c.e() ? new gex($$1, g, $$0) : new exm($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(vd<? extends sy> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fiu.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(vd<? extends sy> a, BooleanSupplier b, long c) {
   }
}
