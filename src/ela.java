import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ela {
   public static final it<elb> c = new it<>();
   protected final dpj<ela, elb> d;
   private elb a;
   private final in.c<ela> b = kt.c.f(this);

   protected ela() {
      dpj.a<ela, elb> $$0 = new dpj.a<>(this);
      this.a($$0);
      this.d = $$0.a(ela::g, elb::new);
      this.f(this.d.b());
   }

   protected void a(dpj.a<ela, elb> $$0) {
   }

   public dpj<ela, elb> f() {
      return this.d;
   }

   protected final void f(elb $$0) {
      this.a = $$0;
   }

   public final elb g() {
      return this.a;
   }

   public abstract crn a();

   protected void a(czg $$0, id $$1, elb $$2, axt $$3) {
   }

   protected void b(czg $$0, id $$1, elb $$2) {
   }

   protected void b(czg $$0, id $$1, elb $$2, axt $$3) {
   }

   @Nullable
   protected kl h() {
      return null;
   }

   protected abstract boolean a(elb var1, cym var2, id var3, ela var4, ij var5);

   protected abstract esj a(cym var1, id var2, elb var3);

   public abstract int a(czj var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(elb var1, cym var2, id var3);

   public abstract float a(elb var1);

   protected abstract dpi b(elb var1);

   public abstract boolean c(elb var1);

   public abstract int d(elb var1);

   public boolean a(ela $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(avt<ela> $$0) {
      return this.b.a($$0);
   }

   public abstract etc b(elb var1, cym var2, id var3);

   public Optional<aun> j() {
      return Optional.empty();
   }

   @Deprecated
   public in.c<ela> k() {
      return this.b;
   }
}
