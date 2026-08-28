import java.util.Optional;
import javax.annotation.Nullable;

public abstract class esy {
   public static final jx<esz> c = new jx<>();
   protected final dwy<esy, esz> d;
   private esz a;
   private final jr.c<esy> b = mb.c.f(this);

   protected esy() {
      dwy.a<esy, esz> $$0 = new dwy.a<>(this);
      this.a($$0);
      this.d = $$0.a(esy::g, esz::new);
      this.f(this.d.b());
   }

   protected void a(dwy.a<esy, esz> $$0) {
   }

   public dwy<esy, esz> f() {
      return this.d;
   }

   protected final void f(esz $$0) {
      this.a = $$0;
   }

   public final esz g() {
      return this.a;
   }

   public abstract cwl a();

   protected void a(dgi $$0, ji $$1, esz $$2, azh $$3) {
   }

   protected void b(arc $$0, ji $$1, dwx $$2, esz $$3) {
   }

   protected void a(arc $$0, ji $$1, esz $$2, azh $$3) {
   }

   @Nullable
   protected lr h() {
      return null;
   }

   protected abstract boolean a(esz var1, dfn var2, ji var3, esy var4, jn var5);

   protected abstract fba a(dfn var1, ji var2, esz var3);

   public abstract int a(dgl var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(esz var1, dfn var2, ji var3);

   public abstract float a(esz var1);

   protected abstract dwx b(esz var1);

   public abstract boolean c(esz var1);

   public abstract int d(esz var1);

   public boolean a(esy $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axf<esy> $$0) {
      return this.b.a($$0);
   }

   public abstract fbu b(esz var1, dfn var2, ji var3);

   public Optional<avz> j() {
      return Optional.empty();
   }

   @Deprecated
   public jr.c<esy> k() {
      return this.b;
   }
}
