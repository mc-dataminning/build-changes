import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epd {
   public static final js<epe> c = new js<>();
   protected final dtd<epd, epe> d;
   private epe a;
   private final jm.c<epd> b = lt.c.f(this);

   protected epd() {
      dtd.a<epd, epe> $$0 = new dtd.a<>(this);
      this.a($$0);
      this.d = $$0.a(epd::g, epe::new);
      this.f(this.d.b());
   }

   protected void a(dtd.a<epd, epe> $$0) {
   }

   public dtd<epd, epe> f() {
      return this.d;
   }

   protected final void f(epe $$0) {
      this.a = $$0;
   }

   public final epe g() {
      return this.a;
   }

   public abstract cul a();

   protected void a(dcw $$0, jd $$1, epe $$2, ayw $$3) {
   }

   protected void b(dcw $$0, jd $$1, epe $$2) {
   }

   protected void b(dcw $$0, jd $$1, epe $$2, ayw $$3) {
   }

   @Nullable
   protected lk h() {
      return null;
   }

   protected abstract boolean a(epe var1, dcc var2, jd var3, epd var4, ji var5);

   protected abstract exc a(dcc var1, jd var2, epe var3);

   public abstract int a(dcz var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(epe var1, dcc var2, jd var3);

   public abstract float a(epe var1);

   protected abstract dtc b(epe var1);

   public abstract boolean c(epe var1);

   public abstract int d(epe var1);

   public boolean a(epd $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awu<epd> $$0) {
      return this.b.a($$0);
   }

   public abstract exv b(epe var1, dcc var2, jd var3);

   public Optional<avo> j() {
      return Optional.empty();
   }

   @Deprecated
   public jm.c<epd> k() {
      return this.b;
   }
}
