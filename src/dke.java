import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dke {
   public final drq a;
   public final drq b;
   public final drq c;
   public final drq d;
   public final drq e;
   public final List<dey> f;
   public final apy<csk> g;
   public final apy<csk> h;
   public static final Codec<dke> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drq.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               drq.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               drq.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               drq.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               drq.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               aqw.a(dey.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               apy.b(jd.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               apy.b(jd.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dke::new)
   );

   public dke(drq $$0, drq $$1, drq $$2, drq $$3, drq $$4, List<dey> $$5, apy<csk> $$6, apy<csk> $$7) {
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
