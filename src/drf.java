import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drf extends dlk {
   public static final MapCodec<drf> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkp.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kc.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, drf::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final ebt f = ebj.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dkp.c i;

   @Override
   public MapCodec<drf> a() {
      return c;
   }

   public drf(dkp.c $$0, kc.a $$1, eas.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(eat $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(ewz $$0) {
      return $$0 == exb.c && this.i == dkp.c.b;
   }

   @Override
   protected double b(eat $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$3.bW() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.c($$5, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(eat $$0, djm $$1, iv $$2) {
      if (this.i == dkp.c.c) {
         d(dmt.fT.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(eat $$0, djm $$1, iv $$2) {
      int $$3 = $$0.c(f) - 1;
      eat $$4 = $$3 == 0 ? dmt.fS.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eft.c, $$2, eft.a.a($$4));
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, dkp.c $$3) {
      if (dno.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         eat $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(eft.c, $$2, eft.a.a($$4));
      }
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, ewz $$3) {
      if (!this.d($$0)) {
         eat $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(eft.c, $$2, eft.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
