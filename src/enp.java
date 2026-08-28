import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enp {
   public static final jo<enq> c = new jo<>();
   protected final dry<enp, enq> d;
   private enq a;
   private final ji.c<enp> b = lp.c.f(this);

   protected enp() {
      dry.a<enp, enq> $$0 = new dry.a<>(this);
      this.a($$0);
      this.d = $$0.a(enp::g, enq::new);
      this.f(this.d.b());
   }

   protected void a(dry.a<enp, enq> $$0) {
   }

   public dry<enp, enq> f() {
      return this.d;
   }

   protected final void f(enq $$0) {
      this.a = $$0;
   }

   public final enq g() {
      return this.a;
   }

   public abstract cuf a();

   protected void a(dbt $$0, iz $$1, enq $$2, azc $$3) {
   }

   protected void b(dbt $$0, iz $$1, enq $$2) {
   }

   protected void b(dbt $$0, iz $$1, enq $$2, azc $$3) {
   }

   @Nullable
   protected lh h() {
      return null;
   }

   protected abstract boolean a(enq var1, daz var2, iz var3, enp var4, je var5);

   protected abstract evm a(daz var1, iz var2, enq var3);

   public abstract int a(dbw var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(enq var1, daz var2, iz var3);

   public abstract float a(enq var1);

   protected abstract drx b(enq var1);

   public abstract boolean c(enq var1);

   public abstract int d(enq var1);

   public boolean a(enp $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axb<enp> $$0) {
      return this.b.a($$0);
   }

   public abstract ewf b(enq var1, daz var2, iz var3);

   public Optional<avv> j() {
      return Optional.empty();
   }

   @Deprecated
   public ji.c<enp> k() {
      return this.b;
   }
}
