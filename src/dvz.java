import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvz implements dxu {
   public static final Codec<dvz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmz.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dmz.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dmz.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dmz.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dtt.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dvz::new)
   );
   public final dmz b;
   public final dmz c;
   public final dmz d;
   public final dmz e;
   public final dtt f;
   public final boolean g;

   public dvz(dmz $$0, dmz $$1, dmz $$2, dmz $$3, dtt $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
