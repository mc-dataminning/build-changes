import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqn extends dkt {
   public static final MapCodec<dqn> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djy.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kb.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dqn::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final eaz f = eap.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final djy.c i;

   @Override
   public MapCodec<dqn> a() {
      return c;
   }

   public dqn(djy.c $$0, kb.a $$1, dzy.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dzz $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(ewf $$0) {
      return $$0 == ewh.c && this.i == djy.c.b;
   }

   @Override
   protected double b(dzz $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$1 instanceof arq $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dzz $$0, div $$1, iu $$2) {
      if (this.i == djy.c.c) {
         d(dmc.fQ.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dzz $$0, div $$1, iu $$2) {
      int $$3 = $$0.c(f) - 1;
      dzz $$4 = $$3 == 0 ? dmc.fP.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eez.c, $$2, eez.a.a($$4));
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, djy.c $$3) {
      if (dmw.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         dzz $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(eez.c, $$2, eez.a.a($$4));
      }
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, ewf $$3) {
      if (!this.d($$0)) {
         dzz $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(eez.c, $$2, eez.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
