import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy implements eit {
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxo.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dxo.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dxo.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dxo.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eeq.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egy::new)
   );
   public final dxo b;
   public final dxo c;
   public final dxo d;
   public final dxo e;
   public final eeq f;
   public final boolean g;

   public egy(dxo $$0, dxo $$1, dxo $$2, dxo $$3, eeq $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
