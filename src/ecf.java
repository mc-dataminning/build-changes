import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecf {
   public static final ii<ecg> c = new ii<>();
   protected final dgx<ecf, ecg> d;
   private ecg a;
   private final ib.c<ecf> b = jy.d.f(this);

   protected ecf() {
      dgx.a<ecf, ecg> $$0 = new dgx.a<>(this);
      this.a($$0);
      this.d = $$0.a(ecf::g, ecg::new);
      this.f(this.d.b());
   }

   protected void a(dgx.a<ecf, ecg> $$0) {
   }

   public dgx<ecf, ecg> f() {
      return this.d;
   }

   protected final void f(ecg $$0) {
      this.a = $$0;
   }

   public final ecg g() {
      return this.a;
   }

   public abstract ckw a();

   protected void a(crs $$0, ht $$1, ecg $$2, ato $$3) {
   }

   protected void b(crs $$0, ht $$1, ecg $$2) {
   }

   protected void b(crs $$0, ht $$1, ecg $$2, ato $$3) {
   }

   @Nullable
   protected jq h() {
      return null;
   }

   protected abstract boolean a(ecg var1, cqy var2, ht var3, ecf var4, hx var5);

   protected abstract eji a(cqy var1, ht var2, ecg var3);

   public abstract int a(crv var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ecg var1, cqy var2, ht var3);

   public abstract float a(ecg var1);

   protected abstract dgw b(ecg var1);

   public abstract boolean c(ecg var1);

   public abstract int d(ecg var1);

   public boolean a(ecf $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(arr<ecf> $$0) {
      return this.b.a($$0);
   }

   public abstract ekb b(ecg var1, cqy var2, ht var3);

   public Optional<aqm> j() {
      return Optional.empty();
   }

   @Deprecated
   public ib.c<ecf> k() {
      return this.b;
   }
}
