import com.mojang.serialization.MapCodec;

public class ddm extends dcc {
   public static final MapCodec<ddm> b = b(ddm::new);
   public static final int c = 5;
   private static final is[] d = is.values();

   @Override
   public MapCodec<ddm> a() {
      return b;
   }

   public ddm(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$3.a(5) == 0) {
         is $$4 = d[$$3.a(d.length)];
         in $$5 = $$2.a($$4);
         dqh $$6 = $$1.a_($$5);
         dde $$7 = null;
         if (g($$6)) {
            $$7 = ddg.qy;
         } else if ($$6.a(ddg.qy) && $$6.c(dcd.d) == $$4) {
            $$7 = ddg.qx;
         } else if ($$6.a(ddg.qx) && $$6.c(dcd.d) == $$4) {
            $$7 = ddg.qw;
         } else if ($$6.a(ddg.qw) && $$6.c(dcd.d) == $$4) {
            $$7 = ddg.qv;
         }

         if ($$7 != null) {
            dqh $$8 = $$7.n().a(dcd.d, $$4).a(dcd.c, Boolean.valueOf($$6.u().a() == emb.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dqh $$0) {
      return $$0.i() || $$0.a(ddg.G) && $$0.u().e() == 8;
   }
}
