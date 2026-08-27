import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eam extends eap {
   public static final Codec<eam> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eam::new)
   );
   private final cut b;
   private final float d;

   public eam(cut $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dgw $$0, ato $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eaq<?> a() {
      return eaq.e;
   }
}
