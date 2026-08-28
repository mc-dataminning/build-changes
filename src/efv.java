import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efv {
   public final enj a;
   public final enj b;
   public final enj c;
   public final enj d;
   public final enj e;
   public final List<dzz> f;
   public final axr<dma> g;
   public final axr<dma> h;
   public static final Codec<efv> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enj.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               enj.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               enj.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               enj.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               enj.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayu.b(dzz.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axr.b(mg.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axr.b(mg.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, efv::new)
   );

   public efv(enj $$0, enj $$1, enj $$2, enj $$3, enj $$4, List<dzz> $$5, axr<dma> $$6, axr<dma> $$7) {
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
