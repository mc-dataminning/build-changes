import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxw {
   public final efj a;
   public final efj b;
   public final efj c;
   public final efj d;
   public final efj e;
   public final List<dsh> f;
   public final awk<dff> g;
   public final awk<dff> h;
   public static final Codec<dxw> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efj.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               efj.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               efj.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               efj.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               efj.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axm.a(dsh.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awk.b(lr.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awk.b(lr.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dxw::new)
   );

   public dxw(efj $$0, efj $$1, efj $$2, efj $$3, efj $$4, List<dsh> $$5, awk<dff> $$6, awk<dff> $$7) {
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
