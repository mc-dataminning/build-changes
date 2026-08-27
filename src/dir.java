import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dir extends dnh implements dff {
   public static final MapCodec<dir> a = b(dir::new);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      ir $$4 = $$2.c();
      dtc $$5 = dfe.cd.n();
      Optional<ja.c<eix>> $$6 = $$0.I_().d(li.aI).b(sr.s);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         ir $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dtc $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dff)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            ja<eix> $$12;
            if ($$1.a(8) == 0) {
               List<ebm<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((eex)$$11.get(0).c()).d();
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
   public dff.a aq_() {
      return dff.a.a;
   }
}
