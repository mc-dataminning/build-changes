import java.util.Optional;
import javax.annotation.Nullable;

public abstract class emv {
   public static final jd<emw> c = new jd<>();
   protected final dre<emv, emw> d;
   private emw a;
   private final ix.c<emv> b = le.c.f(this);

   protected emv() {
      dre.a<emv, emw> $$0 = new dre.a<>(this);
      this.a($$0);
      this.d = $$0.a(emv::g, emw::new);
      this.f(this.d.b());
   }

   protected void a(dre.a<emv, emw> $$0) {
   }

   public dre<emv, emw> f() {
      return this.d;
   }

   protected final void f(emw $$0) {
      this.a = $$0;
   }

   public final emw g() {
      return this.a;
   }

   public abstract ctl a();

   protected void a(daz $$0, io $$1, emw $$2, aym $$3) {
   }

   protected void b(daz $$0, io $$1, emw $$2) {
   }

   protected void b(daz $$0, io $$1, emw $$2, aym $$3) {
   }

   @Nullable
   protected kw h() {
      return null;
   }

   protected abstract boolean a(emw var1, daf var2, io var3, emv var4, it var5);

   protected abstract eum a(daf var1, io var2, emw var3);

   public abstract int a(dbc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(emw var1, daf var2, io var3);

   public abstract float a(emw var1);

   protected abstract drd b(emw var1);

   public abstract boolean c(emw var1);

   public abstract int d(emw var1);

   public boolean a(emv $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awm<emv> $$0) {
      return this.b.a($$0);
   }

   public abstract evf b(emw var1, daf var2, io var3);

   public Optional<avh> j() {
      return Optional.empty();
   }

   @Deprecated
   public ix.c<emv> k() {
      return this.b;
   }
}
