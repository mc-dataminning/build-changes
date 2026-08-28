import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fik implements gts {
   private static final long a = 3000L;
   private final ffd b;
   private final List<fik.a> c = Lists.newArrayList();
   private boolean d;
   private final List<fik.a> e = new ArrayList<>();

   public fik(ffd $$0) {
      this.b = $$0;
   }

   public void a(fgp $$0) {
      gtt $$1 = this.b.aj();
      if (!this.d && this.b.m.W().c()) {
         $$1.a(this);
         this.d = true;
      } else if (this.d && !this.b.m.W().c()) {
         $$1.b(this);
         this.d = false;
      }

      if (this.d) {
         exu $$2 = $$1.b();
         evp $$3 = $$2.b();
         evp $$4 = $$2.c();
         evp $$5 = $$2.a();
         this.e.clear();

         for (fik.a $$6 : this.c) {
            if ($$6.b($$3)) {
               this.e.add($$6);
            }
         }

         if (!this.e.isEmpty()) {
            int $$7 = 0;
            int $$8 = 0;
            double $$9 = this.b.m.B().c();
            Iterator<fik.a> $$10 = this.e.iterator();

            while ($$10.hasNext()) {
               fik.a $$11 = $$10.next();
               if ((double)$$11.b() + 3000.0 * $$9 <= (double)ac.c()) {
                  $$10.remove();
               } else {
                  $$8 = Math.max($$8, this.b.h.a($$11.a()));
               }
            }

            $$8 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");

            for (fik.a $$12 : this.e) {
               int $$13 = 255;
               xo $$14 = $$12.a();
               evp $$15 = $$12.c().d($$3).d();
               double $$16 = $$5.b($$15);
               double $$17 = $$4.b($$15);
               boolean $$18 = $$17 > 0.5;
               int $$19 = $$8 / 2;
               int $$20 = 9;
               int $$21 = $$20 / 2;
               float $$22 = 1.0F;
               int $$23 = this.b.h.a($$14);
               int $$24 = ayx.d(ayx.b(255.0F, 75.0F, (float)(ac.c() - $$12.b()) / (float)(3000.0 * $$9)));
               int $$25 = $$24 << 16 | $$24 << 8 | $$24;
               $$0.c().a();
               $$0.c().a((float)$$0.a() - (float)$$19 * 1.0F - 2.0F, (float)($$0.b() - 35) - (float)($$7 * ($$20 + 1)) * 1.0F, 0.0F);
               $$0.c().b(1.0F, 1.0F, 1.0F);
               $$0.a(-$$19 - 1, -$$21 - 1, $$19 + 1, $$21 + 1, this.b.m.b(0.8F));
               int $$26 = $$25 + -16777216;
               if (!$$18) {
                  if ($$16 > 0.0) {
                     $$0.b(this.b.h, ">", $$19 - this.b.h.b(">"), -$$21, $$26);
                  } else if ($$16 < 0.0) {
                     $$0.b(this.b.h, "<", -$$19, -$$21, $$26);
                  }
               }

               $$0.b(this.b.h, $$14, -$$23 / 2, -$$21, $$26);
               $$0.c().b();
               $$7++;
            }
         }
      }
   }

   @Override
   public void a(gsl $$0, gtu $$1, float $$2) {
      if ($$1.a() != null) {
         xo $$3 = $$1.a();
         if (!this.c.isEmpty()) {
            for (fik.a $$4 : this.c) {
               if ($$4.a().equals($$3)) {
                  $$4.a(new evp($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new fik.a($$3, $$2, new evp($$0.h(), $$0.i(), $$0.j())));
      }
   }

   public static class a {
      private final xo a;
      private final float b;
      private long c;
      private evp d;

      public a(xo $$0, float $$1, evp $$2) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.c = ac.c();
      }

      public xo a() {
         return this.a;
      }

      public long b() {
         return this.c;
      }

      public evp c() {
         return this.d;
      }

      public void a(evp $$0) {
         this.d = $$0;
         this.c = ac.c();
      }

      public boolean b(evp $$0) {
         return Float.isInfinite(this.b) || $$0.a((js)this.d, (double)this.b);
      }
   }
}
