import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddj extends dba {
   public static final MapCodec<ddj> b = b(ddj::new);
   @Nullable
   private static dgg h;
   @Nullable
   private static dgg i;

   @Override
   public MapCodec<ddj> a() {
      return b;
   }

   protected ddj(dga.d $$0) {
      super(dba.b.d, $$0);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ddx $$5 = $$0.c_($$1);
      if ($$5 instanceof dfh) {
         a($$0, $$1, (dfh)$$5);
      }
   }

   public static void a(cqz $$0, ht $$1, dfh $$2) {
      if (!$$0.B) {
         dgb $$3 = $$2.q();
         boolean $$4 = $$3.a(cuc.gG) || $$3.a(cuc.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ai() != bhy.a) {
            dgg.b $$5 = x().a($$0, $$1);
            if ($$5 != null) {
               bze $$6 = bjx.bk.a($$0);
               if ($$6 != null) {
                  cuu.a($$0, $$5);
                  ht $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hx.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hx.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (alr $$8 : $$0.a(alr.class, $$6.cG().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cuu.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cqz $$0, ht $$1, ckj $$2) {
      return $$2.a(ckm.ts) && $$1.v() >= $$0.I_() + 2 && $$0.ai() != bhy.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dgg x() {
      if (h == null) {
         h = dgh.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(aqs.aE)).a('^', dgf.a(dgk.a(cuc.gG).or(dgk.a(cuc.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dgg y() {
      if (i == null) {
         i = dgh.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(aqs.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
