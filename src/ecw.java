import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecw {
   public static final im<ecx> c = new im<>();
   protected final dho<ecw, ecx> d;
   private ecx a;
   private final ig.c<ecw> b = kc.d.f(this);

   protected ecw() {
      dho.a<ecw, ecx> $$0 = new dho.a<>(this);
      this.a($$0);
      this.d = $$0.a(ecw::g, ecx::new);
      this.f(this.d.b());
   }

   protected void a(dho.a<ecw, ecx> $$0) {
   }

   public dho<ecw, ecx> f() {
      return this.d;
   }

   protected final void f(ecx $$0) {
      this.a = $$0;
   }

   public final ecx g() {
      return this.a;
   }

   public abstract clj a();

   protected void a(csf $$0, hx $$1, ecx $$2, atw $$3) {
   }

   protected void b(csf $$0, hx $$1, ecx $$2) {
   }

   protected void b(csf $$0, hx $$1, ecx $$2, atw $$3) {
   }

   @Nullable
   protected ju h() {
      return null;
   }

   protected abstract boolean a(ecx var1, crl var2, hx var3, ecw var4, ib var5);

   protected abstract ejz a(crl var1, hx var2, ecx var3);

   public abstract int a(csi var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ecx var1, crl var2, hx var3);

   public abstract float a(ecx var1);

   protected abstract dhn b(ecx var1);

   public abstract boolean c(ecx var1);

   public abstract int d(ecx var1);

   public boolean a(ecw $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(arz<ecw> $$0) {
      return this.b.a($$0);
   }

   public abstract eks b(ecx var1, crl var2, hx var3);

   public Optional<aqu> j() {
      return Optional.empty();
   }

   @Deprecated
   public ig.c<ecw> k() {
      return this.b;
   }
}
