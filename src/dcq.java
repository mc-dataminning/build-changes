import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dcq {
   private static final Logger c = LogUtils.getLogger();
   private final dcs<?> d;
   @Nullable
   protected cpq o;
   protected final gw p;
   protected boolean q;
   private dfe e;

   public dcq(dcs<?> $$0, gw $$1, dfe $$2) {
      this.d = $$0;
      this.p = $$1.i();
      this.e = $$2;
   }

   public static gw c(qu $$0) {
      return new gw($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cpq k() {
      return this.o;
   }

   public void a(cpq $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   public void a(qu $$0) {
   }

   protected void b(qu $$0) {
   }

   public final qu m() {
      qu $$0 = this.o();
      this.e($$0);
      return $$0;
   }

   public final qu n() {
      qu $$0 = this.o();
      this.d($$0);
      return $$0;
   }

   public final qu o() {
      qu $$0 = new qu();
      this.b($$0);
      return $$0;
   }

   private void d(qu $$0) {
      aeu $$1 = dcs.a(this.u());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(qu $$0, dcs<?> $$1) {
      $$0.a("id", dcs.a($$1).toString());
   }

   public void e(cja $$0) {
      cgt.a($$0, this.u(), this.o());
   }

   private void e(qu $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dcq a(gw $$0, dfe $$1, qu $$2) {
      String $$3 = $$2.l("id");
      aeu $$4 = aeu.a($$3);
      if ($$4 == null) {
         c.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return jd.l.b($$4).map($$3x -> {
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

   protected static void a(cpq $$0, gw $$1, dfe $$2) {
      $$0.p($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public gw p() {
      return this.p;
   }

   public dfe q() {
      return this.e;
   }

   @Nullable
   public va<ws> h() {
      return null;
   }

   public qu an_() {
      return new qu();
   }

   public boolean r() {
      return this.q;
   }

   public void ao_() {
      this.q = true;
   }

   public void s() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> jd.l.b(this.u()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.q());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean t() {
      return false;
   }

   public dcs<?> u() {
      return this.d;
   }

   @Deprecated
   public void b(dfe $$0) {
      this.e = $$0;
   }
}
