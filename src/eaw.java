import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eaw {
   public final eik a;
   public final eik b;
   public final eik c;
   public final eik d;
   public final eik e;
   public final List<dvd> f;
   public final axp<dhy> g;
   public final axp<dhy> h;
   public static final Codec<eaw> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eik.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eik.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eik.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eik.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eik.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ays.a(dvd.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axp.b(ly.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axp.b(ly.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eaw::new)
   );

   public eaw(eik $$0, eik $$1, eik $$2, eik $$3, eik $$4, List<dvd> $$5, axp<dhy> $$6, axp<dhy> $$7) {
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
