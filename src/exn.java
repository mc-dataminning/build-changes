import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exn {
   public static final jl<exo> c = new jl<>();
   protected final ebf<exn, exo> d;
   private exo a;
   private final jf.c<exn> b = mg.c.f(this);

   protected exn() {
      ebf.a<exn, exo> $$0 = new ebf.a<>(this);
      this.a($$0);
      this.d = $$0.a(exn::g, exo::new);
      this.f(this.d.b());
   }

   protected void a(ebf.a<exn, exo> $$0) {
   }

   public ebf<exn, exo> f() {
      return this.d;
   }

   protected final void f(exo $$0) {
      this.a = $$0;
   }

   public final exo g() {
      return this.a;
   }

   public abstract czu a();

   protected void a(djx $$0, iv $$1, exo $$2, azx $$3) {
   }

   protected void b(ars $$0, iv $$1, ebe $$2, exo $$3) {
   }

   protected void a(ars $$0, iv $$1, exo $$2, azx $$3) {
   }

   protected void a(djx $$0, iv $$1, bwt $$2, bxm $$3) {
   }

   @Nullable
   protected lw h() {
      return null;
   }

   protected abstract boolean a(exo var1, djb var2, iv var3, exn var4, jb var5);

   protected abstract ffq a(djb var1, iv var2, exo var3);

   public abstract int a(dka var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(exo var1, djb var2, iv var3);

   public abstract float a(exo var1);

   protected abstract ebe b(exo var1);

   public abstract boolean c(exo var1);

   public abstract int d(exo var1);

   public boolean a(exn $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axt<exn> $$0) {
      return this.b.a($$0);
   }

   public abstract fgk b(exo var1, djb var2, iv var3);

   @Nullable
   public ffl c(exo $$0, djb $$1, iv $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new ffl((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awo> j() {
      return Optional.empty();
   }

   @Deprecated
   public jf.c<exn> k() {
      return this.b;
   }
}
