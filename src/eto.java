import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eto {
   public static final jw<etp> c = new jw<>();
   protected final dxo<eto, etp> d;
   private etp a;
   private final jq.c<eto> b = ma.c.f(this);

   protected eto() {
      dxo.a<eto, etp> $$0 = new dxo.a<>(this);
      this.a($$0);
      this.d = $$0.a(eto::g, etp::new);
      this.f(this.d.b());
   }

   protected void a(dxo.a<eto, etp> $$0) {
   }

   public dxo<eto, etp> f() {
      return this.d;
   }

   protected final void f(etp $$0) {
      this.a = $$0;
   }

   public final etp g() {
      return this.a;
   }

   public abstract cxg a();

   protected void a(dha $$0, jh $$1, etp $$2, bam $$3) {
   }

   protected void b(ash $$0, jh $$1, dxn $$2, etp $$3) {
   }

   protected void a(ash $$0, jh $$1, etp $$2, bam $$3) {
   }

   @Nullable
   protected lq h() {
      return null;
   }

   protected abstract boolean a(etp var1, dgf var2, jh var3, eto var4, jm var5);

   protected abstract fbs a(dgf var1, jh var2, etp var3);

   public abstract int a(dhd var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(etp var1, dgf var2, jh var3);

   public abstract float a(etp var1);

   protected abstract dxn b(etp var1);

   public abstract boolean c(etp var1);

   public abstract int d(etp var1);

   public boolean a(eto $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(ayk<eto> $$0) {
      return this.b.a($$0);
   }

   public abstract fcm b(etp var1, dgf var2, jh var3);

   public Optional<axe> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<eto> k() {
      return this.b;
   }
}
