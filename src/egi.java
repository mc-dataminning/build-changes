import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egi implements eid {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwy.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dwy.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dwy.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dwy.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eea.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egi::new)
   );
   public final dwy b;
   public final dwy c;
   public final dwy d;
   public final dwy e;
   public final eea f;
   public final boolean g;

   public egi(dwy $$0, dwy $$1, dwy $$2, dwy $$3, eea $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
