import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvh extends drk implements dmv {
   public static final MapCodec<dvh> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(dvh::b), t()).apply($$0, dvh::new));
   private final cyy i;

   @Override
   public MapCodec<dvh> a() {
      return h;
   }

   public dvh(cyy $$0, ebf.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cyy b() {
      return this.i;
   }
}
