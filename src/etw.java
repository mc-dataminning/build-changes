import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etw {
   public static final jw<etx> c = new jw<>();
   protected final dxw<etw, etx> d;
   private etx a;
   private final jq.c<etw> b = ma.c.f(this);

   protected etw() {
      dxw.a<etw, etx> $$0 = new dxw.a<>(this);
      this.a($$0);
      this.d = $$0.a(etw::g, etx::new);
      this.f(this.d.b());
   }

   protected void a(dxw.a<etw, etx> $$0) {
   }

   public dxw<etw, etx> f() {
      return this.d;
   }

   protected final void f(etx $$0) {
      this.a = $$0;
   }

   public final etx g() {
      return this.a;
   }

   public abstract cxl a();

   protected void a(dhi $$0, jh $$1, etx $$2, bam $$3) {
   }

   protected void b(ash $$0, jh $$1, dxv $$2, etx $$3) {
   }

   protected void a(ash $$0, jh $$1, etx $$2, bam $$3) {
   }

   @Nullable
   protected lq h() {
      return null;
   }

   protected abstract boolean a(etx var1, dgn var2, jh var3, etw var4, jm var5);

   protected abstract fby a(dgn var1, jh var2, etx var3);

   public abstract int a(dhl var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(etx var1, dgn var2, jh var3);

   public abstract float a(etx var1);

   protected abstract dxv b(etx var1);

   public abstract boolean c(etx var1);

   public abstract int d(etx var1);

   public boolean a(etw $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(ayk<etw> $$0) {
      return this.b.a($$0);
   }

   public abstract fcs b(etx var1, dgn var2, jh var3);

   public Optional<axe> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<etw> k() {
      return this.b;
   }
}
