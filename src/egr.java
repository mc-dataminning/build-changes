import com.mojang.serialization.MapCodec;

public class egr extends egi {
   public static final MapCodec<egr> b = dtc.b.fieldOf("state").xmap(egr::new, $$0 -> $$0.c);
   private final dtc c;

   protected egr(dtc $$0) {
      this.c = $$0;
   }

   @Override
   protected egj<?> a() {
      return egj.a;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      return this.c;
   }
}
