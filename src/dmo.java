import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dmo {
   public final dua a;
   public final dua b;
   public final dua c;
   public final dua d;
   public final dua e;
   public final List<dhi> f;
   public final arv<cva> g;
   public final arv<cva> h;
   public static final Codec<dmo> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dua.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dua.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dua.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dua.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               asu.a(dhi.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               arv.b(jz.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               arv.b(jz.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dmo::new)
   );

   public dmo(dua $$0, dua $$1, dua $$2, dua $$3, dua $$4, List<dhi> $$5, arv<cva> $$6, arv<cva> $$7) {
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
