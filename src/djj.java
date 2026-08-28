import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djj extends ddt {
   public static final MapCodec<djj> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcy.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djj::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dtd g = dst.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcy.c j;

   @Override
   public MapCodec<djj> a() {
      return d;
   }

   public djj(dcy.c $$0, kf.a $$1, dsc.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dsd $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(env $$0) {
      return $$0 == enx.c && this.j == dcy.c.b;
   }

   @Override
   protected double b(dsd $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dsd $$0, dbz $$1, iz $$2) {
      if (this.j == dcy.c.c) {
         d(dfc.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dsd $$0, dbz $$1, iz $$2) {
      int $$3 = $$0.c(g) - 1;
      dsd $$4 = $$3 == 0 ? dfc.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dww.c, $$2, dww.a.a($$4));
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, dcy.c $$3) {
      if (dfv.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dsd $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dww.c, $$2, dww.a.a($$4));
      }
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, env $$3) {
      if (!this.d($$0)) {
         dsd $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dww.c, $$2, dww.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
