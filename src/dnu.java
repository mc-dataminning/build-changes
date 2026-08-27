import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnu implements dpp {
   public static final Codec<dnu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dey.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dey.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dey.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dey.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dlo.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnu::new)
   );
   public final dey b;
   public final dey c;
   public final dey d;
   public final dey e;
   public final dlo f;
   public final boolean g;

   public dnu(dey $$0, dey $$1, dey $$2, dey $$3, dlo $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
