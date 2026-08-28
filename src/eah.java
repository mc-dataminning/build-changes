import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eah {
   public final ehv a;
   public final ehv b;
   public final ehv c;
   public final ehv d;
   public final ehv e;
   public final List<duo> f;
   public final axj<dhj> g;
   public final axj<dhj> h;
   public static final Codec<eah> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehv.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ehv.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ehv.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ehv.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ehv.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               aym.a(duo.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axj.b(lv.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axj.b(lv.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eah::new)
   );

   public eah(ehv $$0, ehv $$1, ehv $$2, ehv $$3, ehv $$4, List<duo> $$5, axj<dhj> $$6, axj<dhj> $$7) {
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
