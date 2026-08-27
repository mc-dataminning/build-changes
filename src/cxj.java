import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxj extends cru {
   public static final MapCodec<cxj> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cqz.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ia.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, cxj::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dgd g = dft.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cqz.c j;

   @Override
   public MapCodec<cxj> a() {
      return d;
   }

   public cxj(cqz.c $$0, ia.a $$1, dfc.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dfd $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eaf $$0) {
      return $$0 == eah.c && this.j == cqz.c.b;
   }

   @Override
   protected double b(dfd $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dfd $$0, cqb $$1, gw $$2) {
      if (this.j == cqz.c.c) {
         d(cte.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dfd $$0, cqb $$1, gw $$2) {
      int $$3 = $$0.c(g) - 1;
      dfd $$4 = $$3 == 0 ? cte.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(djn.c, $$2, djn.a.a($$4));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, cqz.c $$3) {
      if (ctx.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dfd $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(djn.c, $$2, djn.a.a($$4));
      }
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dfd $$0, cqb $$1, gw $$2, eaf $$3) {
      if (!this.d($$0)) {
         dfd $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(djn.c, $$2, djn.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
