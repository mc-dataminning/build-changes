import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgk extends dcs implements cyj {
   public static final MapCodec<dgk> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnr.q.fieldOf("color").forGetter(dgk::b), u()).apply($$0, dgk::new));
   private final cnr k;

   @Override
   public MapCodec<dgk> a() {
      return j;
   }

   public dgk(cnr $$0, dli.d $$1) {
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
   public cnr b() {
      return this.k;
   }
}
