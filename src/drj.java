import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drj extends drd {
   public static final Codec<drj> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bfv.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, drj::new)
   );
   private final bfv b;

   public drj(bfv $$0, bfv $$1, bfv $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dre<?> a() {
      return dre.b;
   }

   @Override
   protected void a(cps $$0, drd.b $$1, aru $$2, dqn $$3, int $$4, drd.a $$5, int $$6, int $$7, int $$8) {
      gu $$9 = $$5.a();
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
   public int a(aru $$0, int $$1, dqn $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
