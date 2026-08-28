import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhv {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 100;
   private static final int c = -1;
   private static final int d = 4;
   private static final int e = 4;
   private static final int f = 40;
   private static final int g = 60;
   private static final wu h = wu.c("chat.deleted_marker").a(n.h, n.u);
   private final ffw i;
   private final awt<String> j = new awt<>(100);
   private final List<ffq> k = Lists.newArrayList();
   private final List<ffq.a> l = Lists.newArrayList();
   private int m;
   private boolean n;
   private final List<fhv.a> o = new ArrayList<>();

   public fhv(ffw $$0) {
      this.i = $$0;
      this.j.addAll($$0.ba().a());
   }

   public void a() {
      if (!this.o.isEmpty()) {
         this.m();
      }
   }

   public void a(fhh $$0, int $$1, int $$2, int $$3, boolean $$4) {
      if (!this.l()) {
         int $$5 = this.j();
         int $$6 = this.l.size();
         if ($$6 > 0) {
            this.i.aH().a("chat");
            float $$7 = (float)this.h();
            int $$8 = ayg.f((float)this.f() / $$7);
            int $$9 = $$0.b();
            $$0.c().a();
            $$0.c().b($$7, $$7, 1.0F);
            $$0.c().a(4.0F, 0.0F, 0.0F);
            int $$10 = ayg.d((float)($$9 - 40) / $$7);
            int $$11 = this.d(this.c((double)$$2), this.d((double)$$3));
            double $$12 = this.i.m.n().c() * 0.9F + 0.1F;
            double $$13 = this.i.m.r().c();
            double $$14 = this.i.m.o().c();
            int $$15 = this.o();
            int $$16 = (int)Math.round(-8.0 * ($$14 + 1.0) + 4.0 * $$14);
            int $$17 = 0;

            for (int $$18 = 0; $$18 + this.m < this.l.size() && $$18 < $$5; $$18++) {
               int $$19 = $$18 + this.m;
               ffq.a $$20 = this.l.get($$19);
               if ($$20 != null) {
                  int $$21 = $$1 - $$20.a();
                  if ($$21 < 200 || $$4) {
                     double $$22 = $$4 ? 1.0 : b($$21);
                     int $$23 = (int)(255.0 * $$22 * $$12);
                     int $$24 = (int)(255.0 * $$22 * $$13);
                     $$17++;
                     if ($$23 > 3) {
                        int $$25 = 0;
                        int $$26 = $$10 - $$18 * $$15;
                        int $$27 = $$26 + $$16;
                        $$0.a(-4, $$26 - $$15, 0 + $$8 + 4 + 4, $$26, $$24 << 24);
                        ffr $$28 = $$20.c();
                        if ($$28 != null) {
                           int $$29 = $$28.e() | $$23 << 24;
                           $$0.a(-4, $$26 - $$15, -2, $$26, $$29);
                           if ($$19 == $$11 && $$28.f() != null) {
                              int $$30 = this.a($$20);
                              int $$31 = $$27 + 9;
                              this.a($$0, $$30, $$31, $$28.f());
                           }
                        }

                        $$0.c().a();
                        $$0.c().a(0.0F, 0.0F, 50.0F);
                        $$0.b(this.i.h, $$20.b(), 0, $$27, 16777215 + ($$23 << 24));
                        $$0.c().b();
                     }
                  }
               }
            }

            long $$32 = this.i.aW().c();
            if ($$32 > 0L) {
               int $$33 = (int)(128.0 * $$12);
               int $$34 = (int)(255.0 * $$13);
               $$0.c().a();
               $$0.c().a(0.0F, (float)$$10, 0.0F);
               $$0.a(-2, 0, $$8 + 4, 9, $$34 << 24);
               $$0.c().a(0.0F, 0.0F, 50.0F);
               $$0.b(this.i.h, wu.a("chat.queue", $$32), 0, 1, 16777215 + ($$33 << 24));
               $$0.c().b();
            }

            if ($$4) {
               int $$35 = this.o();
               int $$36 = $$6 * $$35;
               int $$37 = $$17 * $$35;
               int $$38 = this.m * $$37 / $$6 - $$10;
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
            this.i.aH().c();
         }
      }
   }

   private void a(fhh $$0, int $$1, int $$2, ffr.a $$3) {
      int $$4 = $$2 - $$3.d - 1;
      $$3.a($$0, $$1, $$4);
   }

   private int a(ffq.a $$0) {
      return this.i.h.a($$0.b()) + 4;
   }

   private boolean l() {
      return this.i.m.m().c() == cmj.c;
   }

   private static double b(int $$0) {
      double $$1 = (double)$$0 / 200.0;
      $$1 = 1.0 - $$1;
      $$1 *= 10.0;
      $$1 = ayg.a($$1, 0.0, 1.0);
      return $$1 * $$1;
   }

   public void a(boolean $$0) {
      this.i.aW().d();
      this.o.clear();
      this.l.clear();
      this.k.clear();
      if ($$0) {
         this.j.clear();
         this.j.addAll(this.i.ba().a());
      }
   }

   public void a(wu $$0) {
      this.a($$0, null, this.i.W() ? ffr.b() : ffr.a());
   }

   public void a(wu $$0, @Nullable xg $$1, @Nullable ffr $$2) {
      ffq $$3 = new ffq(this.i.l.e(), $$0, $$1, $$2);
      this.a($$3);
      this.b($$3);
      this.c($$3);
   }

   private void a(ffq $$0) {
      String $$1 = $$0.c().getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
      String $$2 = x.a($$0.e(), ffr::h);
      if ($$2 != null) {
         a.info("[{}] [CHAT] {}", $$2, $$1);
      } else {
         a.info("[CHAT] {}", $$1);
      }
   }

   private void b(ffq $$0) {
      int $$1 = ayg.a((double)this.f() / this.h());
      ffr.a $$2 = $$0.a();
      if ($$2 != null) {
         $$1 -= $$2.c + 4 + 2;
      }

      List<axs> $$3 = fhz.a($$0.c(), $$1, this.i.h);
      boolean $$4 = this.e();

      for (int $$5 = 0; $$5 < $$3.size(); $$5++) {
         axs $$6 = $$3.get($$5);
         if ($$4 && this.m > 0) {
            this.n = true;
            this.a(1);
         }

         boolean $$7 = $$5 == $$3.size() - 1;
         this.l.add(0, new ffq.a($$0.b(), $$6, $$0.e(), $$7));
      }

      while (this.l.size() > 100) {
         this.l.remove(this.l.size() - 1);
      }
   }

   private void c(ffq $$0) {
      this.k.add(0, $$0);

      while (this.k.size() > 100) {
         this.k.remove(this.k.size() - 1);
      }
   }

   private void m() {
      int $$0 = this.i.l.e();
      this.o.removeIf($$1 -> $$0 >= $$1.b() ? this.b($$1.a()) == null : false);
   }

   public void a(xg $$0) {
      fhv.a $$1 = this.b($$0);
      if ($$1 != null) {
         this.o.add($$1);
      }
   }

   @Nullable
   private fhv.a b(xg $$0) {
      int $$1 = this.i.l.e();
      ListIterator<ffq> $$2 = this.k.listIterator();

      while ($$2.hasNext()) {
         ffq $$3 = $$2.next();
         if ($$0.equals($$3.d())) {
            int $$4 = $$3.b() + 60;
            if ($$1 >= $$4) {
               $$2.set(this.d($$3));
               this.n();
               return null;
            }

            return new fhv.a($$0, $$4);
         }
      }

      return null;
   }

   private ffq d(ffq $$0) {
      return new ffq($$0.b(), h, null, ffr.a());
   }

   public void b() {
      this.d();
      this.n();
   }

   private void n() {
      this.l.clear();

      for (ffq $$0 : Lists.reverse(this.k)) {
         this.b($$0);
      }
   }

   public awt<String> c() {
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
         this.i.ba().a($$0);
      }
   }

   public void d() {
      this.m = 0;
      this.n = false;
   }

   public void a(int $$0) {
      this.m += $$0;
      int $$1 = this.l.size();
      if (this.m > $$1 - this.j()) {
         this.m = $$1 - this.j();
      }

      if (this.m <= 0) {
         this.m = 0;
         this.n = false;
      }
   }

   public boolean a(double $$0, double $$1) {
      if (this.e() && !this.i.m.Y && !this.l()) {
         fzf $$2 = this.i.aW();
         if ($$2.c() == 0L) {
            return false;
         } else {
            double $$3 = $$0 - 2.0;
            double $$4 = (double)this.i.aM().p() - $$1 - 40.0;
            if ($$3 <= (double)ayg.a((double)this.f() / this.h()) && $$4 < 0.0 && $$4 > (double)ayg.a(-9.0 * this.h())) {
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
   public xr b(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.e($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         ffq.a $$5 = this.l.get($$4);
         return this.i.h.b().a($$5.b(), ayg.a($$2));
      } else {
         return null;
      }
   }

   @Nullable
   public ffr c(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.d($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         ffq.a $$5 = this.l.get($$4);
         ffr $$6 = $$5.c();
         if ($$6 != null && this.a($$2, $$5, $$6)) {
            return $$6;
         }
      }

      return null;
   }

   private boolean a(double $$0, ffq.a $$1, ffr $$2) {
      if ($$0 < 0.0) {
         return true;
      } else {
         ffr.a $$3 = $$2.f();
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
      return $$0 / this.h() - 4.0;
   }

   private double d(double $$0) {
      double $$1 = (double)this.i.aM().p() - $$0 - 40.0;
      return $$1 / (this.h() * (double)this.o());
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
      if (this.e() && !this.l()) {
         if (!($$0 < -4.0) && !($$0 > (double)ayg.a((double)this.f() / this.h()))) {
            int $$2 = Math.min(this.j(), this.l.size());
            if ($$1 >= 0.0 && $$1 < (double)$$2) {
               int $$3 = ayg.a($$1 + (double)this.m);
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

   public boolean e() {
      return this.i.y instanceof fmh;
   }

   public int f() {
      return a(this.i.m.x().c());
   }

   public int g() {
      return b(this.e() ? this.i.m.z().c() : this.i.m.y().c());
   }

   public double h() {
      return this.i.m.w().c();
   }

   public static int a(double $$0) {
      int $$1 = 320;
      int $$2 = 40;
      return ayg.a($$0 * 280.0 + 40.0);
   }

   public static int b(double $$0) {
      int $$1 = 180;
      int $$2 = 20;
      return ayg.a($$0 * 160.0 + 20.0);
   }

   public static double i() {
      int $$0 = 180;
      int $$1 = 20;
      return 70.0 / (double)(b(1.0) - 20);
   }

   public int j() {
      return this.g() / this.o();
   }

   private int o() {
      return (int)(9.0 * (this.i.m.o().c() + 1.0));
   }

   public fhv.b k() {
      return new fhv.b(List.copyOf(this.k), List.copyOf(this.j), List.copyOf(this.o));
   }

   public void a(fhv.b $$0) {
      this.j.clear();
      this.j.addAll($$0.b);
      this.o.clear();
      this.o.addAll($$0.c);
      this.k.clear();
      this.k.addAll($$0.a);
      this.n();
   }

   static record a(xg a, int b) {
   }

   public static class b {
      final List<ffq> a;
      final List<String> b;
      final List<fhv.a> c;

      public b(List<ffq> $$0, List<String> $$1, List<fhv.a> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
