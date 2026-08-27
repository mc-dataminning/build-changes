import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkp {
   public final dsb a;
   public final dsb b;
   public final dsb c;
   public final dsb d;
   public final dsb e;
   public final List<dfj> f;
   public final aqi<csv> g;
   public final aqi<csv> h;
   public static final Codec<dkp> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dsb.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dsb.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dsb.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dsb.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               arg.a(dfj.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aqi.b(je.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aqi.b(je.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkp::new)
   );

   public dkp(dsb $$0, dsb $$1, dsb $$2, dsb $$3, dsb $$4, List<dfj> $$5, aqi<csv> $$6, aqi<csv> $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }
}
