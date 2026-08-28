import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends diw implements djb {
   public static final MapCodec<djc> a = b(djc::new);

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   public djc(dwu.d $$0) {
      super($$0);
   }

   @Override
   public cvk b() {
      return cvk.a;
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dts($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.p, dts::a);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dts $$5) {
         $$3.a($$5);
         $$3.a(awj.ab);
      }

      return bsi.a;
   }
}
