import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dnd {
   private static final Logger e = LogUtils.getLogger();
   private final dnf<?> f;
   @Nullable
   protected czu o;
   protected final im p;
   protected boolean q;
   private dpy g;

   public dnd(dnf<?> $$0, im $$1, dpy $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static im b(ty $$0) {
      return new im($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public czu i() {
      return this.o;
   }

   public void a(czu $$0) {
      this.o = $$0;
   }

   public boolean m() {
      return this.o != null;
   }

   public void a(ty $$0, ix.a $$1) {
   }

   protected void b(ty $$0, ix.a $$1) {
   }

   public final ty b(ix.a $$0) {
      ty $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ty c(ix.a $$0) {
      ty $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ty d(ix.a $$0) {
      ty $$1 = new ty();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(ty $$0) {
      akf $$1 = dnf.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ty $$0, dnf<?> $$1) {
      $$0.a("id", dnf.a($$1).toString());
   }

   public void a(csd $$0, ix.a $$1) {
      ty $$2 = this.d($$1);
      this.a($$2);
      cqb.a($$0, this.r(), $$2);
      $$0.a(this.s());
   }

   private void d(ty $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dnd a(im $$0, dpy $$1, ty $$2, ix.a $$3) {
      String $$4 = $$2.l("id");
      akf $$5 = akf.a($$4);
      if ($$5 == null) {
         e.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lc.k.b($$5).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5x) {
               e.error("Failed to create block entity {}", $$4, var5x);
               return null;
            }
         }).map($$3x -> {
            try {
               $$3x.a($$2, $$3);
               return $$3x;
            } catch (Throwable var5x) {
               e.error("Failed to load data for block entity {}", $$4, var5x);
               return null;
            }
         }).orElseGet(() -> {
            e.warn("Skipping BlockEntity with id {}", $$4);
            return null;
         });
      }
   }

   public void e() {
      if (this.o != null) {
         a(this.o, this.p, this.g);
      }
   }

   protected static void a(czu $$0, im $$1, dpy $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public im az_() {
      return this.p;
   }

   public dpy n() {
      return this.g;
   }

   @Nullable
   public yz<abk> av_() {
      return null;
   }

   public ty a(ix.a $$0) {
      return new ty();
   }

   public boolean o() {
      return this.q;
   }

   public void aw_() {
      this.q = true;
   }

   public void p() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> lc.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.n());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean q() {
      return false;
   }

   public dnf<?> r() {
      return this.f;
   }

   @Deprecated
   public void b(dpy $$0) {
      this.g = $$0;
   }

   public void a(jv $$0) {
   }

   public void a(jv.a $$0) {
   }

   @Deprecated
   public void a(ty $$0) {
   }

   public final jv s() {
      jv.a $$0 = jv.a();
      this.a($$0);
      return $$0.a();
   }
}
