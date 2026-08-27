import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtd extends dsz {
   public static final Codec<dtd> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bhv.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, dtd::new)
   );
   private final bhv b;

   public dtd(bhv $$0, bhv $$1, bhv $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dta<?> a() {
      return dta.c;
   }

   @Override
   protected void a(cry $$0, dsz.b $$1, ato $$2, dsj $$3, int $$4, dsz.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = 0;

      for (int $$10 = $$8; $$10 >= $$8 - $$6; $$10--) {
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
         if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
            $$9--;
         } else if ($$9 < $$7 + $$5.b()) {
            $$9++;
         }
      }
   }

   @Override
   public int a(ato $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(ato $$0, int $$1, dsj $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ato $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
