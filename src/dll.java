import com.mojang.serialization.MapCodec;

public class dll extends djn {
   public static final MapCodec<dll> a = b(dll::new);

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dwx.d $$0) {
      super($$0);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = jn.b($$3);
         if ($$4 != jn.b) {
            ji $$5 = $$2.a($$4);
            dwy $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lt.aG, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
