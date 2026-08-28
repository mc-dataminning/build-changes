import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eha {
   public final eoq a;
   public final eoq b;
   public final eoq c;
   public final eoq d;
   public final eoq e;
   public final List<ebe> f;
   public final axt<dnc> g;
   public final axt<dnc> h;
   public static final Codec<eha> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoq.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eoq.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eoq.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eoq.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eoq.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayw.b(ebe.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axt.b(mh.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axt.b(mh.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eha::new)
   );

   public eha(eoq $$0, eoq $$1, eoq $$2, eoq $$3, eoq $$4, List<ebe> $$5, axt<dnc> $$6, axt<dnc> $$7) {
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
