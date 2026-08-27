import com.google.common.collect.ImmutableMap;

public class bwh extends bsl<cje> {
   private static final int c = 25;
   private static final int d = 20;

   public bwh() {
      super(ImmutableMap.of(bzw.ay, bzx.a, bzw.o, bzx.b, bzw.aF, bzx.c, bzw.aD, bzx.c), cjf.b);
   }

   protected void a(apu $$0, cje $$1, long $$2) {
      bru<cje> $$3 = $$1.dP();
      $$3.a(bzw.aD, ayo.a, 25L);
      $$3.b(bzw.m);
      bqt $$4 = $$1.dP().c(bzw.ay).get();
      bsn.a($$1, $$4);
      $$1.b(bre.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(apu $$0, cje $$1, long $$2) {
      return true;
   }

   protected void c(apu $$0, cje $$1, long $$2) {
      if (!$$1.dP().a(bzw.aD) && !$$1.dP().a(bzw.aF)) {
         $$1.dP().a(bzw.aF, ayo.a, (long)(cjf.b - 25));
         $$1.a(auo.Bx, 3.0F, 1.0F);
      }
   }

   protected void d(apu $$0, cje $$1, long $$2) {
      if ($$1.c(bre.l)) {
         $$1.b(bre.a);
      }

      $$1.dP().c(bzw.ay).ifPresent($$1::j);
      $$1.dP().b(bzw.ay);
   }
}
