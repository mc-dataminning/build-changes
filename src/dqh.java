import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dqh {
   private static final Logger d = LogUtils.getLogger();
   private final dqj<?> e;
   @Nullable
   protected dcw n;
   protected final jd o;
   protected boolean p;
   private dtc f;
   private km g = km.a;

   public dqh(dqj<?> $$0, jd $$1, dtc $$2) {
      this.e = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dtc $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(dtc $$0) {
      return this.e.a($$0);
   }

   public static jd b(ub $$0) {
      return new jd($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dcw i() {
      return this.n;
   }

   public void a(dcw $$0) {
      this.n = $$0;
   }

   public boolean m() {
      return this.n != null;
   }

   protected void a(ub $$0, jo.a $$1) {
   }

   public final void c(ub $$0, jo.a $$1) {
      this.a($$0, $$1);
      dqh.a.a.parse($$1.a(up.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(ub $$0, jo.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ub $$0, jo.a $$1) {
   }

   public final ub b(jo.a $$0) {
      ub $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ub c(jo.a $$0) {
      ub $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ub d(jo.a $$0) {
      ub $$1 = new ub();
      this.b($$1, $$0);
      dqh.a.a.encodeStart($$0.a(up.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((ub)$$1x));
      return $$1;
   }

   public final ub e(jo.a $$0) {
      ub $$1 = new ub();
      this.b($$1, $$0);
      return $$1;
   }

   public final ub f(jo.a $$0) {
      ub $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(ub $$0) {
      akr $$1 = dqj.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ub $$0, dqj<?> $$1) {
      $$0.a("id", dqj.a($$1).toString());
   }

   public void a(cuq $$0, jo.a $$1) {
      ub $$2 = this.e($$1);
      this.a($$2);
      cso.a($$0, this.r(), $$2);
      $$0.b(this.s());
   }

   private void d(ub $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dqh a(jd $$0, dtc $$1, ub $$2, jo.a $$3) {
      String $$4 = $$2.l("id");
      akr $$5 = akr.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lt.j.b($$5).map($$3x -> {
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

   protected static void a(dcw $$0, jd $$1, dtc $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public jd aD_() {
      return this.o;
   }

   public dtc n() {
      return this.f;
   }

   @Nullable
   public zg<abu> az_() {
      return null;
   }

   public ub a(jo.a $$0) {
      return new ub();
   }

   public boolean o() {
      return this.p;
   }

   public void aA_() {
      this.p = true;
   }

   public void p() {
      this.p = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", this::k);
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.n());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   private String k() {
      return lt.j.b(this.r()) + " // " + this.getClass().getCanonicalName();
   }

   public boolean q() {
      return false;
   }

   public dqj<?> r() {
      return this.e;
   }

   @Deprecated
   public void c(dtc $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(dqh.b $$0) {
   }

   public final void a(cuq $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(km $$0, kn $$1) {
      final Set<kp<?>> $$2 = new HashSet<>();
      $$2.add(kq.O);
      final km $$3 = kr.a($$0, $$1);
      this.a(new dqh.b() {
         @Nullable
         @Override
         public <T> T a(kp<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kp<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kn $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(km.a $$0) {
   }

   @Deprecated
   public void a(ub $$0) {
   }

   public final km s() {
      km.a $$0 = km.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public km t() {
      return this.g;
   }

   public void a(km $$0) {
      this.g = $$0;
   }

   @Nullable
   public static wz a(String $$0, jo.a $$1) {
      try {
         return wz.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<km> a = km.b.optionalFieldOf("components", km.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(kp<T> var1);

      <T> T a(kp<? extends T> var1, T var2);
   }
}
