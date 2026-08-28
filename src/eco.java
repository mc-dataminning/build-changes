import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eco {
   public final ekc a;
   public final ekc b;
   public final ekc c;
   public final ekc d;
   public final ekc e;
   public final List<dww> f;
   public final axf<djl> g;
   public final axf<djl> h;
   public static final Codec<eco> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekc.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ekc.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ekc.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ekc.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ekc.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayi.b(dww.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(mc.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(mc.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eco::new)
   );

   public eco(ekc $$0, ekc $$1, ekc $$2, ekc $$3, ekc $$4, List<dww> $$5, axf<djl> $$6, axf<djl> $$7) {
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
