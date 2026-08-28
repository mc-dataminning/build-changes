import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eil extends eif {
   public static final MapCodec<eil> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(brm.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, eil::new)
   );
   private final brm b;

   public eil(brm $$0, brm $$1, brm $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected eig<?> a() {
      return eig.b;
   }

   @Override
   protected void a(dfl $$0, eif.b $$1, azv $$2, ehp $$3, int $$4, eif.a $$5, int $$6, int $$7, int $$8) {
      jh $$9 = $$5.a();
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
   public int a(azv $$0, int $$1, ehp $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(azv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
