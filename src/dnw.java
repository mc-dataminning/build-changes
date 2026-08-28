import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnw extends die {
   public static final MapCodec<dnw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhj.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ko.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dnw::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dxv g = dxm.aN;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dhj.c j;

   @Override
   public MapCodec<dnw> a() {
      return d;
   }

   public dnw(dhj.c $$0, ko.a $$1, dwv.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dww $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(esx $$0) {
      return $$0 == esz.c && this.j == dhj.c.b;
   }

   @Override
   protected double b(dww $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$1 instanceof ard $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dww $$0, dgh $$1, ji $$2) {
      if (this.j == dhj.c.c) {
         e(djn.fP.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dww $$0, dgh $$1, ji $$2) {
      int $$3 = $$0.c(g) - 1;
      dww $$4 = $$3 == 0 ? djn.fO.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ebs.c, $$2, ebs.a.a($$4));
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, dhj.c $$3) {
      if (dkh.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dww $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ebs.c, $$2, ebs.a.a($$4));
      }
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, esx $$3) {
      if (!this.d($$0)) {
         dww $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ebs.c, $$2, ebs.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
