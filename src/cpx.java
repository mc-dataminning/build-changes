import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cpx extends crq {
   private final btn a;
   private final bsy b;
   @Nullable
   private final akr g;

   public cpx(bqk $$0, btn $$1, bsy $$2, int $$3, int $$4, int $$5, @Nullable akr $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cuq $$0, cuq $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cuq $$0) {
      return this.b == this.a.h($$0);
   }

   @Override
   public boolean a(cmx $$0) {
      cuq $$1 = this.g();
      return !$$1.e() && !$$0.f() && dae.a($$1, dad.E) ? false : super.a($$0);
   }

   @Override
   public Pair<akr, akr> b() {
      return this.g != null ? Pair.of(cqw.x, this.g) : super.b();
   }
}
