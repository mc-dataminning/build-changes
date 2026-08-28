import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo implements egj {
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvd.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dvd.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dvd.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dvd.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ecg.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eeo::new)
   );
   public final dvd b;
   public final dvd c;
   public final dvd d;
   public final dvd e;
   public final ecg f;
   public final boolean g;

   public eeo(dvd $$0, dvd $$1, dvd $$2, dvd $$3, ecg $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
