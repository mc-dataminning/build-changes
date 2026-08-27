import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drn {
   public final dyz a;
   public final dyz b;
   public final dyz c;
   public final dyz d;
   public final dyz e;
   public final List<dme> f;
   public final aut<czf> g;
   public final aut<czf> h;
   public static final Codec<drn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyz.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dyz.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dyz.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dyz.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dyz.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               avu.a(dme.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aut.b(ki.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aut.b(ki.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, drn::new)
   );

   public drn(dyz $$0, dyz $$1, dyz $$2, dyz $$3, dyz $$4, List<dme> $$5, aut<czf> $$6, aut<czf> $$7) {
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
