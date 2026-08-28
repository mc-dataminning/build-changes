import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eah extends eae {
   public static final Codec<eah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eae.d.forGetter($$0x -> $$0x),
               bpj.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpj.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpj.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eah::new)
   );
   public final bpj b;
   public final bpj c;
   final bpj j;

   public eah(float $$0, ehd $$1, bpj $$2, dyz $$3, eaf $$4, jn<dfh> $$5, bpj $$6, bpj $$7, bpj $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eah(float $$0, ehd $$1, bpj $$2, dyz $$3, jn<dfh> $$4, bpj $$5, bpj $$6, bpj $$7) {
      this($$0, $$1, $$2, $$3, eaf.a, $$4, $$5, $$6, $$7);
   }

   public eah(eae $$0, bpj $$1, bpj $$2, bpj $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
