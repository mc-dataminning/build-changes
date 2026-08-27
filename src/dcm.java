import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dcm {
   private static final Logger c = LogUtils.getLogger();
   private final dco<?> d;
   @Nullable
   protected cpm o;
   protected final gu p;
   protected boolean q;
   private dfa e;

   public dcm(dco<?> $$0, gu $$1, dfa $$2) {
      this.d = $$0;
      this.p = $$1.i();
      this.e = $$2;
   }

   public static gu c(qr $$0) {
      return new gu($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cpm k() {
      return this.o;
   }

   public void a(cpm $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   public void a(qr $$0) {
   }

   protected void b(qr $$0) {
   }

   public final qr m() {
      qr $$0 = this.o();
      this.e($$0);
      return $$0;
   }

   public final qr n() {
      qr $$0 = this.o();
      this.d($$0);
      return $$0;
   }

   public final qr o() {
      qr $$0 = new qr();
      this.b($$0);
      return $$0;
   }

   private void d(qr $$0) {
      aer $$1 = dco.a(this.u());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(qr $$0, dco<?> $$1) {
      $$0.a("id", dco.a($$1).toString());
   }

   public void e(ciy $$0) {
      cgr.a($$0, this.u(), this.o());
   }

   private void e(qr $$0) {
      this.d($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dcm a(gu $$0, dfa $$1, qr $$2) {
      String $$3 = $$2.l("id");
      aer $$4 = aer.a($$3);
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

   protected static void a(cpm $$0, gu $$1, dfa $$2) {
      $$0.p($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public gu p() {
      return this.p;
   }

   public dfa q() {
      return this.e;
   }

   @Nullable
   public ux<wp> h() {
      return null;
   }

   public qr ao_() {
      return new qr();
   }

   public boolean r() {
      return this.q;
   }

   public void ap_() {
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

   public dco<?> u() {
      return this.d;
   }

   @Deprecated
   public void b(dfa $$0) {
      this.e = $$0;
   }
}
