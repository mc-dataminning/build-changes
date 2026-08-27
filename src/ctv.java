import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.function.Predicate;

public class ctv extends ctj {
   private static final int b = 6;
   private static final float c = -2.4F;
   private static final float j = 1.5F;
   private static final float k = 5.0F;
   public static final float a = 3.5F;
   private static final float l = 0.7F;
   private static final float m = 3.0F;
   private static final ImmutableMultimap<ix<btr>, btu> n = ImmutableMultimap.builder()
      .put(btw.c, new btu(e, "Weapon modifier", 6.0, btu.a.a))
      .put(btw.e, new btu(f, "Weapon modifier", -2.4F, btu.a.a))
      .build();

   public ctv(ctj.a $$0) {
      super($$0);
   }

   public static cwt h() {
      return new cwt(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(drb $$0, dax $$1, io $$2, clw $$3) {
      return !$$3.f();
   }

   @Override
   public int g() {
      return 15;
   }

   @Override
   public boolean a(cto $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsb.a);
      if ($$2 instanceof aqn $$3 && a($$3)) {
         aqm $$4 = (aqm)$$2.dP();
         if (!$$3.cy || $$3.cw == null || $$3.cw.b() > $$3.dw()) {
            $$3.cw = $$3.dn();
            $$3.cy = true;
         }

         $$3.g($$3.ds().a(it.a.b, 0.0));
         $$3.d.b(new aew($$3));
         if ($$1.aE()) {
            $$3.b(true);
            avg $$5 = $$3.ac > 5.0F ? avh.oq : avh.op;
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), $$5, $$3.de(), 1.0F, 1.0F);
         } else {
            $$4.a(null, $$3.du(), $$3.dw(), $$3.dA(), avh.oo, $$3.de(), 1.0F, 1.0F);
         }

         a($$4, $$3, $$1);
      }

      return true;
   }

   @Override
   public Multimap<ix<btr>, btu> a(bsb $$0) {
      return (Multimap<ix<btr>, btu>)($$0 == bsb.a ? n : super.a($$0));
   }

   @Override
   public boolean a(cto $$0, cto $$1) {
      return $$1.a(ctr.yD);
   }

   @Override
   public float a(clw $$0, float $$1) {
      int $$2 = cza.a(czc.L, $$0);
      float $$3 = cyx.a($$2, $$0.ac);
      return a($$0) ? 3.0F * $$0.ac + $$3 : 0.0F;
   }

   private static void a(dax $$0, clw $$1, bru $$2) {
      $$0.c(2013, $$2.aL(), 750);
      $$0.a(bso.class, $$2.cK().g(3.5), a($$1, $$2)).forEach($$2x -> {
         euk $$3 = $$2x.dn().d($$2.dn());
         double $$4 = a($$1, $$2x, $$3);
         euk $$5 = $$3.d().a($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.c, 0.7F, $$5.e);
         }
      });
   }

   private static Predicate<bso> a(clw $$0, bru $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label44: {
            $$3 = !$$2.N_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof chw $$6 && $$6.z()) {
               var10000 = false;
               break label44;
            }

            var10000 = true;
         }

         boolean $$8 = var10000;
         boolean $$9 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$8 && $$9;
      };
   }

   private static double a(clw $$0, bso $$1, euk $$2) {
      return (3.5 - $$2.f()) * 0.7F * (double)($$0.ac > 5.0F ? 2 : 1) * (1.0 - $$1.g(btw.n));
   }

   public static boolean a(clw $$0) {
      return $$0.ac > 1.5F && !$$0.fE();
   }
}
