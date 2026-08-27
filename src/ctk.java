import com.mojang.serialization.MapCodec;

public class ctk extends csa {
   public static final MapCodec<ctk> b = b(ctk::new);
   public static final int c = 5;
   private static final ha[] d = ha.values();

   @Override
   public MapCodec<ctk> a() {
      return b;
   }

   public ctk(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$3.a(5) == 0) {
         ha $$4 = d[$$3.a(d.length)];
         gw $$5 = $$2.a($$4);
         dfd $$6 = $$1.a_($$5);
         ctc $$7 = null;
         if (g($$6)) {
            $$7 = cte.qy;
         } else if ($$6.a(cte.qy) && $$6.c(csb.d) == $$4) {
            $$7 = cte.qx;
         } else if ($$6.a(cte.qx) && $$6.c(csb.d) == $$4) {
            $$7 = cte.qw;
         } else if ($$6.a(cte.qw) && $$6.c(csb.d) == $$4) {
            $$7 = cte.qv;
         }

         if ($$7 != null) {
            dfd $$8 = $$7.o().a(csb.d, $$4).a(csb.c, Boolean.valueOf($$6.u().a() == eah.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dfd $$0) {
      return $$0.i() || $$0.a(cte.G) && $$0.u().e() == 8;
   }
}
