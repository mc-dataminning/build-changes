import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvw {
   public final edi a;
   public final edi b;
   public final edi c;
   public final edi d;
   public final edi e;
   public final List<dqh> f;
   public final awg<dde> g;
   public final awg<dde> h;
   public static final Codec<dvw> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               edi.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               edi.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               edi.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               edi.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axh.a(dqh.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awg.b(le.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awg.b(le.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dvw::new)
   );

   public dvw(edi $$0, edi $$1, edi $$2, edi $$3, edi $$4, List<dqh> $$5, awg<dde> $$6, awg<dde> $$7) {
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
