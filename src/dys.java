import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dys {
   public final egf a;
   public final egf b;
   public final egf c;
   public final egf d;
   public final egf e;
   public final List<dta> f;
   public final awt<dfw> g;
   public final awt<dfw> h;
   public static final Codec<dys> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egf.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               egf.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               egf.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               egf.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               egf.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axv.a(dta.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awt.b(lu.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awt.b(lu.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dys::new)
   );

   public dys(egf $$0, egf $$1, egf $$2, egf $$3, egf $$4, List<dta> $$5, awt<dfw> $$6, awt<dfw> $$7) {
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
