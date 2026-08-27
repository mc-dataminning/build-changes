import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drn extends drh {
   public static final Codec<drn> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bfy.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, drn::new)
   );
   private final bfy b;

   public drn(bfy $$0, bfy $$1, bfy $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dri<?> a() {
      return dri.b;
   }

   @Override
   protected void a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, int $$4, drh.a $$5, int $$6, int $$7, int $$8) {
      gw $$9 = $$5.a();
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
   public int a(arx $$0, int $$1, dqr $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(arx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
