import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dem extends dga {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awt.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dem::new)
   );
   private final awt b;

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(awt $$0, dqg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dqh $$0, czj $$1, in $$2) {
      return this.b.a();
   }
}
