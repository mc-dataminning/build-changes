import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eog {
   public static final jp<eoh> c = new jp<>();
   protected final dsl<eog, eoh> d;
   private eoh a;
   private final jj.c<eog> b = lq.c.f(this);

   protected eog() {
      dsl.a<eog, eoh> $$0 = new dsl.a<>(this);
      this.a($$0);
      this.d = $$0.a(eog::g, eoh::new);
      this.f(this.d.b());
   }

   protected void a(dsl.a<eog, eoh> $$0) {
   }

   public dsl<eog, eoh> f() {
      return this.d;
   }

   protected final void f(eoh $$0) {
      this.a = $$0;
   }

   public final eoh g() {
      return this.a;
   }

   public abstract ctx a();

   protected void a(dcf $$0, ja $$1, eoh $$2, ayo $$3) {
   }

   protected void b(dcf $$0, ja $$1, eoh $$2) {
   }

   protected void b(dcf $$0, ja $$1, eoh $$2, ayo $$3) {
   }

   @Nullable
   protected lh h() {
      return null;
   }

   protected abstract boolean a(eoh var1, dbl var2, ja var3, eog var4, jf var5);

   protected abstract ewf a(dbl var1, ja var2, eoh var3);

   public abstract int a(dci var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eoh var1, dbl var2, ja var3);

   public abstract float a(eoh var1);

   protected abstract dsk b(eoh var1);

   public abstract boolean c(eoh var1);

   public abstract int d(eoh var1);

   public boolean a(eog $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awm<eog> $$0) {
      return this.b.a($$0);
   }

   public abstract ewy b(eoh var1, dbl var2, ja var3);

   public Optional<avg> j() {
      return Optional.empty();
   }

   @Deprecated
   public jj.c<eog> k() {
      return this.b;
   }
}
