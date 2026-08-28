import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djg extends ddq {
   public static final MapCodec<djg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcv.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djg::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dta g = dsq.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcv.c j;

   @Override
   public MapCodec<djg> a() {
      return d;
   }

   public djg(dcv.c $$0, kf.a $$1, drz.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsa $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ens $$0) {
      return $$0 == enu.c && this.j == dcv.c.b;
   }

   @Override
   protected double b(dsa $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsa $$0, dbw $$1, iz $$2) {
      if (this.j == dcv.c.c) {
         d(dez.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsa $$0, dbw $$1, iz $$2) {
      int $$3 = $$0.c(g) - 1;
      dsa $$4 = $$3 == 0 ? dez.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dwt.c, $$2, dwt.a.a($$4));
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, dcv.c $$3) {
      if (dfs.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsa $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dwt.c, $$2, dwt.a.a($$4));
      }
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, ens $$3) {
      if (!this.d($$0)) {
         dsa $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dwt.c, $$2, dwt.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
