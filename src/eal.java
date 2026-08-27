import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eal {
   public static final hm<eam> c = new hm<>();
   protected final dfk<eal, eam> d;
   private eam a;
   private final hg.c<eal> b = jd.d.f(this);

   protected eal() {
      dfk.a<eal, eam> $$0 = new dfk.a<>(this);
      this.a($$0);
      this.d = $$0.a(eal::g, eam::new);
      this.f(this.d.b());
   }

   protected void a(dfk.a<eal, eam> $$0) {
   }

   public dfk<eal, eam> f() {
      return this.d;
   }

   protected final void f(eam $$0) {
      this.a = $$0;
   }

   public final eam g() {
      return this.a;
   }

   public abstract cja a();

   protected void a(cpv $$0, gw $$1, eam $$2, asc $$3) {
   }

   protected void b(cpv $$0, gw $$1, eam $$2) {
   }

   protected void b(cpv $$0, gw $$1, eam $$2, asc $$3) {
   }

   @Nullable
   protected iv h() {
      return null;
   }

   protected abstract boolean a(eam var1, cpb var2, gw var3, eal var4, hc var5);

   protected abstract ehn a(cpb var1, gw var2, eam var3);

   public abstract int a(cpy var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eam var1, cpb var2, gw var3);

   public abstract float a(eam var1);

   protected abstract dfj b(eam var1);

   public abstract boolean c(eam var1);

   public abstract int d(eam var1);

   public boolean a(eal $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aqi<eal> $$0) {
      return this.b.a($$0);
   }

   public abstract eig b(eam var1, cpb var2, gw var3);

   public Optional<apd> j() {
      return Optional.empty();
   }

   @Deprecated
   public hg.c<eal> k() {
      return this.b;
   }
}
