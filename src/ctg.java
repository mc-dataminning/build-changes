import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;

public class ctg extends csu {
   private static final int a = 6;
   private static final float b = -2.4F;
   private static final float c = 1.5F;
   private static final float j = 2.5F;
   private static final float k = 0.6F;
   private static final ImmutableMultimap<iw<btc>, btf> l = ImmutableMultimap.builder()
      .put(bth.c, new btf(e, "Weapon modifier", 6.0, btf.a.a))
      .put(bth.e, new btf(f, "Weapon modifier", -2.4F, btf.a.a))
      .build();

   public ctg(csu.a $$0) {
      super($$0);
   }

   public static cwc h() {
      return new cwc(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dqh $$0, dad $$1, in $$2, clh $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(csz $$0) {
      return false;
   }

   @Override
   public boolean a(csz $$0, bsa $$1, bsa $$2) {
      $$0.a(1, $$2, bro.a);
      if ($$2 instanceof aqi $$3 && $$3.ac > 1.5F) {
         aqh $$4 = (aqh)$$2.dN();
         if (!$$3.cy || $$3.cw == null || $$3.cw.b() > $$3.du()) {
            $$3.cw = $$3.dl();
            $$3.cy = true;
         }

         if ($$1.aC()) {
            $$3.b(true);
            avb $$5 = $$3.ac > 5.0F ? avc.og : avc.of;
            $$4.a(null, $$3.ds(), $$3.du(), $$3.dy(), $$5, avd.g, 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.ds(), $$3.du(), $$3.dy(), avc.oe, avd.g, 1.0F, 1.0F);
         }

         this.a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public Multimap<iw<btc>, btf> a(bro $$0) {
      return (Multimap<iw<btc>, btf>)($$0 == bro.a ? l : super.a($$0));
   }

   @Override
   public boolean a(csz $$0, csz $$1) {
      return $$1.a(ctc.yB);
   }

   @Override
   public float a(clh $$0, float $$1) {
      return $$0.ac > 1.5F ? $$1 * 0.5F * $$0.ac : 0.0F;
   }

   private void a(dad $$0, clh $$1, brh $$2) {
      $$0.a(
            bsa.class,
            $$2.cI().g(2.5),
            $$2x -> $$2x != $$1 && $$2x != $$2 && !$$2.s($$2x) && (!($$2x instanceof chh $$3) || !$$3.z()) && $$2.g($$2x) <= Math.pow(2.5, 2.0)
         )
         .forEach($$2x -> {
            etp $$3 = $$2x.dl().d($$2.dl());
            double $$4 = (2.5 - $$3.f()) * 0.6F * (1.0 - $$2x.g(bth.n));
            etp $$5 = $$3.d().a($$4);
            if ($$4 > 0.0) {
               $$2x.j($$5.c, 0.6F, $$5.e);
               if ($$0 instanceof aqh $$6) {
                  in $$7 = $$2x.aJ();
                  etp $$8 = $$7.b().b(0.0, 0.5, 0.0);
                  int $$9 = (int)(100.0 * $$4);
                  $$6.a(new ko(kx.b, $$6.a_($$7)), $$8.c, $$8.d, $$8.e, $$9, 0.3F, 0.3F, 0.3F, 0.15F);
               }
            }
         });
   }
}
