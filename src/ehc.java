import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehc {
   public final eos a;
   public final eos b;
   public final eos c;
   public final eos d;
   public final eos e;
   public final List<ebg> f;
   public final axv<dne> g;
   public final axv<dne> h;
   public static final Codec<ehc> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eos.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               eos.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               eos.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               eos.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               eos.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               ayy.b(ebg.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               axv.b(mi.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               axv.b(mi.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ehc::new)
   );

   public ehc(eos $$0, eos $$1, eos $$2, eos $$3, eos $$4, List<ebg> $$5, axv<dne> $$6, axv<dne> $$7) {
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
