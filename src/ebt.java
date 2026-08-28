import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebt implements edo {
   public static final Codec<ebt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsk.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsk.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsk.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsk.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dzm.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebt::new)
   );
   public final dsk b;
   public final dsk c;
   public final dsk d;
   public final dsk e;
   public final dzm f;
   public final boolean g;

   public ebt(dsk $$0, dsk $$1, dsk $$2, dsk $$3, dzm $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
