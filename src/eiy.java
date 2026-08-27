import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiy extends ejb {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kr.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eiy::new)
   );
   private final dby b;
   private final float d;

   public eiy(dby $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(doz $$0, axr $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ejc<?> a() {
      return ejc.e;
   }
}
