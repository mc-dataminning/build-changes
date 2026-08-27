import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aen<C extends bgr> implements aem<Integer> {
   private static final Logger d = LogUtils.getLogger();
   protected final cby a = new cby();
   protected cbt b;
   protected cfv<C> c;

   public aen(cfv<C> $$0) {
      this.c = $$0;
   }

   public void a(aks $$0, @Nullable cmk<? extends cmj<C>> $$1, boolean $$2) {
      if ($$1 != null && (!$$0.dL().X().b(cpr.v) || $$0.G().b($$1))) {
         this.b = $$0.fR();
         if (this.b() || $$0.f()) {
            this.a.a();
            $$0.fR().a(this.a);
            this.c.a(this.a);
            if (this.a.a((cmj<?>)$$1.b(), null)) {
               this.a($$1, $$2);
            } else {
               this.a();
               $$0.c.b(new yu($$0.bS.j, $$1));
            }

            $$0.fR().e();
         }
      }
   }

   protected void a() {
      for (int $$0 = 0; $$0 < this.c.p(); $$0++) {
         if (this.c.e($$0)) {
            cjf $$1 = this.c.b($$0).e().p();
            this.b.a($$1, false);
            this.c.b($$0).e($$1);
         }
      }

      this.c.l();
   }

   protected void a(cmk<? extends cmj<C>> $$0, boolean $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = this.a.a($$0, null);
      if ($$2) {
         for (int $$4 = 0; $$4 < this.c.o() * this.c.n() + 1; $$4++) {
            if ($$4 != this.c.m()) {
               cjf $$5 = this.c.b($$4).e();
               if (!$$5.b() && Math.min($$3, $$5.g()) < $$5.L() + 1) {
                  return;
               }
            }
         }
      }

      int $$6 = this.a($$1, $$3, $$2);
      IntList $$7 = new IntArrayList();
      if (this.a.a((cmj<?>)$$0.b(), $$7, $$6)) {
         int $$8 = $$6;
         IntListIterator var8 = $$7.iterator();

         while (var8.hasNext()) {
            int $$9 = (Integer)var8.next();
            int $$10 = cby.a($$9).g();
            if ($$10 < $$8) {
               $$8 = $$10;
            }
         }

         if (this.a.a((cmj<?>)$$0.b(), $$7, $$8)) {
            this.a();
            this.a(this.c.n(), this.c.o(), this.c.m(), $$0, $$7.iterator(), $$8);
         }
      }
   }

   @Override
   public void a(Iterator<Integer> $$0, int $$1, int $$2, int $$3, int $$4) {
      cgd $$5 = this.c.b($$1);
      cjf $$6 = cby.a($$0.next());
      if (!$$6.b()) {
         for (int $$7 = 0; $$7 < $$2; $$7++) {
            this.a($$5, $$6);
         }
      }
   }

   protected int a(boolean $$0, int $$1, boolean $$2) {
      int $$3 = 1;
      if ($$0) {
         $$3 = $$1;
      } else if ($$2) {
         $$3 = 64;

         for (int $$4 = 0; $$4 < this.c.n() * this.c.o() + 1; $$4++) {
            if ($$4 != this.c.m()) {
               cjf $$5 = this.c.b($$4).e();
               if (!$$5.b() && $$3 > $$5.L()) {
                  $$3 = $$5.L();
               }
            }
         }

         if ($$3 < 64) {
            $$3++;
         }
      }

      return $$3;
   }

   protected void a(cgd $$0, cjf $$1) {
      int $$2 = this.b.c($$1);
      if ($$2 != -1) {
         cjf $$3 = this.b.a($$2);
         if (!$$3.b()) {
            if ($$3.L() > 1) {
               this.b.a($$2, 1);
            } else {
               this.b.b($$2);
            }

            if ($$0.e().b()) {
               $$0.e($$3.c(1));
            } else {
               $$0.e().g(1);
            }
         }
      }
   }

   private boolean b() {
      List<cjf> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (int $$2 = 0; $$2 < this.c.n() * this.c.o() + 1; $$2++) {
         if ($$2 != this.c.m()) {
            cjf $$3 = this.c.b($$2).e().p();
            if (!$$3.b()) {
               int $$4 = this.b.d($$3);
               if ($$4 == -1 && $$0.size() <= $$1) {
                  for (cjf $$5 : $$0) {
                     if (cjf.b($$5, $$3) && $$5.L() != $$5.g() && $$5.L() + $$3.L() <= $$5.g()) {
                        $$5.g($$3.L());
                        $$3.f(0);
                        break;
                     }
                  }

                  if (!$$3.b()) {
                     if ($$0.size() >= $$1) {
                        return false;
                     }

                     $$0.add($$3);
                  }
               } else if ($$4 == -1) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private int c() {
      int $$0 = 0;

      for (cjf $$1 : this.b.i) {
         if ($$1.b()) {
            $$0++;
         }
      }

      return $$0;
   }
}
