import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etv {
   public static final jx<etw> c = new jx<>();
   protected final dxr<etv, etw> d;
   private etw a;
   private final jr.c<etv> b = mb.c.f(this);

   protected etv() {
      dxr.a<etv, etw> $$0 = new dxr.a<>(this);
      this.a($$0);
      this.d = $$0.a(etv::g, etw::new);
      this.f(this.d.b());
   }

   protected void a(dxr.a<etv, etw> $$0) {
   }

   public dxr<etv, etw> f() {
      return this.d;
   }

   protected final void f(etw $$0) {
      this.a = $$0;
   }

   public final etw g() {
      return this.a;
   }

   public abstract cxd a();

   protected void a(dgz $$0, ji $$1, etw $$2, azh $$3) {
   }

   protected void b(ard $$0, ji $$1, dxq $$2, etw $$3) {
   }

   protected void a(ard $$0, ji $$1, etw $$2, azh $$3) {
   }

   @Nullable
   protected lr h() {
      return null;
   }

   protected abstract boolean a(etw var1, dgf var2, ji var3, etv var4, jn var5);

   protected abstract fbx a(dgf var1, ji var2, etw var3);

   public abstract int a(dhc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(etw var1, dgf var2, ji var3);

   public abstract float a(etw var1);

   protected abstract dxq b(etw var1);

   public abstract boolean c(etw var1);

   public abstract int d(etw var1);

   public boolean a(etv $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<etv> $$0) {
      return this.b.a($$0);
   }

   public abstract fcr b(etw var1, dgf var2, ji var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public jr.c<etv> k() {
      return this.b;
   }
}
