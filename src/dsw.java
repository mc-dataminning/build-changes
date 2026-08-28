import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsw extends dmm {
   public static final MapCodec<dsw> a = b(dsw::new);
   public static final ebf b = dsx.b;

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   public dsw(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.D($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b) && !$$1.D($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}
