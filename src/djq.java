import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djq extends dea {
   public static final MapCodec<djq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddf.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kg.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djq::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dtk g = dta.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ddf.c j;

   @Override
   public MapCodec<djq> a() {
      return d;
   }

   public djq(ddf.c $$0, kg.a $$1, dsj.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsk $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eog $$0) {
      return $$0 == eoi.c && this.j == ddf.c.b;
   }

   @Override
   protected double b(dsk $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!$$1.B && $$3.bR() && this.a($$0, $$2, $$3)) {
         $$3.aD();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsk $$0, dcf $$1, ja $$2) {
      if (this.j == ddf.c.c) {
         d(dfj.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsk $$0, dcf $$1, ja $$2) {
      int $$3 = $$0.c(g) - 1;
      dsk $$4 = $$3 == 0 ? dfj.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dxg.c, $$2, dxg.a.a($$4));
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ddf.c $$3) {
      if (dgc.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsk $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dxg.c, $$2, dxg.a.a($$4));
      }
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, eog $$3) {
      if (!this.d($$0)) {
         dsk $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dxg.c, $$2, dxg.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
