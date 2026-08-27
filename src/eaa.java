import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eaa {
   public static final hl<eab> c = new hl<>();
   protected final dez<eaa, eab> d;
   private eab a;
   private final hf.c<eaa> b = jc.d.f(this);

   protected eaa() {
      dez.a<eaa, eab> $$0 = new dez.a<>(this);
      this.a($$0);
      this.d = $$0.a(eaa::g, eab::new);
      this.f(this.d.b());
   }

   protected void a(dez.a<eaa, eab> $$0) {
   }

   public dez<eaa, eab> f() {
      return this.d;
   }

   protected final void f(eab $$0) {
      this.a = $$0;
   }

   public final eab g() {
      return this.a;
   }

   public abstract cir a();

   protected void a(cpk $$0, gv $$1, eab $$2, art $$3) {
   }

   protected void b(cpk $$0, gv $$1, eab $$2) {
   }

   protected void b(cpk $$0, gv $$1, eab $$2, art $$3) {
   }

   @Nullable
   protected iu h() {
      return null;
   }

   protected abstract boolean a(eab var1, coq var2, gv var3, eaa var4, hb var5);

   protected abstract ehf a(coq var1, gv var2, eab var3);

   public abstract int a(cpn var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eab var1, coq var2, gv var3);

   public abstract float a(eab var1);

   protected abstract dey b(eab var1);

   public abstract boolean c(eab var1);

   public abstract int d(eab var1);

   public boolean a(eaa $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(apy<eaa> $$0) {
      return this.b.a($$0);
   }

   public abstract ehy b(eab var1, coq var2, gv var3);

   public Optional<aot> j() {
      return Optional.empty();
   }

   @Deprecated
   public hf.c<eaa> k() {
      return this.b;
   }
}
