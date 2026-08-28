import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cpl extends cre {
   private final btc a;
   private final bso b;
   @Nullable
   private final akk g;

   public cpl(bqa $$0, btc $$1, bso $$2, int $$3, int $$4, int $$5, @Nullable akk $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cud $$0, cud $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cud $$0) {
      return this.b == this.a.h($$0);
   }

   @Override
   public boolean a(cml $$0) {
      cud $$1 = this.g();
      return !$$1.e() && !$$0.f() && czo.a($$1, czn.E) ? false : super.a($$0);
   }

   @Override
   public Pair<akk, akk> b() {
      return this.g != null ? Pair.of(cqk.x, this.g) : super.b();
   }
}
