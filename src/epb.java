import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epb {
   public static final js<epc> c = new js<>();
   protected final dtd<epb, epc> d;
   private epc a;
   private final jm.c<epb> b = lt.c.f(this);

   protected epb() {
      dtd.a<epb, epc> $$0 = new dtd.a<>(this);
      this.a($$0);
      this.d = $$0.a(epb::g, epc::new);
      this.f(this.d.b());
   }

   protected void a(dtd.a<epb, epc> $$0) {
   }

   public dtd<epb, epc> f() {
      return this.d;
   }

   protected final void f(epc $$0) {
      this.a = $$0;
   }

   public final epc g() {
      return this.a;
   }

   public abstract cul a();

   protected void a(dcw $$0, jd $$1, epc $$2, ayw $$3) {
   }

   protected void b(dcw $$0, jd $$1, epc $$2) {
   }

   protected void b(dcw $$0, jd $$1, epc $$2, ayw $$3) {
   }

   @Nullable
   protected lk h() {
      return null;
   }

   protected abstract boolean a(epc var1, dcc var2, jd var3, epb var4, ji var5);

   protected abstract exa a(dcc var1, jd var2, epc var3);

   public abstract int a(dcz var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(epc var1, dcc var2, jd var3);

   public abstract float a(epc var1);

   protected abstract dtc b(epc var1);

   public abstract boolean c(epc var1);

   public abstract int d(epc var1);

   public boolean a(epb $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awu<epb> $$0) {
      return this.b.a($$0);
   }

   public abstract ext b(epc var1, dcc var2, jd var3);

   public Optional<avo> j() {
      return Optional.empty();
   }

   @Deprecated
   public jm.c<epb> k() {
      return this.b;
   }
}
