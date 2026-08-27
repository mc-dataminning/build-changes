import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dit {
   private static final Logger e = LogUtils.getLogger();
   private final div<?> f;
   @Nullable
   protected cvn o;
   protected final hz p;
   protected boolean q;
   private dlf g;

   public dit(div<?> $$0, hz $$1, dlf $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static hz c(sw $$0) {
      return new hz($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cvn i() {
      return this.o;
   }

   public void a(cvn $$0) {
      this.o = $$0;
   }

   public boolean n() {
      return this.o != null;
   }

   public void a(sw $$0) {
   }

   protected void b(sw $$0) {
   }

   public final sw o() {
      sw $$0 = this.q();
      this.e($$0);
      return $$0;
   }

   public final sw p() {
      sw $$0 = this.q();
      this.d($$0);
      return $$0;
   }

   public final sw q() {
      sw $$0 = new sw();
      this.b($$0);
      return $$0;
   }

   private void d(sw $$0) {
      aiy $$1 = div.a(this.v());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(sw $$0, div<?> $$1) {
      $$0.a("id", div.a($$1).toString());
   }

   public void e(coz $$0) {
      cms.a($$0, this.v(), this.q());
   }

   private void e(sw $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dit a(hz $$0, dlf $$1, sw $$2) {
      String $$3 = $$2.l("id");
      aiy $$4 = aiy.a($$3);
      if ($$4 == null) {
         e.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return kf.k.b($$4).map($$3x -> {
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

   protected static void a(cvn $$0, hz $$1, dlf $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public hz aE_() {
      return this.p;
   }

   public dlf r() {
      return this.g;
   }

   @Nullable
   public xx<aag> j() {
      return null;
   }

   public sw aA_() {
      return new sw();
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
      $$0.a("Name", () -> kf.k.b(this.v()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.r());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean u() {
      return false;
   }

   public div<?> v() {
      return this.f;
   }

   @Deprecated
   public void b(dlf $$0) {
      this.g = $$0;
   }
}
