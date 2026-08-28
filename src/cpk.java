import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cpk extends crd {
   private final btb a;
   private final bsn b;
   @Nullable
   private final akk g;

   public cpk(bpz $$0, btb $$1, bsn $$2, int $$3, int $$4, int $$5, @Nullable akk $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cuc $$0, cuc $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cuc $$0) {
      return this.b == btd.h($$0);
   }

   @Override
   public boolean a(cmk $$0) {
      cuc $$1 = this.g();
      return !$$1.e() && !$$0.f() && czn.a($$1, czm.E) ? false : super.a($$0);
   }

   @Override
   public Pair<akk, akk> b() {
      return this.g != null ? Pair.of(cqj.x, this.g) : super.b();
   }
}
