import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtm extends dly {
   public static final MapCodec<dtm> a = b(dtm::new);
   public static final ebf b = ebe.c;
   private final btl c = bti.a(5);

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? null : a($$2, dxo.L, dyw::a);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
