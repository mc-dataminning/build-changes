import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqk implements dpv {
   public static final Codec<dqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfe.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dfe.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bfy.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqk::new)
   );
   public final dfe b;
   public final dfe c;
   private final bfy d;

   public dqk(dfe $$0, dfe $$1, bfy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bfy a() {
      return this.d;
   }
}
