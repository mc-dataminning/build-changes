import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkj {
   public final drv a;
   public final drv b;
   public final drv c;
   public final drv d;
   public final drv e;
   public final List<dfd> f;
   public final aqk<ctc> g;
   public final aqk<ctc> h;
   public static final Codec<dkj> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drv.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               drv.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               drv.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               drv.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               drv.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               arj.a(dfd.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aqk.b(jc.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aqk.b(jc.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkj::new)
   );

   public dkj(drv $$0, drv $$1, drv $$2, drv $$3, drv $$4, List<dfd> $$5, aqk<ctc> $$6, aqk<ctc> $$7) {
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
