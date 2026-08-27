import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eaf {
   public static final hk<eag> c = new hk<>();
   protected final dfe<eaf, eag> d;
   private eag a;
   private final he.c<eaf> b = jb.d.f(this);

   protected eaf() {
      dfe.a<eaf, eag> $$0 = new dfe.a<>(this);
      this.a($$0);
      this.d = $$0.a(eaf::g, eag::new);
      this.f(this.d.b());
   }

   protected void a(dfe.a<eaf, eag> $$0) {
   }

   public dfe<eaf, eag> f() {
      return this.d;
   }

   protected final void f(eag $$0) {
      this.a = $$0;
   }

   public final eag g() {
      return this.a;
   }

   public abstract cjg a();

   protected void a(cqb $$0, gw $$1, eag $$2, ash $$3) {
   }

   protected void b(cqb $$0, gw $$1, eag $$2) {
   }

   protected void b(cqb $$0, gw $$1, eag $$2, ash $$3) {
   }

   @Nullable
   protected it h() {
      return null;
   }

   protected abstract boolean a(eag var1, cph var2, gw var3, eaf var4, ha var5);

   protected abstract ehh a(cph var1, gw var2, eag var3);

   public abstract int a(cqe var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eag var1, cph var2, gw var3);

   public abstract float a(eag var1);

   protected abstract dfd b(eag var1);

   public abstract boolean c(eag var1);

   public abstract int d(eag var1);

   public boolean a(eaf $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aqk<eaf> $$0) {
      return this.b.a($$0);
   }

   public abstract eia b(eag var1, cph var2, gw var3);

   public Optional<apf> j() {
      return Optional.empty();
   }

   @Deprecated
   public he.c<eaf> k() {
      return this.b;
   }
}
