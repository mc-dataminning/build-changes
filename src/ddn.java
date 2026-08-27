import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddn extends cxy {
   public static final MapCodec<ddn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxd.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jh.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, ddn::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dne g = dmu.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cxd.c j;

   @Override
   public MapCodec<ddn> a() {
      return d;
   }

   public ddn(cxd.c $$0, jh.a $$1, dmd.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dme $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ehq $$0) {
      return $$0 == ehs.c && this.j == cxd.c.b;
   }

   @Override
   protected double b(dme $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B && $$3.bK() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dme $$0, cwe $$1, ib $$2) {
      if (this.j == cxd.c.c) {
         d(czh.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dme $$0, cwe $$1, ib $$2) {
      int $$3 = $$0.c(g) - 1;
      dme $$4 = $$3 == 0 ? czh.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dqr.c, $$2, dqr.a.a($$4));
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, cxd.c $$3) {
      if (daa.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dme $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dqr.c, $$2, dqr.a.a($$4));
      }
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, ehq $$3) {
      if (!this.d($$0)) {
         dme $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dqr.c, $$2, dqr.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
