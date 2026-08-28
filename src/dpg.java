import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpg extends djn {
   public static final MapCodec<dpg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dis.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kp.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dpg::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final dzm f = dzc.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dis.c i;

   @Override
   public MapCodec<dpg> a() {
      return c;
   }

   public dpg(dis.c $$0, kp.a $$1, dyl.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dym $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(eus $$0) {
      return $$0 == euu.c && this.i == dis.c.b;
   }

   @Override
   protected double b(dym $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$1 instanceof arn $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dym $$0, dhp $$1, jj $$2) {
      if (this.i == dis.c.c) {
         e(dkw.fP.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dym $$0, dhp $$1, jj $$2) {
      int $$3 = $$0.c(f) - 1;
      dym $$4 = $$3 == 0 ? dkw.fO.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(edm.c, $$2, edm.a.a($$4));
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, dis.c $$3) {
      if (dlq.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         dym $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(edm.c, $$2, edm.a.a($$4));
      }
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, eus $$3) {
      if (!this.d($$0)) {
         dym $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(edm.c, $$2, edm.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
