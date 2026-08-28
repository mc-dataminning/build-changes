import com.mojang.serialization.MapCodec;

public class eqs extends eqo {
   public static final MapCodec<eqs> a = ayu.m.fieldOf("chance").xmap(eqs::new, $$0 -> $$0.c);
   private final int c;

   private eqs(int $$0) {
      this.c = $$0;
   }

   public static eqs a(int $$0) {
      return new eqs($$0);
   }

   @Override
   protected boolean a(eqn $$0, azv $$1, iv $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eqq<?> b() {
      return eqq.b;
   }
}
