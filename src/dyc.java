import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyc {
   public final efp a;
   public final efp b;
   public final efp c;
   public final efp d;
   public final efp e;
   public final List<dsk> f;
   public final awm<dfh> g;
   public final awm<dfh> h;
   public static final Codec<dyc> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efp.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efp.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efp.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efp.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axo.a(dsk.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awm.b(lr.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awm.b(lr.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dyc::new)
   );

   public dyc(efp $$0, efp $$1, efp $$2, efp $$3, efp $$4, List<dsk> $$5, awm<dfh> $$6, awm<dfh> $$7) {
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
