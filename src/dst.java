import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dst extends doy implements dkl {
   public static final MapCodec<dst> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(dst::b), t()).apply($$0, dst::new));
   private final cwv i;

   @Override
   public MapCodec<dst> a() {
      return h;
   }

   public dst(cwv $$0, dyl.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.B
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cwv b() {
      return this.i;
   }
}
