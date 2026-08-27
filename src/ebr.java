import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebr extends ebl {
   public static final Codec<ebr> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bnf.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, ebr::new)
   );
   private final bnf b;

   public ebr(bnf $$0, bnf $$1, bnf $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ebm<?> a() {
      return ebm.b;
   }

   @Override
   protected void a(czd $$0, ebl.b $$1, axr $$2, eav $$3, int $$4, ebl.a $$5, int $$6, int $$7, int $$8) {
      ib $$9 = $$5.a();
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
   public int a(axr $$0, int $$1, eav $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(axr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
