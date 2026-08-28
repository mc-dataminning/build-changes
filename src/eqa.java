import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqa {
   public static final jt<eqb> c = new jt<>();
   protected final dub<eqa, eqb> d;
   private eqb a;
   private final jn.c<eqa> b = lu.c.f(this);

   protected eqa() {
      dub.a<eqa, eqb> $$0 = new dub.a<>(this);
      this.a($$0);
      this.d = $$0.a(eqa::g, eqb::new);
      this.f(this.d.b());
   }

   protected void a(dub.a<eqa, eqb> $$0) {
   }

   public dub<eqa, eqb> f() {
      return this.d;
   }

   protected final void f(eqb $$0) {
      this.a = $$0;
   }

   public final eqb g() {
      return this.a;
   }

   public abstract cvg a();

   protected void a(dds $$0, je $$1, eqb $$2, azk $$3) {
   }

   protected void b(dds $$0, je $$1, dua $$2, eqb $$3) {
   }

   protected void b(dds $$0, je $$1, eqb $$2, azk $$3) {
   }

   @Nullable
   protected ll h() {
      return null;
   }

   protected abstract boolean a(eqb var1, dcx var2, je var3, eqa var4, jj var5);

   protected abstract eye a(dcx var1, je var2, eqb var3);

   public abstract int a(ddv var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eqb var1, dcx var2, je var3);

   public abstract float a(eqb var1);

   protected abstract dua b(eqb var1);

   public abstract boolean c(eqb var1);

   public abstract int d(eqb var1);

   public boolean a(eqa $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axi<eqa> $$0) {
      return this.b.a($$0);
   }

   public abstract eyx b(eqb var1, dcx var2, je var3);

   public Optional<awc> j() {
      return Optional.empty();
   }

   @Deprecated
   public jn.c<eqa> k() {
      return this.b;
   }
}
