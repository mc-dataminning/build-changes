import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsk extends dse {
   public static final Codec<dsk> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bhg.b(0, 24).fieldOf("trunk_height").forGetter($$0x -> $$0x.b)).apply($$0, dsk::new)
   );
   private final bhg b;

   public dsk(bhg $$0, bhg $$1, bhg $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dsf<?> a() {
      return dsf.b;
   }

   @Override
   protected void a(crf $$0, dse.b $$1, ate $$2, dro $$3, int $$4, dse.a $$5, int $$6, int $$7, int $$8) {
      ht $$9 = $$5.a();
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
   public int a(ate $$0, int $$1, dro $$2) {
      return Math.max(4, $$1 - this.b.a($$0));
   }

   @Override
   protected boolean a(ate $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
