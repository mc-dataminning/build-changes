import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drl implements dtg {
   public static final Codec<drl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dip.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dip.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dip.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dip.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dpf.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drl::new)
   );
   public final dip b;
   public final dip c;
   public final dip d;
   public final dip e;
   public final dpf f;
   public final boolean g;

   public drl(dip $$0, dip $$1, dip $$2, dip $$3, dpf $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
