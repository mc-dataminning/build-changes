import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duw(ib<ckw> c, duy d) {
   public static final Codec<duw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agd.a(jz.E).fieldOf("display").forGetter($$0x -> $$0x.c), duy.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, duw::new)
   );
   public static final Codec<ib<duw>> b = agc.a(jz.ax, a);

   public ib<ckw> a() {
      return this.c;
   }

   public duy b() {
      return this.d;
   }
}
