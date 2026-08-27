import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;

public class cup extends cuc {
   private static final int a = 6;
   private static final float b = -2.4F;
   private static final float c = 1.5F;
   private static final float j = 2.5F;
   private static final float k = 0.6F;
   private static final ImmutableMultimap<ja<btq>, btt> l = ImmutableMultimap.builder()
      .put(btv.c, new btt(e, "Weapon modifier", 6.0, btt.a.a))
      .put(btv.e, new btt(f, "Weapon modifier", -2.4F, btt.a.a))
      .build();

   public cup(cuc.a $$0) {
      super($$0);
   }

   public static cxw d() {
      return new cxw(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuh $$0) {
      return false;
   }

   @Override
   public boolean a(cuh $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsc.a);
      if ($$2 instanceof aqu $$3 && a($$3)) {
         aqt $$4 = (aqt)$$2.dU();
         if (!$$3.cO || $$3.cM == null || $$3.cM.b() > $$3.dB()) {
            $$3.cM = $$3.ds();
            $$3.cO = true;
         }

         if ($$1.aE()) {
            $$3.b(true);
            avn $$5 = $$3.ad > 5.0F ? avo.oG : avo.oF;
            $$4.a(null, $$3.dz(), $$3.dB(), $$3.dF(), $$5, avq.g, 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.dz(), $$3.dB(), $$3.dF(), avo.oE, avq.g, 1.0F, 1.0F);
         }

         this.a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public Multimap<ja<btq>, btt> a(bsc $$0) {
      return (Multimap<ja<btq>, btt>)($$0 == bsc.a ? l : super.a($$0));
   }

   @Override
   public boolean a(cuh $$0, cuh $$1) {
      return $$1.a(cuk.Ao);
   }

   @Override
   public float a(cly $$0, float $$1) {
      return a($$0) ? $$1 * 0.5F * $$0.ad : 0.0F;
   }

   private void a(dca $$0, cly $$1, brv $$2) {
      $$0.a(
            bso.class,
            $$2.cP().g(2.5),
            $$2x -> $$2x != $$1 && $$2x != $$2 && !$$2.s($$2x) && (!($$2x instanceof chw $$3) || !$$3.y()) && $$2.g($$2x) <= Math.pow(2.5, 2.0)
         )
         .forEach($$2x -> {
            ewu $$3 = $$2x.ds().d($$2.ds());
            double $$4 = (2.5 - $$3.f()) * 0.6F * (1.0 - $$2x.g(btv.n));
            ewu $$5 = $$3.d().a($$4);
            if ($$4 > 0.0) {
               $$2x.j($$5.c, 0.6F, $$5.e);
               if ($$0 instanceof aqt $$6) {
                  ir $$7 = $$2x.aO();
                  ewu $$8 = $$7.b().b(0.0, 0.5, 0.0);
                  int $$9 = (int)(100.0 * $$4);
                  $$6.a(new ks(lb.b, $$6.a_($$7)), $$8.c, $$8.d, $$8.e, $$9, 0.3F, 0.3F, 0.3F, 0.15F);
               }
            }
         });
   }

   public static boolean a(cly $$0) {
      return $$0.ad > 1.5F && !$$0.fN();
   }
}
