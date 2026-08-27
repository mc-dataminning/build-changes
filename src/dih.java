import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dih extends dcr {
   public static final MapCodec<dih> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbw.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ju.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dih::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dsb g = drr.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dbw.c j;

   @Override
   public MapCodec<dih> a() {
      return d;
   }

   public dih(dbw.c $$0, ju.a $$1, dra.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(drb $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(emt $$0) {
      return $$0 == emv.c && this.j == dbw.c.b;
   }

   @Override
   protected double b(drb $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(drb $$0, dax $$1, io $$2) {
      if (this.j == dbw.c.c) {
         d(dea.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(drb $$0, dax $$1, io $$2) {
      int $$3 = $$0.c(g) - 1;
      drb $$4 = $$3 == 0 ? dea.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dvu.c, $$2, dvu.a.a($$4));
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, dbw.c $$3) {
      if (det.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         drb $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dvu.c, $$2, dvu.a.a($$4));
      }
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, emt $$3) {
      if (!this.d($$0)) {
         drb $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dvu.c, $$2, dvu.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
