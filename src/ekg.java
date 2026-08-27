import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekg extends ekj {
   public static final Codec<ekg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ld.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ekg::new)
   );
   private final dde b;
   private final float d;

   public ekg(dde $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dqh $$0, ayg $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ekk<?> a() {
      return ekk.e;
   }
}
