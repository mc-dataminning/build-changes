import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dly implements dmd {
   public static final MapCodec<dme> a = b(dme::new);

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(ean.d $$0) {
      super($$0);
   }

   @Override
   public cyi b() {
      return cyi.a;
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.p, dxh::a);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxh $$5) {
         $$3.a($$5);
         $$3.a(awx.ab);
      }

      return bug.a;
   }
}
