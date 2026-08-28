import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxm {
   public final eey a;
   public final eey b;
   public final eey c;
   public final eey d;
   public final eey e;
   public final List<drx> f;
   public final axb<deu> g;
   public final axb<deu> h;
   public static final Codec<dxm> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eey.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eey.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eey.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eey.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eey.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayc.a(drx.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axb.b(lq.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axb.b(lq.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxm::new)
   );

   public dxm(eey $$0, eey $$1, eey $$2, eey $$3, eey $$4, List<drx> $$5, axb<deu> $$6, axb<deu> $$7) {
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
