import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dnm {
   private static final Logger d = LogUtils.getLogger();
   private final dno<?> e;
   @Nullable
   protected dad n;
   protected final in o;
   protected boolean p;
   private dqh f;

   public dnm(dno<?> $$0, in $$1, dqh $$2) {
      this.e = $$0;
      this.o = $$1.i();
      this.f = $$2;
   }

   public static in b(ua $$0) {
      return new in($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dad i() {
      return this.n;
   }

   public void a(dad $$0) {
      this.n = $$0;
   }

   public boolean m() {
      return this.n != null;
   }

   public void a(ua $$0, iy.a $$1) {
   }

   protected void b(ua $$0, iy.a $$1) {
   }

   public final ua b(iy.a $$0) {
      ua $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ua c(iy.a $$0) {
      ua $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ua d(iy.a $$0) {
      ua $$1 = new ua();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(ua $$0) {
      akh $$1 = dno.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ua $$0, dno<?> $$1) {
      $$0.a("id", dno.a($$1).toString());
   }

   public void a(csz $$0, iy.a $$1) {
      ua $$2 = this.d($$1);
      this.a($$2);
      cqx.a($$0, this.r(), $$2);
      $$0.a(this.s());
   }

   private void d(ua $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dnm a(in $$0, dqh $$1, ua $$2, iy.a $$3) {
      String $$4 = $$2.l("id");
      akh $$5 = akh.a($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return ld.k.b($$5).map($$3x -> {
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

   protected static void a(dad $$0, in $$1, dqh $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public in az_() {
      return this.o;
   }

   public dqh n() {
      return this.f;
   }

   @Nullable
   public zb<abm> av_() {
      return null;
   }

   public ua a(iy.a $$0) {
      return new ua();
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

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> ld.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.n());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   public boolean q() {
      return false;
   }

   public dno<?> r() {
      return this.e;
   }

   @Deprecated
   public void b(dqh $$0) {
      this.f = $$0;
   }

   public void a(jw $$0) {
   }

   public void a(jw.a $$0) {
   }

   @Deprecated
   public void a(ua $$0) {
   }

   public final jw s() {
      jw.a $$0 = jw.a();
      this.a($$0);
      return $$0.a();
   }
}
