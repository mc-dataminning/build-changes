import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eck implements eek {
   public static final Codec<eck> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dtc.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dtc.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dtc.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eab.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eck::new)
   );
   public final dtc b;
   public final dtc c;
   public final dtc d;
   public final dtc e;
   public final eab f;
   public final boolean g;

   public eck(dtc $$0, dtc $$1, dtc $$2, dtc $$3, eab $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
