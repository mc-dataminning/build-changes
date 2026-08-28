import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ens {
   public static final jo<ent> c = new jo<>();
   protected final dsb<ens, ent> d;
   private ent a;
   private final ji.c<ens> b = lp.c.f(this);

   protected ens() {
      dsb.a<ens, ent> $$0 = new dsb.a<>(this);
      this.a($$0);
      this.d = $$0.a(ens::g, ent::new);
      this.f(this.d.b());
   }

   protected void a(dsb.a<ens, ent> $$0) {
   }

   public dsb<ens, ent> f() {
      return this.d;
   }

   protected final void f(ent $$0) {
      this.a = $$0;
   }

   public final ent g() {
      return this.a;
   }

   public abstract cui a();

   protected void a(dbw $$0, iz $$1, ent $$2, azf $$3) {
   }

   protected void b(dbw $$0, iz $$1, ent $$2) {
   }

   protected void b(dbw $$0, iz $$1, ent $$2, azf $$3) {
   }

   @Nullable
   protected lg h() {
      return null;
   }

   protected abstract boolean a(ent var1, dbc var2, iz var3, ens var4, je var5);

   protected abstract evp a(dbc var1, iz var2, ent var3);

   public abstract int a(dbz var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ent var1, dbc var2, iz var3);

   public abstract float a(ent var1);

   protected abstract dsa b(ent var1);

   public abstract boolean c(ent var1);

   public abstract int d(ent var1);

   public boolean a(ens $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axe<ens> $$0) {
      return this.b.a($$0);
   }

   public abstract ewi b(ent var1, dbc var2, iz var3);

   public Optional<avy> j() {
      return Optional.empty();
   }

   @Deprecated
   public ji.c<ens> k() {
      return this.b;
   }
}
