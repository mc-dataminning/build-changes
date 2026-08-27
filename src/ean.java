import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ean {
   public static final hm<eao> c = new hm<>();
   protected final dfm<ean, eao> d;
   private eao a;
   private final hg.c<ean> b = jd.d.f(this);

   protected ean() {
      dfm.a<ean, eao> $$0 = new dfm.a<>(this);
      this.a($$0);
      this.d = $$0.a(ean::g, eao::new);
      this.f(this.d.b());
   }

   protected void a(dfm.a<ean, eao> $$0) {
   }

   public dfm<ean, eao> f() {
      return this.d;
   }

   protected final void f(eao $$0) {
      this.a = $$0;
   }

   public final eao g() {
      return this.a;
   }

   public abstract cjc a();

   protected void a(cpx $$0, gw $$1, eao $$2, ase $$3) {
   }

   protected void b(cpx $$0, gw $$1, eao $$2) {
   }

   protected void b(cpx $$0, gw $$1, eao $$2, ase $$3) {
   }

   @Nullable
   protected iv h() {
      return null;
   }

   protected abstract boolean a(eao var1, cpd var2, gw var3, ean var4, hc var5);

   protected abstract ehp a(cpd var1, gw var2, eao var3);

   public abstract int a(cqa var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eao var1, cpd var2, gw var3);

   public abstract float a(eao var1);

   protected abstract dfl b(eao var1);

   public abstract boolean c(eao var1);

   public abstract int d(eao var1);

   public boolean a(ean $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aqj<ean> $$0) {
      return this.b.a($$0);
   }

   public abstract eii b(eao var1, cpd var2, gw var3);

   public Optional<ape> j() {
      return Optional.empty();
   }

   @Deprecated
   public hg.c<ean> k() {
      return this.b;
   }
}
