import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends dhb {
   public static final MapCodec<djs> b = b(djs::new);
   @Nullable
   private static dne h;
   @Nullable
   private static dne i;

   @Override
   public MapCodec<djs> a() {
      return b;
   }

   protected djs(dmy.d $$0) {
      super(dhb.b.d, $$0);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      a($$0, $$1);
   }

   public static void a(cwz $$0, ib $$1) {
      if ($$0.c_($$1) instanceof dlr $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cwz $$0, ib $$1, dlr $$2) {
      if (!$$0.B) {
         dmz $$3 = $$2.n();
         boolean $$4 = $$3.a(dac.gG) || $$3.a(dac.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.aj() != bmz.a) {
            dne.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               cer $$6 = bpc.bo.a($$0);
               if ($$6 != null) {
                  dau.a($$0, $$5);
                  ib $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ih.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aX = $$5.b().o() == ih.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (apg $$8 : $$0.a(apg.class, $$6.cH().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dau.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cwz $$0, ib $$1, cqk $$2) {
      return $$2.a(cqn.uj) && $$1.v() >= $$0.I_() + 2 && $$0.aj() != bmz.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dne s() {
      if (h == null) {
         h = dnf.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(aun.aF)).a('^', dnd.a(dni.a(dac.gG).or(dni.a(dac.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dne y() {
      if (i == null) {
         i = dnf.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(aun.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
