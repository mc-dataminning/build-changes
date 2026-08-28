import java.util.Optional;
import javax.annotation.Nullable;

public abstract class env {
   public static final jo<enw> c = new jo<>();
   protected final dse<env, enw> d;
   private enw a;
   private final ji.c<env> b = lp.c.f(this);

   protected env() {
      dse.a<env, enw> $$0 = new dse.a<>(this);
      this.a($$0);
      this.d = $$0.a(env::g, enw::new);
      this.f(this.d.b());
   }

   protected void a(dse.a<env, enw> $$0) {
   }

   public dse<env, enw> f() {
      return this.d;
   }

   protected final void f(enw $$0) {
      this.a = $$0;
   }

   public final enw g() {
      return this.a;
   }

   public abstract cul a();

   protected void a(dbz $$0, iz $$1, enw $$2, azh $$3) {
   }

   protected void b(dbz $$0, iz $$1, enw $$2) {
   }

   protected void b(dbz $$0, iz $$1, enw $$2, azh $$3) {
   }

   @Nullable
   protected lg h() {
      return null;
   }

   protected abstract boolean a(enw var1, dbf var2, iz var3, env var4, je var5);

   protected abstract evs a(dbf var1, iz var2, enw var3);

   public abstract int a(dcc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(enw var1, dbf var2, iz var3);

   public abstract float a(enw var1);

   protected abstract dsd b(enw var1);

   public abstract boolean c(enw var1);

   public abstract int d(enw var1);

   public boolean a(env $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<env> $$0) {
      return this.b.a($$0);
   }

   public abstract ewl b(enw var1, dbf var2, iz var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public ji.c<env> k() {
      return this.b;
   }
}
