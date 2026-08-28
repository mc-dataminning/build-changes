import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji extends dds {
   public static final MapCodec<dji> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcx.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dji::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dtc g = dss.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcx.c j;

   @Override
   public MapCodec<dji> a() {
      return d;
   }

   public dji(dcx.c $$0, kf.a $$1, dsb.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsc $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(enu $$0) {
      return $$0 == enw.c && this.j == dcx.c.b;
   }

   @Override
   protected double b(dsc $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsc $$0, dby $$1, iz $$2) {
      if (this.j == dcx.c.c) {
         d(dfb.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsc $$0, dby $$1, iz $$2) {
      int $$3 = $$0.c(g) - 1;
      dsc $$4 = $$3 == 0 ? dfb.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dwv.c, $$2, dwv.a.a($$4));
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, dcx.c $$3) {
      if (dfu.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsc $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dwv.c, $$2, dwv.a.a($$4));
      }
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, enu $$3) {
      if (!this.d($$0)) {
         dsc $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dwv.c, $$2, dwv.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
