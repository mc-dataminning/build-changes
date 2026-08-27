import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drw implements dtr {
   public static final Codec<drw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dja.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dja.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dja.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dja.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dpq.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drw::new)
   );
   public final dja b;
   public final dja c;
   public final dja d;
   public final dja e;
   public final dpq f;
   public final boolean g;

   public drw(dja $$0, dja $$1, dja $$2, dja $$3, dpq $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
