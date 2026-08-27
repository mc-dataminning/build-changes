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

public abstract class fip implements vh {
   private static final tl g = tl.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final eqp a;
   protected final sm b;
   @Nullable
   protected final fjd c;
   @Nullable
   protected String d;
   protected final gdz e;
   @Nullable
   protected final eye f;
   private final List<fip.a> i = new ArrayList<>();

   protected fip(eqp $$0, sm $$1, fiw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(vk $$0) {
      this.a(new vr($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(vl $$0) {
      vg.a($$0, this, this.a);
      this.b(new vs($$0.a()));
   }

   @Override
   public void a(vi $$0) {
      vx $$1 = $$0.a();
      if (!($$1 instanceof vy)) {
         vg.a($$0, this, this.a);
         if ($$1 instanceof vw $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(vx var1);

   protected abstract hr.b f();

   @Override
   public void a(vm $$0) {
      URL $$1 = a($$0.a());
      if ($$1 == null) {
         this.a(vt.a.c);
      } else {
         String $$2 = $$0.d();
         boolean $$3 = $$0.e();
         if (this.c != null && this.c.b() == fjd.a.a) {
            this.a(vt.a.d);
            this.a(this.a.ac().a($$1, $$2, true));
         } else if (this.c != null && this.c.b() != fjd.a.c && (!$$3 || this.c.b() != fjd.a.b)) {
            this.a(vt.a.b);
            if ($$3) {
               this.b.a(tl.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.a.execute(() -> this.a($$1, $$2, $$3, $$0.f()));
         }
      }
   }

   private void a(URL $$0, String $$1, boolean $$2, @Nullable tl $$3) {
      eye $$4 = this.a.y;
      this.a
         .a(
            new ewy(
               $$4x -> {
                  this.a.a($$4);
                  if ($$4x) {
                     if (this.c != null) {
                        this.c.a(fjd.a.a);
                     }

                     this.a(vt.a.d);
                     this.a(this.a.ac().a($$0, $$1, true));
                  } else {
                     this.a(vt.a.b);
                     if ($$2) {
                        this.b.a(tl.c("multiplayer.requiredTexturePrompt.disconnect"));
                     } else if (this.c != null) {
                        this.c.a(fjd.a.b);
                     }
                  }

                  if (this.c != null) {
                     fje.b(this.c);
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
      $$0.thenRun(() -> this.a(vt.a.a)).exceptionally($$0x -> {
         this.a(vt.a.c);
         return null;
      });
   }

   @Override
   public void a(vn $$0) {
      vg.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(aey<? extends hq<? extends T>> $$0, aqn.a $$1) {
      if (!$$1.a()) {
         hq<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<aqk<T>, List<he<T>>> $$4 = new HashMap<>();
         aqn.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   private void a(vt.a $$0) {
      this.b.a(new vt($$0));
   }

   @Override
   public void a(vj $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fip.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fip.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(ve<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(tl $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   protected eye b(tl $$0) {
      eye $$1 = Objects.requireNonNullElseGet(this.f, () -> new fbb(new eyj()));
      return (eye)(this.c != null && this.c.e() ? new get($$1, g, $$0) : new exh($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(ve<? extends sy> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fip.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   static record a(ve<? extends sy> a, BooleanSupplier b, long c) {
   }
}
