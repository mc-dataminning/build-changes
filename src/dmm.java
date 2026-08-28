import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmm extends dng implements del {
   public static final MapCodec<dmm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctd.q.fieldOf("color").forGetter(dmm::b), u()).apply($$0, dmm::new));
   private final ctd c;

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(ctd $$0, drw.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ctd b() {
      return this.c;
   }
}
