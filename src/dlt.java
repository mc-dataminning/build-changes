import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dlt extends dqa implements dim {
   public static final MapCodec<dlt> a = b(dlt::new);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dvn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      jh $$4 = $$2.d();
      dvo $$5 = dil.bt.m();
      Optional<jq.c<elf>> $$6 = $$0.H_().e(ma.aR).a(st.n);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jh $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dvo $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dim $$11 = (dim)$$5.b();
            if ($$11.b($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jq<elf> $$13;
            if ($$1.a(8) == 0) {
               List<eeb<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               $$13 = ((ehg)$$12.get(0).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$13 = $$6.get();
            }

            $$13.a().a($$0, $$0.l().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dim.a ar_() {
      return dim.a.a;
   }
}
