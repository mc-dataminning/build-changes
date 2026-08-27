import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxx {
   public static final Codec<cxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.aY.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, cxx::new)
   );
   private final ka b;
   private final float c;

   public cxx(ka $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ka a() {
      return this.b;
   }

   public boolean a(axd $$0) {
      return $$0.i() <= this.c;
   }
}
