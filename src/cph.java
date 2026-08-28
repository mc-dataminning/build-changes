import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cph extends cra {
   private final bsy a;
   private final bsk b;
   @Nullable
   private final akk g;

   public cph(bpw $$0, bsy $$1, bsk $$2, int $$3, int $$4, int $$5, @Nullable akk $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cua $$0, cua $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cua $$0) {
      return this.b == bta.h($$0);
   }

   @Override
   public boolean a(cmh $$0) {
      cua $$1 = this.g();
      return !$$1.e() && !$$0.f() && czl.a($$1, czk.F) ? false : super.a($$0);
   }

   @Override
   public Pair<akk, akk> b() {
      return this.g != null ? Pair.of(cqg.x, this.g) : super.b();
   }
}
