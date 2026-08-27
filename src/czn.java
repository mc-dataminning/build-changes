import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czn extends cty {
   public static final MapCodec<czn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctd.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jc.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, czn::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final din g = did.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ctd.c j;

   @Override
   public MapCodec<czn> a() {
      return d;
   }

   public czn(ctd.c $$0, jc.a $$1, dhm.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dhn $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ecw $$0) {
      return $$0 == ecy.c && this.j == ctd.c.b;
   }

   @Override
   protected double b(dhn $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dhn $$0, csf $$1, hx $$2) {
      if (this.j == ctd.c.c) {
         d(cvh.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dhn $$0, csf $$1, hx $$2) {
      int $$3 = $$0.c(g) - 1;
      dhn $$4 = $$3 == 0 ? cvh.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dlx.c, $$2, dlx.a.a($$4));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, ctd.c $$3) {
      if (cwa.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dhn $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dlx.c, $$2, dlx.a.a($$4));
      }
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dhn $$0, csf $$1, hx $$2, ecw $$3) {
      if (!this.d($$0)) {
         dhn $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dlx.c, $$2, dlx.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
