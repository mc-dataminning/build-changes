import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dov {
   public final dwh a;
   public final dwh b;
   public final dwh c;
   public final dwh d;
   public final dwh e;
   public final List<djp> f;
   public final asx<cwy> g;
   public final asx<cwy> h;
   public static final Codec<dov> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwh.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dwh.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dwh.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dwh.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dwh.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               atx.a(djp.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               asx.b(ke.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               asx.b(ke.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dov::new)
   );

   public dov(dwh $$0, dwh $$1, dwh $$2, dwh $$3, dwh $$4, List<djp> $$5, asx<cwy> $$6, asx<cwy> $$7) {
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
