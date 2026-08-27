import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dkg {
   private static final Logger e = LogUtils.getLogger();
   private final dki<?> f;
   @Nullable
   protected cwz o;
   protected final ib p;
   protected boolean q;
   private dmz g;

   public dkg(dki<?> $$0, ib $$1, dmz $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static ib a(ta $$0) {
      return new ib($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cwz i() {
      return this.o;
   }

   public void a(cwz $$0) {
      this.o = $$0;
   }

   public boolean m() {
      return this.o != null;
   }

   public void a(ta $$0, in.a $$1) {
   }

   protected void b(ta $$0, in.a $$1) {
   }

   public final ta b(in.a $$0) {
      ta $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ta c(in.a $$0) {
      ta $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ta d(in.a $$0) {
      ta $$1 = new ta();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(ta $$0) {
      ajh $$1 = dki.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ta $$0, dki<?> $$1) {
      $$0.a("id", dki.a($$1).toString());
   }

   public void a(cqk $$0, in.a $$1) {
      cof.a($$0, this.r(), this.d($$1));
   }

   private void d(ta $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dkg a(ib $$0, dmz $$1, ta $$2, in.a $$3) {
      String $$4 = $$2.l("id");
      ajh $$5 = ajh.a($$4);
      if ($$5 == null) {
         e.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return ki.k.b($$5).map($$3x -> {
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

   protected static void a(cwz $$0, ib $$1, dmz $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public ib aC_() {
      return this.p;
   }

   public dmz n() {
      return this.g;
   }

   @Nullable
   public yb<aam> ay_() {
      return null;
   }

   public ta a(in.a $$0) {
      return new ta();
   }

   public boolean o() {
      return this.q;
   }

   public void az_() {
      this.q = true;
   }

   public void p() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> ki.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.n());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean q() {
      return false;
   }

   public dki<?> r() {
      return this.f;
   }

   @Deprecated
   public void b(dmz $$0) {
      this.g = $$0;
   }
}
