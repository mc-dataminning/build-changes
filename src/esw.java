import java.util.Optional;
import javax.annotation.Nullable;

public abstract class esw {
   public static final jx<esx> c = new jx<>();
   protected final dww<esw, esx> d;
   private esx a;
   private final jr.c<esw> b = mb.c.f(this);

   protected esw() {
      dww.a<esw, esx> $$0 = new dww.a<>(this);
      this.a($$0);
      this.d = $$0.a(esw::g, esx::new);
      this.f(this.d.b());
   }

   protected void a(dww.a<esw, esx> $$0) {
   }

   public dww<esw, esx> f() {
      return this.d;
   }

   protected final void f(esx $$0) {
      this.a = $$0;
   }

   public final esx g() {
      return this.a;
   }

   public abstract cwj a();

   protected void a(dgg $$0, ji $$1, esx $$2, azg $$3) {
   }

   protected void b(arc $$0, ji $$1, dwv $$2, esx $$3) {
   }

   protected void a(arc $$0, ji $$1, esx $$2, azg $$3) {
   }

   @Nullable
   protected lr h() {
      return null;
   }

   protected abstract boolean a(esx var1, dfl var2, ji var3, esw var4, jn var5);

   protected abstract fay a(dfl var1, ji var2, esx var3);

   public abstract int a(dgj var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(esx var1, dfl var2, ji var3);

   public abstract float a(esx var1);

   protected abstract dwv b(esx var1);

   public abstract boolean c(esx var1);

   public abstract int d(esx var1);

   public boolean a(esw $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axe<esw> $$0) {
      return this.b.a($$0);
   }

   public abstract fbs b(esx var1, dfl var2, ji var3);

   public Optional<avy> j() {
      return Optional.empty();
   }

   @Deprecated
   public jr.c<esw> k() {
      return this.b;
   }
}
