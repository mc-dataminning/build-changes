import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emg(float b) implements emb {
   public static final Codec<emg> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(emg::c)).apply($$0, emg::new));

   @Override
   public emc b() {
      return emd.e;
   }

   public boolean a(ejc $$0) {
      return $$0.b().i() < this.b;
   }

   public static emb.a a(float $$0) {
      return () -> new emg($$0);
   }

   public float c() {
      return this.b;
   }
}
