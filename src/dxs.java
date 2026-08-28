import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxs {
   public final efe a;
   public final efe b;
   public final efe c;
   public final efe d;
   public final efe e;
   public final List<dsd> f;
   public final axf<dfa> g;
   public final axf<dfa> h;
   public static final Codec<dxs> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efe.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efe.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efe.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efe.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efe.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayh.a(dsd.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(lq.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(lq.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxs::new)
   );

   public dxs(efe $$0, efe $$1, efe $$2, efe $$3, efe $$4, List<dsd> $$5, axf<dfa> $$6, axf<dfa> $$7) {
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
