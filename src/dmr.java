import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmr extends diz implements dep {
   public static final MapCodec<dmr> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cth.q.fieldOf("color").forGetter(dmr::b), u()).apply($$0, dmr::new));
   private final cth k;

   @Override
   public MapCodec<dmr> a() {
      return j;
   }

   public dmr(cth $$0, dsa.d $$1) {
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
   public cth b() {
      return this.k;
   }
}
