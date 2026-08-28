import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsi extends dop implements dkd {
   public static final MapCodec<dsi> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.q.fieldOf("color").forGetter(dsi::b), t()).apply($$0, dsi::new));
   private final cwm k;

   @Override
   public MapCodec<dsi> a() {
      return j;
   }

   public dsi(cwm $$0, dxu.d $$1) {
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
   public cwm b() {
      return this.k;
   }
}
