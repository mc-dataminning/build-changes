import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecq {
   public final eke a;
   public final eke b;
   public final eke c;
   public final eke d;
   public final eke e;
   public final List<dwy> f;
   public final axf<djn> g;
   public final axf<djn> h;
   public static final Codec<ecq> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eke.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eke.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eke.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eke.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eke.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayi.b(dwy.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(mc.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(mc.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecq::new)
   );

   public ecq(eke $$0, eke $$1, eke $$2, eke $$3, eke $$4, List<dwy> $$5, axf<djn> $$6, axf<djn> $$7) {
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
