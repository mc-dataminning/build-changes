import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebn {
   public final ejb a;
   public final ejb b;
   public final ejb c;
   public final ejb d;
   public final ejb e;
   public final List<dvv> f;
   public final axs<diq> g;
   public final axs<diq> h;
   public static final Codec<ebn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejb.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ejb.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ejb.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ejb.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ejb.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayv.a(dvv.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axs.b(ma.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axs.b(ma.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ebn::new)
   );

   public ebn(ejb $$0, ejb $$1, ejb $$2, ejb $$3, ejb $$4, List<dvv> $$5, axs<diq> $$6, axs<diq> $$7) {
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
