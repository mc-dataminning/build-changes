import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqs {
   public final dye a;
   public final dye b;
   public final dye c;
   public final dye d;
   public final dye e;
   public final List<dlj> f;
   public final aup<cys> g;
   public final aup<cys> h;
   public static final Codec<dqs> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dye.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dye.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dye.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dye.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dye.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               avq.a(dlj.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aup.b(kg.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aup.b(kg.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dqs::new)
   );

   public dqs(dye $$0, dye $$1, dye $$2, dye $$3, dye $$4, List<dlj> $$5, aup<cys> $$6, aup<cys> $$7) {
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
