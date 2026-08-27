import java.util.function.Predicate;

public class cdx extends cgp implements cht {
   public static final int a = 20;
   public static final int b = 15;

   public cdx(cfu.a $$0) {
      super($$0);
   }

   @Override
   public void a(cfz $$0, cmm $$1, bfz $$2, int $$3) {
      if ($$2 instanceof byo $$4) {
         boolean $$5 = $$4.fO().d || cki.a(ckk.B, $$0) > 0;
         cfz $$6 = $$4.g($$0);
         if (!$$6.b() || $$5) {
            if ($$6.b()) {
               $$6 = new cfz(cgc.nH);
            }

            int $$7 = this.b($$0) - $$3;
            float $$8 = a($$7);
            if (!((double)$$8 < 0.1)) {
               boolean $$9 = $$5 && $$6.a(cgc.nH);
               if (!$$1.B) {
                  cdn $$10 = (cdn)($$6.d() instanceof cdn ? $$6.d() : cgc.nH);
                  byu $$11 = $$10.a($$1, $$6, $$4);
                  $$11.a($$4, $$4.dA(), $$4.dy(), 0.0F, $$8 * 3.0F, 1.0F);
                  if ($$8 == 1.0F) {
                     $$11.a(true);
                  }

                  int $$12 = cki.a(ckk.y, $$0);
                  if ($$12 > 0) {
                     $$11.h($$11.q() + (double)$$12 * 0.5 + 0.5);
                  }

                  int $$13 = cki.a(ckk.z, $$0);
                  if ($$13 > 0) {
                     $$11.b($$13);
                  }

                  if (cki.a(ckk.A, $$0) > 0) {
                     $$11.g(100);
                  }

                  $$0.a(1, $$4, $$1x -> $$1x.d($$4.fj()));
                  if ($$9 || $$4.fO().d && ($$6.a(cgc.uv) || $$6.a(cgc.uw))) {
                     $$11.d = byu.a.c;
                  }

                  $$1.b($$11);
               }

               $$1.a(null, $$4.dn(), $$4.dp(), $$4.dt(), amh.ar, ami.h, 1.0F, 1.0F / ($$1.y_().i() * 0.4F + 1.2F) + $$8 * 0.5F);
               if (!$$9 && !$$4.fO().d) {
                  $$6.h(1);
                  if ($$6.b()) {
                     $$4.fN().g($$6);
                  }
               }

               $$4.b(amr.c.b(this));
            }
         }
      }
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int b(cfz $$0) {
      return 72000;
   }

   @Override
   public chs c(cfz $$0) {
      return chs.e;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).b();
      if (!$$1.fO().d && !$$4) {
         return bdy.d($$3);
      } else {
         $$1.c($$2);
         return bdy.b($$3);
      }
   }

   @Override
   public Predicate<cfz> b() {
      return c;
   }

   @Override
   public int d() {
      return 15;
   }
}
