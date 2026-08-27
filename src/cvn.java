import com.mojang.serialization.MapCodec;

public class cvn extends cud {
   public static final MapCodec<cvn> b = b(cvn::new);
   public static final int c = 5;
   private static final ib[] d = ib.values();

   @Override
   public MapCodec<cvn> a() {
      return b;
   }

   public cvn(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$3.a(5) == 0) {
         ib $$4 = d[$$3.a(d.length)];
         hx $$5 = $$2.a($$4);
         dhn $$6 = $$1.a_($$5);
         cvf $$7 = null;
         if (g($$6)) {
            $$7 = cvh.qy;
         } else if ($$6.a(cvh.qy) && $$6.c(cue.d) == $$4) {
            $$7 = cvh.qx;
         } else if ($$6.a(cvh.qx) && $$6.c(cue.d) == $$4) {
            $$7 = cvh.qw;
         } else if ($$6.a(cvh.qw) && $$6.c(cue.d) == $$4) {
            $$7 = cvh.qv;
         }

         if ($$7 != null) {
            dhn $$8 = $$7.o().a(cue.d, $$4).a(cue.c, Boolean.valueOf($$6.u().a() == ecy.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dhn $$0) {
      return $$0.i() || $$0.a(cvh.G) && $$0.u().e() == 8;
   }
}
