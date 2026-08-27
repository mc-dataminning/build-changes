import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyr {
   public final egl a;
   public final egl b;
   public final egl c;
   public final egl d;
   public final egl e;
   public final List<dtc> f;
   public final awt<dfc> g;
   public final awt<dfc> h;
   public static final Codec<dyr> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egl.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               egl.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               egl.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               egl.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               egl.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               dtc.b.listOf().fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awt.b(li.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awt.b(li.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dyr::new)
   );

   public dyr(egl $$0, egl $$1, egl $$2, egl $$3, egl $$4, List<dtc> $$5, awt<dfc> $$6, awt<dfc> $$7) {
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
