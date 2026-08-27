import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyk extends cye implements cyj {
   public static final MapCodec<cyk> a = b(cyk::new);

   @Override
   public MapCodec<cyk> a() {
      return a;
   }

   public cyk(dli.d $$0) {
      super($$0);
   }

   @Override
   public cnr b() {
      return cnr.a;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dis($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.o, dis::a);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof dis) {
            $$3.a((dis)$$5);
            $$3.a(atv.ab);
         }

         return blw.b;
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof dis) {
            ((dis)$$5).a($$4.z());
         }
      }
   }
}
