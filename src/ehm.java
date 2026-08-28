import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehm {
   public final epc a;
   public final epc b;
   public final epc c;
   public final epc d;
   public final epc e;
   public final List<ebq> f;
   public final ayc<dno> g;
   public final ayc<dno> h;
   public static final Codec<ehm> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epc.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               epc.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               epc.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               epc.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               epc.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               azg.b(ebq.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               ayc.b(mi.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               ayc.b(mi.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ehm::new)
   );

   public ehm(epc $$0, epc $$1, epc $$2, epc $$3, epc $$4, List<ebq> $$5, ayc<dno> $$6, ayc<dno> $$7) {
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
