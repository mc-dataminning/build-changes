import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dmt {
   public final duf a;
   public final duf b;
   public final duf c;
   public final duf d;
   public final duf e;
   public final List<dhn> f;
   public final arz<cvf> g;
   public final arz<cvf> h;
   public static final Codec<dmt> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duf.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               duf.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               duf.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               duf.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               duf.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               asy.a(dhn.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               arz.b(kd.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               arz.b(kd.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dmt::new)
   );

   public dmt(duf $$0, duf $$1, duf $$2, duf $$3, duf $$4, List<dhn> $$5, arz<cvf> $$6, arz<cvf> $$7) {
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
