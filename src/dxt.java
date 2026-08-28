import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxt {
   public final eff a;
   public final eff b;
   public final eff c;
   public final eff d;
   public final eff e;
   public final List<dse> f;
   public final axf<dfb> g;
   public final axf<dfb> h;
   public static final Codec<dxt> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eff.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eff.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eff.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eff.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eff.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayh.a(dse.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(lq.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(lq.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxt::new)
   );

   public dxt(eff $$0, eff $$1, eff $$2, eff $$3, eff $$4, List<dse> $$5, axf<dfb> $$6, axf<dfb> $$7) {
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
