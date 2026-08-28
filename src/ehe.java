import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehe implements eiz {
   public static final Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxu.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dxu.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dxu.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dxu.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eew.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ehe::new)
   );
   public final dxu b;
   public final dxu c;
   public final dxu d;
   public final dxu e;
   public final eew f;
   public final boolean g;

   public ehe(dxu $$0, dxu $$1, dxu $$2, dxu $$3, eew $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
