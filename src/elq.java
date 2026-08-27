import java.util.Optional;
import javax.annotation.Nullable;

public abstract class elq {
   public static final jb<elr> c = new jb<>();
   protected final dpz<elq, elr> d;
   private elr a;
   private final iv.c<elq> b = lc.c.f(this);

   protected elq() {
      dpz.a<elq, elr> $$0 = new dpz.a<>(this);
      this.a($$0);
      this.d = $$0.a(elq::g, elr::new);
      this.f(this.d.b());
   }

   protected void a(dpz.a<elq, elr> $$0) {
   }

   public dpz<elq, elr> f() {
      return this.d;
   }

   protected final void f(elr $$0) {
      this.a = $$0;
   }

   public final elr g() {
      return this.a;
   }

   public abstract cry a();

   protected void a(czu $$0, im $$1, elr $$2, ayd $$3) {
   }

   protected void b(czu $$0, im $$1, elr $$2) {
   }

   protected void b(czu $$0, im $$1, elr $$2, ayd $$3) {
   }

   @Nullable
   protected ku h() {
      return null;
   }

   protected abstract boolean a(elr var1, cza var2, im var3, elq var4, ir var5);

   protected abstract etf a(cza var1, im var2, elr var3);

   public abstract int a(czx var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(elr var1, cza var2, im var3);

   public abstract float a(elr var1);

   protected abstract dpy b(elr var1);

   public abstract boolean c(elr var1);

   public abstract int d(elr var1);

   public boolean a(elq $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awd<elq> $$0) {
      return this.b.a($$0);
   }

   public abstract ety b(elr var1, cza var2, im var3);

   public Optional<auy> j() {
      return Optional.empty();
   }

   @Deprecated
   public iv.c<elq> k() {
      return this.b;
   }
}
