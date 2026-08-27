import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dys extends dyv {
   public static final Codec<dys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dys::new)
   );
   private final csv b;
   private final float d;

   public dys(csv $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfj $$0, asc $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dyw<?> a() {
      return dyw.e;
   }
}
