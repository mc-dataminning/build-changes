import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djr extends deb {
   public static final MapCodec<djr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddg.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kg.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djr::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dtl g = dtb.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final ddg.c j;

   @Override
   public MapCodec<djr> a() {
      return d;
   }

   public djr(ddg.c $$0, kg.a $$1, dsk.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsl $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eoi $$0) {
      return $$0 == eok.c && this.j == ddg.c.b;
   }

   @Override
   protected double b(dsl $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B && $$3.bS() && this.a($$0, $$2, $$3)) {
         $$3.aE();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsl $$0, dcg $$1, ja $$2) {
      if (this.j == ddg.c.c) {
         d(dfk.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsl $$0, dcg $$1, ja $$2) {
      int $$3 = $$0.c(g) - 1;
      dsl $$4 = $$3 == 0 ? dfk.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dxh.c, $$2, dxh.a.a($$4));
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ddg.c $$3) {
      if (dgd.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsl $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dxh.c, $$2, dxh.a.a($$4));
      }
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, eoi $$3) {
      if (!this.d($$0)) {
         dsl $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dxh.c, $$2, dxh.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
