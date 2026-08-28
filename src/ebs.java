import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ebs extends ece<eep> {
   public ebs(Codec<eep> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eep> $$0) {
      ayw $$1 = $$0.d();
      dds $$2 = $$0.b();
      jd $$3 = $$0.e();
      Optional<dfy> $$4 = lt.e.a(awe.ar, $$1).map(jm::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dcx var1, ayw var2, jd var3, dtc var4);

   protected boolean b(dcx $$0, ayw $$1, jd $$2, dtc $$3) {
      jd $$4 = $$2.d();
      dtc $$5 = $$0.a_($$2);
      if (($$5.a(dga.G) || $$5.a(awe.au)) && $$0.a_($$4).a(dga.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lt.e.a(awe.au, $$1).map(jm::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dga.mV.o().a(dmw.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ji $$6 : ji.c.a) {
            if ($$1.i() < 0.2F) {
               jd $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dga.G)) {
                  lt.e.a(awe.as, $$1).map(jm::a).ifPresent($$3x -> {
                     dtc $$4x = $$3x.o();
                     if ($$4x.b(dfj.c)) {
                        $$4x = $$4x.a(dfj.c, $$6);
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
