import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epd {
   public static final jg<epe> c = new jg<>();
   protected final dtd<epd, epe> d;
   private epe a;
   private final ja.c<epd> b = lh.c.f(this);

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

   public abstract cuc a();

   protected void a(dca $$0, ir $$1, epe $$2, ayt $$3) {
   }

   protected void b(dca $$0, ir $$1, epe $$2) {
   }

   protected void b(dca $$0, ir $$1, epe $$2, ayt $$3) {
   }

   @Nullable
   protected kz h() {
      return null;
   }

   protected abstract boolean a(epe var1, dbg var2, ir var3, epd var4, iw var5);

   protected abstract ewu a(dbg var1, ir var2, epe var3);

   public abstract int a(dcd var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(epe var1, dbg var2, ir var3);

   public abstract float a(epe var1);

   protected abstract dtc b(epe var1);

   public abstract boolean c(epe var1);

   public abstract int d(epe var1);

   public boolean a(epd $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awt<epd> $$0) {
      return this.b.a($$0);
   }

   public abstract exn b(epe var1, dbg var2, ir var3);

   public Optional<avn> j() {
      return Optional.empty();
   }

   @Deprecated
   public ja.c<epd> k() {
      return this.b;
   }
}
