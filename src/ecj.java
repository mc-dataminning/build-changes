import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecj implements eee {
   public static final Codec<ecj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dta.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dta.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dta.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dta.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eac.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ecj::new)
   );
   public final dta b;
   public final dta c;
   public final dta d;
   public final dta e;
   public final eac f;
   public final boolean g;

   public ecj(dta $$0, dta $$1, dta $$2, dta $$3, eac $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
