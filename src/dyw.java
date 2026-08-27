import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyw extends dyt {
   public static final Codec<dyw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyt.d.forGetter($$0x -> $$0x),
               boz.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               boz.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               boz.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dyw::new)
   );
   public final boz b;
   public final boz c;
   final boz j;

   public dyw(float $$0, efs $$1, boz $$2, dxp $$3, dyu $$4, jb<dea> $$5, boz $$6, boz $$7, boz $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dyw(float $$0, efs $$1, boz $$2, dxp $$3, jb<dea> $$4, boz $$5, boz $$6, boz $$7) {
      this($$0, $$1, $$2, $$3, dyu.a, $$4, $$5, $$6, $$7);
   }

   public dyw(dyt $$0, boz $$1, boz $$2, boz $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
