import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgp extends dba {
   public static final MapCodec<dgp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(daf.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jk.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dgp::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dqi g = dpy.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final daf.c j;

   @Override
   public MapCodec<dgp> a() {
      return d;
   }

   public dgp(daf.c $$0, jk.a $$1, dph.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dpi $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ela $$0) {
      return $$0 == elc.c && this.j == daf.c.b;
   }

   @Override
   protected double b(dpi $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dpi $$0, czg $$1, id $$2) {
      if (this.j == daf.c.c) {
         d(dcj.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dpi $$0, czg $$1, id $$2) {
      int $$3 = $$0.c(g) - 1;
      dpi $$4 = $$3 == 0 ? dcj.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dub.c, $$2, dub.a.a($$4));
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, daf.c $$3) {
      if (ddc.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dpi $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dub.c, $$2, dub.a.a($$4));
      }
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, ela $$3) {
      if (!this.d($$0)) {
         dpi $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dub.c, $$2, dub.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
