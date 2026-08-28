import com.mojang.serialization.MapCodec;

public class dhu extends dgk {
   public static final MapCodec<dhu> b = b(dhu::new);
   public static final int c = 5;
   private static final jk[] d = jk.values();

   @Override
   public MapCodec<dhu> a() {
      return b;
   }

   public dhu(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$3.a(5) == 0) {
         jk $$4 = d[$$3.a(d.length)];
         jf $$5 = $$2.a($$4);
         dus $$6 = $$1.a_($$5);
         dhm $$7 = null;
         if (h($$6)) {
            $$7 = dho.qy;
         } else if ($$6.a(dho.qy) && $$6.c(dgl.d) == $$4) {
            $$7 = dho.qx;
         } else if ($$6.a(dho.qx) && $$6.c(dgl.d) == $$4) {
            $$7 = dho.qw;
         } else if ($$6.a(dho.qw) && $$6.c(dgl.d) == $$4) {
            $$7 = dho.qv;
         }

         if ($$7 != null) {
            dus $$8 = $$7.n().b(dgl.d, $$4).b(dgl.c, Boolean.valueOf($$6.y().a() == equ.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dus $$0) {
      return $$0.l() || $$0.a(dho.G) && $$0.y().e() == 8;
   }
}
