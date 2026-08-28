import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends diz implements dje {
   public static final MapCodec<djf> a = b(djf::new);

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dwx.d $$0) {
      super($$0);
   }

   @Override
   public cvn b() {
      return cvn.a;
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dtv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.p, dtv::a);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtv $$5) {
         $$3.a($$5);
         $$3.a(awk.ab);
      }

      return bsl.a;
   }
}
