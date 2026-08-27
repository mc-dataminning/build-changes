import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dog {
   public final dvs a;
   public final dvs b;
   public final dvs c;
   public final dvs d;
   public final dvs e;
   public final List<dja> f;
   public final asq<cwj> g;
   public final asq<cwj> h;
   public static final Codec<dog> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvs.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dvs.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dvs.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dvs.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dvs.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               atq.a(dja.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               asq.b(ke.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               asq.b(ke.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dog::new)
   );

   public dog(dvs $$0, dvs $$1, dvs $$2, dvs $$3, dvs $$4, List<dja> $$5, asq<cwj> $$6, asq<cwj> $$7) {
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
