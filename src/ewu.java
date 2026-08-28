import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewu {
   public static final jl<ewv> c = new jl<>();
   protected final eap<ewu, ewv> d;
   private ewv a;
   private final jf.c<ewu> b = mg.c.f(this);

   protected ewu() {
      eap.a<ewu, ewv> $$0 = new eap.a<>(this);
      this.a($$0);
      this.d = $$0.a(ewu::g, ewv::new);
      this.f(this.d.b());
   }

   protected void a(eap.a<ewu, ewv> $$0) {
   }

   public eap<ewu, ewv> f() {
      return this.d;
   }

   protected final void f(ewv $$0) {
      this.a = $$0;
   }

   public final ewv g() {
      return this.a;
   }

   public abstract czg a();

   protected void a(djh $$0, iv $$1, ewv $$2, azv $$3) {
   }

   protected void b(arq $$0, iv $$1, eao $$2, ewv $$3) {
   }

   protected void a(arq $$0, iv $$1, ewv $$2, azv $$3) {
   }

   protected void a(djh $$0, iv $$1, bwi $$2, bxb $$3) {
   }

   @Nullable
   protected lw h() {
      return null;
   }

   protected abstract boolean a(ewv var1, din var2, iv var3, ewu var4, jb var5);

   protected abstract fex a(din var1, iv var2, ewv var3);

   public abstract int a(djk var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ewv var1, din var2, iv var3);

   public abstract float a(ewv var1);

   protected abstract eao b(ewv var1);

   public abstract boolean c(ewv var1);

   public abstract int d(ewv var1);

   public boolean a(ewu $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axr<ewu> $$0) {
      return this.b.a($$0);
   }

   public abstract ffr b(ewv var1, din var2, iv var3);

   @Nullable
   public fes c(ewv $$0, din $$1, iv $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new fes((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awm> j() {
      return Optional.empty();
   }

   @Deprecated
   public jf.c<ewu> k() {
      return this.b;
   }
}
