import java.util.Optional;
import javax.annotation.Nullable;

public abstract class evu {
   public static final jk<evv> c = new jk<>();
   protected final dzp<evu, evv> d;
   private evv a;
   private final je.c<evu> b = mf.c.f(this);

   protected evu() {
      dzp.a<evu, evv> $$0 = new dzp.a<>(this);
      this.a($$0);
      this.d = $$0.a(evu::g, evv::new);
      this.f(this.d.b());
   }

   protected void a(dzp.a<evu, evv> $$0) {
   }

   public dzp<evu, evv> f() {
      return this.d;
   }

   protected final void f(evv $$0) {
      this.a = $$0;
   }

   public final evv g() {
      return this.a;
   }

   public abstract cyo a();

   protected void a(dip $$0, iu $$1, evv $$2, azt $$3) {
   }

   protected void b(aro $$0, iu $$1, dzo $$2, evv $$3) {
   }

   protected void a(aro $$0, iu $$1, evv $$2, azt $$3) {
   }

   @Nullable
   protected lv h() {
      return null;
   }

   protected abstract boolean a(evv var1, dhv var2, iu var3, evu var4, ja var5);

   protected abstract fdw a(dhv var1, iu var2, evv var3);

   public abstract int a(dis var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(evv var1, dhv var2, iu var3);

   public abstract float a(evv var1);

   protected abstract dzo b(evv var1);

   public abstract boolean c(evv var1);

   public abstract int d(evv var1);

   public boolean a(evu $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axp<evu> $$0) {
      return this.b.a($$0);
   }

   public abstract feq b(evv var1, dhv var2, iu var3);

   @Nullable
   public fdr c(evv $$0, dhv $$1, iu $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new fdr((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awk> j() {
      return Optional.empty();
   }

   @Deprecated
   public je.c<evu> k() {
      return this.b;
   }
}
