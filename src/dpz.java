import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpz implements dpv {
   public static final Codec<dpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, din.c).fieldOf("height").forGetter($$0x -> $$0x.b), dfe.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dpz::new)
   );
   public final int b;
   public final dfe c;

   public dpz(int $$0, dfe $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
