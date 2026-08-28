import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnx extends dif {
   public static final MapCodec<dnx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhk.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ko.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dnx::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dxw g = dxn.aN;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dhk.c j;

   @Override
   public MapCodec<dnx> a() {
      return d;
   }

   public dnx(dhk.c $$0, ko.a $$1, dww.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dwx $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(esy $$0) {
      return $$0 == eta.c && this.j == dhk.c.b;
   }

   @Override
   protected double b(dwx $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if ($$1 instanceof arc $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dwx $$0, dgi $$1, ji $$2) {
      if (this.j == dhk.c.c) {
         e(djo.fP.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dwx $$0, dgi $$1, ji $$2) {
      int $$3 = $$0.c(g) - 1;
      dwx $$4 = $$3 == 0 ? djo.fO.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ebt.c, $$2, ebt.a.a($$4));
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, dhk.c $$3) {
      if (dki.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dwx $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ebt.c, $$2, ebt.a.a($$4));
      }
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, esy $$3) {
      if (!this.d($$0)) {
         dwx $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ebt.c, $$2, ebt.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
