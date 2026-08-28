import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxq {
   public final efc a;
   public final efc b;
   public final efc c;
   public final efc d;
   public final efc e;
   public final List<dsb> f;
   public final axe<dey> g;
   public final axe<dey> h;
   public static final Codec<dxq> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efc.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efc.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efc.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efc.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efc.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayg.a(dsb.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axe.b(lq.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axe.b(lq.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxq::new)
   );

   public dxq(efc $$0, efc $$1, efc $$2, efc $$3, efc $$4, List<dsb> $$5, axe<dey> $$6, axe<dey> $$7) {
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
