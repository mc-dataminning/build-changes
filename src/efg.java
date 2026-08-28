import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efg extends efa {
   public static final MapCodec<efg> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpl.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, efg::new)
   );
   private final bpl b;

   public efg(bpl $$0, bpl $$1, bpl $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected efb<?> a() {
      return efb.b;
   }

   @Override
   protected void a(dcl $$0, efa.b $$1, ayo $$2, eek $$3, int $$4, efa.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(ayo $$0, int $$1, eek $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
