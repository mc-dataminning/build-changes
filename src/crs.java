import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class crs extends ctl {
   private final bva a;
   private final bum b;
   @Nullable
   private final ali g;

   public crs(brw $$0, bva $$1, bum $$2, int $$3, int $$4, int $$5, @Nullable ali $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cwb $$0, cwb $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cwb $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(com $$0) {
      cwb $$1 = this.g();
      return !$$1.f() && !$$0.f() && dbu.a($$1, dbt.E) ? false : super.a($$0);
   }

   @Override
   public Pair<ali, ali> b() {
      return this.g != null ? Pair.of(csr.B, this.g) : super.b();
   }
}
