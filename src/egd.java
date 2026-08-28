import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egd {
   public final enr a;
   public final enr b;
   public final enr c;
   public final enr d;
   public final enr e;
   public final List<eah> f;
   public final axr<dmf> g;
   public final axr<dmf> h;
   public static final Codec<egd> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enr.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               enr.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               enr.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               enr.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               enr.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayu.b(eah.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axr.b(mg.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axr.b(mg.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egd::new)
   );

   public egd(enr $$0, enr $$1, enr $$2, enr $$3, enr $$4, List<eah> $$5, axr<dmf> $$6, axr<dmf> $$7) {
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
