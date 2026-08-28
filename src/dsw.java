import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsw extends dse implements dqt {
   public static final MapCodec<dsw> a = b(dsw::new);
   public static final dxp c = dxo.J;

   @Override
   protected MapCodec<? extends dsw> a() {
      return a;
   }

   protected dsw(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(etb.c)));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }
}
