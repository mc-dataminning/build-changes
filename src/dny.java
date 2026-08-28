import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dny extends dig {
   public static final MapCodec<dny> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhl.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ko.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dny::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dxx g = dxo.aN;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dhl.c j;

   @Override
   public MapCodec<dny> a() {
      return d;
   }

   public dny(dhl.c $$0, ko.a $$1, dwx.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dwy $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(esz $$0) {
      return $$0 == etb.c && this.j == dhl.c.b;
   }

   @Override
   protected double b(dwy $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$1 instanceof ard $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dwy $$0, dgj $$1, ji $$2) {
      if (this.j == dhl.c.c) {
         e(djp.fP.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dwy $$0, dgj $$1, ji $$2) {
      int $$3 = $$0.c(g) - 1;
      dwy $$4 = $$3 == 0 ? djp.fO.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ebu.c, $$2, ebu.a.a($$4));
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, dhl.c $$3) {
      if (dkj.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dwy $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ebu.c, $$2, ebu.a.a($$4));
      }
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, esz $$3) {
      if (!this.d($$0)) {
         dwy $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ebu.c, $$2, ebu.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
