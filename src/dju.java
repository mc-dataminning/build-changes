import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dju extends dar {
   public static final MapCodec<dju> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpb.q.fieldOf("color").forGetter(dju::b), u()).apply($$0, dju::new));
   private final cpb d;

   @Override
   public MapCodec<dju> a() {
      return c;
   }

   protected dju(cpb $$0, dmy.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cpb b() {
      return this.d;
   }
}
