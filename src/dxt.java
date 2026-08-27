import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dxt extends dye<eap> {
   public dxt(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      axt $$1 = $$0.d();
      dab $$2 = $$0.b();
      id $$3 = $$0.e();
      Optional<dch> $$4 = kt.e.a(ave.aq, $$1).map(in::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(czh var1, axt var2, id var3, dpi var4);

   protected boolean b(czh $$0, axt $$1, id $$2, dpi $$3) {
      id $$4 = $$2.c();
      dpi $$5 = $$0.a_($$2);
      if (($$5.a(dcj.G) || $$5.a(ave.at)) && $$0.a_($$4).a(dcj.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kt.e.a(ave.at, $$1).map(in::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dcj.mV.n().a(djd.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ij $$6 : ij.c.a) {
            if ($$1.i() < 0.2F) {
               id $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dcj.G)) {
                  kt.e.a(ave.ar, $$1).map(in::a).ifPresent($$3x -> {
                     dpi $$4x = $$3x.n();
                     if ($$4x.b(dbs.c)) {
                        $$4x = $$4x.a(dbs.c, $$6);
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
