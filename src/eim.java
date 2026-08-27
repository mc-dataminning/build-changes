import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eim {
   public static final ir<ein> c = new ir<>();
   protected final dna<eim, ein> d;
   private ein a;
   private final il.c<eim> b = ki.c.f(this);

   protected eim() {
      dna.a<eim, ein> $$0 = new dna.a<>(this);
      this.a($$0);
      this.d = $$0.a(eim::g, ein::new);
      this.f(this.d.b());
   }

   protected void a(dna.a<eim, ein> $$0) {
   }

   public dna<eim, ein> f() {
      return this.d;
   }

   protected final void f(ein $$0) {
      this.a = $$0;
   }

   public final ein g() {
      return this.a;
   }

   public abstract cqf a();

   protected void a(cwz $$0, ib $$1, ein $$2, axd $$3) {
   }

   protected void b(cwz $$0, ib $$1, ein $$2) {
   }

   protected void b(cwz $$0, ib $$1, ein $$2, axd $$3) {
   }

   @Nullable
   protected ka h() {
      return null;
   }

   protected abstract boolean a(ein var1, cwf var2, ib var3, eim var4, ih var5);

   protected abstract epr a(cwf var1, ib var2, ein var3);

   public abstract int a(cxc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ein var1, cwf var2, ib var3);

   public abstract float a(ein var1);

   protected abstract dmz b(ein var1);

   public abstract boolean c(ein var1);

   public abstract int d(ein var1);

   public boolean a(eim $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(avd<eim> $$0) {
      return this.b.a($$0);
   }

   public abstract eqk b(ein var1, cwf var2, ib var3);

   public Optional<atx> j() {
      return Optional.empty();
   }

   @Deprecated
   public il.c<eim> k() {
      return this.b;
   }
}
