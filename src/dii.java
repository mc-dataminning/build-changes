import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dii extends dic implements dih {
   public static final MapCodec<dii> a = b(dii::new);

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dvu.d $$0) {
      super($$0);
   }

   @Override
   public cvj b() {
      return cvj.a;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dst($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.o, dst::a);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dst $$5) {
         $$3.a($$5);
         $$3.a(awx.ab);
      }

      return bsk.a;
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }
}
