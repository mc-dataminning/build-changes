import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekq extends ekm {
   public static final MapCodec<ekq> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bso.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, ekq::new)
   );
   private final bso b;

   public ekq(bso $$0, bso $$1, bso $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected ekn<?> a() {
      return ekn.c;
   }

   @Override
   protected void a(dho $$0, ekm.b $$1, bam $$2, ejw $$3, int $$4, ekm.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(bam $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(bam $$0, int $$1, ejw $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(bam $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
