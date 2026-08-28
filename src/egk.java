import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egk {
   public final eny a;
   public final eny b;
   public final eny c;
   public final eny d;
   public final eny e;
   public final List<eao> f;
   public final axr<dmm> g;
   public final axr<dmm> h;
   public static final Codec<egk> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eny.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eny.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eny.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eny.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eny.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayu.b(eao.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axr.b(mh.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axr.b(mh.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egk::new)
   );

   public egk(eny $$0, eny $$1, eny $$2, eny $$3, eny $$4, List<eao> $$5, axr<dmm> $$6, axr<dmm> $$7) {
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
