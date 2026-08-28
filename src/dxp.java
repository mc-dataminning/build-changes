import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxp {
   public final efb a;
   public final efb b;
   public final efb c;
   public final efb d;
   public final efb e;
   public final List<dsa> f;
   public final axe<dex> g;
   public final axe<dex> h;
   public static final Codec<dxp> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efb.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efb.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efb.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efb.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efb.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayf.a(dsa.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axe.b(lq.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axe.b(lq.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxp::new)
   );

   public dxp(efb $$0, efb $$1, efb $$2, efb $$3, efb $$4, List<dsa> $$5, axe<dex> $$6, axe<dex> $$7) {
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
