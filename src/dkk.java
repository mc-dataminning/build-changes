import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkk {
   public final drw a;
   public final drw b;
   public final drw c;
   public final drw d;
   public final drw e;
   public final List<dfe> f;
   public final aqd<csq> g;
   public final aqd<csq> h;
   public static final Codec<dkk> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drw.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               drw.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               drw.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               drw.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               drw.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               arb.a(dfe.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aqd.b(je.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aqd.b(je.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkk::new)
   );

   public dkk(drw $$0, drw $$1, drw $$2, drw $$3, drw $$4, List<dfe> $$5, aqd<csq> $$6, aqd<csq> $$7) {
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
