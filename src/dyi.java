import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyi extends dyk {
   public static final Codec<dyi> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dyi::new));

   public dyi(blq $$0, blq $$1) {
      super($$0, $$1);
   }

   @Override
   protected dyl<?> a() {
      return dyl.i;
   }

   @Override
   protected void a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, int $$4, dyk.a $$5, int $$6, int $$7, int $$8) {
      ib $$9 = $$5.a().b($$8);
      boolean $$10 = $$5.c();
      if ($$10) {
         this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, -1, $$10);
         this.a($$0, $$1, $$2, $$3, $$9, $$7 + 3, 0, $$10);
         this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, 1, $$10);
         if ($$2.h()) {
            this.a($$0, $$1, $$2, $$3, $$9, $$7, 2, $$10);
         }
      } else {
         this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, -1, $$10);
         this.a($$0, $$1, $$2, $$3, $$9, $$7 + 1, 0, $$10);
      }
   }

   @Override
   public int a(awt $$0, int $$1, dxu $$2) {
      return 4;
   }

   @Override
   protected boolean b(awt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 != 0 || !$$5 || $$1 != -$$4 && $$1 < $$4 || $$3 != -$$4 && $$3 < $$4 ? super.b($$0, $$1, $$2, $$3, $$4, $$5) : true;
   }

   @Override
   protected boolean a(awt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$2 == -1 && !$$5) {
         return $$1 == $$4 && $$3 == $$4;
      } else {
         return $$2 == 1 ? $$1 + $$3 > $$4 * 2 - 2 : false;
      }
   }
}
