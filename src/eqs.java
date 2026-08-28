import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqs {
   public static final ju<eqt> c = new ju<>();
   protected final dut<eqs, eqt> d;
   private eqt a;
   private final jo.c<eqs> b = lv.c.f(this);

   protected eqs() {
      dut.a<eqs, eqt> $$0 = new dut.a<>(this);
      this.a($$0);
      this.d = $$0.a(eqs::g, eqt::new);
      this.f(this.d.b());
   }

   protected void a(dut.a<eqs, eqt> $$0) {
   }

   public dut<eqs, eqt> f() {
      return this.d;
   }

   protected final void f(eqt $$0) {
      this.a = $$0;
   }

   public final eqt g() {
      return this.a;
   }

   public abstract cvn a();

   protected void a(dej $$0, jf $$1, eqt $$2, azn $$3) {
   }

   protected void b(dej $$0, jf $$1, dus $$2, eqt $$3) {
   }

   protected void b(dej $$0, jf $$1, eqt $$2, azn $$3) {
   }

   @Nullable
   protected lm h() {
      return null;
   }

   protected abstract boolean a(eqt var1, ddo var2, jf var3, eqs var4, jk var5);

   protected abstract eyw a(ddo var1, jf var2, eqt var3);

   public abstract int a(dem var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eqt var1, ddo var2, jf var3);

   public abstract float a(eqt var1);

   protected abstract dus b(eqt var1);

   public abstract boolean c(eqt var1);

   public abstract int d(eqt var1);

   public boolean a(eqs $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axl<eqs> $$0) {
      return this.b.a($$0);
   }

   public abstract ezq b(eqt var1, ddo var2, jf var3);

   public Optional<awf> j() {
      return Optional.empty();
   }

   @Deprecated
   public jo.c<eqs> k() {
      return this.b;
   }
}
