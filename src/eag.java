import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eag {
   public static final hm<eah> c = new hm<>();
   protected final dff<eag, eah> d;
   private eah a;
   private final hg.c<eag> b = jd.d.f(this);

   protected eag() {
      dff.a<eag, eah> $$0 = new dff.a<>(this);
      this.a($$0);
      this.d = $$0.a(eag::g, eah::new);
      this.f(this.d.b());
   }

   protected void a(dff.a<eag, eah> $$0) {
   }

   public dff<eag, eah> f() {
      return this.d;
   }

   protected final void f(eah $$0) {
      this.a = $$0;
   }

   public final eah g() {
      return this.a;
   }

   public abstract civ a();

   protected void a(cpq $$0, gw $$1, eah $$2, arx $$3) {
   }

   protected void b(cpq $$0, gw $$1, eah $$2) {
   }

   protected void b(cpq $$0, gw $$1, eah $$2, arx $$3) {
   }

   @Nullable
   protected iv h() {
      return null;
   }

   protected abstract boolean a(eah var1, cow var2, gw var3, eag var4, hc var5);

   protected abstract ehi a(cow var1, gw var2, eah var3);

   public abstract int a(cpt var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eah var1, cow var2, gw var3);

   public abstract float a(eah var1);

   protected abstract dfe b(eah var1);

   public abstract boolean c(eah var1);

   public abstract int d(eah var1);

   public boolean a(eag $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aqd<eag> $$0) {
      return this.b.a($$0);
   }

   public abstract eib b(eah var1, cow var2, gw var3);

   public Optional<aoy> j() {
      return Optional.empty();
   }

   @Deprecated
   public hg.c<eag> k() {
      return this.b;
   }
}
