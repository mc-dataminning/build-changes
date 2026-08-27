import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dni extends dod implements des {
   public static final MapCodec<dni> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csy.q.fieldOf("color").forGetter(dni::b), u()).apply($$0, dni::new));
   private final csy c;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(csy $$0, dtb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public csy b() {
      return this.c;
   }
}
