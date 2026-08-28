import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dix implements djc {
   public static final MapCodec<djd> a = b(djd::new);

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dwv.d $$0) {
      super($$0);
   }

   @Override
   public cvl b() {
      return cvl.a;
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.p, dtt::a);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtt $$5) {
         $$3.a($$5);
         $$3.a(awk.ab);
      }

      return bsj.a;
   }
}
