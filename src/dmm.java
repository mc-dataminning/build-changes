import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmm extends dgx {
   public static final MapCodec<dmm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgc.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dmm::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dwj g = dvz.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dgc.c j;

   @Override
   public MapCodec<dmm> a() {
      return d;
   }

   public dmm(dgc.c $$0, kn.a $$1, dvi.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dvj $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(erj $$0) {
      return $$0 == erl.c && this.j == dgc.c.b;
   }

   @Override
   protected double b(dvj $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C && $$3.bZ() && this.a($$0, $$2, $$3)) {
         $$3.aI();
         if ($$3.a($$1, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dvj $$0, dfb $$1, jh $$2) {
      if (this.j == dgc.c.c) {
         e(dig.fu.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dvj $$0, dfb $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dvj $$4 = $$3 == 0 ? dig.ft.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eag.c, $$2, eag.a.a($$4));
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, dgc.c $$3) {
      if (diz.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dvj $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(eag.c, $$2, eag.a.a($$4));
      }
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, erj $$3) {
      if (!this.d($$0)) {
         dvj $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(eag.c, $$2, eag.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
