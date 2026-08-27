import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efk(ix<ctj> c, efm d) {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lf.G).fieldOf("display").forGetter($$0x -> $$0x.c), efm.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, efk::new)
   );
   public static final Codec<ix<efk>> b = aki.a(lf.aF, a);

   public ix<ctj> a() {
      return this.c;
   }

   public efm b() {
      return this.d;
   }
}
