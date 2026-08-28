import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egv extends egs {
   public static final MapCodec<egv> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bqp.b(0, 24).fieldOf("crown_height").forGetter($$0x -> $$0x.b)).apply($$0, egv::new)
   );
   private final bqp b;

   public egv(bqp $$0, bqp $$1, bqp $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected egt<?> a() {
      return egt.h;
   }

   @Override
   protected void a(ddy $$0, egs.b $$1, azk $$2, egc $$3, int $$4, egs.a $$5, int $$6, int $$7, int $$8) {
      je $$9 = $$5.a();
      int $$10 = 0;

      for (int $$11 = $$9.v() - $$6 + $$8; $$11 <= $$9.v() + $$8; $$11++) {
         int $$12 = $$9.v() - $$11;
         int $$13 = $$7 + $$5.b() + azc.d((float)$$12 / (float)$$6 * 3.5F);
         int $$14;
         if ($$12 > 0 && $$13 == $$10 && ($$11 & 1) == 0) {
            $$14 = $$13 + 1;
         } else {
            $$14 = $$13;
         }

         this.a($$0, $$1, $$2, $$3, new je($$9.u(), $$11, $$9.w()), $$14, 0, $$5.c());
         $$10 = $$13;
      }
   }

   @Override
   public int a(azk $$0, int $$1, egc $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
