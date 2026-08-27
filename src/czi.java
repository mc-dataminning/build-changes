import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czi extends ctt {
   public static final MapCodec<czi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csy.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), iy.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, czi::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dii g = dhy.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final csy.c j;

   @Override
   public MapCodec<czi> a() {
      return d;
   }

   public czi(csy.c $$0, iy.a $$1, dhh.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dhi $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ecr $$0) {
      return $$0 == ect.c && this.j == csy.c.b;
   }

   @Override
   protected double b(dhi $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dhi $$0, csa $$1, ht $$2) {
      if (this.j == csy.c.c) {
         d(cvc.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dhi $$0, csa $$1, ht $$2) {
      int $$3 = $$0.c(g) - 1;
      dhi $$4 = $$3 == 0 ? cvc.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dls.c, $$2, dls.a.a($$4));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, csy.c $$3) {
      if (cvv.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dhi $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dls.c, $$2, dls.a.a($$4));
      }
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dhi $$0, csa $$1, ht $$2, ecr $$3) {
      if (!this.d($$0)) {
         dhi $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dls.c, $$2, dls.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
