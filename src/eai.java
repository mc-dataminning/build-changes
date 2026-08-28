import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eai extends eaf {
   public static final Codec<eai> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eaf.d.forGetter($$0x -> $$0x),
               bpk.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpk.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpk.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eai::new)
   );
   public final bpk b;
   public final bpk c;
   final bpk j;

   public eai(float $$0, ehe $$1, bpk $$2, dza $$3, eag $$4, jn<dfi> $$5, bpk $$6, bpk $$7, bpk $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public eai(float $$0, ehe $$1, bpk $$2, dza $$3, jn<dfi> $$4, bpk $$5, bpk $$6, bpk $$7) {
      this($$0, $$1, $$2, $$3, eag.a, $$4, $$5, $$6, $$7);
   }

   public eai(eaf $$0, bpk $$1, bpk $$2, bpk $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
