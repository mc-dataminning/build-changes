import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends djf {
   public static final MapCodec<dox> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dik.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dox::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dyu g = dyl.aL;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dik.c j;

   @Override
   public MapCodec<dox> a() {
      return d;
   }

   public dox(dik.c $$0, kn.a $$1, dxu.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dxv $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(etw $$0) {
      return $$0 == ety.c && this.j == dik.c.b;
   }

   @Override
   protected double b(dxv $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$1 instanceof ash $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dxv $$0, dhi $$1, jh $$2) {
      if (this.j == dik.c.c) {
         e(dko.fI.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dxv $$0, dhi $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dxv $$4 = $$3 == 0 ? dko.fH.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ecr.c, $$2, ecr.a.a($$4));
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, dik.c $$3) {
      if (dli.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dxv $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ecr.c, $$2, ecr.a.a($$4));
      }
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, etw $$3) {
      if (!this.d($$0)) {
         dxv $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ecr.c, $$2, ecr.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
