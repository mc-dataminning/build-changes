import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exp {
   public static final jm<exq> c = new jm<>();
   protected final ebh<exp, exq> d;
   private exq a;
   private final jg.c<exp> b = mh.c.f(this);

   protected exp() {
      ebh.a<exp, exq> $$0 = new ebh.a<>(this);
      this.a($$0);
      this.d = $$0.a(exp::g, exq::new);
      this.f(this.d.b());
   }

   protected void a(ebh.a<exp, exq> $$0) {
   }

   public ebh<exp, exq> f() {
      return this.d;
   }

   protected final void f(exq $$0) {
      this.a = $$0;
   }

   public final exq g() {
      return this.a;
   }

   public abstract czw a();

   protected void a(djz $$0, iw $$1, exq $$2, azz $$3) {
   }

   protected void b(aru $$0, iw $$1, ebg $$2, exq $$3) {
   }

   protected void a(aru $$0, iw $$1, exq $$2, azz $$3) {
   }

   protected void a(djz $$0, iw $$1, bwv $$2, bxo $$3) {
   }

   @Nullable
   protected lx h() {
      return null;
   }

   protected abstract boolean a(exq var1, djd var2, iw var3, exp var4, jc var5);

   protected abstract ffs a(djd var1, iw var2, exq var3);

   public abstract int a(dkc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(exq var1, djd var2, iw var3);

   public abstract float a(exq var1);

   protected abstract ebg b(exq var1);

   public abstract boolean c(exq var1);

   public abstract int d(exq var1);

   public boolean a(exp $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axv<exp> $$0) {
      return this.b.a($$0);
   }

   public abstract fgm b(exq var1, djd var2, iw var3);

   @Nullable
   public ffn c(exq $$0, djd $$1, iw $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new ffn((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)$$2.u() + 1.0, (double)((float)$$2.v() + $$3), (double)$$2.w() + 1.0);
      }
   }

   public Optional<awq> j() {
      return Optional.empty();
   }

   @Deprecated
   public jg.c<exp> k() {
      return this.b;
   }
}
