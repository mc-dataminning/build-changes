import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkh extends der {
   public static final MapCodec<dkh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddw.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kj.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dkh::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final duc g = dts.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ddw.c j;

   @Override
   public MapCodec<dkh> a() {
      return d;
   }

   public dkh(ddw.c $$0, kj.a $$1, dtb.d $$2) {
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
      return $$0 == epf.c && this.j == ddw.c.b;
   }

   @Override
   protected double b(dtc $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$1.B && $$3.bR() && this.a($$0, $$2, $$3)) {
         $$3.aD();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dtc $$0, dcw $$1, jd $$2) {
      if (this.j == ddw.c.c) {
         d(dga.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dtc $$0, dcw $$1, jd $$2) {
      int $$3 = $$0.c(g) - 1;
      dtc $$4 = $$3 == 0 ? dga.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dxz.c, $$2, dxz.a.a($$4));
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ddw.c $$3) {
      if (dgt.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dtc $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dxz.c, $$2, dxz.a.a($$4));
      }
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, epd $$3) {
      if (!this.d($$0)) {
         dtc $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dxz.c, $$2, dxz.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
