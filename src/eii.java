import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eii extends eif {
   public static final MapCodec<eii> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(brm.b(0, 24).fieldOf("crown_height").forGetter($$0x -> $$0x.b)).apply($$0, eii::new)
   );
   private final brm b;

   public eii(brm $$0, brm $$1, brm $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected eig<?> a() {
      return eig.h;
   }

   @Override
   protected void a(dfl $$0, eif.b $$1, azv $$2, ehp $$3, int $$4, eif.a $$5, int $$6, int $$7, int $$8) {
      jh $$9 = $$5.a();
      int $$10 = 0;

      for (int $$11 = $$9.v() - $$6 + $$8; $$11 <= $$9.v() + $$8; $$11++) {
         int $$12 = $$9.v() - $$11;
         int $$13 = $$7 + $$5.b() + azn.d((float)$$12 / (float)$$6 * 3.5F);
         int $$14;
         if ($$12 > 0 && $$13 == $$10 && ($$11 & 1) == 0) {
            $$14 = $$13 + 1;
         } else {
            $$14 = $$13;
         }

         this.a($$0, $$1, $$2, $$3, new jh($$9.u(), $$11, $$9.w()), $$14, 0, $$5.c());
         $$10 = $$13;
      }
   }

   @Override
   public int a(azv $$0, int $$1, ehp $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
