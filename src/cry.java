import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cry extends cso implements cim {
   public static final dfu a = dft.w;
   private final dac.a b;

   public cry(dac.a $$0, dfc.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cry> a();

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dej($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cte.gO) || $$1.a(cte.gP) || $$1.a(cte.gQ) || $$1.a(cte.gR);
         if ($$3) {
            return a($$2, ddb.p, dej::a);
         }
      }

      return null;
   }

   public dac.a b() {
      return this.b;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public bjb g() {
      return bjb.f;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
