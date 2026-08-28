import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class fnl implements hef {
   private static final long a = 3000L;
   private final fke b;
   private final List<fnl.b> c = Lists.newArrayList();
   private boolean d;
   private final List<fnl.b> e = new ArrayList<>();

   public fnl(fke $$0) {
      this.b = $$0;
   }

   public void a(flq $$0) {
      heg $$1 = this.b.ak();
      if (!this.d && this.b.n.Y().c()) {
         $$1.a(this);
         this.d = true;
      } else if (this.d && !this.b.n.Y().c()) {
         $$1.b(this);
         this.d = false;
      }

      if (this.d) {
         fcg $$2 = $$1.b();
         ezy $$3 = $$2.b();
         ezy $$4 = $$2.c();
         ezy $$5 = $$2.a();
         this.e.clear();

         for (fnl.b $$6 : this.c) {
            if ($$6.c($$3)) {
               this.e.add($$6);
            }
         }

         if (!this.e.isEmpty()) {
            int $$7 = 0;
            int $$8 = 0;
            double $$9 = this.b.n.C().c();
            Iterator<fnl.b> $$10 = this.e.iterator();

            while ($$10.hasNext()) {
               fnl.b $$11 = $$10.next();
               $$11.a(3000.0 * $$9);
               if (!$$11.b()) {
                  $$10.remove();
               } else {
                  $$8 = Math.max($$8, this.b.h.a($$11.a()));
               }
            }

            $$8 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");

            for (fnl.b $$12 : this.e) {
               int $$13 = 255;
               xj $$14 = $$12.a();
               fnl.a $$15 = $$12.a($$3);
               if ($$15 != null) {
                  ezy $$16 = $$15.a.d($$3).d();
                  double $$17 = $$5.b($$16);
                  double $$18 = $$4.b($$16);
                  boolean $$19 = $$18 > 0.5;
                  int $$20 = $$8 / 2;
                  int $$21 = 9;
                  int $$22 = $$21 / 2;
                  float $$23 = 1.0F;
                  int $$24 = this.b.h.a($$14);
                  int $$25 = azm.d(azm.b(255.0F, 75.0F, (float)(ae.c() - $$15.b) / (float)(3000.0 * $$9)));
                  $$0.c().a();
                  $$0.c().a((float)$$0.a() - (float)$$20 * 1.0F - 2.0F, (float)($$0.b() - 35) - (float)($$7 * ($$21 + 1)) * 1.0F, 0.0F);
                  $$0.c().b(1.0F, 1.0F, 1.0F);
                  $$0.a(-$$20 - 1, -$$22 - 1, $$20 + 1, $$22 + 1, this.b.n.b(0.8F));
                  int $$26 = axx.a(255, $$25, $$25, $$25);
                  if (!$$19) {
                     if ($$17 > 0.0) {
                        $$0.b(this.b.h, ">", $$20 - this.b.h.b(">"), -$$22, $$26);
                     } else if ($$17 < 0.0) {
                        $$0.b(this.b.h, "<", -$$20, -$$22, $$26);
                     }
                  }

                  $$0.b(this.b.h, $$14, -$$24 / 2, -$$22, $$26);
                  $$0.c().b();
                  $$7++;
               }
            }
         }
      }
   }

   @Override
   public void a(hdb $$0, heh $$1, float $$2) {
      if ($$1.a() != null) {
         xj $$3 = $$1.a();
         if (!this.c.isEmpty()) {
            for (fnl.b $$4 : this.c) {
               if ($$4.a().equals($$3)) {
                  $$4.b(new ezy($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new fnl.b($$3, $$2, new ezy($$0.h(), $$0.i(), $$0.j())));
      }
   }

   static record a(ezy a, long b) {
   }

   static class b {
      private final xj a;
      private final float b;
      private final List<fnl.a> c = new ArrayList<>();

      public b(xj $$0, float $$1, ezy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c.add(new fnl.a($$2, ae.c()));
      }

      public xj a() {
         return this.a;
      }

      @Nullable
      public fnl.a a(ezy $$0) {
         if (this.c.isEmpty()) {
            return null;
         } else {
            return this.c.size() == 1 ? this.c.getFirst() : this.c.stream().min(Comparator.comparingDouble($$1 -> $$1.a().f($$0))).orElse(null);
         }
      }

      public void b(ezy $$0) {
         this.c.removeIf($$1 -> $$0.equals($$1.a()));
         this.c.add(new fnl.a($$0, ae.c()));
      }

      public boolean c(ezy $$0) {
         if (Float.isInfinite(this.b)) {
            return true;
         } else if (this.c.isEmpty()) {
            return false;
         } else {
            fnl.a $$1 = this.a($$0);
            return $$1 == null ? false : $$0.a((ka)$$1.a, (double)this.b);
         }
      }

      public void a(double $$0) {
         long $$1 = ae.c();
         this.c.removeIf($$2 -> (double)($$1 - $$2.b()) > $$0);
      }

      public boolean b() {
         return !this.c.isEmpty();
      }
   }
}
