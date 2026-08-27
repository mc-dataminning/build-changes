import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dgg extends dkm implements dcy {
   public static final MapCodec<dgg> a = b(dgg::new);

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public dgg(dpx.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      im $$4 = $$2.c();
      dpy $$5 = dcx.bt.n();
      Optional<iv.c<efk>> $$6 = $$0.H_().d(ld.aH).b(sf.n);

      label49:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         im $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.d()).a(this) || $$0.a_($$8).r($$0, $$8)) {
               continue label49;
            }
         }

         dpy $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            ((dcy)$$5.b()).a($$0, $$1, $$8, $$10);
         }

         if ($$10.i()) {
            iv<efk> $$12;
            if ($$1.a(8) == 0) {
               List<dyh<?, ?>> $$11 = $$0.t($$8).a().d().a();
               if ($$11.isEmpty()) {
                  continue;
               }

               $$12 = ((ebl)$$11.get(0).c()).d();
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
   public dcy.a aq_() {
      return dcy.a.a;
   }
}
