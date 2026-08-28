import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akp<C extends bqi> implements ako<Integer> {
   private static final Logger d = LogUtils.getLogger();
   protected final cmw a = new cmw();
   protected cmr b;
   protected crc<C> c;

   public akp(crc<C> $$0) {
      this.c = $$0;
   }

   public void a(arc $$0, @Nullable cys<? extends cyq<C>> $$1, boolean $$2) {
      if ($$1 != null && $$0.I().b($$1)) {
         this.b = $$0.gc();
         if (this.b() || $$0.f()) {
            this.a.a();
            $$0.gc().a(this.a);
            this.c.a(this.a);
            if (this.a.a((cyq<?>)$$1.b(), null)) {
               this.a($$1, $$2);
            } else {
               this.a();
               $$0.c.b(new aed($$0.cb.j, $$1));
            }

            $$0.gc().e();
         }
      }
   }

   protected void a() {
      for (int $$0 = 0; $$0 < this.c.p(); $$0++) {
         if (this.c.e($$0)) {
            cuk $$1 = this.c.b($$0).g().s();
            this.b.a($$1, false);
            this.c.b($$0).f($$1);
         }
      }

      this.c.l();
   }

   protected void a(cys<? extends cyq<C>> $$0, boolean $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = this.a.a($$0, null);
      if ($$2) {
         for (int $$4 = 0; $$4 < this.c.o() * this.c.n() + 1; $$4++) {
            if ($$4 != this.c.m()) {
               cuk $$5 = this.c.b($$4).g();
               if (!$$5.e() && Math.min($$3, $$5.j()) < $$5.I() + 1) {
                  return;
               }
            }
         }
      }

      int $$6 = this.a($$1, $$3, $$2);
      IntList $$7 = new IntArrayList();
      if (this.a.a((cyq<?>)$$0.b(), $$7, $$6)) {
         int $$8 = $$6;
         IntListIterator var8 = $$7.iterator();

         while (var8.hasNext()) {
            int $$9 = (Integer)var8.next();
            cuk $$10 = cmw.a($$9);
            if (!$$10.e()) {
               int $$11 = $$10.j();
               if ($$11 < $$8) {
                  $$8 = $$11;
               }
            }
         }

         if (this.a.a((cyq<?>)$$0.b(), $$7, $$8)) {
            this.a();
            this.a(this.c.n(), this.c.o(), this.c.m(), $$0, $$7.iterator(), $$8);
         }
      }
   }

   @Override
   public void a(Iterator<Integer> $$0, int $$1, int $$2, int $$3, int $$4) {
      crk $$5 = this.c.b($$1);
      cuk $$6 = cmw.a($$0.next());
      if (!$$6.e()) {
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
         $$3 = Integer.MAX_VALUE;

         for (int $$4 = 0; $$4 < this.c.n() * this.c.o() + 1; $$4++) {
            if ($$4 != this.c.m()) {
               cuk $$5 = this.c.b($$4).g();
               if (!$$5.e() && $$3 > $$5.I()) {
                  $$3 = $$5.I();
               }
            }
         }

         if ($$3 != Integer.MAX_VALUE) {
            $$3++;
         }
      }

      return $$3;
   }

   protected void a(crk $$0, cuk $$1) {
      int $$2 = this.b.d($$1);
      if ($$2 != -1) {
         cuk $$3 = this.b.a($$2);
         if (!$$3.e()) {
            if ($$3.I() > 1) {
               this.b.a($$2, 1);
            } else {
               this.b.b($$2);
            }

            if ($$0.g().e()) {
               $$0.f($$3.c(1));
            } else {
               $$0.g().g(1);
            }
         }
      }
   }

   private boolean b() {
      List<cuk> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (int $$2 = 0; $$2 < this.c.n() * this.c.o() + 1; $$2++) {
         if ($$2 != this.c.m()) {
            cuk $$3 = this.c.b($$2).g().s();
            if (!$$3.e()) {
               int $$4 = this.b.e($$3);
               if ($$4 == -1 && $$0.size() <= $$1) {
                  for (cuk $$5 : $$0) {
                     if (cuk.b($$5, $$3) && $$5.I() != $$5.j() && $$5.I() + $$3.I() <= $$5.j()) {
                        $$5.g($$3.I());
                        $$3.e(0);
                        break;
                     }
                  }

                  if (!$$3.e()) {
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

      for (cuk $$1 : this.b.h) {
         if ($$1.e()) {
            $$0++;
         }
      }

      return $$0;
   }
}
