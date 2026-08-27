import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dre extends drc {
   public static final Codec<dre> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, dre::new)
   );
   protected final int b;

   public dre(bfv $$0, bfv $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected drd<?> a() {
      return drd.g;
   }

   @Override
   protected void a(cpr $$0, drc.b $$1, aru $$2, dqm $$3, int $$4, drc.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$5.c() ? $$6 : 1 + $$2.a(2);

      for (int $$10 = $$8; $$10 >= $$8 - $$9; $$10--) {
         int $$11 = $$7 + $$5.b() + 1 - $$10;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$11, $$10, $$5.c());
      }
   }

   @Override
   public int a(aru $$0, int $$1, dqm $$2) {
      return this.b;
   }

   @Override
   protected boolean a(aru $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 + $$3 >= 7 ? true : $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
   }
}
