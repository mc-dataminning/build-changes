import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ddx {
   private static final Logger c = LogUtils.getLogger();
   private final ddz<?> d;
   @Nullable
   protected cqz o;
   protected final ht p;
   protected boolean q;
   private dgb e;

   public ddx(ddz<?> $$0, ht $$1, dgb $$2) {
      this.d = $$0;
      this.p = $$1.i();
      this.e = $$2;
   }

   public static ht c(rt $$0) {
      return new ht($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cqz k() {
      return this.o;
   }

   public void a(cqz $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   public void a(rt $$0) {
   }

   protected void b(rt $$0) {
   }

   public final rt m() {
      rt $$0 = this.o();
      this.e($$0);
      return $$0;
   }

   public final rt n() {
      rt $$0 = this.o();
      this.d($$0);
      return $$0;
   }

   public final rt o() {
      rt $$0 = new rt();
      this.b($$0);
      return $$0;
   }

   private void d(rt $$0) {
      afw $$1 = ddz.a(this.u());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(rt $$0, ddz<?> $$1) {
      $$0.a("id", ddz.a($$1).toString());
   }

   public void e(ckj $$0) {
      cic.a($$0, this.u(), this.o());
   }

   private void e(rt $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static ddx a(ht $$0, dgb $$1, rt $$2) {
      String $$3 = $$2.l("id");
      afw $$4 = afw.a($$3);
      if ($$4 == null) {
         c.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return jy.l.b($$4).map($$3x -> {
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

   protected static void a(cqz $$0, ht $$1, dgb $$2) {
      $$0.p($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public ht p() {
      return this.p;
   }

   public dgb q() {
      return this.e;
   }

   @Nullable
   public wb<xu> h() {
      return null;
   }

   public rt av_() {
      return new rt();
   }

   public boolean r() {
      return this.q;
   }

   public void aw_() {
      this.q = true;
   }

   public void s() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> jy.l.b(this.u()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.q());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean t() {
      return false;
   }

   public ddz<?> u() {
      return this.d;
   }

   @Deprecated
   public void b(dgb $$0) {
      this.e = $$0;
   }
}
