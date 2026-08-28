import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehd implements eiy {
   public static final Codec<ehd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxq.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dxq.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dxq.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dxq.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eev.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ehd::new)
   );
   public final dxq b;
   public final dxq c;
   public final dxq d;
   public final dxq e;
   public final eev f;
   public final boolean g;

   public ehd(dxq $$0, dxq $$1, dxq $$2, dxq $$3, eev $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
