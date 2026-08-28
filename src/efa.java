import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efa extends eeu {
   public static final MapCodec<efa> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpi.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, efa::new)
   );
   private final bpi b;

   public efa(bpi $$0, bpi $$1, bpi $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected eev<?> a() {
      return eev.b;
   }

   @Override
   protected void a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, int $$4, eeu.a $$5, int $$6, int $$7, int $$8) {
      ja $$9 = $$5.a();
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
   public int a(aym $$0, int $$1, eee $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(aym $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
