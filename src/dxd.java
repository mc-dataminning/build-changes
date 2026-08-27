import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dxd {
   public static final hk<dxe> c = new hk<>();
   protected final dcc<dxd, dxe> d;
   private dxe a;
   private final he.c<dxd> b = jb.d.f(this);

   protected dxd() {
      dcc.a<dxd, dxe> $$0 = new dcc.a<>(this);
      this.a($$0);
      this.d = $$0.a(dxd::g, dxe::new);
      this.f(this.d.b());
   }

   protected void a(dcc.a<dxd, dxe> $$0) {
   }

   public dcc<dxd, dxe> f() {
      return this.d;
   }

   protected final void f(dxe $$0) {
      this.a = $$0;
   }

   public final dxe g() {
      return this.a;
   }

   public abstract cfu a();

   protected void a(cmm $$0, gu $$1, dxe $$2, apf $$3) {
   }

   protected void b(cmm $$0, gu $$1, dxe $$2) {
   }

   protected void b(cmm $$0, gu $$1, dxe $$2, apf $$3) {
   }

   @Nullable
   protected it h() {
      return null;
   }

   protected abstract boolean a(dxe var1, cls var2, gu var3, dxd var4, ha var5);

   protected abstract eei a(cls var1, gu var2, dxe var3);

   public abstract int a(cmp var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(dxe var1, cls var2, gu var3);

   public abstract float a(dxe var1);

   protected abstract dcb b(dxe var1);

   public abstract boolean c(dxe var1);

   public abstract int d(dxe var1);

   public boolean a(dxd $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(anl<dxd> $$0) {
      return this.b.a($$0);
   }

   public abstract efb b(dxe var1, cls var2, gu var3);

   public Optional<amg> j() {
      return Optional.empty();
   }

   @Deprecated
   public he.c<dxd> k() {
      return this.b;
   }
}
