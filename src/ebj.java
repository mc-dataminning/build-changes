import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebj implements ede {
   public static final Codec<ebj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dse.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dse.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dse.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dse.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dzd.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebj::new)
   );
   public final dse b;
   public final dse c;
   public final dse d;
   public final dse e;
   public final dzd f;
   public final boolean g;

   public ebj(dse $$0, dse $$1, dse $$2, dse $$3, dzd $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
