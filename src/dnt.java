import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnt extends dep {
   public static final MapCodec<dnt> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csh.q.fieldOf("color").forGetter(dnt::b), u()).apply($$0, dnt::new));
   private final csh d;

   @Override
   public MapCodec<dnt> a() {
      return c;
   }

   protected dnt(csh $$0, dra.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public csh b() {
      return this.d;
   }
}
