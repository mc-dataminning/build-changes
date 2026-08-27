import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqr extends dqo {
   public static final Codec<dqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqo.d.forGetter($$0x -> $$0x),
               bje.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bje.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bje.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dqr::new)
   );
   public final bje b;
   public final bje c;
   final bje j;

   public dqr(float $$0, dxn $$1, bje $$2, dpk $$3, dqp $$4, il<cwq> $$5, bje $$6, bje $$7, bje $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dqr(float $$0, dxn $$1, bje $$2, dpk $$3, il<cwq> $$4, bje $$5, bje $$6, bje $$7) {
      this($$0, $$1, $$2, $$3, dqp.a, $$4, $$5, $$6, $$7);
   }

   public dqr(dqo $$0, bje $$1, bje $$2, bje $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
