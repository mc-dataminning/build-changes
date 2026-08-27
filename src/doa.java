import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doa implements dpv {
   public static final Codec<doa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfe.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dfe.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dfe.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dfe.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dlu.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, doa::new)
   );
   public final dfe b;
   public final dfe c;
   public final dfe d;
   public final dfe e;
   public final dlu f;
   public final boolean g;

   public doa(dfe $$0, dfe $$1, dfe $$2, dfe $$3, dlu $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
