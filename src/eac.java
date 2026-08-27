import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eac {
   public static final hk<ead> c = new hk<>();
   protected final dfb<eac, ead> d;
   private ead a;
   private final he.c<eac> b = jb.d.f(this);

   protected eac() {
      dfb.a<eac, ead> $$0 = new dfb.a<>(this);
      this.a($$0);
      this.d = $$0.a(eac::g, ead::new);
      this.f(this.d.b());
   }

   protected void a(dfb.a<eac, ead> $$0) {
   }

   public dfb<eac, ead> f() {
      return this.d;
   }

   protected final void f(ead $$0) {
      this.a = $$0;
   }

   public final ead g() {
      return this.a;
   }

   public abstract cit a();

   protected void a(cpm $$0, gu $$1, ead $$2, aru $$3) {
   }

   protected void b(cpm $$0, gu $$1, ead $$2) {
   }

   protected void b(cpm $$0, gu $$1, ead $$2, aru $$3) {
   }

   @Nullable
   protected it h() {
      return null;
   }

   protected abstract boolean a(ead var1, cos var2, gu var3, eac var4, ha var5);

   protected abstract ehe a(cos var1, gu var2, ead var3);

   public abstract int a(cpp var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ead var1, cos var2, gu var3);

   public abstract float a(ead var1);

   protected abstract dfa b(ead var1);

   public abstract boolean c(ead var1);

   public abstract int d(ead var1);

   public boolean a(eac $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(aqa<eac> $$0) {
      return this.b.a($$0);
   }

   public abstract ehx b(ead var1, cos var2, gu var3);

   public Optional<aov> j() {
      return Optional.empty();
   }

   @Deprecated
   public he.c<eac> k() {
      return this.b;
   }
}
