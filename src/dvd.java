import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvd implements dwy {
   public static final Codec<dvd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dme.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dme.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dme.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dme.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dsx.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dvd::new)
   );
   public final dme b;
   public final dme c;
   public final dme d;
   public final dme e;
   public final dsx f;
   public final boolean g;

   public dvd(dme $$0, dme $$1, dme $$2, dme $$3, dsx $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
