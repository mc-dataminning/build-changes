import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class etn implements gdf {
   private static final long a = 3000L;
   private final eql b;
   private final List<etn.a> c = Lists.newArrayList();
   private boolean d;

   public etn(eql $$0) {
      this.b = $$0;
   }

   public void a(erv $$0) {
      if (!this.d && this.b.m.S().c()) {
         this.b.ai().a(this);
         this.d = true;
      } else if (this.d && !this.b.m.S().c()) {
         this.b.ai().b(this);
         this.d = false;
      }

      if (this.d && !this.c.isEmpty()) {
         ehd $$1 = new ehd(this.b.s.dp(), this.b.s.dt(), this.b.s.dv());
         ehd $$2 = new ehd(0.0, 0.0, -1.0).a(-this.b.s.dC() * (float) (Math.PI / 180.0)).b(-this.b.s.dA() * (float) (Math.PI / 180.0));
         ehd $$3 = new ehd(0.0, 1.0, 0.0).a(-this.b.s.dC() * (float) (Math.PI / 180.0)).b(-this.b.s.dA() * (float) (Math.PI / 180.0));
         ehd $$4 = $$2.c($$3);
         int $$5 = 0;
         int $$6 = 0;
         double $$7 = this.b.m.y().c();
         Iterator<etn.a> $$8 = this.c.iterator();

         while ($$8.hasNext()) {
            etn.a $$9 = $$8.next();
            if ((double)$$9.b() + 3000.0 * $$7 <= (double)ac.b()) {
               $$8.remove();
            } else {
               $$6 = Math.max($$6, this.b.h.a($$9.a()));
            }
         }

         $$6 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");

         for (etn.a $$10 : this.c) {
            int $$11 = 255;
            tf $$12 = $$10.a();
            ehd $$13 = $$10.c().d($$1).d();
            double $$14 = -$$4.b($$13);
            double $$15 = -$$2.b($$13);
            boolean $$16 = $$15 > 0.5;
            int $$17 = $$6 / 2;
            int $$18 = 9;
            int $$19 = $$18 / 2;
            float $$20 = 1.0F;
            int $$21 = this.b.h.a($$12);
            int $$22 = arp.d(arp.b(255.0F, 75.0F, (float)(ac.b() - $$10.b()) / (float)(3000.0 * $$7)));
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
   public void a(gcc $$0, gdh $$1) {
      if ($$1.a() != null) {
         tf $$2 = $$1.a();
         if (!this.c.isEmpty()) {
            for (etn.a $$3 : this.c) {
               if ($$3.a().equals($$2)) {
                  $$3.a(new ehd($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new etn.a($$2, new ehd($$0.h(), $$0.i(), $$0.j())));
      }
   }

   public static class a {
      private final tf a;
      private long b;
      private ehd c;

      public a(tf $$0, ehd $$1) {
         this.a = $$0;
         this.c = $$1;
         this.b = ac.b();
      }

      public tf a() {
         return this.a;
      }

      public long b() {
         return this.b;
      }

      public ehd c() {
         return this.c;
      }

      public void a(ehd $$0) {
         this.c = $$0;
         this.b = ac.b();
      }
   }
}
