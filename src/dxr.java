import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxr {
   public final efd a;
   public final efd b;
   public final efd c;
   public final efd d;
   public final efd e;
   public final List<dsc> f;
   public final axf<dez> g;
   public final axf<dez> h;
   public static final Codec<dxr> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efd.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efd.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efd.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efd.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efd.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayh.a(dsc.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(lq.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(lq.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxr::new)
   );

   public dxr(efd $$0, efd $$1, efd $$2, efd $$3, efd $$4, List<dsc> $$5, axf<dez> $$6, axf<dez> $$7) {
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
