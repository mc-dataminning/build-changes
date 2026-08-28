import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dxr {
   private static final Logger d = LogUtils.getLogger();
   private final dxt<?> e;
   @Nullable
   protected djm n;
   protected final iv o;
   protected boolean p;
   private eat f;
   private kh g = kh.a;

   public dxr(dxt<?> $$0, iv $$1, eat $$2) {
      this.e = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(eat $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(eat $$0) {
      return this.e.a($$0);
   }

   public static iv b(tz $$0) {
      return new iv($$0.f("x"), $$0.f("y"), $$0.f("z"));
   }

   @Nullable
   public djm i() {
      return this.n;
   }

   public void a(djm $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(tz $$0, jh.a $$1) {
   }

   public final void c(tz $$0, jh.a $$1) {
      this.a($$0, $$1);
      this.g = $$0.<kh>a(dxr.a.a, $$1.a(un.a)).orElse(kh.a);
   }

   public final void d(tz $$0, jh.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(tz $$0, jh.a $$1) {
   }

   public final tz b(jh.a $$0) {
      tz $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tz c(jh.a $$0) {
      tz $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tz d(jh.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      $$1.a(dxr.a.a, $$0.a(un.a), this.g);
      return $$1;
   }

   public final tz e(jh.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      return $$1;
   }

   public final tz f(jh.a $$0) {
      tz $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(tz $$0) {
      alg $$1 = dxt.a(this.p());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(tz $$0, dxt<?> $$1) {
      $$0.a("id", dxt.a($$1).toString());
   }

   private void d(tz $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dxr a(iv $$0, eat $$1, tz $$2, jh.a $$3) {
      String $$4 = $$2.j("id");
      alg $$5 = alg.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return mg.j.b($$5).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5x) {
               d.error("Failed to create block entity {}", $$4, var5x);
               return null;
            }
         }).map($$3x -> {
            try {
               $$3x.c($$2, $$3);
               return $$3x;
            } catch (Throwable var5x) {
               d.error("Failed to load data for block entity {}", $$4, var5x);
               return null;
            }
         }).orElseGet(() -> {
            d.warn("Skipping BlockEntity with id {}", $$4);
            return null;
         });
      }
   }

   public void e() {
      if (this.n != null) {
         a(this.n, this.o, this.f);
      }
   }

   protected static void a(djm $$0, iv $$1, eat $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.b($$1, $$2.b());
      }
   }

   public iv ax_() {
      return this.o;
   }

   public eat m() {
      return this.f;
   }

   @Nullable
   public zf<abu> au_() {
      return null;
   }

   public tz a(jh.a $$0) {
      return new tz();
   }

   public boolean n() {
      return this.p;
   }

   public void as_() {
      this.p = true;
   }

   public void o() {
      this.p = false;
   }

   public void a(iv $$0, eat $$1) {
      if (this instanceof btz $$2 && this.n != null) {
         buc.a(this.n, $$0, $$2);
      }
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Name", this::k);
      if (this.n != null) {
         q.a($$0, this.n, this.o, this.m());
         q.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   private String k() {
      return mg.j.b(this.p()) + " // " + this.getClass().getCanonicalName();
   }

   public dxt<?> p() {
      return this.e;
   }

   @Deprecated
   public void c(eat $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(kf $$0) {
   }

   public final void a(czn $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kh $$0, ki $$1) {
      final Set<kj<?>> $$2 = new HashSet<>();
      $$2.add(kk.aa);
      $$2.add(kk.aq);
      final kh $$3 = kl.a($$0, $$1);
      this.a(new kf() {
         @Nullable
         @Override
         public <T> T a(kj<? extends T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kj<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      ki $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kh.a $$0) {
   }

   @Deprecated
   public void a(tz $$0) {
   }

   public final kh q() {
      kh.a $$0 = kh.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kh r() {
      return this.g;
   }

   public void a(kh $$0) {
      this.g = $$0;
   }

   @Nullable
   public static wy a(@Nullable uw $$0, jh.a $$1) {
      return $$0 == null
         ? null
         : (wy)xa.a.parse($$1.a(un.a), $$0).resultOrPartial($$0x -> d.warn("Failed to parse custom name, discarding: {}", $$0x)).orElse(null);
   }

   static class a {
      public static final MapCodec<kh> a = kh.b.optionalFieldOf("components", kh.a);

      private a() {
      }
   }
}
