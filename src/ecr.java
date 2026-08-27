import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecr {
   public static final ii<ecs> c = new ii<>();
   protected final dhj<ecr, ecs> d;
   private ecs a;
   private final ib.c<ecr> b = jy.d.f(this);

   protected ecr() {
      dhj.a<ecr, ecs> $$0 = new dhj.a<>(this);
      this.a($$0);
      this.d = $$0.a(ecr::g, ecs::new);
      this.f(this.d.b());
   }

   protected void a(dhj.a<ecr, ecs> $$0) {
   }

   public dhj<ecr, ecs> f() {
      return this.d;
   }

   protected final void f(ecs $$0) {
      this.a = $$0;
   }

   public final ecs g() {
      return this.a;
   }

   public abstract cle a();

   protected void a(csa $$0, ht $$1, ecs $$2, ats $$3) {
   }

   protected void b(csa $$0, ht $$1, ecs $$2) {
   }

   protected void b(csa $$0, ht $$1, ecs $$2, ats $$3) {
   }

   @Nullable
   protected jq h() {
      return null;
   }

   protected abstract boolean a(ecs var1, crg var2, ht var3, ecr var4, hx var5);

   protected abstract eju a(crg var1, ht var2, ecs var3);

   public abstract int a(csd var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ecs var1, crg var2, ht var3);

   public abstract float a(ecs var1);

   protected abstract dhi b(ecs var1);

   public abstract boolean c(ecs var1);

   public abstract int d(ecs var1);

   public boolean a(ecr $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(arv<ecr> $$0) {
      return this.b.a($$0);
   }

   public abstract ekn b(ecs var1, crg var2, ht var3);

   public Optional<aqq> j() {
      return Optional.empty();
   }

   @Deprecated
   public ib.c<ecr> k() {
      return this.b;
   }
}
