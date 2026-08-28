import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpd extends dlk implements dha {
   public static final MapCodec<dpd> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuj.q.fieldOf("color").forGetter(dpd::b), u()).apply($$0, dpd::new));
   private final cuj k;

   @Override
   public MapCodec<dpd> a() {
      return j;
   }

   public dpd(cuj $$0, dun.d $$1) {
      super($$1);
      this.k = $$0;
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cuj b() {
      return this.k;
   }
}
