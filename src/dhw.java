import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends dhq implements dhv {
   public static final MapCodec<dhw> a = b(dhw::new);

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dvi.d $$0) {
      super($$0);
   }

   @Override
   public cuy b() {
      return cuy.a;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.o, dsh::a);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsh $$5) {
         $$3.a($$5);
         $$3.a(awv.ab);
      }

      return bsd.a;
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }
}
