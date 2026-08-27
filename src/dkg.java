import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkg {
   public final drs a;
   public final drs b;
   public final drs c;
   public final drs d;
   public final drs e;
   public final List<dfa> f;
   public final aqa<csm> g;
   public final aqa<csm> h;
   public static final Codec<dkg> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drs.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               drs.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               drs.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               drs.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               drs.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               aqy.a(dfa.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               aqa.b(jc.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               aqa.b(jc.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dkg::new)
   );

   public dkg(drs $$0, drs $$1, drs $$2, drs $$3, drs $$4, List<dfa> $$5, aqa<csm> $$6, aqa<csm> $$7) {
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
