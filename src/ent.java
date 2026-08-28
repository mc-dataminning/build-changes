import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ent {
   public static final jo<enu> c = new jo<>();
   protected final dsc<ent, enu> d;
   private enu a;
   private final ji.c<ent> b = lp.c.f(this);

   protected ent() {
      dsc.a<ent, enu> $$0 = new dsc.a<>(this);
      this.a($$0);
      this.d = $$0.a(ent::g, enu::new);
      this.f(this.d.b());
   }

   protected void a(dsc.a<ent, enu> $$0) {
   }

   public dsc<ent, enu> f() {
      return this.d;
   }

   protected final void f(enu $$0) {
      this.a = $$0;
   }

   public final enu g() {
      return this.a;
   }

   public abstract cuj a();

   protected void a(dbx $$0, iz $$1, enu $$2, azg $$3) {
   }

   protected void b(dbx $$0, iz $$1, enu $$2) {
   }

   protected void b(dbx $$0, iz $$1, enu $$2, azg $$3) {
   }

   @Nullable
   protected lg h() {
      return null;
   }

   protected abstract boolean a(enu var1, dbd var2, iz var3, ent var4, je var5);

   protected abstract evq a(dbd var1, iz var2, enu var3);

   public abstract int a(dca var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(enu var1, dbd var2, iz var3);

   public abstract float a(enu var1);

   protected abstract dsb b(enu var1);

   public abstract boolean c(enu var1);

   public abstract int d(enu var1);

   public boolean a(ent $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axe<ent> $$0) {
      return this.b.a($$0);
   }

   public abstract ewj b(enu var1, dbd var2, iz var3);

   public Optional<avy> j() {
      return Optional.empty();
   }

   @Deprecated
   public ji.c<ent> k() {
      return this.b;
   }
}
