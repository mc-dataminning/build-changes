import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eek extends eew<ehh> {
   public eek(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehh> $$0) {
      azu $$1 = $$0.d();
      dgk $$2 = $$0.b();
      jh $$3 = $$0.e();
      Optional<diq> $$4 = lz.e.a(axc.as, $$1).map(jq::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dfn var1, azu var2, jh var3, dvv var4);

   protected boolean b(dfn $$0, azu $$1, jh $$2, dvv $$3) {
      jh $$4 = $$2.d();
      dvv $$5 = $$0.a_($$2);
      if (($$5.a(dis.G) || $$5.a(axc.av)) && $$0.a_($$4).a(dis.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lz.e.a(axc.av, $$1).map(jq::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dis.mV.m().b(dpn.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jm $$6 : jm.c.a) {
            if ($$1.i() < 0.2F) {
               jh $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dis.G)) {
                  lz.e.a(axc.at, $$1).map(jq::a).ifPresent($$3x -> {
                     dvv $$4x = $$3x.m();
                     if ($$4x.b(dib.c)) {
                        $$4x = $$4x.b(dib.c, $$6);
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
