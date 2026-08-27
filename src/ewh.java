import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class ewh implements ggf {
   private static final long a = 3000L;
   private final etd b;
   private final List<ewh.a> c = Lists.newArrayList();
   private boolean d;

   public ewh(etd $$0) {
      this.b = $$0;
   }

   public void a(euo $$0) {
      if (!this.d && this.b.m.T().c()) {
         this.b.ah().a(this);
         this.d = true;
      } else if (this.d && !this.b.m.T().c()) {
         this.b.ah().b(this);
         this.d = false;
      }

      if (this.d && !this.c.isEmpty()) {
         eju $$1 = new eju(this.b.s.ds(), this.b.s.dw(), this.b.s.dy());
         eju $$2 = new eju(0.0, 0.0, -1.0).a(-this.b.s.dF() * (float) (Math.PI / 180.0)).b(-this.b.s.dD() * (float) (Math.PI / 180.0));
         eju $$3 = new eju(0.0, 1.0, 0.0).a(-this.b.s.dF() * (float) (Math.PI / 180.0)).b(-this.b.s.dD() * (float) (Math.PI / 180.0));
         eju $$4 = $$2.c($$3);
         int $$5 = 0;
         int $$6 = 0;
         double $$7 = this.b.m.z().c();
         Iterator<ewh.a> $$8 = this.c.iterator();

         while ($$8.hasNext()) {
            ewh.a $$9 = $$8.next();
            if ((double)$$9.b() + 3000.0 * $$7 <= (double)ac.b()) {
               $$8.remove();
            } else {
               $$6 = Math.max($$6, this.b.h.a($$9.a()));
            }
         }

         $$6 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");

         for (ewh.a $$10 : this.c) {
            int $$11 = 255;
            ur $$12 = $$10.a();
            eju $$13 = $$10.c().d($$1).d();
            double $$14 = -$$4.b($$13);
            double $$15 = -$$2.b($$13);
            boolean $$16 = $$15 > 0.5;
            int $$17 = $$6 / 2;
            int $$18 = 9;
            int $$19 = $$18 / 2;
            float $$20 = 1.0F;
            int $$21 = this.b.h.a($$12);
            int $$22 = atm.d(atm.b(255.0F, 75.0F, (float)(ac.b() - $$10.b()) / (float)(3000.0 * $$7)));
            int $$23 = $$22 << 16 | $$22 << 8 | $$22;
            $$0.c().a();
            $$0.c().a((float)$$0.a() - (float)$$17 * 1.0F - 2.0F, (float)($$0.b() - 35) - (float)($$5 * ($$18 + 1)) * 1.0F, 0.0F);
            $$0.c().b(1.0F, 1.0F, 1.0F);
            $$0.a(-$$17 - 1, -$$19 - 1, $$17 + 1, $$19 + 1, this.b.m.b(0.8F));
            int $$24 = $$23 + -16777216;
            if (!$$16) {
               if ($$14 > 0.0) {
                  $$0.b(this.b.h, ">", $$17 - this.b.h.b(">"), -$$19, $$24);
               } else if ($$14 < 0.0) {
                  $$0.b(this.b.h, "<", -$$17, -$$19, $$24);
               }
            }

            $$0.b(this.b.h, $$12, -$$21 / 2, -$$19, $$24);
            $$0.c().b();
            $$5++;
         }
      }
   }

   @Override
   public void a(gfc $$0, ggh $$1) {
      if ($$1.a() != null) {
         ur $$2 = $$1.a();
         if (!this.c.isEmpty()) {
            for (ewh.a $$3 : this.c) {
               if ($$3.a().equals($$2)) {
                  $$3.a(new eju($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new ewh.a($$2, new eju($$0.h(), $$0.i(), $$0.j())));
      }
   }

   public static class a {
      private final ur a;
      private long b;
      private eju c;

      public a(ur $$0, eju $$1) {
         this.a = $$0;
         this.c = $$1;
         this.b = ac.b();
      }

      public ur a() {
         return this.a;
      }

      public long b() {
         return this.b;
      }

      public eju c() {
         return this.c;
      }

      public void a(eju $$0) {
         this.c = $$0;
         this.b = ac.b();
      }
   }
}
