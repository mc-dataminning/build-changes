import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dqc {
   private static final Logger d = LogUtils.getLogger();
   private final dqe<?> e;
   @Nullable
   protected dca n;
   protected final ir o;
   protected boolean p;
   private dtc f;

   public dqc(dqe<?> $$0, ir $$1, dtc $$2) {
      this.e = $$0;
      this.o = $$1.i();
      this.f = $$2;
   }

   public static ir b(uk $$0) {
      return new ir($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dca i() {
      return this.n;
   }

   public void a(dca $$0) {
      this.n = $$0;
   }

   public boolean m() {
      return this.n != null;
   }

   public void a(uk $$0, jc.a $$1) {
   }

   protected void b(uk $$0, jc.a $$1) {
   }

   public final uk b(jc.a $$0) {
      uk $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final uk c(jc.a $$0) {
      uk $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final uk d(jc.a $$0) {
      uk $$1 = new uk();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(uk $$0) {
      akt $$1 = dqe.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(uk $$0, dqe<?> $$1) {
      $$0.a("id", dqe.a($$1).toString());
   }

   public void a(cuh $$0, jc.a $$1) {
      uk $$2 = this.d($$1);
      this.a($$2);
      csc.a($$0, this.r(), $$2);
      $$0.a(this.s());
   }

   private void d(uk $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dqc a(ir $$0, dtc $$1, uk $$2, jc.a $$3) {
      String $$4 = $$2.l("id");
      akt $$5 = akt.a($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lh.k.b($$5).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5x) {
               d.error("Failed to create block entity {}", $$4, var5x);
               return null;
            }
         }).map($$3x -> {
            try {
               $$3x.a($$2, $$3);
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

   protected static void a(dca $$0, ir $$1, dtc $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public ir az_() {
      return this.o;
   }

   public dtc n() {
      return this.f;
   }

   @Nullable
   public zl<abw> av_() {
      return null;
   }

   public uk a(jc.a $$0) {
      return new uk();
   }

   public boolean o() {
      return this.p;
   }

   public void aw_() {
      this.p = true;
   }

   public void p() {
      this.p = false;
   }

   public boolean b_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> lh.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.n());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   public boolean q() {
      return false;
   }

   public dqe<?> r() {
      return this.e;
   }

   @Deprecated
   public void b(dtc $$0) {
      this.f = $$0;
   }

   public void a(ka $$0) {
   }

   public void a(ka.a $$0) {
   }

   @Deprecated
   public void a(uk $$0) {
   }

   public final ka s() {
      ka.a $$0 = ka.a();
      this.a($$0);
      return $$0.a();
   }
}
