import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dms extends dnm implements der {
   public static final MapCodec<dms> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctj.q.fieldOf("color").forGetter(dms::b), u()).apply($$0, dms::new));
   private final ctj c;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(ctj $$0, dsc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ctj b() {
      return this.c;
   }
}
