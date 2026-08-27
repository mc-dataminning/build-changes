import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dmf {
   private static final Logger e = LogUtils.getLogger();
   private final dmh<?> f;
   @Nullable
   protected cyx o;
   protected final ib p;
   protected boolean q;
   private doz g;

   public dmf(dmh<?> $$0, ib $$1, doz $$2) {
      this.f = $$0;
      this.p = $$1.i();
      this.g = $$2;
   }

   public static ib b(tm $$0) {
      return new ib($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cyx i() {
      return this.o;
   }

   public void a(cyx $$0) {
      this.o = $$0;
   }

   public boolean m() {
      return this.o != null;
   }

   public void a(tm $$0, in.a $$1) {
   }

   protected void b(tm $$0, in.a $$1) {
   }

   public final tm b(in.a $$0) {
      tm $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tm c(in.a $$0) {
      tm $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tm d(in.a $$0) {
      tm $$1 = new tm();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(tm $$0) {
      ajt $$1 = dmh.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(tm $$0, dmh<?> $$1) {
      $$0.a("id", dmh.a($$1).toString());
   }

   public void a(crj $$0, in.a $$1) {
      tm $$2 = this.d($$1);
      this.a($$2);
      cph.a($$0, this.r(), $$2);
      $$0.a(this.s());
   }

   private void d(tm $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dmf a(ib $$0, doz $$1, tm $$2, in.a $$3) {
      String $$4 = $$2.l("id");
      ajt $$5 = ajt.a($$4);
      if ($$5 == null) {
         e.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return kr.k.b($$5).map($$3x -> {
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

   protected static void a(cyx $$0, ib $$1, doz $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public ib aA_() {
      return this.p;
   }

   public doz n() {
      return this.g;
   }

   @Nullable
   public yn<aay> aw_() {
      return null;
   }

   public tm a(in.a $$0) {
      return new tm();
   }

   public boolean o() {
      return this.q;
   }

   public void ax_() {
      this.q = true;
   }

   public void p() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> kr.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.n());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean q() {
      return false;
   }

   public dmh<?> r() {
      return this.f;
   }

   @Deprecated
   public void b(doz $$0) {
      this.g = $$0;
   }

   public void a(jl $$0) {
   }

   public void a(jl.a $$0) {
   }

   @Deprecated
   public void a(tm $$0) {
   }

   public final jl s() {
      jl.a $$0 = jl.a();
      this.a($$0);
      return $$0.a();
   }
}
