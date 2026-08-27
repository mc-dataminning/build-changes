import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ekr {
   public static final ir<eks> c = new ir<>();
   protected final dpa<ekr, eks> d;
   private eks a;
   private final il.c<ekr> b = kr.c.f(this);

   protected ekr() {
      dpa.a<ekr, eks> $$0 = new dpa.a<>(this);
      this.a($$0);
      this.d = $$0.a(ekr::g, eks::new);
      this.f(this.d.b());
   }

   protected void a(dpa.a<ekr, eks> $$0) {
   }

   public dpa<ekr, eks> f() {
      return this.d;
   }

   protected final void f(eks $$0) {
      this.a = $$0;
   }

   public final eks g() {
      return this.a;
   }

   public abstract cre a();

   protected void a(cyx $$0, ib $$1, eks $$2, axr $$3) {
   }

   protected void b(cyx $$0, ib $$1, eks $$2) {
   }

   protected void b(cyx $$0, ib $$1, eks $$2, axr $$3) {
   }

   @Nullable
   protected kj h() {
      return null;
   }

   protected abstract boolean a(eks var1, cyd var2, ib var3, ekr var4, ih var5);

   protected abstract esa a(cyd var1, ib var2, eks var3);

   public abstract int a(cza var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eks var1, cyd var2, ib var3);

   public abstract float a(eks var1);

   protected abstract doz b(eks var1);

   public abstract boolean c(eks var1);

   public abstract int d(eks var1);

   public boolean a(ekr $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(avr<ekr> $$0) {
      return this.b.a($$0);
   }

   public abstract est b(eks var1, cyd var2, ib var3);

   public Optional<aul> j() {
      return Optional.empty();
   }

   @Deprecated
   public il.c<ekr> k() {
      return this.b;
   }
}
