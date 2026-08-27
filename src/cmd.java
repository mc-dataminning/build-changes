import java.util.List;
import javax.annotation.Nullable;

public class cmd extends clj {
   private static final int a = 32;

   public cmd(clj.a $$0) {
      super($$0);
   }

   @Override
   public clo an_() {
      return cnn.a(super.an_(), cno.c);
   }

   @Override
   public clo a(clo $$0, csf $$1, bll $$2) {
      cdz $$3 = $$2 instanceof cdz ? (cdz)$$2 : null;
      if ($$3 instanceof amj) {
         al.z.a((amj)$$3, $$0);
      }

      if (!$$1.B) {
         for (bki $$5 : cnn.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bki($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(arf.c.b(this));
         if (!$$3.fU().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fU().d) {
         if ($$0.b()) {
            return new clo(clr.si);
         }

         if ($$3 != null) {
            $$3.fT().e(new clo(clr.si));
         }
      }

      $$2.a(dlx.l);
      return $$0;
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      cdz $$3 = $$0.o();
      clo $$4 = $$0.n();
      dhn $$5 = $$1.a_($$2);
      if ($$0.k() != ib.a && $$5.a(ark.ca) && cnn.d($$4) == cno.c) {
         $$1.a(null, $$2, aqv.jv, aqw.e, 1.0F, 1.0F);
         $$3.a($$0.p(), clq.a($$4, $$3, new clo(clr.si)));
         $$3.b(arf.c.b($$4.d()));
         if (!$$1.B) {
            ami $$6 = (ami)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jw.ah, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aqv.ch, aqw.e, 1.0F, 1.0F);
         $$1.a(null, dlx.z, $$2);
         $$1.b($$2, cvh.sI.o());
         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   @Override
   public int b(clo $$0) {
      return 32;
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.c;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      return clq.a($$0, $$1, $$2);
   }

   @Override
   public String j(clo $$0) {
      return cnn.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      cnn.a($$0, $$2, 1.0F);
   }
}
