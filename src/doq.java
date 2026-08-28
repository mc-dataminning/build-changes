import com.mojang.serialization.MapCodec;

public class doq extends dmr {
   public static final MapCodec<doq> a = b(doq::new);

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(eas.d $$0) {
      super($$0);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         jb $$4 = jb.b($$3);
         if ($$4 != jb.b) {
            iv $$5 = $$2.a($$4);
            eat $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(ly.aH, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
