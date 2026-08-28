import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class doh extends dsr implements dkx {
   public static final MapCodec<doh> a = b(doh::new);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dyl.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      jj $$4 = $$2.d();
      dym $$5 = dkw.bA.m();
      Optional<js.c<eok>> $$6 = $$0.F_().f(me.aY).a(ry.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jj $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         dym $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dkx $$11 = (dkx)$$5.b();
            if ($$11.a($$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            js<eok> $$14;
            if ($$1.a(8) == 0) {
               List<ehd<?, ?>> $$12 = $$0.t($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((eki)$$12.get($$13).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$14 = $$6.get();
            }

            $$14.a().a($$0, $$0.m().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dkx.a am_() {
      return dkx.a.a;
   }
}
