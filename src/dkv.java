import com.mojang.serialization.MapCodec;

public class dkv extends djk {
   public static final MapCodec<dkv> b = b(dkv::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dkv> a() {
      return b;
   }

   public dkv(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dxv $$6 = $$1.a_($$5);
         dkm $$7 = null;
         if (h($$6)) {
            $$7 = dko.qT;
         } else if ($$6.a(dko.qT) && $$6.c(djl.d) == $$4) {
            $$7 = dko.qS;
         } else if ($$6.a(dko.qS) && $$6.c(djl.d) == $$4) {
            $$7 = dko.qR;
         } else if ($$6.a(dko.qR) && $$6.c(djl.d) == $$4) {
            $$7 = dko.qQ;
         }

         if ($$7 != null) {
            dxv $$8 = $$7.m().b(djl.d, $$4).b(djl.c, Boolean.valueOf($$6.y().a() == ety.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dxv $$0) {
      return $$0.l() || $$0.a(dko.J) && $$0.y().e() == 8;
   }
}
