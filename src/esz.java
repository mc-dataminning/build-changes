import java.util.Optional;
import javax.annotation.Nullable;

public abstract class esz {
   public static final jx<eta> c = new jx<>();
   protected final dwz<esz, eta> d;
   private eta a;
   private final jr.c<esz> b = mb.c.f(this);

   protected esz() {
      dwz.a<esz, eta> $$0 = new dwz.a<>(this);
      this.a($$0);
      this.d = $$0.a(esz::g, eta::new);
      this.f(this.d.b());
   }

   protected void a(dwz.a<esz, eta> $$0) {
   }

   public dwz<esz, eta> f() {
      return this.d;
   }

   protected final void f(eta $$0) {
      this.a = $$0;
   }

   public final eta g() {
      return this.a;
   }

   public abstract cwm a();

   protected void a(dgj $$0, ji $$1, eta $$2, azh $$3) {
   }

   protected void b(ard $$0, ji $$1, dwy $$2, eta $$3) {
   }

   protected void a(ard $$0, ji $$1, eta $$2, azh $$3) {
   }

   @Nullable
   protected lr h() {
      return null;
   }

   protected abstract boolean a(eta var1, dfo var2, ji var3, esz var4, jn var5);

   protected abstract fbb a(dfo var1, ji var2, eta var3);

   public abstract int a(dgm var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eta var1, dfo var2, ji var3);

   public abstract float a(eta var1);

   protected abstract dwy b(eta var1);

   public abstract boolean c(eta var1);

   public abstract int d(eta var1);

   public boolean a(esz $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<esz> $$0) {
      return this.b.a($$0);
   }

   public abstract fbv b(eta var1, dfo var2, ji var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public jr.c<esz> k() {
      return this.b;
   }
}
