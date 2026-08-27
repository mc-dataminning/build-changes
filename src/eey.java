import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eey {
   public static final in<eez> c = new in<>();
   protected final djq<eey, eez> d;
   private eez a;
   private final ih.c<eey> b = kd.c.f(this);

   protected eey() {
      djq.a<eey, eez> $$0 = new djq.a<>(this);
      this.a($$0);
      this.d = $$0.a(eey::g, eez::new);
      this.f(this.d.b());
   }

   protected void a(djq.a<eey, eez> $$0) {
   }

   public djq<eey, eez> f() {
      return this.d;
   }

   protected final void f(eez $$0) {
      this.a = $$0;
   }

   public final eez g() {
      return this.a;
   }

   public abstract cnb a();

   protected void a(ctx $$0, hx $$1, eez $$2, auw $$3) {
   }

   protected void b(ctx $$0, hx $$1, eez $$2) {
   }

   protected void b(ctx $$0, hx $$1, eez $$2, auw $$3) {
   }

   @Nullable
   protected jv h() {
      return null;
   }

   protected abstract boolean a(eez var1, ctd var2, hx var3, eey var4, ic var5);

   protected abstract emc a(ctd var1, hx var2, eez var3);

   public abstract int a(cua var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eez var1, ctd var2, hx var3);

   public abstract float a(eez var1);

   protected abstract djp b(eez var1);

   public abstract boolean c(eez var1);

   public abstract int d(eez var1);

   public boolean a(eey $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(asx<eey> $$0) {
      return this.b.a($$0);
   }

   public abstract emv b(eez var1, ctd var2, hx var3);

   public Optional<ars> j() {
      return Optional.empty();
   }

   @Deprecated
   public ih.c<eey> k() {
      return this.b;
   }
}
