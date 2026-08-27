import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkr {
   public final dsd a;
   public final dsd b;
   public final dsd c;
   public final dsd d;
   public final dsd e;
   public final List<dfl> f;
   public final aqj<csx> g;
   public final aqj<csx> h;
   public static final Codec<dkr> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dsd.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dsd.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dsd.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dsd.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               arh.a(dfl.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aqj.b(je.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aqj.b(je.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkr::new)
   );

   public dkr(dsd $$0, dsd $$1, dsd $$2, dsd $$3, dsd $$4, List<dfl> $$5, aqj<csx> $$6, aqj<csx> $$7) {
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
