import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzw extends dzt {
   public static final Codec<dzw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzt.d.forGetter($$0x -> $$0x),
               bpy.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bpy.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bpy.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dzw::new)
   );
   public final bpy b;
   public final bpy c;
   final bpy j;

   public dzw(float $$0, egs $$1, bpy $$2, dyp $$3, dzu $$4, jm<dfa> $$5, bpy $$6, bpy $$7, bpy $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dzw(float $$0, egs $$1, bpy $$2, dyp $$3, jm<dfa> $$4, bpy $$5, bpy $$6, bpy $$7) {
      this($$0, $$1, $$2, $$3, dzu.a, $$4, $$5, $$6, $$7);
   }

   public dzw(dzt $$0, bpy $$1, bpy $$2, bpy $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
