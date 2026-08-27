import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dlh {
   public final dst a;
   public final dst b;
   public final dst c;
   public final dst d;
   public final dst e;
   public final List<dgb> f;
   public final arh<cua> g;
   public final arh<cua> h;
   public static final Codec<dlh> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dst.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dst.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dst.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dst.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               asg.a(dgb.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               arh.b(jz.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               arh.b(jz.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dlh::new)
   );

   public dlh(dst $$0, dst $$1, dst $$2, dst $$3, dst $$4, List<dgb> $$5, arh<cua> $$6, arh<cua> $$7) {
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
