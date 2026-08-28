import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etv {
   public static final jw<etw> c = new jw<>();
   protected final dxv<etv, etw> d;
   private etw a;
   private final jq.c<etv> b = ma.c.f(this);

   protected etv() {
      dxv.a<etv, etw> $$0 = new dxv.a<>(this);
      this.a($$0);
      this.d = $$0.a(etv::g, etw::new);
      this.f(this.d.b());
   }

   protected void a(dxv.a<etv, etw> $$0) {
   }

   public dxv<etv, etw> f() {
      return this.d;
   }

   protected final void f(etw $$0) {
      this.a = $$0;
   }

   public final etw g() {
      return this.a;
   }

   public abstract cxk a();

   protected void a(dhh $$0, jh $$1, etw $$2, bam $$3) {
   }

   protected void b(ash $$0, jh $$1, dxu $$2, etw $$3) {
   }

   protected void a(ash $$0, jh $$1, etw $$2, bam $$3) {
   }

   @Nullable
   protected lq h() {
      return null;
   }

   protected abstract boolean a(etw var1, dgm var2, jh var3, etv var4, jm var5);

   protected abstract fbx a(dgm var1, jh var2, etw var3);

   public abstract int a(dhk var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(etw var1, dgm var2, jh var3);

   public abstract float a(etw var1);

   protected abstract dxu b(etw var1);

   public abstract boolean c(etw var1);

   public abstract int d(etw var1);

   public boolean a(etv $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(ayk<etv> $$0) {
      return this.b.a($$0);
   }

   public abstract fcr b(etw var1, dgm var2, jh var3);

   public Optional<axe> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<etv> k() {
      return this.b;
   }
}
