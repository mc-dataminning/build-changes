import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edg {
   public final eku a;
   public final eku b;
   public final eku c;
   public final eku d;
   public final eku e;
   public final List<dxo> f;
   public final aya<dkd> g;
   public final aya<dkd> h;
   public static final Codec<edg> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eku.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eku.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eku.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eku.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eku.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               azd.a(dxo.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aya.b(mb.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aya.b(mb.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edg::new)
   );

   public edg(eku $$0, eku $$1, eku $$2, eku $$3, eku $$4, List<dxo> $$5, aya<dkd> $$6, aya<dkd> $$7) {
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
