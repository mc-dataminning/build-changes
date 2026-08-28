import com.mojang.serialization.MapCodec;

public class dmd extends dks {
   public static final MapCodec<dmd> b = b(dmd::new);
   public static final int c = 5;
   private static final ja[] d = ja.values();

   @Override
   public MapCodec<dmd> a() {
      return b;
   }

   public dmd(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$3.a(5) == 0) {
         ja $$4 = d[$$3.a(d.length)];
         iu $$5 = $$2.a($$4);
         dzo $$6 = $$1.a_($$5);
         dlu $$7 = null;
         if (h($$6)) {
            $$7 = dlw.rc;
         } else if ($$6.a(dlw.rc) && $$6.c(dkt.d) == $$4) {
            $$7 = dlw.rb;
         } else if ($$6.a(dlw.rb) && $$6.c(dkt.d) == $$4) {
            $$7 = dlw.ra;
         } else if ($$6.a(dlw.ra) && $$6.c(dkt.d) == $$4) {
            $$7 = dlw.qZ;
         }

         if ($$7 != null) {
            dzo $$8 = $$7.m().b(dkt.d, $$4).b(dkt.c, Boolean.valueOf($$6.y().a() == evw.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dzo $$0) {
      return $$0.l() || $$0.a(dlw.J) && $$0.y().e() == 8;
   }
}
