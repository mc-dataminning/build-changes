import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dcq extends dgv implements czi {
   public static final MapCodec<dcq> a = b(dcq::new);

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dcq(dmd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      ib $$4 = $$2.c();
      dme $$5 = czh.bt.o();
      Optional<il.c<ebk>> $$6 = $$0.I_().d(ki.aD).b(rf.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ib $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dme $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((czi)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            il<ebk> $$12;
            if ($$1.a(8) == 0) {
               List<duh<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((dxl)$$11.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$12 = $$6.get();
            }

            $$12.a().a($$0, $$0.l().g(), $$1, $$8);
         }
      }
   }

   @Override
   public czi.a au_() {
      return czi.a.a;
   }
}
