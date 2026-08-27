import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dgu {
   private static final Logger e = LogUtils.getLogger();
   private final dgw<?> f;
   @Nullable
   protected cto o;
   protected final hx p;
   protected boolean q;
   private djg g;

   public dgu(dgw<?> $$0, hx $$1, djg $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static hx c(sn $$0) {
      return new hx($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cto i() {
      return this.o;
   }

   public void a(cto $$0) {
      this.o = $$0;
   }

   public boolean n() {
      return this.o != null;
   }

   public void a(sn $$0) {
   }

   protected void b(sn $$0) {
   }

   public final sn o() {
      sn $$0 = this.q();
      this.e($$0);
      return $$0;
   }

   public final sn p() {
      sn $$0 = this.q();
      this.d($$0);
      return $$0;
   }

   public final sn q() {
      sn $$0 = new sn();
      this.b($$0);
      return $$0;
   }

   private void d(sn $$0) {
      ahg $$1 = dgw.a(this.v());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(sn $$0, dgw<?> $$1) {
      $$0.a("id", dgw.a($$1).toString());
   }

   public void e(cmx $$0) {
      ckq.a($$0, this.v(), this.q());
   }

   private void e(sn $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dgu a(hx $$0, djg $$1, sn $$2) {
      String $$3 = $$2.l("id");
      ahg $$4 = ahg.a($$3);
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

   protected static void a(cto $$0, hx $$1, djg $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public hx aB_() {
      return this.p;
   }

   public djg r() {
      return this.g;
   }

   @Nullable
   public xf<za> j() {
      return null;
   }

   public sn ax_() {
      return new sn();
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
      $$0.a("Name", () -> kd.k.b(this.v()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.r());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean u() {
      return false;
   }

   public dgw<?> v() {
      return this.f;
   }

   @Deprecated
   public void b(djg $$0) {
      this.g = $$0;
   }
}
