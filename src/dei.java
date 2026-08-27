import com.mojang.serialization.MapCodec;

public class dei extends dcy {
   public static final MapCodec<dei> b = b(dei::new);
   public static final int c = 5;
   private static final it[] d = it.values();

   @Override
   public MapCodec<dei> a() {
      return b;
   }

   public dei(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$3.a(5) == 0) {
         it $$4 = d[$$3.a(d.length)];
         io $$5 = $$2.a($$4);
         drd $$6 = $$1.a_($$5);
         dea $$7 = null;
         if (g($$6)) {
            $$7 = dec.qy;
         } else if ($$6.a(dec.qy) && $$6.c(dcz.d) == $$4) {
            $$7 = dec.qx;
         } else if ($$6.a(dec.qx) && $$6.c(dcz.d) == $$4) {
            $$7 = dec.qw;
         } else if ($$6.a(dec.qw) && $$6.c(dcz.d) == $$4) {
            $$7 = dec.qv;
         }

         if ($$7 != null) {
            drd $$8 = $$7.n().a(dcz.d, $$4).a(dcz.c, Boolean.valueOf($$6.u().a() == emx.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(drd $$0) {
      return $$0.i() || $$0.a(dec.G) && $$0.u().e() == 8;
   }
}
