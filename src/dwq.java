import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwq {
   public final eec a;
   public final eec b;
   public final eec c;
   public final eec d;
   public final eec e;
   public final List<drb> f;
   public final awl<ddy> g;
   public final awl<ddy> h;
   public static final Codec<dwq> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eec.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eec.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eec.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eec.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eec.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axm.a(drb.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awl.b(lf.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awl.b(lf.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dwq::new)
   );

   public dwq(eec $$0, eec $$1, eec $$2, eec $$3, eec $$4, List<drb> $$5, awl<ddy> $$6, awl<ddy> $$7) {
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
