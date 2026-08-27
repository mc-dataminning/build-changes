import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyj extends dym {
   public static final Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dyj::new)
   );
   private final csm b;
   private final float d;

   public dyj(csm $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfa $$0, aru $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dyn<?> a() {
      return dyn.e;
   }
}
