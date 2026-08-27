import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dah extends cus {
   public static final MapCodec<dah> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctx.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jb.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dah::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final djp g = djf.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ctx.c j;

   @Override
   public MapCodec<dah> a() {
      return d;
   }

   public dah(ctx.c $$0, jb.a $$1, dio.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dip $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(edy $$0) {
      return $$0 == eea.c && this.j == ctx.c.b;
   }

   @Override
   protected double b(dip $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dip $$0, csy $$1, hv $$2) {
      if (this.j == ctx.c.c) {
         d(cwb.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dip $$0, csy $$1, hv $$2) {
      int $$3 = $$0.c(g) - 1;
      dip $$4 = $$3 == 0 ? cwb.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dmz.c, $$2, dmz.a.a($$4));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, ctx.c $$3) {
      if (cwu.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dip $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dmz.c, $$2, dmz.a.a($$4));
      }
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dip $$0, csy $$1, hv $$2, edy $$3) {
      if (!this.d($$0)) {
         dip $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dmz.c, $$2, dmz.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
