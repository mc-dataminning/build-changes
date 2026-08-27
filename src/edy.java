import java.util.Optional;
import javax.annotation.Nullable;

public abstract class edy {
   public static final il<edz> c = new il<>();
   protected final diq<edy, edz> d;
   private edz a;
   private final ie.c<edy> b = kb.c.f(this);

   protected edy() {
      diq.a<edy, edz> $$0 = new diq.a<>(this);
      this.a($$0);
      this.d = $$0.a(edy::g, edz::new);
      this.f(this.d.b());
   }

   protected void a(diq.a<edy, edz> $$0) {
   }

   public diq<edy, edz> f() {
      return this.d;
   }

   protected final void f(edz $$0) {
      this.a = $$0;
   }

   public final edz g() {
      return this.a;
   }

   public abstract cmc a();

   protected void a(csy $$0, hv $$1, edz $$2, auf $$3) {
   }

   protected void b(csy $$0, hv $$1, edz $$2) {
   }

   protected void b(csy $$0, hv $$1, edz $$2, auf $$3) {
   }

   @Nullable
   protected jt h() {
      return null;
   }

   protected abstract boolean a(edz var1, cse var2, hv var3, edy var4, ia var5);

   protected abstract elb a(cse var1, hv var2, edz var3);

   public abstract int a(ctb var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(edz var1, cse var2, hv var3);

   public abstract float a(edz var1);

   protected abstract dip b(edz var1);

   public abstract boolean c(edz var1);

   public abstract int d(edz var1);

   public boolean a(edy $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(asg<edy> $$0) {
      return this.b.a($$0);
   }

   public abstract elu b(edz var1, cse var2, hv var3);

   public Optional<arb> j() {
      return Optional.empty();
   }

   @Deprecated
   public ie.c<edy> k() {
      return this.b;
   }
}
