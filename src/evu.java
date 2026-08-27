import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class evu implements gfs {
   private static final long a = 3000L;
   private final esr b;
   private final List<evu.a> c = Lists.newArrayList();
   private boolean d;

   public evu(esr $$0) {
      this.b = $$0;
   }

   public void a(eub $$0) {
      if (!this.d && this.b.m.T().c()) {
         this.b.ah().a(this);
         this.d = true;
      } else if (this.d && !this.b.m.T().c()) {
         this.b.ah().b(this);
         this.d = false;
      }

      if (this.d && !this.c.isEmpty()) {
         eji $$1 = new eji(this.b.s.dq(), this.b.s.du(), this.b.s.dw());
         eji $$2 = new eji(0.0, 0.0, -1.0).a(-this.b.s.dD() * (float) (Math.PI / 180.0)).b(-this.b.s.dB() * (float) (Math.PI / 180.0));
         eji $$3 = new eji(0.0, 1.0, 0.0).a(-this.b.s.dD() * (float) (Math.PI / 180.0)).b(-this.b.s.dB() * (float) (Math.PI / 180.0));
         eji $$4 = $$2.c($$3);
         int $$5 = 0;
         int $$6 = 0;
         double $$7 = this.b.m.z().c();
         Iterator<evu.a> $$8 = this.c.iterator();

         while ($$8.hasNext()) {
            evu.a $$9 = $$8.next();
            if ((double)$$9.b() + 3000.0 * $$7 <= (double)ac.b()) {
               $$8.remove();
            } else {
               $$6 = Math.max($$6, this.b.h.a($$9.a()));
            }
         }

         $$6 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");

         for (evu.a $$10 : this.c) {
            int $$11 = 255;
            ur $$12 = $$10.a();
            eji $$13 = $$10.c().d($$1).d();
            double $$14 = -$$4.b($$13);
            double $$15 = -$$2.b($$13);
            boolean $$16 = $$15 > 0.5;
            int $$17 = $$6 / 2;
            int $$18 = 9;
            int $$19 = $$18 / 2;
            float $$20 = 1.0F;
            int $$21 = this.b.h.a($$12);
            int $$22 = ati.d(ati.b(255.0F, 75.0F, (float)(ac.b() - $$10.b()) / (float)(3000.0 * $$7)));
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
   public void a(gep $$0, gfu $$1) {
      if ($$1.a() != null) {
         ur $$2 = $$1.a();
         if (!this.c.isEmpty()) {
            for (evu.a $$3 : this.c) {
               if ($$3.a().equals($$2)) {
                  $$3.a(new eji($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new evu.a($$2, new eji($$0.h(), $$0.i(), $$0.j())));
      }
   }

   public static class a {
      private final ur a;
      private long b;
      private eji c;

      public a(ur $$0, eji $$1) {
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

      public eji c() {
         return this.c;
      }

      public void a(eji $$0) {
         this.c = $$0;
         this.b = ac.b();
      }
   }
}
