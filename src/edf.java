import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edf {
   public final ekt a;
   public final ekt b;
   public final ekt c;
   public final ekt d;
   public final ekt e;
   public final List<dxn> f;
   public final ayk<dke> g;
   public final ayk<dke> h;
   public static final Codec<edf> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekt.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ekt.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ekt.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ekt.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ekt.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               azn.a(dxn.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               ayk.b(mb.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               ayk.b(mb.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edf::new)
   );

   public edf(ekt $$0, ekt $$1, ekt $$2, ekt $$3, ekt $$4, List<dxn> $$5, ayk<dke> $$6, ayk<dke> $$7) {
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
