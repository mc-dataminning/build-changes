import com.mojang.serialization.MapCodec;

public class djv extends dfo implements dju {
   public static final MapCodec<djv> b = b(djv::new);

   @Override
   public MapCodec<djv> a() {
      return b;
   }

   public djv(dqg.d $$0) {
      super(boo.a(1), $$0);
   }

   @Override
   public int a(djz.a $$0, dae $$1, in $$2, ayg $$3, djz $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         in $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               in $$10 = $$7.c();
               dqh $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), avd.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(djz $$0, in $$1, in $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = axz.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = axz.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dqh a(dae $$0, in $$1, ayg $$2, boolean $$3) {
      dqh $$4;
      if ($$2.a(11) == 0) {
         $$4 = ddg.qV.n().a(djy.d, Boolean.valueOf($$3));
      } else {
         $$4 = ddg.qQ.n();
      }

      return $$4.b(dqx.C) && !$$0.b_($$1).c() ? $$4.a(dqx.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dae $$0, in $$1) {
      dqh $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(ddg.G) && $$2.u().b(emb.c)) {
         int $$3 = 0;

         for (in $$4 : in.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dqh $$5 = $$0.a_($$4);
            if ($$5.a(ddg.qQ) || $$5.a(ddg.qV)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
