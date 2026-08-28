import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnv extends did {
   public static final MapCodec<dnv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhi.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ko.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dnv::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dxu g = dxl.aN;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dhi.c j;

   @Override
   public MapCodec<dnv> a() {
      return d;
   }

   public dnv(dhi.c $$0, ko.a $$1, dwu.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dwv $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(esw $$0) {
      return $$0 == esy.c && this.j == dhi.c.b;
   }

   @Override
   protected double b(dwv $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$1 instanceof arc $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dwv $$0, dgg $$1, ji $$2) {
      if (this.j == dhi.c.c) {
         e(djm.fP.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dwv $$0, dgg $$1, ji $$2) {
      int $$3 = $$0.c(g) - 1;
      dwv $$4 = $$3 == 0 ? djm.fO.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ebr.c, $$2, ebr.a.a($$4));
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, dhi.c $$3) {
      if (dkg.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dwv $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ebr.c, $$2, ebr.a.a($$4));
      }
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, esw $$3) {
      if (!this.d($$0)) {
         dwv $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ebr.c, $$2, ebr.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
