import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enw {
   public static final jo<enx> c = new jo<>();
   protected final dsf<enw, enx> d;
   private enx a;
   private final ji.c<enw> b = lp.c.f(this);

   protected enw() {
      dsf.a<enw, enx> $$0 = new dsf.a<>(this);
      this.a($$0);
      this.d = $$0.a(enw::g, enx::new);
      this.f(this.d.b());
   }

   protected void a(dsf.a<enw, enx> $$0) {
   }

   public dsf<enw, enx> f() {
      return this.d;
   }

   protected final void f(enx $$0) {
      this.a = $$0;
   }

   public final enx g() {
      return this.a;
   }

   public abstract cum a();

   protected void a(dca $$0, iz $$1, enx $$2, azh $$3) {
   }

   protected void b(dca $$0, iz $$1, enx $$2) {
   }

   protected void b(dca $$0, iz $$1, enx $$2, azh $$3) {
   }

   @Nullable
   protected lg h() {
      return null;
   }

   protected abstract boolean a(enx var1, dbg var2, iz var3, enw var4, je var5);

   protected abstract evt a(dbg var1, iz var2, enx var3);

   public abstract int a(dcd var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(enx var1, dbg var2, iz var3);

   public abstract float a(enx var1);

   protected abstract dse b(enx var1);

   public abstract boolean c(enx var1);

   public abstract int d(enx var1);

   public boolean a(enw $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<enw> $$0) {
      return this.b.a($$0);
   }

   public abstract ewm b(enx var1, dbg var2, iz var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public ji.c<enw> k() {
      return this.b;
   }
}
