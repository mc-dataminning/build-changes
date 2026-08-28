import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dud extends dkv {
   public static final MapCodec<dud> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwd.q.fieldOf("color").forGetter(dud::b), t()).apply($$0, dud::new));
   private final cwd d;

   @Override
   public MapCodec<dud> a() {
      return c;
   }

   protected dud(cwd $$0, dxn.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cwd b() {
      return this.d;
   }
}
