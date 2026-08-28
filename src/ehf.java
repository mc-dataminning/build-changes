import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ehf extends ehr<ekc> {
   public ehf(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      azs $$1 = $$0.d();
      dio $$2 = $$0.b();
      jj $$3 = $$0.e();
      Optional<dku> $$4 = md.e.a(awz.at, $$1).map(js::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dhq var1, azs var2, jj var3, dym var4);

   protected boolean b(dhq $$0, azs $$1, jj $$2, dym $$3) {
      jj $$4 = $$2.d();
      dym $$5 = $$0.a_($$2);
      if (($$5.a(dkw.J) || $$5.a(awz.aw)) && $$0.a_($$4).a(dkw.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            md.e.a(awz.aw, $$1).map(js::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dkw.nx.m().b(drw.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jo $$6 : jo.c.a) {
            if ($$1.i() < 0.2F) {
               jj $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dkw.J)) {
                  md.e.a(awz.au, $$1).map(js::a).ifPresent($$3x -> {
                     dym $$4x = $$3x.m();
                     if ($$4x.b(dkf.d)) {
                        $$4x = $$4x.b(dkf.d, $$6);
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
