import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewf {
   public static final jk<ewg> c = new jk<>();
   protected final eaa<ewf, ewg> d;
   private ewg a;
   private final je.c<ewf> b = mf.c.f(this);

   protected ewf() {
      eaa.a<ewf, ewg> $$0 = new eaa.a<>(this);
      this.a($$0);
      this.d = $$0.a(ewf::g, ewg::new);
      this.f(this.d.b());
   }

   protected void a(eaa.a<ewf, ewg> $$0) {
   }

   public eaa<ewf, ewg> f() {
      return this.d;
   }

   protected final void f(ewg $$0) {
      this.a = $$0;
   }

   public final ewg g() {
      return this.a;
   }

   public abstract cyu a();

   protected void a(div $$0, iu $$1, ewg $$2, azv $$3) {
   }

   protected void b(arq $$0, iu $$1, dzz $$2, ewg $$3) {
   }

   protected void a(arq $$0, iu $$1, ewg $$2, azv $$3) {
   }

   @Nullable
   protected lv h() {
      return null;
   }

   protected abstract boolean a(ewg var1, dib var2, iu var3, ewf var4, ja var5);

   protected abstract fei a(dib var1, iu var2, ewg var3);

   public abstract int a(diy var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ewg var1, dib var2, iu var3);

   public abstract float a(ewg var1);

   protected abstract dzz b(ewg var1);

   public abstract boolean c(ewg var1);

   public abstract int d(ewg var1);

   public boolean a(ewf $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axr<ewf> $$0) {
      return this.b.a($$0);
   }

   public abstract ffc b(ewg var1, dib var2, iu var3);

   @Nullable
   public fed c(ewg $$0, dib $$1, iu $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new fed((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awm> j() {
      return Optional.empty();
   }

   @Deprecated
   public je.c<ewf> k() {
      return this.b;
   }
}
