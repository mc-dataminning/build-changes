import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dfl {
   public static final MapCodec<dop> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctd.q.fieldOf("color").forGetter(dop::b), u()).apply($$0, dop::new));
   private final ctd d;

   @Override
   public MapCodec<dop> a() {
      return c;
   }

   protected dop(ctd $$0, drw.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ctd b() {
      return this.d;
   }
}
