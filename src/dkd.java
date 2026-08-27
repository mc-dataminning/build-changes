import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dkd extends dko<dmz> {
   public dkd(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      apf $$1 = $$0.d();
      cng $$2 = $$0.b();
      gu $$3 = $$0.e();
      Optional<cpn> $$4 = jb.f.b(amw.ao).flatMap($$1x -> $$1x.a($$1)).map(he::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cmn var1, apf var2, gu var3, dcb var4);

   protected boolean b(cmn $$0, apf $$1, gu $$2, dcb $$3) {
      gu $$4 = $$2.c();
      dcb $$5 = $$0.a_($$2);
      if (($$5.a(cpo.G) || $$5.a(amw.ar)) && $$0.a_($$4).a(cpo.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jb.f.b(amw.ar).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cpo.mV.n().a(cwk.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ha $$6 : ha.c.a) {
            if ($$1.i() < 0.2F) {
               gu $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cpo.G)) {
                  jb.f.b(amw.ap).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$3x -> {
                     dcb $$4x = $$3x.n();
                     if ($$4x.b(coz.a)) {
                        $$4x = $$4x.a(coz.a, $$6);
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
