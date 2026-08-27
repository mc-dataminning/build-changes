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

public abstract class fnp implements xi {
   private static final vf g = vf.c("disconnect.lost");
   private static final Logger h = LogUtils.getLogger();
   protected final evi a;
   protected final ug b;
   @Nullable
   protected final fod c;
   @Nullable
   protected String d;
   protected final gjr e;
   @Nullable
   protected final fdb f;
   private final List<fnp.a> i = new ArrayList<>();

   protected fnp(evi $$0, ug $$1, fnw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
   }

   @Override
   public void a(xl $$0) {
      this.a(new xt($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(xm $$0) {
      xh.a($$0, this, this.a);
      this.b(new xu($$0.a()));
   }

   @Override
   public void a(xj $$0) {
      ya $$1 = $$0.a();
      if (!($$1 instanceof yb)) {
         xh.a($$0, this, this.a);
         if ($$1 instanceof xy $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(ya var1);

   protected abstract iu.b f();

   @Override
   public void a(xo $$0) {
      xh.a($$0, this, this.a);
      UUID $$1 = $$0.a();
      URL $$2 = a($$0.d());
      if ($$2 == null) {
         this.b.a(new xv($$1, xv.a.f));
      } else {
         String $$3 = $$0.e();
         boolean $$4 = $$0.f();
         fod.a $$5 = this.c != null ? this.c.b() : fod.a.c;
         if ($$5 != fod.a.c && (!$$4 || $$5 != fod.a.b)) {
            this.a.ac().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.g()));
         }
      }
   }

   @Override
   public void a(xn $$0) {
      xh.a($$0, this, this.a);
      $$0.a().ifPresentOrElse($$0x -> this.a.ac().a($$0x), () -> this.a.ac().e());
   }

   static vf a(vf $$0, @Nullable vf $$1) {
      return (vf)($$1 == null ? $$0 : vf.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(xp $$0) {
      xh.a($$0, this, this.a);
      $$0.a().forEach(this::a);
   }

   private <T> void a(ahf<? extends it<? extends T>> $$0, asz.a $$1) {
      if (!$$1.a()) {
         it<T> $$2 = this.f().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<asw<T>, List<ih<T>>> $$4 = new HashMap<>();
         asz.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   @Override
   public void a(xk $$0) {
      this.b.a($$0.a());
   }

   protected void g() {
      Iterator<fnp.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fnp.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(xf<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vf $$0) {
      this.e.c();
      this.a.b(this.b($$0));
      h.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fdb b(vf $$0) {
      fdb $$1 = Objects.requireNonNullElseGet(this.f, () -> new ffz(new fdg()));
      return (fdb)(this.c != null && this.c.e() ? new gkl($$1, g, $$0) : new fcd($$1, g, $$0));
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(xf<? extends us> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.i.add(new fnp.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fdb a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vf $$4) {
      fdb $$5 = this.a.y;
      return $$5 instanceof fnp.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fnp.b(this.a, $$5, List.of(new fnp.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(xf<? extends us> a, BooleanSupplier b, long c) {
   }

   class b extends fbu {
      private final List<fnp.b.a> l;
      @Nullable
      private final fdb m;

      b(evi $$0, @Nullable fdb $$1, List<fnp.b.a> $$2, boolean $$3, @Nullable vf $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               ghc $$6 = $$0.ac();
               if ($$5) {
                  if (fnp.this.c != null) {
                     fnp.this.c.a(fod.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fnp.this.b.a(vf.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fnp.this.c != null) {
                     fnp.this.c.a(fod.a.b);
                  }
               }

               for (fnp.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fnp.this.c != null) {
                  foe.b(fnp.this.c);
               }
            },
            $$3 ? vf.c("multiplayer.requiredTexturePrompt.line1") : vf.c("multiplayer.texturePrompt.line1"),
            fnp.a($$3 ? vf.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vf.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? ve.i : ve.f,
            $$3 ? ve.p : ve.g
         );
         this.l = $$2;
         this.m = $$1;
      }

      public fnp.b a(evi $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable vf $$5) {
         List<fnp.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.l.size() + 1).addAll(this.l).add(new fnp.b.a($$1, $$2, $$3)).build();
         return fnp.this.new b($$0, this.m, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
