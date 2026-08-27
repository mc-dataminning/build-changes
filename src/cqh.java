import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqh {
   public static final Codec<cqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.aR.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cqh::new)
   );
   private final iu b;
   private final float c;

   public cqh(iu $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public iu a() {
      return this.b;
   }

   public boolean a(art $$0) {
      return $$0.i() <= this.c;
   }
}
