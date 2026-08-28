import java.util.Optional;
import javax.annotation.Nullable;

public abstract class erd {
   public static final jv<ere> c = new jv<>();
   protected final dve<erd, ere> d;
   private ere a;
   private final jp.c<erd> b = lx.c.f(this);

   protected erd() {
      dve.a<erd, ere> $$0 = new dve.a<>(this);
      this.a($$0);
      this.d = $$0.a(erd::g, ere::new);
      this.f(this.d.b());
   }

   protected void a(dve.a<erd, ere> $$0) {
   }

   public dve<erd, ere> f() {
      return this.d;
   }

   protected final void f(ere $$0) {
      this.a = $$0;
   }

   public final ere g() {
      return this.a;
   }

   public abstract cvt a();

   protected void a(dev $$0, jg $$1, ere $$2, azr $$3) {
   }

   protected void b(dev $$0, jg $$1, dvd $$2, ere $$3) {
   }

   protected void b(dev $$0, jg $$1, ere $$2, azr $$3) {
   }

   @Nullable
   protected lo h() {
      return null;
   }

   protected abstract boolean a(ere var1, dea var2, jg var3, erd var4, jl var5);

   protected abstract ezh a(dea var1, jg var2, ere var3);

   public abstract int a(dey var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ere var1, dea var2, jg var3);

   public abstract float a(ere var1);

   protected abstract dvd b(ere var1);

   public abstract boolean c(ere var1);

   public abstract int d(ere var1);

   public boolean a(erd $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axp<erd> $$0) {
      return this.b.a($$0);
   }

   public abstract fab b(ere var1, dea var2, jg var3);

   public Optional<awj> j() {
      return Optional.empty();
   }

   @Deprecated
   public jp.c<erd> k() {
      return this.b;
   }
}
