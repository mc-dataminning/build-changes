import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyd {
   public final efq a;
   public final efq b;
   public final efq c;
   public final efq d;
   public final efq e;
   public final List<dsl> f;
   public final awm<dfi> g;
   public final awm<dfi> h;
   public static final Codec<dyd> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efq.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efq.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efq.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efq.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efq.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axo.a(dsl.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awm.b(lr.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awm.b(lr.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dyd::new)
   );

   public dyd(efq $$0, efq $$1, efq $$2, efq $$3, efq $$4, List<dsl> $$5, awm<dfi> $$6, awm<dfi> $$7) {
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
