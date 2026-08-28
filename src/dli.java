import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dli extends dly {
   public static final ebf a = ebe.A;
   private final dty.a b;

   public dli(dty.a $$0, ean.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dli> a();

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dmo.hp) || $$1.a(dmo.hq) || $$1.a(dmo.hr) || $$1.a(dmo.hs);
         if ($$3) {
            return a($$2, dxo.q, dzc::a);
         }
      }

      return null;
   }

   public dty.a b() {
      return this.b;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(a);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
