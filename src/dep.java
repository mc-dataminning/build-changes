import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dep extends dcb {
   public static final MapCodec<dep> b = b(dep::new);
   @Nullable
   private static dhn h;
   @Nullable
   private static dhn i;

   @Override
   public MapCodec<dep> a() {
      return b;
   }

   protected dep(dhh.d $$0) {
      super(dcb.b.d, $$0);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dfd $$5 = $$0.c_($$1);
      if ($$5 instanceof dgo) {
         a($$0, $$1, (dgo)$$5);
      }
   }

   public static void a(csa $$0, ht $$1, dgo $$2) {
      if (!$$0.B) {
         dhi $$3 = $$2.q();
         boolean $$4 = $$3.a(cvc.gG) || $$3.a(cvc.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.aj() != biu.a) {
            dhn.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cab $$6 = bku.bk.a($$0);
               if ($$6 != null) {
                  cvu.a($$0, $$5);
                  ht $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hx.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hx.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (amf $$8 : $$0.a(amf.class, $$6.cH().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cvu.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(csa $$0, ht $$1, clj $$2) {
      return $$2.a(clm.ue) && $$1.v() >= $$0.I_() + 2 && $$0.aj() != biu.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dhn s() {
      if (h == null) {
         h = dho.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(arg.aE)).a('^', dhm.a(dhr.a(cvc.gG).or(dhr.a(cvc.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dhn y() {
      if (i == null) {
         i = dho.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(arg.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
