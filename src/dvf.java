import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvf extends dri implements dmt {
   public static final MapCodec<dvf> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(dvf::b), t()).apply($$0, dvf::new));
   private final cyw i;

   @Override
   public MapCodec<dvf> a() {
      return h;
   }

   public dvf(cyw $$0, ebd.d $$1) {
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
   public cyw b() {
      return this.i;
   }
}
