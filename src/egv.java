import java.util.Optional;
import javax.annotation.Nullable;

public abstract class egv {
   public static final ip<egw> c = new ip<>();
   protected final dlk<egv, egw> d;
   private egw a;
   private final ij.c<egv> b = kf.c.g(this);

   protected egv() {
      dlk.a<egv, egw> $$0 = new dlk.a<>(this);
      this.a($$0);
      this.d = $$0.a(egv::g, egw::new);
      this.f(this.d.b());
   }

   protected void a(dlk.a<egv, egw> $$0) {
   }

   public dlk<egv, egw> f() {
      return this.d;
   }

   protected final void f(egw $$0) {
      this.a = $$0;
   }

   public final egw g() {
      return this.a;
   }

   public abstract coy a();

   protected void a(cvr $$0, hz $$1, egw $$2, awp $$3) {
   }

   protected void b(cvr $$0, hz $$1, egw $$2) {
   }

   protected void b(cvr $$0, hz $$1, egw $$2, awp $$3) {
   }

   @Nullable
   protected jx h() {
      return null;
   }

   protected abstract boolean a(egw var1, cux var2, hz var3, egv var4, ie var5);

   protected abstract enz a(cux var1, hz var2, egw var3);

   public abstract int a(cvu var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(egw var1, cux var2, hz var3);

   public abstract float a(egw var1);

   protected abstract dlj b(egw var1);

   public abstract boolean c(egw var1);

   public abstract int d(egw var1);

   public boolean a(egv $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aup<egv> $$0) {
      return this.b.a($$0);
   }

   public abstract eos b(egw var1, cux var2, hz var3);

   public Optional<atk> j() {
      return Optional.empty();
   }

   @Deprecated
   public ij.c<egv> k() {
      return this.b;
   }
}
