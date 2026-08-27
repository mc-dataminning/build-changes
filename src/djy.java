import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djy extends dks implements dby {
   public static final MapCodec<djy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cql.q.fieldOf("color").forGetter(djy::b), u()).apply($$0, djy::new));
   private final cql c;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(cql $$0, dph.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cql b() {
      return this.c;
   }
}
