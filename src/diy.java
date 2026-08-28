import com.mojang.serialization.MapCodec;

public class diy extends dho {
   public static final MapCodec<diy> b = b(diy::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<diy> a() {
      return b;
   }

   public diy(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dvv $$6 = $$1.a_($$5);
         diq $$7 = null;
         if (h($$6)) {
            $$7 = dis.qy;
         } else if ($$6.a(dis.qy) && $$6.c(dhp.d) == $$4) {
            $$7 = dis.qx;
         } else if ($$6.a(dis.qx) && $$6.c(dhp.d) == $$4) {
            $$7 = dis.qw;
         } else if ($$6.a(dis.qw) && $$6.c(dhp.d) == $$4) {
            $$7 = dis.qv;
         }

         if ($$7 != null) {
            dvv $$8 = $$7.m().b(dhp.d, $$4).b(dhp.c, Boolean.valueOf($$6.y().a() == erw.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dvv $$0) {
      return $$0.l() || $$0.a(dis.G) && $$0.y().e() == 8;
   }
}
