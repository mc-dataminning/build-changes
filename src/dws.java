import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dws {
   public final eee a;
   public final eee b;
   public final eee c;
   public final eee d;
   public final eee e;
   public final List<drd> f;
   public final awm<dea> g;
   public final awm<dea> h;
   public static final Codec<dws> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eee.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eee.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eee.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eee.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eee.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axn.a(drd.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awm.b(lf.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awm.b(lf.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dws::new)
   );

   public dws(eee $$0, eee $$1, eee $$2, eee $$3, eee $$4, List<drd> $$5, awm<dea> $$6, awm<dea> $$7) {
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
