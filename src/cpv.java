import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cpv extends cro {
   private final btl a;
   private final bsx b;
   @Nullable
   private final akq g;

   public cpv(bqj $$0, btl $$1, bsx $$2, int $$3, int $$4, int $$5, @Nullable akq $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cuo $$0, cuo $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cuo $$0) {
      return this.b == this.a.h($$0);
   }

   @Override
   public boolean a(cmv $$0) {
      cuo $$1 = this.g();
      return !$$1.e() && !$$0.f() && dac.a($$1, dab.E) ? false : super.a($$0);
   }

   @Override
   public Pair<akq, akq> b() {
      return this.g != null ? Pair.of(cqu.x, this.g) : super.b();
   }
}
