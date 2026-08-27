import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eio {
   public static final ir<eip> c = new ir<>();
   protected final dnc<eio, eip> d;
   private eip a;
   private final il.c<eio> b = ki.c.f(this);

   protected eio() {
      dnc.a<eio, eip> $$0 = new dnc.a<>(this);
      this.a($$0);
      this.d = $$0.a(eio::g, eip::new);
      this.f(this.d.b());
   }

   protected void a(dnc.a<eio, eip> $$0) {
   }

   public dnc<eio, eip> f() {
      return this.d;
   }

   protected final void f(eip $$0) {
      this.a = $$0;
   }

   public final eip g() {
      return this.a;
   }

   public abstract cqh a();

   protected void a(cxb $$0, ib $$1, eip $$2, axd $$3) {
   }

   protected void b(cxb $$0, ib $$1, eip $$2) {
   }

   protected void b(cxb $$0, ib $$1, eip $$2, axd $$3) {
   }

   @Nullable
   protected ka h() {
      return null;
   }

   protected abstract boolean a(eip var1, cwh var2, ib var3, eio var4, ih var5);

   protected abstract ept a(cwh var1, ib var2, eip var3);

   public abstract int a(cxe var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eip var1, cwh var2, ib var3);

   public abstract float a(eip var1);

   protected abstract dnb b(eip var1);

   public abstract boolean c(eip var1);

   public abstract int d(eip var1);

   public boolean a(eio $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(avd<eio> $$0) {
      return this.b.a($$0);
   }

   public abstract eqm b(eip var1, cwh var2, ib var3);

   public Optional<atx> j() {
      return Optional.empty();
   }

   @Deprecated
   public il.c<eio> k() {
      return this.b;
   }
}
