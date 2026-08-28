import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egp {
   public final eod a;
   public final eod b;
   public final eod c;
   public final eod d;
   public final eod e;
   public final List<eat> f;
   public final axr<dmr> g;
   public final axr<dmr> h;
   public static final Codec<egp> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eod.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eod.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eod.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eod.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eod.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayu.b(eat.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axr.b(mh.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axr.b(mh.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egp::new)
   );

   public egp(eod $$0, eod $$1, eod $$2, eod $$3, eod $$4, List<eat> $$5, axr<dmr> $$6, axr<dmr> $$7) {
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
