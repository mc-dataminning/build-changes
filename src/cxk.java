import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class cxk extends dbp implements cud {
   public static final MapCodec<cxk> a = b(cxk::new);

   @Override
   public MapCodec<cxk> a() {
      return a;
   }

   public cxk(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      ht $$4 = $$2.c();
      dgb $$5 = cuc.bt.o();
      Optional<ib.c<dve>> $$6 = $$0.H_().d(jz.az).b(qf.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ht $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dgb $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((cud)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ib<dve> $$12;
            if ($$1.a(8) == 0) {
               List<dob<?, ?>> $$11 = $$0.s($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((drf)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.k().g(), $$1, $$8);
         }
      }
   }
}
