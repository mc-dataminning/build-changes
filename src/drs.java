import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drs extends drm {
   public static final Codec<drs> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bgd.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, drs::new)
   );
   private final bgd b;

   public drs(bgd $$0, bgd $$1, bgd $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected drn<?> a() {
      return drn.b;
   }

   @Override
   protected void a(cqb $$0, drm.b $$1, asc $$2, dqw $$3, int $$4, drm.a $$5, int $$6, int $$7, int $$8) {
      gw $$9 = $$5.a();
      int $$10 = $$2.a(2);
      int $$11 = 1;
      int $$12 = 0;

      for (int $$13 = $$8; $$13 >= -$$6; $$13--) {
         this.a($$0, $$1, $$2, $$3, $$9, $$10, $$13, $$5.c());
         if ($$10 >= $$11) {
            $$10 = $$12;
            $$12 = 1;
            $$11 = Math.min($$11 + 1, $$7 + $$5.b());
         } else {
            $$10++;
         }
      }
   }

   @Override
   public int a(asc $$0, int $$1, dqw $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(asc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
