import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebn implements edi {
   public static final Codec<ebn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsh.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dsh.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dsh.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dsh.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dzg.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebn::new)
   );
   public final dsh b;
   public final dsh c;
   public final dsh d;
   public final dsh e;
   public final dzg f;
   public final boolean g;

   public ebn(dsh $$0, dsh $$1, dsh $$2, dsh $$3, dzg $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
