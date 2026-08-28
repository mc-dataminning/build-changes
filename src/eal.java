import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eal {
   public final ehz a;
   public final ehz b;
   public final ehz c;
   public final ehz d;
   public final ehz e;
   public final List<dus> f;
   public final axl<dhm> g;
   public final axl<dhm> h;
   public static final Codec<eal> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehz.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ehz.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ehz.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ehz.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ehz.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayo.a(dus.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axl.b(lw.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axl.b(lw.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eal::new)
   );

   public eal(ehz $$0, ehz $$1, ehz $$2, ehz $$3, ehz $$4, List<dus> $$5, axl<dhm> $$6, axl<dhm> $$7) {
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
