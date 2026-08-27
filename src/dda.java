import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dda extends cxl {
   public static final MapCodec<dda> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwq.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dda::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dmj g = dlz.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cwq.c j;

   @Override
   public MapCodec<dda> a() {
      return d;
   }

   public dda(cwq.c $$0, jf.a $$1, dli.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dlj $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(egv $$0) {
      return $$0 == egx.c && this.j == cwq.c.b;
   }

   @Override
   protected double b(dlj $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dlj $$0, cvr $$1, hz $$2) {
      if (this.j == cwq.c.c) {
         d(cyu.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dlj $$0, cvr $$1, hz $$2) {
      int $$3 = $$0.c(g) - 1;
      dlj $$4 = $$3 == 0 ? cyu.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dpw.c, $$2, dpw.a.a($$4));
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, cwq.c $$3) {
      if (czn.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dlj $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dpw.c, $$2, dpw.a.a($$4));
      }
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, egv $$3) {
      if (!this.d($$0)) {
         dlj $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dpw.c, $$2, dpw.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
