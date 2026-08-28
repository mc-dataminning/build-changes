import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dix {
   public static final MapCodec<dop> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dop::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dym g = dyd.aL;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dic.c j;

   @Override
   public MapCodec<dop> a() {
      return d;
   }

   public dop(dic.c $$0, kn.a $$1, dxm.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dxn $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eto $$0) {
      return $$0 == etq.c && this.j == dic.c.b;
   }

   @Override
   protected double b(dxn $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$1 instanceof ash $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dxn $$0, dha $$1, jh $$2) {
      if (this.j == dic.c.c) {
         e(dkg.fI.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dxn $$0, dha $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dxn $$4 = $$3 == 0 ? dkg.fH.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ecj.c, $$2, ecj.a.a($$4));
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, dic.c $$3) {
      if (dla.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dxn $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ecj.c, $$2, ecj.a.a($$4));
      }
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, eto $$3) {
      if (!this.d($$0)) {
         dxn $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ecj.c, $$2, ecj.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
