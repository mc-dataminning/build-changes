import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eus {
   public static final jy<eut> c = new jy<>();
   protected final dyn<eus, eut> d;
   private eut a;
   private final js.c<eus> b = md.c.f(this);

   protected eus() {
      dyn.a<eus, eut> $$0 = new dyn.a<>(this);
      this.a($$0);
      this.d = $$0.a(eus::g, eut::new);
      this.f(this.d.b());
   }

   protected void a(dyn.a<eus, eut> $$0) {
   }

   public dyn<eus, eut> f() {
      return this.d;
   }

   protected final void f(eut $$0) {
      this.a = $$0;
   }

   public final eut g() {
      return this.a;
   }

   public abstract cxu a();

   protected void a(dhp $$0, jj $$1, eut $$2, azs $$3) {
   }

   protected void b(arn $$0, jj $$1, dym $$2, eut $$3) {
   }

   protected void a(arn $$0, jj $$1, eut $$2, azs $$3) {
   }

   @Nullable
   protected lt h() {
      return null;
   }

   protected abstract boolean a(eut var1, dgv var2, jj var3, eus var4, jo var5);

   protected abstract fcu a(dgv var1, jj var2, eut var3);

   public abstract int a(dhs var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eut var1, dgv var2, jj var3);

   public abstract float a(eut var1);

   protected abstract dym b(eut var1);

   public abstract boolean c(eut var1);

   public abstract int d(eut var1);

   public boolean a(eus $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axp<eus> $$0) {
      return this.b.a($$0);
   }

   public abstract fdo b(eut var1, dgv var2, jj var3);

   @Nullable
   public fcp c(eut $$0, dgv $$1, jj $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new fcp((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awj> j() {
      return Optional.empty();
   }

   @Deprecated
   public js.c<eus> k() {
      return this.b;
   }
}
