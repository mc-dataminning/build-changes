import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekc implements elx {
   public static final Codec<ekc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eao.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               eao.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               eao.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               eao.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ehu.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ekc::new)
   );
   public final eao b;
   public final eao c;
   public final eao d;
   public final eao e;
   public final ehu f;
   public final boolean g;

   public ekc(eao $$0, eao $$1, eao $$2, eao $$3, ehu $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
