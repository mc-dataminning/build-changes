import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dzt {
   public final ehh a;
   public final ehh b;
   public final ehh c;
   public final ehh d;
   public final ehh e;
   public final List<dua> f;
   public final axi<dgv> g;
   public final axi<dgv> h;
   public static final Codec<dzt> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehh.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ehh.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ehh.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ehh.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ehh.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayl.a(dua.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axi.b(lv.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axi.b(lv.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dzt::new)
   );

   public dzt(ehh $$0, ehh $$1, ehh $$2, ehh $$3, ehh $$4, List<dua> $$5, axi<dgv> $$6, axi<dgv> $$7) {
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
