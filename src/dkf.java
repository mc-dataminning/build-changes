import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkf extends dep {
   public static final MapCodec<dkf> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddu.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kj.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dkf::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dua g = dtq.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ddu.c j;

   @Override
   public MapCodec<dkf> a() {
      return d;
   }

   public dkf(ddu.c $$0, kj.a $$1, dsz.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dta $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eox $$0) {
      return $$0 == eoz.c && this.j == ddu.c.b;
   }

   @Override
   protected double b(dta $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B && $$3.bR() && this.a($$0, $$2, $$3)) {
         $$3.aD();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dta $$0, dcu $$1, jd $$2) {
      if (this.j == ddu.c.c) {
         d(dfy.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dta $$0, dcu $$1, jd $$2) {
      int $$3 = $$0.c(g) - 1;
      dta $$4 = $$3 == 0 ? dfy.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dxw.c, $$2, dxw.a.a($$4));
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ddu.c $$3) {
      if (dgr.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dta $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dxw.c, $$2, dxw.a.a($$4));
      }
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, eox $$3) {
      if (!this.d($$0)) {
         dta $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dxw.c, $$2, dxw.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
