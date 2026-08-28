import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehi extends ehk {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ehi::new));

   public ehi(bqx $$0, bqx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehl<?> a() {
      return ehl.i;
   }

   @Override
   protected void a(dep $$0, ehk.b $$1, azn $$2, egu $$3, int $$4, ehk.a $$5, int $$6, int $$7, int $$8) {
      jf $$9 = $$5.a().b($$8);
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
   public int a(azn $$0, int $$1, egu $$2) {
      return 4;
   }

   @Override
   protected boolean b(azn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 != 0 || !$$5 || $$1 != -$$4 && $$1 < $$4 || $$3 != -$$4 && $$3 < $$4 ? super.b($$0, $$1, $$2, $$3, $$4, $$5) : true;
   }

   @Override
   protected boolean a(azn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$2 == -1 && !$$5) {
         return $$1 == $$4 && $$3 == $$4;
      } else {
         return $$2 == 1 ? $$1 + $$3 > $$4 * 2 - 2 : false;
      }
   }
}
