import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcw extends cxh {
   public static final MapCodec<dcw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwm.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dcw::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dmf g = dlv.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cwm.c j;

   @Override
   public MapCodec<dcw> a() {
      return d;
   }

   public dcw(cwm.c $$0, jf.a $$1, dle.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dlf $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ego $$0) {
      return $$0 == egq.c && this.j == cwm.c.b;
   }

   @Override
   protected double b(dlf $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dlf $$0, cvn $$1, hz $$2) {
      if (this.j == cwm.c.c) {
         d(cyq.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dlf $$0, cvn $$1, hz $$2) {
      int $$3 = $$0.c(g) - 1;
      dlf $$4 = $$3 == 0 ? cyq.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dpp.c, $$2, dpp.a.a($$4));
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, cwm.c $$3) {
      if (czj.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dlf $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dpp.c, $$2, dpp.a.a($$4));
      }
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, ego $$3) {
      if (!this.d($$0)) {
         dlf $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dpp.c, $$2, dpp.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
