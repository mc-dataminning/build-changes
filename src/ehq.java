import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ehq {
   public static final ir<ehr> c = new ir<>();
   protected final dmf<ehq, ehr> d;
   private ehr a;
   private final il.c<ehq> b = kh.c.g(this);

   protected ehq() {
      dmf.a<ehq, ehr> $$0 = new dmf.a<>(this);
      this.a($$0);
      this.d = $$0.a(ehq::g, ehr::new);
      this.f(this.d.b());
   }

   protected void a(dmf.a<ehq, ehr> $$0) {
   }

   public dmf<ehq, ehr> f() {
      return this.d;
   }

   protected final void f(ehr $$0) {
      this.a = $$0;
   }

   public final ehr g() {
      return this.a;
   }

   public abstract cpl a();

   protected void a(cwe $$0, ib $$1, ehr $$2, awt $$3) {
   }

   protected void b(cwe $$0, ib $$1, ehr $$2) {
   }

   protected void b(cwe $$0, ib $$1, ehr $$2, awt $$3) {
   }

   @Nullable
   protected jz h() {
      return null;
   }

   protected abstract boolean a(ehr var1, cvk var2, ib var3, ehq var4, ih var5);

   protected abstract eov a(cvk var1, ib var2, ehr var3);

   public abstract int a(cwh var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ehr var1, cvk var2, ib var3);

   public abstract float a(ehr var1);

   protected abstract dme b(ehr var1);

   public abstract boolean c(ehr var1);

   public abstract int d(ehr var1);

   public boolean a(ehq $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aut<ehq> $$0) {
      return this.b.a($$0);
   }

   public abstract epo b(ehr var1, cvk var2, ib var3);

   public Optional<ato> j() {
      return Optional.empty();
   }

   @Deprecated
   public il.c<ehq> k() {
      return this.b;
   }
}
