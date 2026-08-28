import com.mojang.serialization.MapCodec;

public class eql extends eqh {
   public static final MapCodec<eql> a = ayu.m.fieldOf("chance").xmap(eql::new, $$0 -> $$0.c);
   private final int c;

   private eql(int $$0) {
      this.c = $$0;
   }

   public static eql a(int $$0) {
      return new eql($$0);
   }

   @Override
   protected boolean a(eqg $$0, azv $$1, iu $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eqj<?> b() {
      return eqj.b;
   }
}
