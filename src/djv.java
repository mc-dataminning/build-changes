import com.mojang.serialization.MapCodec;

public class djv extends dik {
   public static final MapCodec<djv> b = b(djv::new);
   public static final int c = 5;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<djv> a() {
      return b;
   }

   public djv(dww.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = d[$$3.a(d.length)];
         ji $$5 = $$2.a($$4);
         dwx $$6 = $$1.a_($$5);
         djm $$7 = null;
         if (h($$6)) {
            $$7 = djo.ra;
         } else if ($$6.a(djo.ra) && $$6.c(dil.d) == $$4) {
            $$7 = djo.qZ;
         } else if ($$6.a(djo.qZ) && $$6.c(dil.d) == $$4) {
            $$7 = djo.qY;
         } else if ($$6.a(djo.qY) && $$6.c(dil.d) == $$4) {
            $$7 = djo.qX;
         }

         if ($$7 != null) {
            dwx $$8 = $$7.m().b(dil.d, $$4).b(dil.c, Boolean.valueOf($$6.y().a() == eta.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dwx $$0) {
      return $$0.l() || $$0.a(djo.J) && $$0.y().e() == 8;
   }
}
