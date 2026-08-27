import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dgd {
   private static final Logger e = LogUtils.getLogger();
   private final dgf<?> f;
   @Nullable
   protected csy o;
   protected final hv p;
   protected boolean q;
   private dip g;

   public dgd(dgf<?> $$0, hv $$1, dip $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static hv c(sj $$0) {
      return new hv($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public csy i() {
      return this.o;
   }

   public void a(csy $$0) {
      this.o = $$0;
   }

   public boolean n() {
      return this.o != null;
   }

   public void a(sj $$0) {
   }

   protected void b(sj $$0) {
   }

   public final sj o() {
      sj $$0 = this.q();
      this.e($$0);
      return $$0;
   }

   public final sj p() {
      sj $$0 = this.q();
      this.d($$0);
      return $$0;
   }

   public final sj q() {
      sj $$0 = new sj();
      this.b($$0);
      return $$0;
   }

   private void d(sj $$0) {
      agt $$1 = dgf.a(this.v());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(sj $$0, dgf<?> $$1) {
      $$0.a("id", dgf.a($$1).toString());
   }

   public void e(cmh $$0) {
      cka.a($$0, this.v(), this.q());
   }

   private void e(sj $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dgd a(hv $$0, dip $$1, sj $$2) {
      String $$3 = $$2.l("id");
      agt $$4 = agt.a($$3);
      if ($$4 == null) {
         e.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return kb.k.b($$4).map($$3x -> {
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

   protected static void a(csy $$0, hv $$1, dip $$2) {
      $$0.p($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public hv aB_() {
      return this.p;
   }

   public dip r() {
      return this.g;
   }

   @Nullable
   public wu<yo> j() {
      return null;
   }

   public sj ax_() {
      return new sj();
   }

   public boolean s() {
      return this.q;
   }

   public void ay_() {
      this.q = true;
   }

   public void t() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> kb.k.b(this.v()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.r());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean u() {
      return false;
   }

   public dgf<?> v() {
      return this.f;
   }

   @Deprecated
   public void b(dip $$0) {
      this.g = $$0;
   }
}
