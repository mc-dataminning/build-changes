import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ega extends efu {
   public static final MapCodec<ega> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpw.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, ega::new)
   );
   private final bpw b;

   public ega(bpw $$0, bpw $$1, bpw $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected efv<?> a() {
      return efv.b;
   }

   @Override
   protected void a(ddc $$0, efu.b $$1, ayw $$2, efe $$3, int $$4, efu.a $$5, int $$6, int $$7, int $$8) {
      jd $$9 = $$5.a();
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
   public int a(ayw $$0, int $$1, efe $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ayw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
