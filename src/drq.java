import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drq extends drm {
   public static final Codec<drq> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bgd.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, drq::new)
   );
   private final bgd b;

   public drq(bgd $$0, bgd $$1, bgd $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected drn<?> a() {
      return drn.c;
   }

   @Override
   protected void a(cqb $$0, drm.b $$1, asc $$2, dqw $$3, int $$4, drm.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = 0;

      for (int $$10 = $$8; $$10 >= $$8 - $$6; $$10--) {
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
         if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
            $$9--;
         } else if ($$9 < $$7 + $$5.b()) {
            $$9++;
         }
      }
   }

   @Override
   public int a(asc $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(asc $$0, int $$1, dqw $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(asc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
