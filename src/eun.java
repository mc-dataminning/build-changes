import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eun {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 100;
   private static final int c = -1;
   private static final int d = 4;
   private static final int e = 4;
   private static final int f = 40;
   private static final int g = 60;
   private static final ur h = ur.c("chat.deleted_marker").a(n.h, n.u);
   private final esr i;
   private final ary<String> j = new ary<>(100);
   private final List<esl> k = Lists.newArrayList();
   private final List<esl.a> l = Lists.newArrayList();
   private int m;
   private boolean n;
   private final List<eun.a> o = new ArrayList<>();

   public eun(esr $$0) {
      this.i = $$0;
      this.j.addAll($$0.aZ().a());
   }

   public void a() {
      if (!this.o.isEmpty()) {
         this.k();
      }
   }

   public void a(eub $$0, int $$1, int $$2, int $$3) {
      if (!this.j()) {
         int $$4 = this.i();
         int $$5 = this.l.size();
         if ($$5 > 0) {
            boolean $$6 = this.m();
            float $$7 = (float)this.g();
            int $$8 = ati.f((float)this.e() / $$7);
            int $$9 = $$0.b();
            $$0.c().a();
            $$0.c().b($$7, $$7, 1.0F);
            $$0.c().a(4.0F, 0.0F, 0.0F);
            int $$10 = ati.d((float)($$9 - 40) / $$7);
            int $$11 = this.d(this.c((double)$$2), this.d((double)$$3));
            double $$12 = this.i.m.n().c() * 0.9F + 0.1F;
            double $$13 = this.i.m.p().c();
            double $$14 = this.i.m.o().c();
            int $$15 = this.n();
            int $$16 = (int)Math.round(-8.0 * ($$14 + 1.0) + 4.0 * $$14);
            int $$17 = 0;

            for (int $$18 = 0; $$18 + this.m < this.l.size() && $$18 < $$4; $$18++) {
               int $$19 = $$18 + this.m;
               esl.a $$20 = this.l.get($$19);
               if ($$20 != null) {
                  int $$21 = $$1 - $$20.a();
                  if ($$21 < 200 || $$6) {
                     double $$22 = $$6 ? 1.0 : b($$21);
                     int $$23 = (int)(255.0 * $$22 * $$12);
                     int $$24 = (int)(255.0 * $$22 * $$13);
                     $$17++;
                     if ($$23 > 3) {
                        int $$25 = 0;
                        int $$26 = $$10 - $$18 * $$15;
                        int $$27 = $$26 + $$16;
                        $$0.c().a();
                        $$0.c().a(0.0F, 0.0F, 50.0F);
                        $$0.a(-4, $$26 - $$15, 0 + $$8 + 4 + 4, $$26, $$24 << 24);
                        esm $$28 = $$20.c();
                        if ($$28 != null) {
                           int $$29 = $$28.e() | $$23 << 24;
                           $$0.a(-4, $$26 - $$15, -2, $$26, $$29);
                           if ($$19 == $$11 && $$28.f() != null) {
                              int $$30 = this.a($$20);
                              int $$31 = $$27 + 9;
                              this.a($$0, $$30, $$31, $$28.f());
                           }
                        }

                        $$0.c().a(0.0F, 0.0F, 50.0F);
                        $$0.b(this.i.h, $$20.b(), 0, $$27, 16777215 + ($$23 << 24));
                        $$0.c().b();
                     }
                  }
               }
            }

            long $$32 = this.i.aV().c();
            if ($$32 > 0L) {
               int $$33 = (int)(128.0 * $$12);
               int $$34 = (int)(255.0 * $$13);
               $$0.c().a();
               $$0.c().a(0.0F, (float)$$10, 50.0F);
               $$0.a(-2, 0, $$8 + 4, 9, $$34 << 24);
               $$0.c().a(0.0F, 0.0F, 50.0F);
               $$0.b(this.i.h, ur.a("chat.queue", $$32), 0, 1, 16777215 + ($$33 << 24));
               $$0.c().b();
            }

            if ($$6) {
               int $$35 = this.n();
               int $$36 = $$5 * $$35;
               int $$37 = $$17 * $$35;
               int $$38 = this.m * $$37 / $$5 - $$10;
               int $$39 = $$37 * $$37 / $$36;
               if ($$36 != $$37) {
                  int $$40 = $$38 > 0 ? 170 : 96;
                  int $$41 = this.n ? 13382451 : 3355562;
                  int $$42 = $$8 + 4;
                  $$0.a($$42, -$$38, $$42 + 2, -$$38 - $$39, 100, $$41 + ($$40 << 24));
                  $$0.a($$42 + 2, -$$38, $$42 + 1, -$$38 - $$39, 100, 13421772 + ($$40 << 24));
               }
            }

            $$0.c().b();
         }
      }
   }

   private void a(eub $$0, int $$1, int $$2, esm.a $$3) {
      int $$4 = $$2 - $$3.d - 1;
      $$3.a($$0, $$1, $$4);
   }

   private int a(esl.a $$0) {
      return this.i.h.a($$0.b()) + 4;
   }

   private boolean j() {
      return this.i.m.m().c() == cdk.c;
   }

   private static double b(int $$0) {
      double $$1 = (double)$$0 / 200.0;
      $$1 = 1.0 - $$1;
      $$1 *= 10.0;
      $$1 = ati.a($$1, 0.0, 1.0);
      return $$1 * $$1;
   }

   public void a(boolean $$0) {
      this.i.aV().d();
      this.o.clear();
      this.l.clear();
      this.k.clear();
      if ($$0) {
         this.j.clear();
         this.j.addAll(this.i.aZ().a());
      }
   }

   public void a(ur $$0) {
      this.a($$0, null, this.i.T() ? esm.b() : esm.a());
   }

   public void a(ur $$0, @Nullable vd $$1, @Nullable esm $$2) {
      this.a($$0, $$2);
      this.a($$0, $$1, this.i.l.e(), $$2, false);
   }

   private void a(ur $$0, @Nullable esm $$1) {
      String $$2 = $$0.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
      String $$3 = x.a($$1, esm::h);
      if ($$3 != null) {
         a.info("[{}] [CHAT] {}", $$3, $$2);
      } else {
         a.info("[CHAT] {}", $$2);
      }
   }

   private void a(ur $$0, @Nullable vd $$1, int $$2, @Nullable esm $$3, boolean $$4) {
      int $$5 = ati.a((double)this.e() / this.g());
      if ($$3 != null && $$3.f() != null) {
         $$5 -= $$3.f().c + 4 + 2;
      }

      List<asu> $$6 = eur.a($$0, $$5, this.i.h);
      boolean $$7 = this.m();

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         asu $$9 = $$6.get($$8);
         if ($$7 && this.m > 0) {
            this.n = true;
            this.a(1);
         }

         boolean $$10 = $$8 == $$6.size() - 1;
         this.l.add(0, new esl.a($$2, $$9, $$3, $$10));
      }

      while (this.l.size() > 100) {
         this.l.remove(this.l.size() - 1);
      }

      if (!$$4) {
         this.k.add(0, new esl($$2, $$0, $$1, $$3));

         while (this.k.size() > 100) {
            this.k.remove(this.k.size() - 1);
         }
      }
   }

   private void k() {
      int $$0 = this.i.l.e();
      this.o.removeIf($$1 -> $$0 >= $$1.b() ? this.b($$1.a()) == null : false);
   }

   public void a(vd $$0) {
      eun.a $$1 = this.b($$0);
      if ($$1 != null) {
         this.o.add($$1);
      }
   }

   @Nullable
   private eun.a b(vd $$0) {
      int $$1 = this.i.l.e();
      ListIterator<esl> $$2 = this.k.listIterator();

      while ($$2.hasNext()) {
         esl $$3 = $$2.next();
         if ($$0.equals($$3.c())) {
            int $$4 = $$3.a() + 60;
            if ($$1 >= $$4) {
               $$2.set(this.a($$3));
               this.l();
               return null;
            }

            return new eun.a($$0, $$4);
         }
      }

      return null;
   }

   private esl a(esl $$0) {
      return new esl($$0.a(), h, null, esm.a());
   }

   public void b() {
      this.d();
      this.l();
   }

   private void l() {
      this.l.clear();

      for (int $$0 = this.k.size() - 1; $$0 >= 0; $$0--) {
         esl $$1 = this.k.get($$0);
         this.a($$1.b(), $$1.c(), $$1.a(), $$1.d(), true);
      }
   }

   public ary<String> c() {
      return this.j;
   }

   public void a(String $$0) {
      if (!$$0.equals(this.j.peekLast())) {
         if (this.j.size() >= 100) {
            this.j.removeFirst();
         }

         this.j.addLast($$0);
      }

      if ($$0.startsWith("/")) {
         this.i.aZ().a($$0);
      }
   }

   public void d() {
      this.m = 0;
      this.n = false;
   }

   public void a(int $$0) {
      this.m += $$0;
      int $$1 = this.l.size();
      if (this.m > $$1 - this.i()) {
         this.m = $$1 - this.i();
      }

      if (this.m <= 0) {
         this.m = 0;
         this.n = false;
      }
   }

   public boolean a(double $$0, double $$1) {
      if (this.m() && !this.i.m.Z && !this.j()) {
         flk $$2 = this.i.aV();
         if ($$2.c() == 0L) {
            return false;
         } else {
            double $$3 = $$0 - 2.0;
            double $$4 = (double)this.i.aL().p() - $$1 - 40.0;
            if ($$3 <= (double)ati.a((double)this.e() / this.g()) && $$4 < 0.0 && $$4 > (double)ati.a(-9.0 * this.g())) {
               $$2.b();
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Nullable
   public vo b(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.e($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         esl.a $$5 = this.l.get($$4);
         return this.i.h.b().a($$5.b(), ati.a($$2));
      } else {
         return null;
      }
   }

   @Nullable
   public esm c(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.d($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         esl.a $$5 = this.l.get($$4);
         esm $$6 = $$5.c();
         if ($$6 != null && this.a($$2, $$5, $$6)) {
            return $$6;
         }
      }

      return null;
   }

   private boolean a(double $$0, esl.a $$1, esm $$2) {
      if ($$0 < 0.0) {
         return true;
      } else {
         esm.a $$3 = $$2.f();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.a($$1);
            int $$5 = $$4 + $$3.c;
            return $$0 >= (double)$$4 && $$0 <= (double)$$5;
         }
      }
   }

   private double c(double $$0) {
      return $$0 / this.g() - 4.0;
   }

   private double d(double $$0) {
      double $$1 = (double)this.i.aL().p() - $$0 - 40.0;
      return $$1 / (this.g() * (double)this.n());
   }

   private int d(double $$0, double $$1) {
      int $$2 = this.e($$0, $$1);
      if ($$2 == -1) {
         return -1;
      } else {
         while ($$2 >= 0) {
            if (this.l.get($$2).d()) {
               return $$2;
            }

            $$2--;
         }

         return $$2;
      }
   }

   private int e(double $$0, double $$1) {
      if (this.m() && !this.i.m.Z && !this.j()) {
         if (!($$0 < -4.0) && !($$0 > (double)ati.a((double)this.e() / this.g()))) {
            int $$2 = Math.min(this.i(), this.l.size());
            if ($$1 >= 0.0 && $$1 < (double)$$2) {
               int $$3 = ati.a($$1 + (double)this.m);
               if ($$3 >= 0 && $$3 < this.l.size()) {
                  return $$3;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private boolean m() {
      return this.i.y instanceof eyy;
   }

   public int e() {
      return a(this.i.m.v().c());
   }

   public int f() {
      return b(this.m() ? this.i.m.x().c() : this.i.m.w().c());
   }

   public double g() {
      return this.i.m.u().c();
   }

   public static int a(double $$0) {
      int $$1 = 320;
      int $$2 = 40;
      return ati.a($$0 * 280.0 + 40.0);
   }

   public static int b(double $$0) {
      int $$1 = 180;
      int $$2 = 20;
      return ati.a($$0 * 160.0 + 20.0);
   }

   public static double h() {
      int $$0 = 180;
      int $$1 = 20;
      return 70.0 / (double)(b(1.0) - 20);
   }

   public int i() {
      return this.f() / this.n();
   }

   private int n() {
      return (int)(9.0 * (this.i.m.o().c() + 1.0));
   }

   static record a(vd a, int b) {
   }
}
