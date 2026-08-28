import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqt extends dky {
   public static final MapCodec<dqt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkd.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kb.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dqt::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final ebh f = eax.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dkd.c i;

   @Override
   public MapCodec<dqt> a() {
      return c;
   }

   public dqt(dkd.c $$0, kb.a $$1, eag.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(eah $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(ewn $$0) {
      return $$0 == ewp.c && this.i == dkd.c.b;
   }

   @Override
   protected double b(eah $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$1 instanceof arq $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(eah $$0, dja $$1, iu $$2) {
      if (this.i == dkd.c.c) {
         d(dmh.fT.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(eah $$0, dja $$1, iu $$2) {
      int $$3 = $$0.c(f) - 1;
      eah $$4 = $$3 == 0 ? dmh.fS.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(efh.c, $$2, efh.a.a($$4));
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, dkd.c $$3) {
      if (dnc.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         eah $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(efh.c, $$2, efh.a.a($$4));
      }
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, ewn $$3) {
      if (!this.d($$0)) {
         eah $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(efh.c, $$2, efh.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
