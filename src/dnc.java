import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnc extends dor {
   public static final MapCodec<dnc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayd.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dnc::new)
   );
   private final ayd b;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(ayd $$0, dzn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dzo $$0, dhv $$1, iu $$2) {
      return this.b.a();
   }
}
