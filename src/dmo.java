import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dmo {
   private static final Logger e = LogUtils.getLogger();
   private final dmq<?> f;
   @Nullable
   protected czg o;
   protected final id p;
   protected boolean q;
   private dpi g;

   public dmo(dmq<?> $$0, id $$1, dpi $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static id b(to $$0) {
      return new id($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public czg i() {
      return this.o;
   }

   public void a(czg $$0) {
      this.o = $$0;
   }

   public boolean m() {
      return this.o != null;
   }

   public void a(to $$0, ip.a $$1) {
   }

   protected void b(to $$0, ip.a $$1) {
   }

   public final to b(ip.a $$0) {
      to $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final to c(ip.a $$0) {
      to $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final to d(ip.a $$0) {
      to $$1 = new to();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(to $$0) {
      ajv $$1 = dmq.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(to $$0, dmq<?> $$1) {
      $$0.a("id", dmq.a($$1).toString());
   }

   public void a(crs $$0, ip.a $$1) {
      to $$2 = this.d($$1);
      this.a($$2);
      cpq.a($$0, this.r(), $$2);
      $$0.a(this.s());
   }

   private void d(to $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dmo a(id $$0, dpi $$1, to $$2, ip.a $$3) {
      String $$4 = $$2.l("id");
      ajv $$5 = ajv.a($$4);
      if ($$5 == null) {
         e.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return kt.k.b($$5).map($$3x -> {
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

   protected static void a(czg $$0, id $$1, dpi $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public id az_() {
      return this.p;
   }

   public dpi n() {
      return this.g;
   }

   @Nullable
   public yp<aba> av_() {
      return null;
   }

   public to a(ip.a $$0) {
      return new to();
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
      $$0.a("Name", () -> kt.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.n());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean q() {
      return false;
   }

   public dmq<?> r() {
      return this.f;
   }

   @Deprecated
   public void b(dpi $$0) {
      this.g = $$0;
   }

   public void a(jn $$0) {
   }

   public void a(jn.a $$0) {
   }

   @Deprecated
   public void a(to $$0) {
   }

   public final jn s() {
      jn.a $$0 = jn.a();
      this.a($$0);
      return $$0.a();
   }
}
