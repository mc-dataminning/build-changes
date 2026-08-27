import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dck {
   private static final Logger c = LogUtils.getLogger();
   private final dcm<?> d;
   @Nullable
   protected cpk o;
   protected final gv p;
   protected boolean q;
   private dey e;

   public dck(dcm<?> $$0, gv $$1, dey $$2) {
      this.d = $$0;
      this.p = $$1.i();
      this.e = $$2;
   }

   public static gv c(qs $$0) {
      return new gv($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cpk k() {
      return this.o;
   }

   public void a(cpk $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   public void a(qs $$0) {
   }

   protected void b(qs $$0) {
   }

   public final qs m() {
      qs $$0 = this.o();
      this.e($$0);
      return $$0;
   }

   public final qs n() {
      qs $$0 = this.o();
      this.d($$0);
      return $$0;
   }

   public final qs o() {
      qs $$0 = new qs();
      this.b($$0);
      return $$0;
   }

   private void d(qs $$0) {
      aep $$1 = dcm.a(this.u());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(qs $$0, dcm<?> $$1) {
      $$0.a("id", dcm.a($$1).toString());
   }

   public void e(ciw $$0) {
      cgp.a($$0, this.u(), this.o());
   }

   private void e(qs $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dck a(gv $$0, dey $$1, qs $$2) {
      String $$3 = $$2.l("id");
      aep $$4 = aep.a($$3);
      if ($$4 == null) {
         c.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return jc.l.b($$4).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5) {
               c.error("Failed to create block entity {}", $$3, var5);
               return null;
            }
         }).map($$2x -> {
            try {
               $$2x.a($$2);
               return $$2x;
            } catch (Throwable var4x) {
               c.error("Failed to load data for block entity {}", $$3, var4x);
               return null;
            }
         }).orElseGet(() -> {
            c.warn("Skipping BlockEntity with id {}", $$3);
            return null;
         });
      }
   }

   public void e() {
      if (this.o != null) {
         a(this.o, this.p, this.e);
      }
   }

   protected static void a(cpk $$0, gv $$1, dey $$2) {
      $$0.p($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public gv p() {
      return this.p;
   }

   public dey q() {
      return this.e;
   }

   @Nullable
   public uw<wo> h() {
      return null;
   }

   public qs ao_() {
      return new qs();
   }

   public boolean r() {
      return this.q;
   }

   public void ap_() {
      this.q = true;
   }

   public void s() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> jc.l.b(this.u()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.q());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean t() {
      return false;
   }

   public dcm<?> u() {
      return this.d;
   }

   @Deprecated
   public void b(dey $$0) {
      this.e = $$0;
   }
}
