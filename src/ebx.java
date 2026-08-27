import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebx extends ebu {
   public static final Codec<ebx> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bnk.b(0, 24).fieldOf("crown_height").forGetter($$0x -> $$0x.b)).apply($$0, ebx::new)
   );
   private final bnk b;

   public ebx(bnk $$0, bnk $$1, bnk $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ebv<?> a() {
      return ebv.h;
   }

   @Override
   protected void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, int $$4, ebu.a $$5, int $$6, int $$7, int $$8) {
      id $$9 = $$5.a();
      int $$10 = 0;

      for (int $$11 = $$9.v() - $$6 + $$8; $$11 <= $$9.v() + $$8; $$11++) {
         int $$12 = $$9.v() - $$11;
         int $$13 = $$7 + $$5.b() + axm.d((float)$$12 / (float)$$6 * 3.5F);
         int $$14;
         if ($$12 > 0 && $$13 == $$10 && ($$11 & 1) == 0) {
            $$14 = $$13 + 1;
         } else {
            $$14 = $$13;
         }

         this.a($$0, $$1, $$2, $$3, new id($$9.u(), $$11, $$9.w()), $$14, 0, $$5.c());
         $$10 = $$13;
      }
   }

   @Override
   public int a(axt $$0, int $$1, ebe $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(axt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
