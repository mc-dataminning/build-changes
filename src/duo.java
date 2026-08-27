import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duo {
   public final eca a;
   public final eca b;
   public final eca c;
   public final eca d;
   public final eca e;
   public final List<doz> f;
   public final avr<dby> g;
   public final avr<dby> h;
   public static final Codec<duo> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eca.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eca.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eca.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eca.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eca.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               aws.a(doz.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               avr.b(ks.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               avr.b(ks.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, duo::new)
   );

   public duo(eca $$0, eca $$1, eca $$2, eca $$3, eca $$4, List<doz> $$5, avr<dby> $$6, avr<dby> $$7) {
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
