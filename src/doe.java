import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doe extends dlw {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doc.a.forGetter($$0x -> $$0x.c), t()).apply($$0, doe::new));
   private final dmm c;
   private static final ffr d = dmm.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   protected doe(dmm $$0, ean.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.a && !$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }
}
