import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgp extends did {
   public static final MapCodec<dgp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awz.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgp::new)
   );
   private final awz b;

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(awz $$0, dsj.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsk $$0, dbl $$1, ja $$2) {
      return this.b.a();
   }
}
