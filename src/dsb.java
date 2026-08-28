import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsb extends dog implements dju {
   public static final MapCodec<dsb> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwd.q.fieldOf("color").forGetter(dsb::b), t()).apply($$0, dsb::new));
   private final cwd k;

   @Override
   public MapCodec<dsb> a() {
      return j;
   }

   public dsb(cwd $$0, dxn.d $$1) {
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
   public cwd b() {
      return this.k;
   }
}
