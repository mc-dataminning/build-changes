import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyv {
   public final egj a;
   public final egj b;
   public final egj c;
   public final egj d;
   public final egj e;
   public final List<dtc> f;
   public final awu<dfy> g;
   public final awu<dfy> h;
   public static final Codec<dyv> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egj.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               egj.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               egj.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               egj.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               egj.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axw.a(dtc.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awu.b(lu.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awu.b(lu.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dyv::new)
   );

   public dyv(egj $$0, egj $$1, egj $$2, egj $$3, egj $$4, List<dtc> $$5, awu<dfy> $$6, awu<dfy> $$7) {
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
