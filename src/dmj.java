import com.mojang.serialization.MapCodec;

public class dmj extends dky {
   public static final MapCodec<dmj> b = b(dmj::new);
   public static final int c = 5;
   private static final ja[] d = ja.values();

   @Override
   public MapCodec<dmj> a() {
      return b;
   }

   public dmj(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         ja $$4 = d[$$3.a(d.length)];
         iu $$5 = $$2.a($$4);
         dzz $$6 = $$1.a_($$5);
         dma $$7 = null;
         if (h($$6)) {
            $$7 = dmc.rd;
         } else if ($$6.a(dmc.rd) && $$6.c(dkz.d) == $$4) {
            $$7 = dmc.rc;
         } else if ($$6.a(dmc.rc) && $$6.c(dkz.d) == $$4) {
            $$7 = dmc.rb;
         } else if ($$6.a(dmc.rb) && $$6.c(dkz.d) == $$4) {
            $$7 = dmc.ra;
         }

         if ($$7 != null) {
            dzz $$8 = $$7.m().b(dkz.d, $$4).b(dkz.c, Boolean.valueOf($$6.y().a() == ewh.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dzz $$0) {
      return $$0.l() || $$0.a(dmc.J) && $$0.y().e() == 8;
   }
}
