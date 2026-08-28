import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebc {
   public final eiq a;
   public final eiq b;
   public final eiq c;
   public final eiq d;
   public final eiq e;
   public final List<dvj> f;
   public final axq<die> g;
   public final axq<die> h;
   public static final Codec<ebc> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiq.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eiq.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eiq.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eiq.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eiq.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayt.a(dvj.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axq.b(lz.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axq.b(lz.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ebc::new)
   );

   public ebc(eiq $$0, eiq $$1, eiq $$2, eiq $$3, eiq $$4, List<dvj> $$5, axq<die> $$6, axq<die> $$7) {
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
