import com.mojang.serialization.MapCodec;

public class eqd extends epz {
   public static final MapCodec<eqd> a = ayu.m.fieldOf("chance").xmap(eqd::new, $$0 -> $$0.c);
   private final int c;

   private eqd(int $$0) {
      this.c = $$0;
   }

   public static eqd a(int $$0) {
      return new eqd($$0);
   }

   @Override
   protected boolean a(epy $$0, azv $$1, iu $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eqb<?> b() {
      return eqb.b;
   }
}
