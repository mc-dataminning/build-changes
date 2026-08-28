import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class csd extends ctw {
   private final bvh a;
   private final but b;
   @Nullable
   private final alj g;

   public csd(bsd $$0, bvh $$1, but $$2, int $$3, int $$4, int $$5, @Nullable alj $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cwm $$0, cwm $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cwm $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cou $$0) {
      cwm $$1 = this.g();
      return !$$1.f() && !$$0.b() && dcf.a($$1, dce.E) ? false : super.a($$0);
   }

   @Override
   public Pair<alj, alj> b() {
      return this.g != null ? Pair.of(ctc.B, this.g) : super.b();
   }
}
