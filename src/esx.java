import java.util.Optional;
import javax.annotation.Nullable;

public abstract class esx {
   public static final jx<esy> c = new jx<>();
   protected final dwx<esx, esy> d;
   private esy a;
   private final jr.c<esx> b = mb.c.f(this);

   protected esx() {
      dwx.a<esx, esy> $$0 = new dwx.a<>(this);
      this.a($$0);
      this.d = $$0.a(esx::g, esy::new);
      this.f(this.d.b());
   }

   protected void a(dwx.a<esx, esy> $$0) {
   }

   public dwx<esx, esy> f() {
      return this.d;
   }

   protected final void f(esy $$0) {
      this.a = $$0;
   }

   public final esy g() {
      return this.a;
   }

   public abstract cwk a();

   protected void a(dgh $$0, ji $$1, esy $$2, azh $$3) {
   }

   protected void b(ard $$0, ji $$1, dww $$2, esy $$3) {
   }

   protected void a(ard $$0, ji $$1, esy $$2, azh $$3) {
   }

   @Nullable
   protected lr h() {
      return null;
   }

   protected abstract boolean a(esy var1, dfm var2, ji var3, esx var4, jn var5);

   protected abstract faz a(dfm var1, ji var2, esy var3);

   public abstract int a(dgk var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(esy var1, dfm var2, ji var3);

   public abstract float a(esy var1);

   protected abstract dww b(esy var1);

   public abstract boolean c(esy var1);

   public abstract int d(esy var1);

   public boolean a(esx $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<esx> $$0) {
      return this.b.a($$0);
   }

   public abstract fbt b(esy var1, dfm var2, ji var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public jr.c<esx> k() {
      return this.b;
   }
}
