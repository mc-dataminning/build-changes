import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dat extends cxb implements cst {
   public static final MapCodec<dat> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(chz.q.fieldOf("color").forGetter(dat::b), t()).apply($$0, dat::new));
   private final chz k;

   @Override
   public MapCodec<dat> a() {
      return j;
   }

   public dat(chz $$0, dfc.d $$1) {
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
   public chz b() {
      return this.k;
   }
}
