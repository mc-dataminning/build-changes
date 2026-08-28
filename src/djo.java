import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djo extends ddy {
   public static final MapCodec<djo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddd.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kg.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djo::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dth g = dsx.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ddd.c j;

   @Override
   public MapCodec<djo> a() {
      return d;
   }

   public djo(ddd.c $$0, kg.a $$1, dsg.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsh $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eoa $$0) {
      return $$0 == eoc.c && this.j == ddd.c.b;
   }

   @Override
   protected double b(dsh $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsh $$0, dcd $$1, ja $$2) {
      if (this.j == ddd.c.c) {
         d(dfh.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsh $$0, dcd $$1, ja $$2) {
      int $$3 = $$0.c(g) - 1;
      dsh $$4 = $$3 == 0 ? dfh.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dxa.c, $$2, dxa.a.a($$4));
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, ddd.c $$3) {
      if (dga.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsh $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dxa.c, $$2, dxa.a.a($$4));
      }
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, eoa $$3) {
      if (!this.d($$0)) {
         dsh $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dxa.c, $$2, dxa.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
