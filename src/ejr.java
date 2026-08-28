import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejr extends ejo {
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejo.d.forGetter($$0x -> $$0x),
               buf.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               buf.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               buf.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ejr::new)
   );
   public final buf b;
   public final buf c;
   final buf j;

   public ejr(float $$0, equ $$1, buf $$2, eij $$3, ejp $$4, jk<dno> $$5, buf $$6, buf $$7, buf $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public ejr(float $$0, equ $$1, buf $$2, eij $$3, jk<dno> $$4, buf $$5, buf $$6, buf $$7) {
      this($$0, $$1, $$2, $$3, ejp.a, $$4, $$5, $$6, $$7);
   }

   public ejr(ejo $$0, buf $$1, buf $$2, buf $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
