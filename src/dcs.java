import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcs extends cza implements cur {
   public static final MapCodec<dcs> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjx.q.fieldOf("color").forGetter(dcs::b), u()).apply($$0, dcs::new));
   private final cjx k;

   @Override
   public MapCodec<dcs> a() {
      return j;
   }

   public dcs(cjx $$0, dhh.d $$1) {
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
   public cjx b() {
      return this.k;
   }
}
