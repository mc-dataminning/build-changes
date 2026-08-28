import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq extends dix {
   public static final MapCodec<doq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), ko.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, doq::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final dyq f = dyg.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dic.c i;

   @Override
   public MapCodec<doq> a() {
      return c;
   }

   public doq(dic.c $$0, ko.a $$1, dxp.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dxq $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(etv $$0) {
      return $$0 == etx.c && this.i == dic.c.b;
   }

   @Override
   protected double b(dxq $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$1 instanceof ard $$4 && $$3.bX() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dxq $$0, dgz $$1, ji $$2) {
      if (this.i == dic.c.c) {
         e(dkg.fP.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dxq $$0, dgz $$1, ji $$2) {
      int $$3 = $$0.c(f) - 1;
      dxq $$4 = $$3 == 0 ? dkg.fO.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ecp.c, $$2, ecp.a.a($$4));
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, dic.c $$3) {
      if (dla.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         dxq $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(ecp.c, $$2, ecp.a.a($$4));
      }
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, etv $$3) {
      if (!this.d($$0)) {
         dxq $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(ecp.c, $$2, ecp.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
