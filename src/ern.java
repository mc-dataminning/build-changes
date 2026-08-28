import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ern {
   public static final jw<ero> c = new jw<>();
   protected final dvp<ern, ero> d;
   private ero a;
   private final jq.c<ern> b = lz.c.f(this);

   protected ern() {
      dvp.a<ern, ero> $$0 = new dvp.a<>(this);
      this.a($$0);
      this.d = $$0.a(ern::g, ero::new);
      this.f(this.d.b());
   }

   protected void a(dvp.a<ern, ero> $$0) {
   }

   public dvp<ern, ero> f() {
      return this.d;
   }

   protected final void f(ero $$0) {
      this.a = $$0;
   }

   public final ero g() {
      return this.a;
   }

   public abstract cwb a();

   protected void a(dff $$0, jh $$1, ero $$2, azv $$3) {
   }

   protected void b(dff $$0, jh $$1, dvo $$2, ero $$3) {
   }

   protected void b(dff $$0, jh $$1, ero $$2, azv $$3) {
   }

   @Nullable
   protected lq h() {
      return null;
   }

   protected abstract boolean a(ero var1, dek var2, jh var3, ern var4, jm var5);

   protected abstract ezr a(dek var1, jh var2, ero var3);

   public abstract int a(dfi var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ero var1, dek var2, jh var3);

   public abstract float a(ero var1);

   protected abstract dvo b(ero var1);

   public abstract boolean c(ero var1);

   public abstract int d(ero var1);

   public boolean a(ern $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axt<ern> $$0) {
      return this.b.a($$0);
   }

   public abstract fal b(ero var1, dek var2, jh var3);

   public Optional<awn> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<ern> k() {
      return this.b;
   }
}
