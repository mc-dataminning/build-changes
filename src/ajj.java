import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ajj<C extends bny> implements aji<Integer> {
   private static final Logger d = LogUtils.getLogger();
   protected final cke a = new cke();
   protected cjz b;
   protected coj<C> c;

   public ajj(coj<C> $$0) {
      this.c = $$0;
   }

   public void a(apv $$0, @Nullable cvu<? extends cvs<C>> $$1, boolean $$2) {
      if ($$1 != null && $$0.I().b($$1)) {
         this.b = $$0.fZ();
         if (this.b() || $$0.f()) {
            this.a.a();
            $$0.fZ().a(this.a);
            this.c.a(this.a);
            if (this.a.a((cvs<?>)$$1.b(), null)) {
               this.a($$1, $$2);
            } else {
               this.a();
               $$0.d.b(new acz($$0.ca.j, $$1));
            }

            $$0.fZ().e();
         }
      }
   }

   protected void a() {
      for (int $$0 = 0; $$0 < this.c.p(); $$0++) {
         if (this.c.e($$0)) {
            crs $$1 = this.c.b($$0).g().r();
            this.b.a($$1, false);
            this.c.b($$0).f($$1);
         }
      }

      this.c.l();
   }

   protected void a(cvu<? extends cvs<C>> $$0, boolean $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = this.a.a($$0, null);
      if ($$2) {
         for (int $$4 = 0; $$4 < this.c.o() * this.c.n() + 1; $$4++) {
            if ($$4 != this.c.m()) {
               crs $$5 = this.c.b($$4).g();
               if (!$$5.d() && Math.min($$3, $$5.i()) < $$5.G() + 1) {
                  return;
               }
            }
         }
      }

      int $$6 = this.a($$1, $$3, $$2);
      IntList $$7 = new IntArrayList();
      if (this.a.a((cvs<?>)$$0.b(), $$7, $$6)) {
         int $$8 = $$6;
         IntListIterator var8 = $$7.iterator();

         while (var8.hasNext()) {
            int $$9 = (Integer)var8.next();
            int $$10 = cke.a($$9).i();
            if ($$10 < $$8) {
               $$8 = $$10;
            }
         }

         if (this.a.a((cvs<?>)$$0.b(), $$7, $$8)) {
            this.a();
            this.a(this.c.n(), this.c.o(), this.c.m(), $$0, $$7.iterator(), $$8);
         }
      }
   }

   @Override
   public void a(Iterator<Integer> $$0, int $$1, int $$2, int $$3, int $$4) {
      cos $$5 = this.c.b($$1);
      crs $$6 = cke.a($$0.next());
      if (!$$6.d()) {
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
               crs $$5 = this.c.b($$4).g();
               if (!$$5.d() && $$3 > $$5.G()) {
                  $$3 = $$5.G();
               }
            }
         }

         if ($$3 < 64) {
            $$3++;
         }
      }

      return $$3;
   }

   protected void a(cos $$0, crs $$1) {
      int $$2 = this.b.c($$1);
      if ($$2 != -1) {
         crs $$3 = this.b.a($$2);
         if (!$$3.d()) {
            if ($$3.G() > 1) {
               this.b.a($$2, 1);
            } else {
               this.b.b($$2);
            }

            if ($$0.g().d()) {
               $$0.f($$3.c(1));
            } else {
               $$0.g().f(1);
            }
         }
      }
   }

   private boolean b() {
      List<crs> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (int $$2 = 0; $$2 < this.c.n() * this.c.o() + 1; $$2++) {
         if ($$2 != this.c.m()) {
            crs $$3 = this.c.b($$2).g().r();
            if (!$$3.d()) {
               int $$4 = this.b.d($$3);
               if ($$4 == -1 && $$0.size() <= $$1) {
                  for (crs $$5 : $$0) {
                     if (crs.b($$5, $$3) && $$5.G() != $$5.i() && $$5.G() + $$3.G() <= $$5.i()) {
                        $$5.f($$3.G());
                        $$3.e(0);
                        break;
                     }
                  }

                  if (!$$3.d()) {
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

      for (crs $$1 : this.b.i) {
         if ($$1.d()) {
            $$0++;
         }
      }

      return $$0;
   }
}
