import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmz extends dnt implements dey {
   public static final MapCodec<dmz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csv.q.fieldOf("color").forGetter(dmz::b), u()).apply($$0, dmz::new));
   private final csv c;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   public dmz(csv $$0, dsj.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public csv b() {
      return this.c;
   }
}
