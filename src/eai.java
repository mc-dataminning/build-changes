import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eai implements ecd {
   public static final Codec<eai> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drd.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               drd.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               drd.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               drd.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dyc.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eai::new)
   );
   public final drd b;
   public final drd c;
   public final drd d;
   public final drd e;
   public final dyc f;
   public final boolean g;

   public eai(drd $$0, drd $$1, drd $$2, drd $$3, dyc $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
