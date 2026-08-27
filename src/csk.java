import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

public class csk extends cry {
   private static final int b = 6;
   private static final float c = -2.4F;
   public static final float a = 1.5F;
   private static final ImmutableMultimap<iv<bsg>, bsj> j = ImmutableMultimap.builder()
      .put(bsl.c, new bsj(e, "Weapon modifier", 6.0, bsj.a.a))
      .put(bsl.e, new bsj(f, "Weapon modifier", -2.4F, bsj.a.a))
      .build();

   public csk(cry.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      return !$$3.f();
   }

   @Override
   public float a(csd $$0, dpy $$1) {
      return $$1.a(dcx.bs) ? 15.0F : 1.5F;
   }

   @Override
   public boolean a(csd $$0) {
      return false;
   }

   @Override
   public boolean a(csd $$0, bre $$1, bre $$2) {
      $$0.a(1, $$2, bqs.a);
      if ($$2 instanceof aqf $$3 && $$3.ac > 1.5F) {
         aqe $$4 = (aqe)$$2.dN();
         if ($$3.cw == null || $$3.cw > $$3.du()) {
            $$3.cw = $$3.du();
         }

         if ($$1.aC()) {
            $$3.b(true);
            $$4.a(null, $$3.ds(), $$3.du(), $$3.dy(), auz.of, ava.g, 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.ds(), $$3.du(), $$3.dy(), auz.oe, ava.g, 1.0F, 1.0F);
         }
      }

      return true;
   }

   @Override
   public boolean a(csd $$0, czu $$1, dpy $$2, im $$3, bre $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bqs.a);
      }

      return true;
   }

   @Override
   public boolean a_(dpy $$0) {
      return $$0.a(dcx.bs);
   }

   @Override
   public Multimap<iv<bsg>, bsj> a(bqs $$0) {
      return (Multimap<iv<bsg>, bsj>)($$0 == bqs.a ? j : super.a($$0));
   }

   @Override
   public boolean a(csd $$0, csd $$1) {
      return $$1.a(csg.yB);
   }
}
