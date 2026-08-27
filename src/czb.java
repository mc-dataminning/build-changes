import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czb extends ctl {
   public static final MapCodec<czb> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csq.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), iy.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, czb::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dhw g = dhm.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final csq.c j;

   @Override
   public MapCodec<czb> a() {
      return d;
   }

   public czb(csq.c $$0, iy.a $$1, dgv.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dgw $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ecf $$0) {
      return $$0 == ech.c && this.j == csq.c.b;
   }

   @Override
   protected double b(dgw $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dgw $$0, crs $$1, ht $$2) {
      if (this.j == csq.c.c) {
         d(cuv.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dgw $$0, crs $$1, ht $$2) {
      int $$3 = $$0.c(g) - 1;
      dgw $$4 = $$3 == 0 ? cuv.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dlg.c, $$2, dlg.a.a($$4));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, csq.c $$3) {
      if (cvo.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dgw $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dlg.c, $$2, dlg.a.a($$4));
      }
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dgw $$0, crs $$1, ht $$2, ecf $$3) {
      if (!this.d($$0)) {
         dgw $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dlg.c, $$2, dlg.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
