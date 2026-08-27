import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dpk extends dpv<dsg> {
   public dpk(Codec<dsg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      ats $$1 = $$0.d();
      csu $$2 = $$0.b();
      ht $$3 = $$0.e();
      Optional<cva> $$4 = jy.f.b(arg.ap).flatMap($$1x -> $$1x.a($$1)).map(ib::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(csb var1, ats var2, ht var3, dhi var4);

   protected boolean b(csb $$0, ats $$1, ht $$2, dhi $$3) {
      ht $$4 = $$2.c();
      dhi $$5 = $$0.a_($$2);
      if (($$5.a(cvc.G) || $$5.a(arg.as)) && $$0.a_($$4).a(cvc.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jy.f.b(arg.as).flatMap($$1x -> $$1x.a($$1)).map(ib::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cvc.mV.o().a(dbw.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hx $$6 : hx.c.a) {
            if ($$1.i() < 0.2F) {
               ht $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cvc.G)) {
                  jy.f.b(arg.aq).flatMap($$1x -> $$1x.a($$1)).map(ib::a).ifPresent($$3x -> {
                     dhi $$4x = $$3x.o();
                     if ($$4x.b(cul.c)) {
                        $$4x = $$4x.a(cul.c, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
