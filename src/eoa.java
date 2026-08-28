import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eoa {
   public static final jp<eob> c = new jp<>();
   protected final dsi<eoa, eob> d;
   private eob a;
   private final jj.c<eoa> b = lq.c.f(this);

   protected eoa() {
      dsi.a<eoa, eob> $$0 = new dsi.a<>(this);
      this.a($$0);
      this.d = $$0.a(eoa::g, eob::new);
      this.f(this.d.b());
   }

   protected void a(dsi.a<eoa, eob> $$0) {
   }

   public dsi<eoa, eob> f() {
      return this.d;
   }

   protected final void f(eob $$0) {
      this.a = $$0;
   }

   public final eob g() {
      return this.a;
   }

   public abstract ctv a();

   protected void a(dcd $$0, ja $$1, eob $$2, aym $$3) {
   }

   protected void b(dcd $$0, ja $$1, eob $$2) {
   }

   protected void b(dcd $$0, ja $$1, eob $$2, aym $$3) {
   }

   @Nullable
   protected lh h() {
      return null;
   }

   protected abstract boolean a(eob var1, dbj var2, ja var3, eoa var4, jf var5);

   protected abstract evz a(dbj var1, ja var2, eob var3);

   public abstract int a(dcg var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eob var1, dbj var2, ja var3);

   public abstract float a(eob var1);

   protected abstract dsh b(eob var1);

   public abstract boolean c(eob var1);

   public abstract int d(eob var1);

   public boolean a(eoa $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awk<eoa> $$0) {
      return this.b.a($$0);
   }

   public abstract ews b(eob var1, dbj var2, ja var3);

   public Optional<ave> j() {
      return Optional.empty();
   }

   @Deprecated
   public jj.c<eoa> k() {
      return this.b;
   }
}
