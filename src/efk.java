import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efk {
   public final emy a;
   public final emy b;
   public final emy c;
   public final emy d;
   public final emy e;
   public final List<dzo> f;
   public final axp<dlu> g;
   public final axp<dlu> h;
   public static final Codec<efk> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emy.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               emy.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               emy.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               emy.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               emy.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ays.b(dzo.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axp.b(mg.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axp.b(mg.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, efk::new)
   );

   public efk(emy $$0, emy $$1, emy $$2, emy $$3, emy $$4, List<dzo> $$5, axp<dlu> $$6, axp<dlu> $$7) {
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
