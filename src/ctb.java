import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class ctb extends cuu {
   private final bwb a;
   private final bvn b;
   @Nullable
   private final alz g;

   public ctb(bsx $$0, bwb $$1, bvn $$2, int $$3, int $$4, int $$5, @Nullable alz $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cxk $$0, cxk $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cxk $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cps $$0) {
      cxk $$1 = this.g();
      return !$$1.f() && !$$0.b() && ddt.a($$1, dds.E) ? false : super.a($$0);
   }

   @Override
   public Pair<alz, alz> b() {
      return this.g != null ? Pair.of(cua.B, this.g) : super.b();
   }
}
