import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egt extends egw {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, egt::new)
   );
   private final daa b;
   private final float d;

   public egt(daa $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dmz $$0, axd $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected egx<?> a() {
      return egx.e;
   }
}
