import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dhd {
   private static final Logger e = LogUtils.getLogger();
   private final dhf<?> f;
   @Nullable
   protected ctx o;
   protected final hx p;
   protected boolean q;
   private djp g;

   public dhd(dhf<?> $$0, hx $$1, djp $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static hx c(so $$0) {
      return new hx($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public ctx i() {
      return this.o;
   }

   public void a(ctx $$0) {
      this.o = $$0;
   }

   public boolean n() {
      return this.o != null;
   }

   public void a(so $$0) {
   }

   protected void b(so $$0) {
   }

   public final so o() {
      so $$0 = this.q();
      this.e($$0);
      return $$0;
   }

   public final so p() {
      so $$0 = this.q();
      this.d($$0);
      return $$0;
   }

   public final so q() {
      so $$0 = new so();
      this.b($$0);
      return $$0;
   }

   private void d(so $$0) {
      ahh $$1 = dhf.a(this.v());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(so $$0, dhf<?> $$1) {
      $$0.a("id", dhf.a($$1).toString());
   }

   public void e(cng $$0) {
      cla.a($$0, this.v(), this.q());
   }

   private void e(so $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dhd a(hx $$0, djp $$1, so $$2) {
      String $$3 = $$2.l("id");
      ahh $$4 = ahh.a($$3);
      if ($$4 == null) {
         e.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return kd.k.b($$4).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5) {
               e.error("Failed to create block entity {}", $$3, var5);
               return null;
            }
         }).map($$2x -> {
            try {
               $$2x.a($$2);
               return $$2x;
            } catch (Throwable var4x) {
               e.error("Failed to load data for block entity {}", $$3, var4x);
               return null;
            }
         }).orElseGet(() -> {
            e.warn("Skipping BlockEntity with id {}", $$3);
            return null;
         });
      }
   }

   public void e() {
      if (this.o != null) {
         a(this.o, this.p, this.g);
      }
   }

   protected static void a(ctx $$0, hx $$1, djp $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public hx aE_() {
      return this.p;
   }

   public djp r() {
      return this.g;
   }

   @Nullable
   public xg<zb> j() {
      return null;
   }

   public so aA_() {
      return new so();
   }

   public boolean s() {
      return this.q;
   }

   public void aB_() {
      this.q = true;
   }

   public void t() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> kd.k.b(this.v()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.r());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean u() {
      return false;
   }

   public dhf<?> v() {
      return this.f;
   }

   @Deprecated
   public void b(djp $$0) {
      this.g = $$0;
   }
}
