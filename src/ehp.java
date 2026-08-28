import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehp extends eic {
   public static final MapCodec<ehp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzm.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehp::new)
   );
   private final dzm c;

   private ehp(dzm $$0) {
      this.c = $$0;
   }

   public static ehp a(dzm $$0) {
      return new ehp($$0);
   }

   @Override
   protected boolean a(eib $$0, ayo $$1, ja $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eie<?> b() {
      return eie.a;
   }
}
