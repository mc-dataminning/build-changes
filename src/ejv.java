import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejv implements elq {
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eah.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               eah.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               eah.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               eah.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ehn.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejv::new)
   );
   public final eah b;
   public final eah c;
   public final eah d;
   public final eah e;
   public final ehn f;
   public final boolean g;

   public ejv(eah $$0, eah $$1, eah $$2, eah $$3, ehn $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
