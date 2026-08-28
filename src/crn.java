import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class crn extends ctg {
   private final buv a;
   private final buh b;
   @Nullable
   private final alh g;

   public crn(brr $$0, buv $$1, buh $$2, int $$3, int $$4, int $$5, @Nullable alh $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cvx $$0, cvx $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cvx $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(coh $$0) {
      cvx $$1 = this.g();
      return !$$1.f() && !$$0.f() && dbo.a($$1, dbn.E) ? false : super.a($$0);
   }

   @Override
   public Pair<alh, alh> b() {
      return this.g != null ? Pair.of(csm.B, this.g) : super.b();
   }
}
