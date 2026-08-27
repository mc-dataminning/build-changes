import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dko extends dgw implements dcm {
   public static final MapCodec<dko> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqw.q.fieldOf("color").forGetter(dko::b), u()).apply($$0, dko::new));
   private final cqw k;

   @Override
   public MapCodec<dko> a() {
      return j;
   }

   public dko(cqw $$0, dpx.d $$1) {
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
   public cqw b() {
      return this.k;
   }
}
