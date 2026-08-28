import com.mojang.serialization.MapCodec;

public class dld extends djs {
   public static final MapCodec<dld> b = b(dld::new);
   public static final int c = 5;
   private static final jo[] d = jo.values();

   @Override
   public MapCodec<dld> a() {
      return b;
   }

   public dld(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$3.a(5) == 0) {
         jo $$4 = d[$$3.a(d.length)];
         jj $$5 = $$2.a($$4);
         dym $$6 = $$1.a_($$5);
         dku $$7 = null;
         if (h($$6)) {
            $$7 = dkw.rc;
         } else if ($$6.a(dkw.rc) && $$6.c(djt.d) == $$4) {
            $$7 = dkw.rb;
         } else if ($$6.a(dkw.rb) && $$6.c(djt.d) == $$4) {
            $$7 = dkw.ra;
         } else if ($$6.a(dkw.ra) && $$6.c(djt.d) == $$4) {
            $$7 = dkw.qZ;
         }

         if ($$7 != null) {
            dym $$8 = $$7.m().b(djt.d, $$4).b(djt.c, Boolean.valueOf($$6.y().a() == euu.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dym $$0) {
      return $$0.l() || $$0.a(dkw.J) && $$0.y().e() == 8;
   }
}
