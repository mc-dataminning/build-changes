import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eei {
   public final elw a;
   public final elw b;
   public final elw c;
   public final elw d;
   public final elw e;
   public final List<dym> f;
   public final axp<dku> g;
   public final axp<dku> h;
   public static final Codec<eei> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elw.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               elw.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               elw.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               elw.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               elw.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ays.b(dym.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axp.b(me.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axp.b(me.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eei::new)
   );

   public eei(elw $$0, elw $$1, elw $$2, elw $$3, elw $$4, List<dym> $$5, axp<dku> $$6, axp<dku> $$7) {
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
