import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgx extends ddf implements cyw {
   public static final MapCodec<dgx> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cog.q.fieldOf("color").forGetter(dgx::b), u()).apply($$0, dgx::new));
   private final cog k;

   @Override
   public MapCodec<dgx> a() {
      return j;
   }

   public dgx(cog $$0, dmd.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cog b() {
      return this.k;
   }
}
