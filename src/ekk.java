import com.mojang.serialization.MapCodec;

public class ekk extends ekb {
   public static final MapCodec<ekk> b = dwv.a.fieldOf("state").xmap(ekk::new, $$0 -> $$0.c);
   private final dwv c;

   protected ekk(dwv $$0) {
      this.c = $$0;
   }

   @Override
   protected ekc<?> a() {
      return ekc.a;
   }

   @Override
   public dwv a(azg $$0, ji $$1) {
      return this.c;
   }
}
