import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg extends dkn {
   public static final MapCodec<dqg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djs.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kb.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dqg::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final eao f = eae.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final djs.c i;

   @Override
   public MapCodec<dqg> a() {
      return c;
   }

   public dqg(djs.c $$0, kb.a $$1, dzn.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dzo $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(evu $$0) {
      return $$0 == evw.c && this.i == djs.c.b;
   }

   @Override
   protected double b(dzo $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$1 instanceof aro $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dzo $$0, dip $$1, iu $$2) {
      if (this.i == djs.c.c) {
         d(dlw.fP.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dzo $$0, dip $$1, iu $$2) {
      int $$3 = $$0.c(f) - 1;
      dzo $$4 = $$3 == 0 ? dlw.fO.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eeo.c, $$2, eeo.a.a($$4));
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, djs.c $$3) {
      if (dmq.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         dzo $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(eeo.c, $$2, eeo.a.a($$4));
      }
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, evu $$3) {
      if (!this.d($$0)) {
         dzo $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(eeo.c, $$2, eeo.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
