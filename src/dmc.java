import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dmc {
   public final dto a;
   public final dto b;
   public final dto c;
   public final dto d;
   public final dto e;
   public final List<dgw> f;
   public final arr<cut> g;
   public final arr<cut> h;
   public static final Codec<dmc> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dto.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dto.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dto.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dto.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               asq.a(dgw.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               arr.b(jz.e).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               arr.b(jz.e).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dmc::new)
   );

   public dmc(dto $$0, dto $$1, dto $$2, dto $$3, dto $$4, List<dgw> $$5, arr<cut> $$6, arr<cut> $$7) {
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
