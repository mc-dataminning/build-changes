import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deu extends dcg {
   public static final MapCodec<deu> b = b(deu::new);
   @Nullable
   private static dhs h;
   @Nullable
   private static dhs i;

   @Override
   public MapCodec<deu> a() {
      return b;
   }

   protected deu(dhm.d $$0) {
      super(dcg.b.d, $$0);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dfi $$5 = $$0.c_($$1);
      if ($$5 instanceof dgt) {
         a($$0, $$1, (dgt)$$5);
      }
   }

   public static void a(csf $$0, hx $$1, dgt $$2) {
      if (!$$0.B) {
         dhn $$3 = $$2.r();
         boolean $$4 = $$3.a(cvh.gG) || $$3.a(cvh.gH);
         if ($$4 && $$1.v() >= $$0.J_() && $$0.aj() != biy.a) {
            dhs.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cag $$6 = bkz.bk.a($$0);
               if ($$6 != null) {
                  cvz.a($$0, $$5);
                  hx $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ib.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ib.a.a ? 0.0F : 90.0F;
                  $$6.u();

                  for (amj $$8 : $$0.a(amj.class, $$6.cH().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cvz.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(csf $$0, hx $$1, clo $$2) {
      return $$2.a(clr.ue) && $$1.v() >= $$0.J_() + 2 && $$0.aj() != biy.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dhs s() {
      if (h == null) {
         h = dht.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(ark.aE)).a('^', dhr.a(dhw.a(cvh.gG).or(dhw.a(cvh.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dhs y() {
      if (i == null) {
         i = dht.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(ark.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
