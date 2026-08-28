import com.mojang.serialization.MapCodec;

public class eqx extends eqt {
   public static final MapCodec<eqx> a = ayu.m.fieldOf("chance").xmap(eqx::new, $$0 -> $$0.c);
   private final int c;

   private eqx(int $$0) {
      this.c = $$0;
   }

   public static eqx a(int $$0) {
      return new eqx($$0);
   }

   @Override
   protected boolean a(eqs $$0, azv $$1, iv $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eqv<?> b() {
      return eqv.b;
   }
}
