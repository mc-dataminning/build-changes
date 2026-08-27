import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbg extends cvr {
   public static final MapCodec<dbg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cuw.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jd.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dbg::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dkp g = dkf.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cuw.c j;

   @Override
   public MapCodec<dbg> a() {
      return d;
   }

   public dbg(cuw.c $$0, jd.a $$1, djo.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(djp $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eey $$0) {
      return $$0 == efa.c && this.j == cuw.c.b;
   }

   @Override
   protected double b(djp $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(djp $$0, ctx $$1, hx $$2) {
      if (this.j == cuw.c.c) {
         d(cxa.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(djp $$0, ctx $$1, hx $$2) {
      int $$3 = $$0.c(g) - 1;
      djp $$4 = $$3 == 0 ? cxa.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dnz.c, $$2, dnz.a.a($$4));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cuw.c $$3) {
      if (cxt.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         djp $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dnz.c, $$2, dnz.a.a($$4));
      }
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(djp $$0, ctx $$1, hx $$2, eey $$3) {
      if (!this.d($$0)) {
         djp $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dnz.c, $$2, dnz.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
