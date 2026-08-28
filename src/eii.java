import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eii extends eif {
   public static final Codec<eii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eif.d.forGetter($$0x -> $$0x),
               btg.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               btg.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               btg.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eii::new)
   );
   public final btg b;
   public final btg c;
   final btg j;

   public eii(float $$0, epi $$1, btg $$2, eha $$3, eig $$4, ji<dmf> $$5, btg $$6, btg $$7, btg $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eii(float $$0, epi $$1, btg $$2, eha $$3, ji<dmf> $$4, btg $$5, btg $$6, btg $$7) {
      this($$0, $$1, $$2, $$3, eig.a, $$4, $$5, $$6, $$7);
   }

   public eii(eif $$0, btg $$1, btg $$2, btg $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
