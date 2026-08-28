import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edn {
   public final elb a;
   public final elb b;
   public final elb c;
   public final elb d;
   public final elb e;
   public final List<dxv> f;
   public final ayk<dkm> g;
   public final ayk<dkm> h;
   public static final Codec<edn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elb.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               elb.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               elb.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               elb.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               elb.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               azn.a(dxv.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               ayk.b(mb.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               ayk.b(mb.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edn::new)
   );

   public edn(elb $$0, elb $$1, elb $$2, elb $$3, elb $$4, List<dxv> $$5, ayk<dkm> $$6, ayk<dkm> $$7) {
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
