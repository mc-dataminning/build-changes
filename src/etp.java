import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etp {
   public static final jw<etq> c = new jw<>();
   protected final dxp<etp, etq> d;
   private etq a;
   private final jq.c<etp> b = ma.c.f(this);

   protected etp() {
      dxp.a<etp, etq> $$0 = new dxp.a<>(this);
      this.a($$0);
      this.d = $$0.a(etp::g, etq::new);
      this.f(this.d.b());
   }

   protected void a(dxp.a<etp, etq> $$0) {
   }

   public dxp<etp, etq> f() {
      return this.d;
   }

   protected final void f(etq $$0) {
      this.a = $$0;
   }

   public final etq g() {
      return this.a;
   }

   public abstract cxc a();

   protected void a(dgz $$0, jh $$1, etq $$2, bac $$3) {
   }

   protected void b(arx $$0, jh $$1, dxo $$2, etq $$3) {
   }

   protected void a(arx $$0, jh $$1, etq $$2, bac $$3) {
   }

   @Nullable
   protected lq h() {
      return null;
   }

   protected abstract boolean a(etq var1, dge var2, jh var3, etp var4, jm var5);

   protected abstract fbr a(dge var1, jh var2, etq var3);

   public abstract int a(dhc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(etq var1, dge var2, jh var3);

   public abstract float a(etq var1);

   protected abstract dxo b(etq var1);

   public abstract boolean c(etq var1);

   public abstract int d(etq var1);

   public boolean a(etp $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aya<etp> $$0) {
      return this.b.a($$0);
   }

   public abstract fcl b(etq var1, dge var2, jh var3);

   public Optional<awu> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<etp> k() {
      return this.b;
   }
}
