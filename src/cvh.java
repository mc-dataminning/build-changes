import java.util.List;
import javax.annotation.Nullable;

public class cvh extends cuc {
   private static final int a = 32;

   public cvh(cuc.a $$0) {
      super($$0);
   }

   @Override
   public cuh v() {
      cuh $$0 = super.v();
      $$0.a(this.o());
      if ($$0.a(ke.E) == null) {
         $$0.b(ke.E, new cwr(cws.a));
      }

      return $$0;
   }

   @Override
   public cuh a(cuh $$0, dca $$1, bso $$2) {
      cly $$3 = $$2 instanceof cly ? (cly)$$2 : null;
      if ($$3 instanceof aqu) {
         an.A.a((aqu)$$3, $$0);
      }

      if (!$$1.C) {
         cwr $$4 = $$0.a(ke.E, cwr.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avz.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fY()) {
         if ($$0.d()) {
            return new cuh(cuk.tI);
         }

         if ($$3 != null) {
            $$3.gl().f(new cuh(cuk.tI));
         }
      }

      $$2.a(dxv.l);
      return $$0;
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      cly $$3 = $$0.o();
      cuh $$4 = $$0.n();
      cwr $$5 = $$4.a(ke.E, cwr.a);
      dtc $$6 = $$1.a_($$2);
      if ($$0.k() != iw.a && $$6.a(awe.cl) && $$5.a(cws.a)) {
         $$1.a(null, $$2, avo.kv, avq.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cuj.a($$4, $$3, new cuh(cuk.tI)));
         $$3.b(avz.c.b($$4.f()));
         if (!$$1.C) {
            aqt $$7 = (aqt)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lb.ak, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avo.cG, avq.e, 1.0F, 1.0F);
         $$1.a(null, dxv.z, $$2);
         $$1.b($$2, dfe.uf.n());
         return bqa.a($$1.C);
      } else {
         return bqa.d;
      }
   }

   @Override
   public int b(cuh $$0) {
      return 32;
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.c;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      return cuj.a($$0, $$1, $$2);
   }

   @Override
   public String i(cuh $$0) {
      return cwp.a($$0.a(ke.E, cwr.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      cwr $$4 = $$0.a(ke.E);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }
}
