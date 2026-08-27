import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlt extends dib implements ddr {
   public static final MapCodec<dlt> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csj.q.fieldOf("color").forGetter(dlt::b), u()).apply($$0, dlt::new));
   private final csj k;

   @Override
   public MapCodec<dlt> a() {
      return j;
   }

   public dlt(csj $$0, drc.d $$1) {
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
   public csj b() {
      return this.k;
   }
}
