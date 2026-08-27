import com.mojang.serialization.MapCodec;

public class cui extends csy {
   public static final MapCodec<cui> b = b(cui::new);
   public static final int c = 5;
   private static final hx[] d = hx.values();

   @Override
   public MapCodec<cui> a() {
      return b;
   }

   public cui(dga.d $$0) {
      super($$0);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$3.a(5) == 0) {
         hx $$4 = d[$$3.a(d.length)];
         ht $$5 = $$2.a($$4);
         dgb $$6 = $$1.a_($$5);
         cua $$7 = null;
         if (g($$6)) {
            $$7 = cuc.qy;
         } else if ($$6.a(cuc.qy) && $$6.c(csz.d) == $$4) {
            $$7 = cuc.qx;
         } else if ($$6.a(cuc.qx) && $$6.c(csz.d) == $$4) {
            $$7 = cuc.qw;
         } else if ($$6.a(cuc.qw) && $$6.c(csz.d) == $$4) {
            $$7 = cuc.qv;
         }

         if ($$7 != null) {
            dgb $$8 = $$7.o().a(csz.d, $$4).a(csz.c, Boolean.valueOf($$6.u().a() == ebf.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dgb $$0) {
      return $$0.i() || $$0.a(cuc.G) && $$0.u().e() == 8;
   }
}
