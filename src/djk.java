import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djk extends ddu {
   public static final MapCodec<djk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djk::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dte g = dsu.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcz.c j;

   @Override
   public MapCodec<djk> a() {
      return d;
   }

   public djk(dcz.c $$0, kf.a $$1, dsd.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dse $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(enw $$0) {
      return $$0 == eny.c && this.j == dcz.c.b;
   }

   @Override
   protected double b(dse $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dse $$0, dca $$1, iz $$2) {
      if (this.j == dcz.c.c) {
         d(dfd.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dse $$0, dca $$1, iz $$2) {
      int $$3 = $$0.c(g) - 1;
      dse $$4 = $$3 == 0 ? dfd.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dwx.c, $$2, dwx.a.a($$4));
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, dcz.c $$3) {
      if (dfw.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dse $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dwx.c, $$2, dwx.a.a($$4));
      }
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, enw $$3) {
      if (!this.d($$0)) {
         dse $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dwx.c, $$2, dwx.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
