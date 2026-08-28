import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecm implements eeh {
   public static final Codec<ecm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dtc.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dtc.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dtc.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eaf.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ecm::new)
   );
   public final dtc b;
   public final dtc c;
   public final dtc d;
   public final dtc e;
   public final eaf f;
   public final boolean g;

   public ecm(dtc $$0, dtc $$1, dtc $$2, dtc $$3, eaf $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
