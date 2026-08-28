import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eis extends eim {
   public static final MapCodec<eis> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(brp.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, eis::new)
   );
   private final brp b;

   public eis(brp $$0, brp $$1, brp $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ein<?> a() {
      return ein.b;
   }

   @Override
   protected void a(dfs $$0, eim.b $$1, azu $$2, ehw $$3, int $$4, eim.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(azu $$0, int $$1, ehw $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(azu $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
