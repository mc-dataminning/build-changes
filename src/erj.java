import java.util.Optional;
import javax.annotation.Nullable;

public abstract class erj {
   public static final jw<erk> c = new jw<>();
   protected final dvk<erj, erk> d;
   private erk a;
   private final jq.c<erj> b = ly.c.f(this);

   protected erj() {
      dvk.a<erj, erk> $$0 = new dvk.a<>(this);
      this.a($$0);
      this.d = $$0.a(erj::g, erk::new);
      this.f(this.d.b());
   }

   protected void a(dvk.a<erj, erk> $$0) {
   }

   public dvk<erj, erk> f() {
      return this.d;
   }

   protected final void f(erk $$0) {
      this.a = $$0;
   }

   public final erk g() {
      return this.a;
   }

   public abstract cvx a();

   protected void a(dfb $$0, jh $$1, erk $$2, azs $$3) {
   }

   protected void b(dfb $$0, jh $$1, dvj $$2, erk $$3) {
   }

   protected void b(dfb $$0, jh $$1, erk $$2, azs $$3) {
   }

   @Nullable
   protected lp h() {
      return null;
   }

   protected abstract boolean a(erk var1, deg var2, jh var3, erj var4, jm var5);

   protected abstract ezn a(deg var1, jh var2, erk var3);

   public abstract int a(dfe var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(erk var1, deg var2, jh var3);

   public abstract float a(erk var1);

   protected abstract dvj b(erk var1);

   public abstract boolean c(erk var1);

   public abstract int d(erk var1);

   public boolean a(erj $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axq<erj> $$0) {
      return this.b.a($$0);
   }

   public abstract fah b(erk var1, deg var2, jh var3);

   public Optional<awk> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<erj> k() {
      return this.b;
   }
}
