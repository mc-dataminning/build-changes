import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvq extends dvk {
   public static final Codec<dvq> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bjg.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, dvq::new)
   );
   private final bjg b;

   public dvq(bjg $$0, bjg $$1, bjg $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dvl<?> a() {
      return dvl.b;
   }

   @Override
   protected void a(ctv $$0, dvk.b $$1, auv $$2, duu $$3, int $$4, dvk.a $$5, int $$6, int $$7, int $$8) {
      hx $$9 = $$5.a();
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
   public int a(auv $$0, int $$1, duu $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(auv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
