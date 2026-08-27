import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drt extends dro {
   public static final Codec<drt> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bgf.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, drt::new)
   );
   private final bgf b;
   private final int c;

   public drt(bgf $$0, bgf $$1, bgf $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected drp<?> a() {
      return drp.j;
   }

   @Override
   protected void a(cqd $$0, dro.b $$1, ase $$2, dqy $$3, int $$4, dro.a $$5, int $$6, int $$7, int $$8) {
      gw $$9 = $$5.a();
      gw.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ase $$0, int $$1, dqy $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ase $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
