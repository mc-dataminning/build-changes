import com.mojang.serialization.MapCodec;

public class egs extends egj {
   public static final MapCodec<egs> b = dtc.b.fieldOf("state").xmap(egs::new, $$0 -> $$0.c);
   private final dtc c;

   protected egs(dtc $$0) {
      this.c = $$0;
   }

   @Override
   protected egk<?> a() {
      return egk.a;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      return this.c;
   }
}
