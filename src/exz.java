import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exz {
   public static final jm<eya> c = new jm<>();
   protected final ebr<exz, eya> d;
   private eya a;
   private final jg.c<exz> b = mh.c.f(this);

   protected exz() {
      ebr.a<exz, eya> $$0 = new ebr.a<>(this);
      this.a($$0);
      this.d = $$0.a(exz::g, eya::new);
      this.f(this.d.b());
   }

   protected void a(ebr.a<exz, eya> $$0) {
   }

   public ebr<exz, eya> f() {
      return this.d;
   }

   protected final void f(eya $$0) {
      this.a = $$0;
   }

   public final eya g() {
      return this.a;
   }

   public abstract dag a();

   protected void a(dkj $$0, iw $$1, eya $$2, bai $$3) {
   }

   protected void b(asb $$0, iw $$1, ebq $$2, eya $$3) {
   }

   protected void a(asb $$0, iw $$1, eya $$2, bai $$3) {
   }

   protected void a(dkj $$0, iw $$1, bxe $$2, bxx $$3) {
   }

   @Nullable
   protected lx h() {
      return null;
   }

   protected abstract boolean a(eya var1, djn var2, iw var3, exz var4, jc var5);

   protected abstract fgc a(djn var1, iw var2, eya var3);

   public abstract int a(dkm var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eya var1, djn var2, iw var3);

   public abstract float a(eya var1);

   protected abstract ebq b(eya var1);

   public abstract boolean c(eya var1);

   public abstract int d(eya var1);

   public boolean a(exz $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(ayc<exz> $$0) {
      return this.b.a($$0);
   }

   public abstract fgw b(eya var1, djn var2, iw var3);

   @Nullable
   public ffx c(eya $$0, djn $$1, iw $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new ffx((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awx> j() {
      return Optional.empty();
   }

   @Deprecated
   public jg.c<exz> k() {
      return this.b;
   }
}
