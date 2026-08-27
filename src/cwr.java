import com.mojang.serialization.MapCodec;

public class cwr extends cvh {
   public static final MapCodec<cwr> b = b(cwr::new);
   public static final int c = 5;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<cwr> a() {
      return b;
   }

   public cwr(diz.d $$0) {
      super($$0);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$3.a(5) == 0) {
         ic $$4 = d[$$3.a(d.length)];
         hx $$5 = $$2.a($$4);
         dja $$6 = $$1.a_($$5);
         cwj $$7 = null;
         if (g($$6)) {
            $$7 = cwl.qy;
         } else if ($$6.a(cwl.qy) && $$6.c(cvi.d) == $$4) {
            $$7 = cwl.qx;
         } else if ($$6.a(cwl.qx) && $$6.c(cvi.d) == $$4) {
            $$7 = cwl.qw;
         } else if ($$6.a(cwl.qw) && $$6.c(cvi.d) == $$4) {
            $$7 = cwl.qv;
         }

         if ($$7 != null) {
            dja $$8 = $$7.o().a(cvi.d, $$4).a(cvi.c, Boolean.valueOf($$6.u().a() == eel.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dja $$0) {
      return $$0.i() || $$0.a(cwl.G) && $$0.u().e() == 8;
   }
}
