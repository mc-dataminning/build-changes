import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eep {
   public static final in<eeq> c = new in<>();
   protected final djh<eep, eeq> d;
   private eeq a;
   private final ih.c<eep> b = kd.c.f(this);

   protected eep() {
      djh.a<eep, eeq> $$0 = new djh.a<>(this);
      this.a($$0);
      this.d = $$0.a(eep::g, eeq::new);
      this.f(this.d.b());
   }

   protected void a(djh.a<eep, eeq> $$0) {
   }

   public djh<eep, eeq> f() {
      return this.d;
   }

   protected final void f(eeq $$0) {
      this.a = $$0;
   }

   public final eeq g() {
      return this.a;
   }

   public abstract cms a();

   protected void a(cto $$0, hx $$1, eeq $$2, auu $$3) {
   }

   protected void b(cto $$0, hx $$1, eeq $$2) {
   }

   protected void b(cto $$0, hx $$1, eeq $$2, auu $$3) {
   }

   @Nullable
   protected jv h() {
      return null;
   }

   protected abstract boolean a(eeq var1, csu var2, hx var3, eep var4, ic var5);

   protected abstract els a(csu var1, hx var2, eeq var3);

   public abstract int a(ctr var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eeq var1, csu var2, hx var3);

   public abstract float a(eeq var1);

   protected abstract djg b(eeq var1);

   public abstract boolean c(eeq var1);

   public abstract int d(eeq var1);

   public boolean a(eep $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(asv<eep> $$0) {
      return this.b.a($$0);
   }

   public abstract eml b(eeq var1, csu var2, hx var3);

   public Optional<arq> j() {
      return Optional.empty();
   }

   @Deprecated
   public ih.c<eep> k() {
      return this.b;
   }
}
