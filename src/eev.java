import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eev extends eey {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eev::new)
   );
   private final cyo b;
   private final float d;

   public eev(cyo $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dlf $$0, awo $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eez<?> a() {
      return eez.e;
   }
}
