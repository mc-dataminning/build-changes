import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmo extends dml {
   public static final Codec<dmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dml.d.forGetter($$0x -> $$0x),
               bfw.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bfw.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bfw.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dmo::new)
   );
   public final bfw b;
   public final bfw c;
   final bfw j;

   public dmo(float $$0, dtk $$1, bfw $$2, dlh $$3, dmm $$4, hk<csq> $$5, bfw $$6, bfw $$7, bfw $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dmo(float $$0, dtk $$1, bfw $$2, dlh $$3, hk<csq> $$4, bfw $$5, bfw $$6, bfw $$7) {
      this($$0, $$1, $$2, $$3, dmm.a, $$4, $$5, $$6, $$7);
   }

   public dmo(dml $$0, bfw $$1, bfw $$2, bfw $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
