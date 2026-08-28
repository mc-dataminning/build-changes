import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends diw {
   public static final MapCodec<doo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dib.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, doo::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dyn g = dye.aN;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dib.c j;

   @Override
   public MapCodec<doo> a() {
      return d;
   }

   public doo(dib.c $$0, kn.a $$1, dxn.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dxo $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(etp $$0) {
      return $$0 == etr.c && this.j == dib.c.b;
   }

   @Override
   protected double b(dxo $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$1 instanceof arx $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dxo $$0, dgz $$1, jh $$2) {
      if (this.j == dib.c.c) {
         e(dkf.fP.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dxo $$0, dgz $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dxo $$4 = $$3 == 0 ? dkf.fO.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eck.c, $$2, eck.a.a($$4));
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, dib.c $$3) {
      if (dkz.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dxo $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(eck.c, $$2, eck.a.a($$4));
      }
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, etp $$3) {
      if (!this.d($$0)) {
         dxo $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(eck.c, $$2, eck.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
