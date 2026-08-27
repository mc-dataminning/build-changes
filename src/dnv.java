import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dnv {
   public final dvh a;
   public final dvh b;
   public final dvh c;
   public final dvh d;
   public final dvh e;
   public final List<dip> f;
   public final asg<cvz> g;
   public final asg<cvz> h;
   public static final Codec<dnv> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvh.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dvh.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dvh.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dvh.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dvh.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               atg.a(dip.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               asg.b(kc.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               asg.b(kc.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dnv::new)
   );

   public dnv(dvh $$0, dvh $$1, dvh $$2, dvh $$3, dvh $$4, List<dip> $$5, asg<cvz> $$6, asg<cvz> $$7) {
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
