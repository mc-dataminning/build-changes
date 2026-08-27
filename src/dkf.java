import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkf {
   public final drr a;
   public final drr b;
   public final drr c;
   public final drr d;
   public final drr e;
   public final List<dez> f;
   public final aqa<csl> g;
   public final aqa<csl> h;
   public static final Codec<dkf> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drr.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               drr.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               drr.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               drr.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               drr.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               aqy.a(dez.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aqa.b(jc.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aqa.b(jc.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkf::new)
   );

   public dkf(drr $$0, drr $$1, drr $$2, drr $$3, drr $$4, List<dez> $$5, aqa<csl> $$6, aqa<csl> $$7) {
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
