import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dls extends dcp {
   public static final MapCodec<dls> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqc.q.fieldOf("color").forGetter(dls::b), u()).apply($$0, dls::new));
   private final cqc d;

   @Override
   public MapCodec<dls> a() {
      return c;
   }

   protected dls(cqc $$0, doy.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cqc b() {
      return this.d;
   }
}
