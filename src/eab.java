import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eab {
   public static final hk<eac> c = new hk<>();
   protected final dfa<eab, eac> d;
   private eac a;
   private final he.c<eab> b = jb.d.f(this);

   protected eab() {
      dfa.a<eab, eac> $$0 = new dfa.a<>(this);
      this.a($$0);
      this.d = $$0.a(eab::g, eac::new);
      this.f(this.d.b());
   }

   protected void a(dfa.a<eab, eac> $$0) {
   }

   public dfa<eab, eac> f() {
      return this.d;
   }

   protected final void f(eac $$0) {
      this.a = $$0;
   }

   public final eac g() {
      return this.a;
   }

   public abstract cis a();

   protected void a(cpl $$0, gu $$1, eac $$2, aru $$3) {
   }

   protected void b(cpl $$0, gu $$1, eac $$2) {
   }

   protected void b(cpl $$0, gu $$1, eac $$2, aru $$3) {
   }

   @Nullable
   protected it h() {
      return null;
   }

   protected abstract boolean a(eac var1, cor var2, gu var3, eab var4, ha var5);

   protected abstract ehd a(cor var1, gu var2, eac var3);

   public abstract int a(cpo var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eac var1, cor var2, gu var3);

   public abstract float a(eac var1);

   protected abstract dez b(eac var1);

   public abstract boolean c(eac var1);

   public abstract int d(eac var1);

   public boolean a(eab $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aqa<eab> $$0) {
      return this.b.a($$0);
   }

   public abstract ehw b(eac var1, cor var2, gu var3);

   public Optional<aov> j() {
      return Optional.empty();
   }

   @Deprecated
   public he.c<eab> k() {
      return this.b;
   }
}
