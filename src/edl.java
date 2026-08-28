import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edl {
   public final ekz a;
   public final ekz b;
   public final ekz c;
   public final ekz d;
   public final ekz e;
   public final List<dxq> f;
   public final axf<dke> g;
   public final axf<dke> h;
   public static final Codec<edl> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekz.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ekz.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ekz.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ekz.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ekz.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayi.b(dxq.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(mc.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(mc.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edl::new)
   );

   public edl(ekz $$0, ekz $$1, ekz $$2, ekz $$3, ekz $$4, List<dxq> $$5, axf<dke> $$6, axf<dke> $$7) {
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
