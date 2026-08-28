import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duk extends dly {
   public static final MapCodec<duk> a = b(duk::new);

   @Override
   public MapCodec<duk> a() {
      return a;
   }

   protected duk(ean.d $$0) {
      super($$0);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dze($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.j, $$0.C ? dze::a : dze::b);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
