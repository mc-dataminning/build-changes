import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpg extends dln implements dhd {
   public static final MapCodec<dpg> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cum.q.fieldOf("color").forGetter(dpg::b), t()).apply($$0, dpg::new));
   private final cum k;

   @Override
   public MapCodec<dpg> a() {
      return j;
   }

   public dpg(cum $$0, dur.d $$1) {
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
   public cum b() {
      return this.k;
   }
}
