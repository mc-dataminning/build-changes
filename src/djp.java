import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djp extends ddu {
   public static final MapCodec<djp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jx.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djp::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final duc g = dts.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcz.c j;

   @Override
   public MapCodec<djp> a() {
      return d;
   }

   public djp(dcz.c $$0, jx.a $$1, dtb.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dtc $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(epd $$0) {
      return $$0 == epf.c && this.j == dcz.c.b;
   }

   @Override
   protected double b(dtc $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C && $$3.bV() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dtc $$0, dca $$1, ir $$2) {
      if (this.j == dcz.c.c) {
         d(dfe.gm.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dtc $$0, dca $$1, ir $$2) {
      int $$3 = $$0.c(g) - 1;
      dtc $$4 = $$3 == 0 ? dfe.gl.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dxv.c, $$2, dxv.a.a($$4));
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, dcz.c $$3) {
      if (dfx.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dtc $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dxv.c, $$2, dxv.a.a($$4));
      }
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, epd $$3) {
      if (!this.d($$0)) {
         dtc $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dxv.c, $$2, dxv.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
