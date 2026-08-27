import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dij extends dct {
   public static final MapCodec<dij> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dby.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ju.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dij::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dsd g = drt.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dby.c j;

   @Override
   public MapCodec<dij> a() {
      return d;
   }

   public dij(dby.c $$0, ju.a $$1, drc.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(drd $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(emv $$0) {
      return $$0 == emx.c && this.j == dby.c.b;
   }

   @Override
   protected double b(drd $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(drd $$0, daz $$1, io $$2) {
      if (this.j == dby.c.c) {
         d(dec.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(drd $$0, daz $$1, io $$2) {
      int $$3 = $$0.c(g) - 1;
      drd $$4 = $$3 == 0 ? dec.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dvw.c, $$2, dvw.a.a($$4));
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, dby.c $$3) {
      if (dev.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         drd $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dvw.c, $$2, dvw.a.a($$4));
      }
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, emv $$3) {
      if (!this.d($$0)) {
         drd $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dvw.c, $$2, dvw.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
