import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dom {
   public final dvy a;
   public final dvy b;
   public final dvy c;
   public final dvy d;
   public final dvy e;
   public final List<djg> f;
   public final asv<cwp> g;
   public final asv<cwp> h;
   public static final Codec<dom> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvy.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dvy.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dvy.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dvy.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dvy.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               atv.a(djg.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               asv.b(ke.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               asv.b(ke.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dom::new)
   );

   public dom(dvy $$0, dvy $$1, dvy $$2, dvy $$3, dvy $$4, List<djg> $$5, asv<cwp> $$6, asv<cwp> $$7) {
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
