import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgg extends dar {
   public static final MapCodec<dgg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czw.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ji.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dgg::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dpz g = dpp.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final czw.c j;

   @Override
   public MapCodec<dgg> a() {
      return d;
   }

   public dgg(czw.c $$0, ji.a $$1, doy.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(doz $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ekr $$0) {
      return $$0 == ekt.c && this.j == czw.c.b;
   }

   @Override
   protected double b(doz $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(doz $$0, cyx $$1, ib $$2) {
      if (this.j == czw.c.c) {
         d(dca.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(doz $$0, cyx $$1, ib $$2) {
      int $$3 = $$0.c(g) - 1;
      doz $$4 = $$3 == 0 ? dca.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dts.c, $$2, dts.a.a($$4));
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, czw.c $$3) {
      if (dct.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         doz $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dts.c, $$2, dts.a.a($$4));
      }
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, ekr $$3) {
      if (!this.d($$0)) {
         doz $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dts.c, $$2, dts.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
