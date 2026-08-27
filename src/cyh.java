import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyh extends css {
   public static final MapCodec<cyh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(crx.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), iy.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, cyh::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dhb g = dgr.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final crx.c j;

   @Override
   public MapCodec<cyh> a() {
      return d;
   }

   public cyh(crx.c $$0, iy.a $$1, dga.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dgb $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ebd $$0) {
      return $$0 == ebf.c && this.j == crx.c.b;
   }

   @Override
   protected double b(dgb $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B && $$3.bM() && this.a($$0, $$2, $$3)) {
         $$3.ay();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dgb $$0, cqz $$1, ht $$2) {
      if (this.j == crx.c.c) {
         d(cuc.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dgb $$0, cqz $$1, ht $$2) {
      int $$3 = $$0.c(g) - 1;
      dgb $$4 = $$3 == 0 ? cuc.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dkl.c, $$2, dkl.a.a($$4));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, crx.c $$3) {
      if (cuv.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dgb $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dkl.c, $$2, dkl.a.a($$4));
      }
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dgb $$0, cqz $$1, ht $$2, ebd $$3) {
      if (!this.d($$0)) {
         dgb $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dkl.c, $$2, dkl.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
