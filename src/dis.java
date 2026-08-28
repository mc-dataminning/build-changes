import com.mojang.serialization.MapCodec;

public class dis extends dgv {
   public static final MapCodec<dis> a = b(dis::new);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(dtz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$3.a(5) == 0) {
         jj $$4 = jj.b($$3);
         if ($$4 != jj.b) {
            je $$5 = $$2.a($$4);
            dua $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(ln.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
