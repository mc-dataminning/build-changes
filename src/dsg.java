import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dsg {
   private static final Logger d = LogUtils.getLogger();
   private final dsi<?> e;
   @Nullable
   protected dev o;
   protected final jg p;
   protected boolean q;
   private dvd f;
   private kp g = kp.a;

   public dsg(dsi<?> $$0, jg $$1, dvd $$2) {
      this.e = $$0;
      this.p = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dvd $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.p + ", got " + $$0);
      }
   }

   public boolean b(dvd $$0) {
      return this.e.a($$0);
   }

   public static jg b(uj $$0) {
      return new jg($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dev i() {
      return this.o;
   }

   public void a(dev $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   protected void a(uj $$0, jr.a $$1) {
   }

   public final void c(uj $$0, jr.a $$1) {
      this.a($$0, $$1);
      dsg.a.a.parse($$1.a(ux.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(uj $$0, jr.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(uj $$0, jr.a $$1) {
   }

   public final uj b(jr.a $$0) {
      uj $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final uj c(jr.a $$0) {
      uj $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final uj d(jr.a $$0) {
      uj $$1 = new uj();
      this.b($$1, $$0);
      dsg.a.a.encodeStart($$0.a(ux.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((uj)$$1x));
      return $$1;
   }

   public final uj e(jr.a $$0) {
      uj $$1 = new uj();
      this.b($$1, $$0);
      return $$1;
   }

   public final uj f(jr.a $$0) {
      uj $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(uj $$0) {
      alh $$1 = dsi.a(this.q());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(uj $$0, dsi<?> $$1) {
      $$0.a("id", dsi.a($$1).toString());
   }

   public void a(cvx $$0, jr.a $$1) {
      uj $$2 = this.e($$1);
      this.a($$2);
      $$0.c();
      cuc.a($$0, this.q(), $$2);
      $$0.b(this.r());
   }

   private void d(uj $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dsg a(jg $$0, dvd $$1, uj $$2, jr.a $$3) {
      String $$4 = $$2.l("id");
      alh $$5 = alh.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lx.j.b($$5).map($$3x -> {
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
      if (this.o != null) {
         a(this.o, this.p, this.f);
      }
   }

   protected static void a(dev $$0, jg $$1, dvd $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.c($$1, $$2.b());
      }
   }

   public jg aC_() {
      return this.p;
   }

   public dvd m() {
      return this.f;
   }

   @Nullable
   public zo<acd> az_() {
      return null;
   }

   public uj a(jr.a $$0) {
      return new uj();
   }

   public boolean n() {
      return this.q;
   }

   public void ax_() {
      this.q = true;
   }

   public void o() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", this::k);
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.m());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   private String k() {
      return lx.j.b(this.q()) + " // " + this.getClass().getCanonicalName();
   }

   public boolean p() {
      return false;
   }

   public dsi<?> q() {
      return this.e;
   }

   @Deprecated
   public void c(dvd $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(dsg.b $$0) {
   }

   public final void a(cvx $$0) {
      this.a($$0.d(), $$0.e());
   }

   public final void a(kp $$0, kq $$1) {
      final Set<ks<?>> $$2 = new HashSet<>();
      $$2.add(kt.X);
      final kp $$3 = ku.a($$0, $$1);
      this.a(new dsg.b() {
         @Nullable
         @Override
         public <T> T a(ks<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(ks<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kq $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kp.a $$0) {
   }

   @Deprecated
   public void a(uj $$0) {
   }

   public final kp r() {
      kp.a $$0 = kp.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kp s() {
      return this.g;
   }

   public void a(kp $$0) {
      this.g = $$0;
   }

   @Nullable
   public static xh a(String $$0, jr.a $$1) {
      try {
         return xh.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<kp> a = kp.b.optionalFieldOf("components", kp.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(ks<T> var1);

      <T> T a(ks<? extends T> var1, T var2);
   }
}
