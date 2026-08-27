import com.mojang.serialization.MapCodec;

public class dcg extends daw {
   public static final MapCodec<dcg> b = b(dcg::new);
   public static final int c = 5;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<dcg> a() {
      return b;
   }

   public dcg(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = d[$$3.a(d.length)];
         ib $$5 = $$2.a($$4);
         doz $$6 = $$1.a_($$5);
         dby $$7 = null;
         if (g($$6)) {
            $$7 = dca.qy;
         } else if ($$6.a(dca.qy) && $$6.c(dax.d) == $$4) {
            $$7 = dca.qx;
         } else if ($$6.a(dca.qx) && $$6.c(dax.d) == $$4) {
            $$7 = dca.qw;
         } else if ($$6.a(dca.qw) && $$6.c(dax.d) == $$4) {
            $$7 = dca.qv;
         }

         if ($$7 != null) {
            doz $$8 = $$7.n().a(dax.d, $$4).a(dax.c, Boolean.valueOf($$6.u().a() == ekt.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(doz $$0) {
      return $$0.i() || $$0.a(dca.G) && $$0.u().e() == 8;
   }
}
