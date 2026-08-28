import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class ctf extends cuy {
   private final bwf a;
   private final bvr b;
   @Nullable
   private final alz g;

   public ctf(btb $$0, bwf $$1, bvr $$2, int $$3, int $$4, int $$5, @Nullable alz $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cxo $$0, cxo $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cxo $$0) {
      return this.b == this.a.f($$0);
   }

   @Override
   public boolean a(cpw $$0) {
      cxo $$1 = this.g();
      return !$$1.f() && !$$0.b() && dea.a($$1, ddz.E) ? false : super.a($$0);
   }

   @Override
   public Pair<alz, alz> b() {
      return this.g != null ? Pair.of(cue.B, this.g) : super.b();
   }
}
