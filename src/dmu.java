import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dmo implements dmt {
   public static final MapCodec<dmu> a = b(dmu::new);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(ebd.d $$0) {
      super($$0);
   }

   @Override
   public cyw b() {
      return cyw.a;
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dxx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.p, dxx::a);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxx $$5) {
         $$3.a($$5);
         $$3.a(awz.ab);
      }

      return bur.a;
   }
}
