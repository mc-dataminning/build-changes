import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drr extends dpa {
   public static final MapCodec<drr> b = b(drr::new);
   @Nullable
   private static dvi h;
   @Nullable
   private static dvi i;

   @Override
   public MapCodec<drr> a() {
      return b;
   }

   protected drr(dvc.d $$0) {
      super(dpa.b.d, $$0);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, @Nullable buv $$3, cvx $$4) {
      a($$0, $$1);
   }

   public static void a(dev $$0, jg $$1) {
      if ($$0.c_($$1) instanceof dtu $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dev $$0, jg $$1, dtu $$2) {
      if (!$$0.C) {
         dvd $$3 = $$2.m();
         boolean $$4 = $$3.a(dia.gG) || $$3.a(dia.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.am() != brv.a) {
            dvi.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               ckd $$6 = bug.bp.a($$0, buf.k);
               if ($$6 != null) {
                  dis.a($$0, $$5);
                  jg $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jl.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == jl.a.a ? 0.0F : 90.0F;
                  $$6.q();

                  for (arn $$8 : $$0.a(arn.class, $$6.cS().g(50.0))) {
                     an.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dis.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dev $$0, jg $$1, cvx $$2) {
      return $$2.a(cwb.uo) && $$1.v() >= $$0.I_() + 2 && $$0.am() != brv.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dvi q() {
      if (h == null) {
         h = dvj.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(awz.aG)).a('^', dvh.a(dvm.a(dia.gG).or(dvm.a(dia.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dvi r() {
      if (i == null) {
         i = dvj.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(awz.aG)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
