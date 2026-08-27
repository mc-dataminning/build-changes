import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dcz {
   private static final Logger c = LogUtils.getLogger();
   private final ddb<?> d;
   @Nullable
   protected cqb o;
   protected final gw p;
   protected boolean q;
   private dfd e;

   public dcz(ddb<?> $$0, gw $$1, dfd $$2) {
      this.d = $$0;
      this.p = $$1.i();
      this.e = $$2;
   }

   public static gw c(qw $$0) {
      return new gw($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cqb k() {
      return this.o;
   }

   public void a(cqb $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   public void a(qw $$0) {
   }

   protected void b(qw $$0) {
   }

   public final qw m() {
      qw $$0 = this.o();
      this.e($$0);
      return $$0;
   }

   public final qw n() {
      qw $$0 = this.o();
      this.d($$0);
      return $$0;
   }

   public final qw o() {
      qw $$0 = new qw();
      this.b($$0);
      return $$0;
   }

   private void d(qw $$0) {
      aez $$1 = ddb.a(this.u());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(qw $$0, ddb<?> $$1) {
      $$0.a("id", ddb.a($$1).toString());
   }

   public void e(cjl $$0) {
      che.a($$0, this.u(), this.o());
   }

   private void e(qw $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dcz a(gw $$0, dfd $$1, qw $$2) {
      String $$3 = $$2.l("id");
      aez $$4 = aez.a($$3);
      if ($$4 == null) {
         c.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return jb.l.b($$4).map($$3x -> {
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

   protected static void a(cqb $$0, gw $$1, dfd $$2) {
      $$0.p($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public gw p() {
      return this.p;
   }

   public dfd q() {
      return this.e;
   }

   @Nullable
   public ve<wx> h() {
      return null;
   }

   public qw as_() {
      return new qw();
   }

   public boolean r() {
      return this.q;
   }

   public void at_() {
      this.q = true;
   }

   public void s() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> jb.l.b(this.u()) + " // " + this.getClass().getCanonicalName());
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.q());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   public boolean t() {
      return false;
   }

   public ddb<?> u() {
      return this.d;
   }

   @Deprecated
   public void b(dfd $$0) {
      this.e = $$0;
   }
}
