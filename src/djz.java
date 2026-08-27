import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djz extends dgh implements dby {
   public static final MapCodec<djz> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cql.q.fieldOf("color").forGetter(djz::b), u()).apply($$0, djz::new));
   private final cql k;

   @Override
   public MapCodec<djz> a() {
      return j;
   }

   public djz(cql $$0, dph.d $$1) {
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
   public cql b() {
      return this.k;
   }
}
