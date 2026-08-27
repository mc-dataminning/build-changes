import com.google.common.collect.ImmutableList;
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
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fob implements xj {
   private static final vg g = vg.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final evr a;
   protected final uh b;
   @Nullable
   protected final fop c;
   @Nullable
   protected String d;
   protected final gkf e;
   @Nullable
   protected final fdm f;
   private final List<fob.a> i = new ArrayList<>();

   protected fob(evr $$0, uh $$1, foi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(xm $$0) {
      this.a(new xu($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(xn $$0) {
      xi.a($$0, this, this.a);
      this.b(new xv($$0.a()));
   }

   @Override
   public void a(xk $$0) {
      yb $$1 = $$0.a();
      if (!($$1 instanceof yc)) {
         xi.a($$0, this, this.a);
         if ($$1 instanceof xz $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(yb var1);

   protected abstract iu.b f();

   @Override
   public void a(xp $$0) {
      xi.a($$0, this, this.a);
      UUID $$1 = $$0.a();
      URL $$2 = a($$0.d());
      if ($$2 == null) {
         this.b.a(new xw($$1, xw.a.f));
      } else {
         String $$3 = $$0.e();
         boolean $$4 = $$0.f();
         fop.a $$5 = this.c != null ? this.c.b() : fop.a.c;
         if ($$5 != fop.a.c && (!$$4 || $$5 != fop.a.b)) {
            this.a.ac().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.g()));
         }
      }
   }

   @Override
   public void a(xo $$0) {
      xi.a($$0, this, this.a);
      $$0.a().ifPresentOrElse($$0x -> this.a.ac().a($$0x), () -> this.a.ac().e());
   }

   static vg a(vg $$0, @Nullable vg $$1) {
      return (vg)($$1 == null ? $$0 : vg.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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

   @Override
   public void a(xq $$0) {
      xi.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(ahg<? extends it<? extends T>> $$0, ata.a $$1) {
      if (!$$1.a()) {
         it<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<asx<T>, List<ih<T>>> $$4 = new HashMap<>();
         ata.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   @Override
   public void a(xl $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fob.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fob.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(xg<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vg $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fdm b(vg $$0) {
      fdm $$1 = Objects.requireNonNullElseGet(this.f, () -> new fgk(new fdr()));
      return (fdm)(this.c != null && this.c.e() ? new gkz($$1, g, $$0) : new fco($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(xg<? extends ut> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fob.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fdm a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vg $$4) {
      fdm $$5 = this.a.y;
      return $$5 instanceof fob.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fob.b(this.a, $$5, List.of(new fob.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(xg<? extends ut> a, BooleanSupplier b, long c) {
   }

   class b extends fcf {
      private final List<fob.b.a> l;
      @Nullable
      private final fdm m;

      b(evr $$0, @Nullable fdm $$1, List<fob.b.a> $$2, boolean $$3, @Nullable vg $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               ghq $$6 = $$0.ac();
               if ($$5) {
                  if (fob.this.c != null) {
                     fob.this.c.a(fop.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fob.this.b.a(vg.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fob.this.c != null) {
                     fob.this.c.a(fop.a.b);
                  }
               }

               for (fob.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fob.this.c != null) {
                  foq.b(fob.this.c);
               }
            },
            $$3 ? vg.c("multiplayer.requiredTexturePrompt.line1") : vg.c("multiplayer.texturePrompt.line1"),
            fob.a($$3 ? vg.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vg.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? vf.i : vf.f,
            $$3 ? vf.p : vf.g
         );
         this.l = $$2;
         this.m = $$1;
      }

      public fob.b a(evr $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable vg $$5) {
         List<fob.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.l.size() + 1).addAll(this.l).add(new fob.b.a($$1, $$2, $$3)).build();
         return fob.this.new b($$0, this.m, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
