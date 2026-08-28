import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djh extends ddr {
   public static final MapCodec<djh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcw.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djh::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dtb g = dsr.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcw.c j;

   @Override
   public MapCodec<djh> a() {
      return d;
   }

   public djh(dcw.c $$0, kf.a $$1, dsa.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsb $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ent $$0) {
      return $$0 == env.c && this.j == dcw.c.b;
   }

   @Override
   protected double b(dsb $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsb $$0, dbx $$1, iz $$2) {
      if (this.j == dcw.c.c) {
         d(dfa.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsb $$0, dbx $$1, iz $$2) {
      int $$3 = $$0.c(g) - 1;
      dsb $$4 = $$3 == 0 ? dfa.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dwu.c, $$2, dwu.a.a($$4));
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, dcw.c $$3) {
      if (dft.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsb $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dwu.c, $$2, dwu.a.a($$4));
      }
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, ent $$3) {
      if (!this.d($$0)) {
         dsb $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dwu.c, $$2, dwu.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
