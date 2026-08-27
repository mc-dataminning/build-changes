import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dux {
   public final ecj a;
   public final ecj b;
   public final ecj c;
   public final ecj d;
   public final ecj e;
   public final List<dpi> f;
   public final avt<dch> g;
   public final avt<dch> h;
   public static final Codec<dux> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ecj.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ecj.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ecj.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ecj.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               awu.a(dpi.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               avt.b(ku.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               avt.b(ku.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dux::new)
   );

   public dux(ecj $$0, ecj $$1, ecj $$2, ecj $$3, ecj $$4, List<dpi> $$5, avt<dch> $$6, avt<dch> $$7) {
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
