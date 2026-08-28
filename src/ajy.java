import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.List;
import javax.annotation.Nullable;

public class ajy<I extends cym, R extends cyj<I>> implements ajx<Integer> {
   private static final int d = -1;
   protected final cmp a = new cmp();
   protected cmk b;
   protected cqw<I, R> c;

   public ajy(cqw<I, R> $$0) {
      this.c = $$0;
   }

   public void a(aqn $$0, @Nullable cyl<R> $$1, boolean $$2) {
      if ($$1 != null && $$0.J().b($$1)) {
         this.b = $$0.ga();
         if (this.b() || $$0.f()) {
            this.a.a();
            $$0.ga().a(this.a);
            this.c.a(this.a);
            if (this.a.a($$1.b(), null)) {
               this.a($$1, $$2);
            } else {
               this.a();
               $$0.c.b(new adm($$0.ce.j, $$1));
            }

            $$0.ga().e();
         }
      }
   }

   protected void a() {
      for (int $$0 = 0; $$0 < this.c.p(); $$0++) {
         if (this.c.e($$0)) {
            cud $$1 = this.c.b($$0).g().s();
            this.b.a($$1, false);
            this.c.b($$0).f($$1);
         }
      }

      this.c.l();
   }

   protected void a(cyl<R> $$0, boolean $$1) {
      boolean $$2 = this.c.a($$0);
      int $$3 = this.a.a($$0, null);
      if ($$2) {
         for (int $$4 = 0; $$4 < this.c.o() * this.c.n() + 1; $$4++) {
            if ($$4 != this.c.m()) {
               cud $$5 = this.c.b($$4).g();
               if (!$$5.e() && Math.min($$3, $$5.j()) < $$5.H() + 1) {
                  return;
               }
            }
         }
      }

      int $$6 = this.a($$1, $$3, $$2);
      IntList $$7 = new IntArrayList();
      if (this.a.a($$0.b(), $$7, $$6)) {
         int $$8 = $$6;
         IntListIterator var8 = $$7.iterator();

         while (var8.hasNext()) {
            int $$9 = (Integer)var8.next();
            cud $$10 = cmp.a($$9);
            if (!$$10.e()) {
               int $$11 = $$10.j();
               if ($$11 < $$8) {
                  $$8 = $$11;
               }
            }
         }

         if (this.a.a($$0.b(), $$7, $$8)) {
            this.a();
            this.a(this.c.n(), this.c.o(), this.c.m(), $$0, $$7.iterator(), $$8);
         }
      }
   }

   public void a(Integer $$0, int $$1, int $$2, int $$3, int $$4) {
      cre $$5 = this.c.b($$1);
      cud $$6 = cmp.a($$0);
      if (!$$6.e()) {
         int $$7 = $$2;

         while ($$7 > 0) {
            $$7 = this.a($$5, $$6, $$7);
            if ($$7 == -1) {
               return;
            }
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
               cud $$5 = this.c.b($$4).g();
               if (!$$5.e() && $$3 > $$5.H()) {
                  $$3 = $$5.H();
               }
            }
         }

         if ($$3 != Integer.MAX_VALUE) {
            $$3++;
         }
      }

      return $$3;
   }

   protected int a(cre $$0, cud $$1, int $$2) {
      int $$3 = this.b.d($$1);
      if ($$3 == -1) {
         return -1;
      } else {
         cud $$4 = this.b.a($$3);
         int $$5;
         if ($$2 < $$4.H()) {
            this.b.a($$3, $$2);
            $$5 = $$2;
         } else {
            this.b.b($$3);
            $$5 = $$4.H();
         }

         if ($$0.g().e()) {
            $$0.f($$4.c($$5));
         } else {
            $$0.g().g($$5);
         }

         return $$2 - $$5;
      }
   }

   private boolean b() {
      List<cud> $$0 = Lists.newArrayList();
      int $$1 = this.c();

      for (int $$2 = 0; $$2 < this.c.n() * this.c.o() + 1; $$2++) {
         if ($$2 != this.c.m()) {
            cud $$3 = this.c.b($$2).g().s();
            if (!$$3.e()) {
               int $$4 = this.b.e($$3);
               if ($$4 == -1 && $$0.size() <= $$1) {
                  for (cud $$5 : $$0) {
                     if (cud.b($$5, $$3) && $$5.H() != $$5.j() && $$5.H() + $$3.H() <= $$5.j()) {
                        $$5.g($$3.H());
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

      for (cud $$1 : this.b.h) {
         if ($$1.e()) {
            $$0++;
         }
      }

      return $$0;
   }
}
