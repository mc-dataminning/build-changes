import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djl extends dji {
   public static final Codec<djl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dji.d.forGetter($$0x -> $$0x),
               bda.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bda.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bda.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, djl::new)
   );
   public final bda b;
   public final bda c;
   final bda j;

   public djl(float $$0, dqh $$1, bda $$2, die $$3, djj $$4, hi<cpn> $$5, bda $$6, bda $$7, bda $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public djl(float $$0, dqh $$1, bda $$2, die $$3, hi<cpn> $$4, bda $$5, bda $$6, bda $$7) {
      this($$0, $$1, $$2, $$3, djj.a, $$4, $$5, $$6, $$7);
   }

   public djl(dji $$0, bda $$1, bda $$2, bda $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
