import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejs extends ejm {
   public static final MapCodec<ejs> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(brn.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, ejs::new)
   );
   private final brn b;

   public ejs(brn $$0, brn $$1, brn $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ejn<?> a() {
      return ejn.b;
   }

   @Override
   protected void a(dgm $$0, ejm.b $$1, azg $$2, eiw $$3, int $$4, ejm.a $$5, int $$6, int $$7, int $$8) {
      ji $$9 = $$5.a();
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
   public int a(azg $$0, int $$1, eiw $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(azg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
