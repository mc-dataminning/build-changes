import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eoi {
   public static final jp<eoj> c = new jp<>();
   protected final dsm<eoi, eoj> d;
   private eoj a;
   private final jj.c<eoi> b = lq.c.f(this);

   protected eoi() {
      dsm.a<eoi, eoj> $$0 = new dsm.a<>(this);
      this.a($$0);
      this.d = $$0.a(eoi::g, eoj::new);
      this.f(this.d.b());
   }

   protected void a(dsm.a<eoi, eoj> $$0) {
   }

   public dsm<eoi, eoj> f() {
      return this.d;
   }

   protected final void f(eoj $$0) {
      this.a = $$0;
   }

   public final eoj g() {
      return this.a;
   }

   public abstract cty a();

   protected void a(dcg $$0, ja $$1, eoj $$2, ayo $$3) {
   }

   protected void b(dcg $$0, ja $$1, eoj $$2) {
   }

   protected void b(dcg $$0, ja $$1, eoj $$2, ayo $$3) {
   }

   @Nullable
   protected lh h() {
      return null;
   }

   protected abstract boolean a(eoj var1, dbm var2, ja var3, eoi var4, jf var5);

   protected abstract ewh a(dbm var1, ja var2, eoj var3);

   public abstract int a(dcj var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eoj var1, dbm var2, ja var3);

   public abstract float a(eoj var1);

   protected abstract dsl b(eoj var1);

   public abstract boolean c(eoj var1);

   public abstract int d(eoj var1);

   public boolean a(eoi $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awm<eoi> $$0) {
      return this.b.a($$0);
   }

   public abstract exa b(eoj var1, dbm var2, ja var3);

   public Optional<avg> j() {
      return Optional.empty();
   }

   @Deprecated
   public jj.c<eoi> k() {
      return this.b;
   }
}
