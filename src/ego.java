import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ego {
   public static final ip<egp> c = new ip<>();
   protected final dlg<ego, egp> d;
   private egp a;
   private final ij.c<ego> b = kf.c.g(this);

   protected ego() {
      dlg.a<ego, egp> $$0 = new dlg.a<>(this);
      this.a($$0);
      this.d = $$0.a(ego::g, egp::new);
      this.f(this.d.b());
   }

   protected void a(dlg.a<ego, egp> $$0) {
   }

   public dlg<ego, egp> f() {
      return this.d;
   }

   protected final void f(egp $$0) {
      this.a = $$0;
   }

   public final egp g() {
      return this.a;
   }

   public abstract cou a();

   protected void a(cvn $$0, hz $$1, egp $$2, awo $$3) {
   }

   protected void b(cvn $$0, hz $$1, egp $$2) {
   }

   protected void b(cvn $$0, hz $$1, egp $$2, awo $$3) {
   }

   @Nullable
   protected jx h() {
      return null;
   }

   protected abstract boolean a(egp var1, cut var2, hz var3, ego var4, ie var5);

   protected abstract ens a(cut var1, hz var2, egp var3);

   public abstract int a(cvq var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(egp var1, cut var2, hz var3);

   public abstract float a(egp var1);

   protected abstract dlf b(egp var1);

   public abstract boolean c(egp var1);

   public abstract int d(egp var1);

   public boolean a(ego $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(auo<ego> $$0) {
      return this.b.a($$0);
   }

   public abstract eol b(egp var1, cut var2, hz var3);

   public Optional<atj> j() {
      return Optional.empty();
   }

   @Deprecated
   public ij.c<ego> k() {
      return this.b;
   }
}
