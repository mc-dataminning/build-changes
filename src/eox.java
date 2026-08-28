import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eox {
   public static final js<eoy> c = new js<>();
   protected final dtb<eox, eoy> d;
   private eoy a;
   private final jm.c<eox> b = lt.c.f(this);

   protected eox() {
      dtb.a<eox, eoy> $$0 = new dtb.a<>(this);
      this.a($$0);
      this.d = $$0.a(eox::g, eoy::new);
      this.f(this.d.b());
   }

   protected void a(dtb.a<eox, eoy> $$0) {
   }

   public dtb<eox, eoy> f() {
      return this.d;
   }

   protected final void f(eoy $$0) {
      this.a = $$0;
   }

   public final eoy g() {
      return this.a;
   }

   public abstract cuj a();

   protected void a(dcu $$0, jd $$1, eoy $$2, ayv $$3) {
   }

   protected void b(dcu $$0, jd $$1, eoy $$2) {
   }

   protected void b(dcu $$0, jd $$1, eoy $$2, ayv $$3) {
   }

   @Nullable
   protected lk h() {
      return null;
   }

   protected abstract boolean a(eoy var1, dca var2, jd var3, eox var4, ji var5);

   protected abstract eww a(dca var1, jd var2, eoy var3);

   public abstract int a(dcx var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eoy var1, dca var2, jd var3);

   public abstract float a(eoy var1);

   protected abstract dta b(eoy var1);

   public abstract boolean c(eoy var1);

   public abstract int d(eoy var1);

   public boolean a(eox $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awt<eox> $$0) {
      return this.b.a($$0);
   }

   public abstract exp b(eoy var1, dca var2, jd var3);

   public Optional<avn> j() {
      return Optional.empty();
   }

   @Deprecated
   public jm.c<eox> k() {
      return this.b;
   }
}
