import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebg {
   public final eiu a;
   public final eiu b;
   public final eiu c;
   public final eiu d;
   public final eiu e;
   public final List<dvo> f;
   public final axt<dij> g;
   public final axt<dij> h;
   public static final Codec<ebg> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiu.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eiu.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eiu.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eiu.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eiu.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayw.a(dvo.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axt.b(ma.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axt.b(ma.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ebg::new)
   );

   public ebg(eiu $$0, eiu $$1, eiu $$2, eiu $$3, eiu $$4, List<dvo> $$5, axt<dij> $$6, axt<dij> $$7) {
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
