import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhe extends dbo {
   public static final MapCodec<dhe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dat.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), js.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dhe::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dqy g = dqo.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dat.c j;

   @Override
   public MapCodec<dhe> a() {
      return d;
   }

   public dhe(dat.c $$0, js.a $$1, dpx.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dpy $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(elq $$0) {
      return $$0 == els.c && this.j == dat.c.b;
   }

   @Override
   protected double b(dpy $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B && $$3.bO() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dpy $$0, czu $$1, im $$2) {
      if (this.j == dat.c.c) {
         d(dcx.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dpy $$0, czu $$1, im $$2) {
      int $$3 = $$0.c(g) - 1;
      dpy $$4 = $$3 == 0 ? dcx.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dur.c, $$2, dur.a.a($$4));
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, dat.c $$3) {
      if (ddq.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dpy $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dur.c, $$2, dur.a.a($$4));
      }
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, elq $$3) {
      if (!this.d($$0)) {
         dpy $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dur.c, $$2, dur.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
