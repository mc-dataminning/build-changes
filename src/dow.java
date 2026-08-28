import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dow extends dje {
   public static final MapCodec<dow> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dow::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dyt g = dyk.aL;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dij.c j;

   @Override
   public MapCodec<dow> a() {
      return d;
   }

   public dow(dij.c $$0, kn.a $$1, dxt.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dxu $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(etv $$0) {
      return $$0 == etx.c && this.j == dij.c.b;
   }

   @Override
   protected double b(dxu $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$1 instanceof ash $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dxu $$0, dhh $$1, jh $$2) {
      if (this.j == dij.c.c) {
         e(dkn.fI.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dxu $$0, dhh $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dxu $$4 = $$3 == 0 ? dkn.fH.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ecq.c, $$2, ecq.a.a($$4));
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, dij.c $$3) {
      if (dlh.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dxu $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ecq.c, $$2, ecq.a.a($$4));
      }
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, etv $$3) {
      if (!this.d($$0)) {
         dxu $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ecq.c, $$2, ecq.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
