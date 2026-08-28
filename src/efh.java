import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efh extends efb {
   public static final MapCodec<efh> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpm.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, efh::new)
   );
   private final bpm b;

   public efh(bpm $$0, bpm $$1, bpm $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected efc<?> a() {
      return efc.b;
   }

   @Override
   protected void a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, int $$4, efb.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(ayo $$0, int $$1, eel $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
