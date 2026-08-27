import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dql {
   public final dxx a;
   public final dxx b;
   public final dxx c;
   public final dxx d;
   public final dxx e;
   public final List<dlf> f;
   public final auo<cyo> g;
   public final auo<cyo> h;
   public static final Codec<dql> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dxx.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dxx.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dxx.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dxx.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               avp.a(dlf.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               auo.b(kg.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               auo.b(kg.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dql::new)
   );

   public dql(dxx $$0, dxx $$1, dxx $$2, dxx $$3, dxx $$4, List<dlf> $$5, auo<cyo> $$6, auo<cyo> $$7) {
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
