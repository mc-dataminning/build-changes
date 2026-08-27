import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dhh {
   public final dot a;
   public final dot b;
   public final dot c;
   public final dot d;
   public final dot e;
   public final List<dcb> f;
   public final anl<cpn> g;
   public final anl<cpn> h;
   public static final Codec<dhh> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dot.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dot.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dot.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dot.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dot.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               aoi.a(dcb.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               anl.b(jc.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               anl.b(jc.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dhh::new)
   );

   public dhh(dot $$0, dot $$1, dot $$2, dot $$3, dot $$4, List<dcb> $$5, anl<cpn> $$6, anl<cpn> $$7) {
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
