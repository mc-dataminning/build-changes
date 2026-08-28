import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewn {
   public static final jk<ewo> c = new jk<>();
   protected final eai<ewn, ewo> d;
   private ewo a;
   private final je.c<ewn> b = mf.c.f(this);

   protected ewn() {
      eai.a<ewn, ewo> $$0 = new eai.a<>(this);
      this.a($$0);
      this.d = $$0.a(ewn::g, ewo::new);
      this.f(this.d.b());
   }

   protected void a(eai.a<ewn, ewo> $$0) {
   }

   public eai<ewn, ewo> f() {
      return this.d;
   }

   protected final void f(ewo $$0) {
      this.a = $$0;
   }

   public final ewo g() {
      return this.a;
   }

   public abstract cyz a();

   protected void a(dja $$0, iu $$1, ewo $$2, azv $$3) {
   }

   protected void b(arq $$0, iu $$1, eah $$2, ewo $$3) {
   }

   protected void a(arq $$0, iu $$1, ewo $$2, azv $$3) {
   }

   @Nullable
   protected lv h() {
      return null;
   }

   protected abstract boolean a(ewo var1, dig var2, iu var3, ewn var4, ja var5);

   protected abstract feq a(dig var1, iu var2, ewo var3);

   public abstract int a(djd var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ewo var1, dig var2, iu var3);

   public abstract float a(ewo var1);

   protected abstract eah b(ewo var1);

   public abstract boolean c(ewo var1);

   public abstract int d(ewo var1);

   public boolean a(ewn $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axr<ewn> $$0) {
      return this.b.a($$0);
   }

   public abstract ffk b(ewo var1, dig var2, iu var3);

   @Nullable
   public fel c(ewo $$0, dig $$1, iu $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new fel((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awm> j() {
      return Optional.empty();
   }

   @Deprecated
   public je.c<ewn> k() {
      return this.b;
   }
}
