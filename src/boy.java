import com.google.common.collect.ImmutableMap;

public class boy extends bkz<cba> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = ary.c(34.0);
   private static final int i = ary.f(60.0F);

   public boy() {
      super(ImmutableMap.of(bsj.o, bsk.a, bsj.aI, bsk.b, bsj.aJ, bsk.c, bsj.aK, bsk.c), i);
   }

   protected boolean a(aks $$0, cba $$1) {
      return $$1.a($$1.dN().c(bsj.o).get(), 15.0, 20.0);
   }

   protected boolean a(aks $$0, cba $$1, long $$2) {
      return true;
   }

   protected void b(aks $$0, cba $$1, long $$2) {
      $$1.dN().a(bsj.p, true, (long)i);
      $$1.dN().a(bsj.aK, asz.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(apf.zM, 3.0F, 1.0F);
   }

   protected void c(aks $$0, cba $$1, long $$2) {
      $$1.dN().c(bsj.o).ifPresent($$1x -> $$1.G().a($$1x.dj()));
      if (!$$1.dN().a(bsj.aK) && !$$1.dN().a(bsj.aJ)) {
         $$1.dN().a(bsj.aJ, asz.a, (long)(i - h));
         $$1.dN().c(bsj.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            ehp $$3 = $$1.dj().b(0.0, 1.6F, 0.0);
            ehp $$4 = $$2x.bp().d($$3);
            ehp $$5 = $$4.d();

            for (int $$6 = 1; $$6 < ary.a($$4.f()) + 7; $$6++) {
               ehp $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(ix.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(apf.zL, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bko.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bko.c));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(aks $$0, cba $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bji $$0, int $$1) {
      $$0.dN().a(bsj.aI, asz.a, (long)$$1);
   }
}
