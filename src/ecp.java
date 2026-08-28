import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecp {
   public final ekd a;
   public final ekd b;
   public final ekd c;
   public final ekd d;
   public final ekd e;
   public final List<dwx> f;
   public final axf<djm> g;
   public final axf<djm> h;
   public static final Codec<ecp> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekd.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ekd.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ekd.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ekd.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ekd.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayi.b(dwx.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axf.b(mc.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axf.b(mc.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecp::new)
   );

   public ecp(ekd $$0, ekd $$1, ekd $$2, ekd $$3, ekd $$4, List<dwx> $$5, axf<djm> $$6, axf<djm> $$7) {
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
