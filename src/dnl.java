import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnl extends dni {
   public static final Codec<dnl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dni.d.forGetter($$0x -> $$0x),
               bhe.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bhe.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bhe.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dnl::new)
   );
   public final bhe b;
   public final bhe c;
   final bhe j;

   public dnl(float $$0, duh $$1, bhe $$2, dme $$3, dnj $$4, ig<cua> $$5, bhe $$6, bhe $$7, bhe $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dnl(float $$0, duh $$1, bhe $$2, dme $$3, ig<cua> $$4, bhe $$5, bhe $$6, bhe $$7) {
      this($$0, $$1, $$2, $$3, dnj.a, $$4, $$5, $$6, $$7);
   }

   public dnl(dni $$0, bhe $$1, bhe $$2, bhe $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
