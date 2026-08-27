import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edt extends edn {
   public static final MapCodec<edt> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(boz.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, edt::new)
   );
   private final boz b;

   public edt(boz $$0, boz $$1, boz $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected edo<?> a() {
      return edo.b;
   }

   @Override
   protected void a(dbd $$0, edn.b $$1, ayk $$2, ecx $$3, int $$4, edn.a $$5, int $$6, int $$7, int $$8) {
      io $$9 = $$5.a();
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
   public int a(ayk $$0, int $$1, ecx $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ayk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
