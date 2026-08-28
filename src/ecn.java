import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecn {
   public final ekb a;
   public final ekb b;
   public final ekb c;
   public final ekb d;
   public final ekb e;
   public final List<dwv> f;
   public final axe<djk> g;
   public final axe<djk> h;
   public static final Codec<ecn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekb.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ekb.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ekb.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ekb.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ekb.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayh.b(dwv.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axe.b(mc.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axe.b(mc.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecn::new)
   );

   public ecn(ekb $$0, ekb $$1, ekb $$2, ekb $$3, ekb $$4, List<dwv> $$5, axe<djk> $$6, axe<djk> $$7) {
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
