import com.mojang.serialization.MapCodec;

public class cvb extends ctr {
   public static final MapCodec<cvb> b = b(cvb::new);
   public static final int c = 5;
   private static final hx[] d = hx.values();

   @Override
   public MapCodec<cvb> a() {
      return b;
   }

   public cvb(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$3.a(5) == 0) {
         hx $$4 = d[$$3.a(d.length)];
         ht $$5 = $$2.a($$4);
         dgw $$6 = $$1.a_($$5);
         cut $$7 = null;
         if (g($$6)) {
            $$7 = cuv.qy;
         } else if ($$6.a(cuv.qy) && $$6.c(cts.d) == $$4) {
            $$7 = cuv.qx;
         } else if ($$6.a(cuv.qx) && $$6.c(cts.d) == $$4) {
            $$7 = cuv.qw;
         } else if ($$6.a(cuv.qw) && $$6.c(cts.d) == $$4) {
            $$7 = cuv.qv;
         }

         if ($$7 != null) {
            dgw $$8 = $$7.o().a(cts.d, $$4).a(cts.c, Boolean.valueOf($$6.u().a() == ech.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dgw $$0) {
      return $$0.i() || $$0.a(cuv.G) && $$0.u().e() == 8;
   }
}
