import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class don {
   public final dvz a;
   public final dvz b;
   public final dvz c;
   public final dvz d;
   public final dvz e;
   public final List<djh> f;
   public final asw<cwq> g;
   public final asw<cwq> h;
   public static final Codec<don> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvz.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dvz.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dvz.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dvz.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dvz.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               atw.a(djh.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               asw.b(ke.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               asw.b(ke.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, don::new)
   );

   public don(dvz $$0, dvz $$1, dvz $$2, dvz $$3, dvz $$4, List<djh> $$5, asw<cwq> $$6, asw<cwq> $$7) {
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
