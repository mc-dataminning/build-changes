import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enu {
   public static final jo<env> c = new jo<>();
   protected final dsd<enu, env> d;
   private env a;
   private final ji.c<enu> b = lp.c.f(this);

   protected enu() {
      dsd.a<enu, env> $$0 = new dsd.a<>(this);
      this.a($$0);
      this.d = $$0.a(enu::g, env::new);
      this.f(this.d.b());
   }

   protected void a(dsd.a<enu, env> $$0) {
   }

   public dsd<enu, env> f() {
      return this.d;
   }

   protected final void f(env $$0) {
      this.a = $$0;
   }

   public final env g() {
      return this.a;
   }

   public abstract cuk a();

   protected void a(dby $$0, iz $$1, env $$2, azh $$3) {
   }

   protected void b(dby $$0, iz $$1, env $$2) {
   }

   protected void b(dby $$0, iz $$1, env $$2, azh $$3) {
   }

   @Nullable
   protected lg h() {
      return null;
   }

   protected abstract boolean a(env var1, dbe var2, iz var3, enu var4, je var5);

   protected abstract evr a(dbe var1, iz var2, env var3);

   public abstract int a(dcb var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(env var1, dbe var2, iz var3);

   public abstract float a(env var1);

   protected abstract dsc b(env var1);

   public abstract boolean c(env var1);

   public abstract int d(env var1);

   public boolean a(enu $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<enu> $$0) {
      return this.b.a($$0);
   }

   public abstract ewk b(env var1, dbe var2, iz var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public ji.c<enu> k() {
      return this.b;
   }
}
