import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fov {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 100;
   private static final int c = -1;
   private static final int d = 4;
   private static final int e = 4;
   private static final int f = 40;
   private static final int g = 60;
   private static final wp h = wp.c("chat.deleted_marker").a(n.h, n.u);
   private final flk i;
   private final axm<String> j = new axm<>(100);
   private final List<fld> k = Lists.newArrayList();
   private final List<fld.a> l = Lists.newArrayList();
   private int m;
   private boolean n;
   private final List<fov.a> o = new ArrayList<>();

   public fov(flk $$0) {
      this.i = $$0;
      this.j.addAll($$0.bd().a());
   }

   public void a() {
      if (!this.o.isEmpty()) {
         this.m();
      }
   }

   public void a(fof $$0, int $$1, int $$2, int $$3, boolean $$4) {
      if (!this.l()) {
         int $$5 = this.j();
         int $$6 = this.l.size();
         if ($$6 > 0) {
            bou $$7 = bot.a();
            $$7.a("chat");
            float $$8 = (float)this.h();
            int $$9 = ayz.f((float)this.f() / $$8);
            int $$10 = $$0.b();
            $$0.c().a();
            $$0.c().b($$8, $$8, 1.0F);
            $$0.c().a(4.0F, 0.0F, 0.0F);
            int $$11 = ayz.d((float)($$10 - 40) / $$8);
            int $$12 = this.d(this.c((double)$$2), this.d((double)$$3));
            double $$13 = this.i.n.o().c() * 0.9 + 0.1;
            double $$14 = this.i.n.s().c();
            double $$15 = this.i.n.p().c();
            int $$16 = this.o();
            int $$17 = (int)Math.round(-8.0 * ($$15 + 1.0) + 4.0 * $$15);
            int $$18 = 0;

            for (int $$19 = 0; $$19 + this.m < this.l.size() && $$19 < $$5; $$19++) {
               int $$20 = $$19 + this.m;
               fld.a $$21 = this.l.get($$20);
               if ($$21 != null) {
                  int $$22 = $$1 - $$21.a();
                  if ($$22 < 200 || $$4) {
                     double $$23 = $$4 ? 1.0 : b($$22);
                     int $$24 = (int)(255.0 * $$23 * $$13);
                     int $$25 = (int)(255.0 * $$23 * $$14);
                     $$18++;
                     if ($$24 > 3) {
                        int $$26 = 0;
                        int $$27 = $$11 - $$19 * $$16;
                        int $$28 = $$27 + $$17;
                        $$0.a(-4, $$27 - $$16, 0 + $$9 + 4 + 4, $$27, $$25 << 24);
                        fle $$29 = $$21.c();
                        if ($$29 != null) {
                           int $$30 = $$29.e() | $$24 << 24;
                           $$0.a(-4, $$27 - $$16, -2, $$27, $$30);
                           if ($$20 == $$12 && $$29.f() != null) {
                              int $$31 = this.a($$21);
                              int $$32 = $$28 + 9;
                              this.a($$0, $$31, $$32, $$29.f());
                           }
                        }

                        $$0.c().a();
                        $$0.c().a(0.0F, 0.0F, 50.0F);
                        $$0.b(this.i.h, $$21.b(), 0, $$28, axk.c($$24, -1));
                        $$0.c().b();
                     }
                  }
               }
            }

            long $$33 = this.i.aZ().c();
            if ($$33 > 0L) {
               int $$34 = (int)(128.0 * $$13);
               int $$35 = (int)(255.0 * $$14);
               $$0.c().a();
               $$0.c().a(0.0F, (float)$$11, 0.0F);
               $$0.a(-2, 0, $$9 + 4, 9, $$35 << 24);
               $$0.c().a(0.0F, 0.0F, 50.0F);
               $$0.b(this.i.h, wp.a("chat.queue", $$33), 0, 1, 16777215 + ($$34 << 24));
               $$0.c().b();
            }

            if ($$4) {
               int $$36 = this.o();
               int $$37 = $$6 * $$36;
               int $$38 = $$18 * $$36;
               int $$39 = this.m * $$38 / $$6 - $$11;
               int $$40 = $$38 * $$38 / $$37;
               if ($$37 != $$38) {
                  int $$41 = $$39 > 0 ? 170 : 96;
                  int $$42 = this.n ? 13382451 : 3355562;
                  int $$43 = $$9 + 4;
                  $$0.a($$43, -$$39, $$43 + 2, -$$39 - $$40, 100, $$42 + ($$41 << 24));
                  $$0.a($$43 + 2, -$$39, $$43 + 1, -$$39 - $$40, 100, 13421772 + ($$41 << 24));
               }
            }

            $$0.c().b();
            $$7.c();
         }
      }
   }

   private void a(fof $$0, int $$1, int $$2, fle.a $$3) {
      int $$4 = $$2 - $$3.d - 1;
      $$3.a($$0, $$1, $$4);
   }

   private int a(fld.a $$0) {
      return this.i.h.a($$0.b()) + 4;
   }

   private boolean l() {
      return this.i.n.n().c() == cov.c;
   }

   private static double b(int $$0) {
      double $$1 = (double)$$0 / 200.0;
      $$1 = 1.0 - $$1;
      $$1 *= 10.0;
      $$1 = ayz.a($$1, 0.0, 1.0);
      return $$1 * $$1;
   }

   public void a(boolean $$0) {
      this.i.aZ().d();
      this.o.clear();
      this.l.clear();
      this.k.clear();
      if ($$0) {
         this.j.clear();
         this.j.addAll(this.i.bd().a());
      }
   }

   public void a(wp $$0) {
      this.a($$0, null, this.i.W() ? fle.b() : fle.a());
   }

   public void a(wp $$0, @Nullable xb $$1, @Nullable fle $$2) {
      fld $$3 = new fld(this.i.m.e(), $$0, $$1, $$2);
      this.a($$3);
      this.b($$3);
      this.c($$3);
   }

   private void a(fld $$0) {
      String $$1 = $$0.c().getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
      String $$2 = x.a($$0.e(), fle::h);
      if ($$2 != null) {
         a.info("[{}] [CHAT] {}", $$2, $$1);
      } else {
         a.info("[CHAT] {}", $$1);
      }
   }

   private void b(fld $$0) {
      int $$1 = ayz.a((double)this.f() / this.h());
      fle.a $$2 = $$0.a();
      if ($$2 != null) {
         $$1 -= $$2.c + 4 + 2;
      }

      List<ayl> $$3 = foz.a($$0.c(), $$1, this.i.h);
      boolean $$4 = this.e();

      for (int $$5 = 0; $$5 < $$3.size(); $$5++) {
         ayl $$6 = $$3.get($$5);
         if ($$4 && this.m > 0) {
            this.n = true;
            this.a(1);
         }

         boolean $$7 = $$5 == $$3.size() - 1;
         this.l.add(0, new fld.a($$0.b(), $$6, $$0.e(), $$7));
      }

      while (this.l.size() > 100) {
         this.l.remove(this.l.size() - 1);
      }
   }

   private void c(fld $$0) {
      this.k.add(0, $$0);

      while (this.k.size() > 100) {
         this.k.remove(this.k.size() - 1);
      }
   }

   private void m() {
      int $$0 = this.i.m.e();
      this.o.removeIf($$1 -> $$0 >= $$1.b() ? this.b($$1.a()) == null : false);
   }

   public void a(xb $$0) {
      fov.a $$1 = this.b($$0);
      if ($$1 != null) {
         this.o.add($$1);
      }
   }

   @Nullable
   private fov.a b(xb $$0) {
      int $$1 = this.i.m.e();
      ListIterator<fld> $$2 = this.k.listIterator();

      while ($$2.hasNext()) {
         fld $$3 = $$2.next();
         if ($$0.equals($$3.d())) {
            int $$4 = $$3.b() + 60;
            if ($$1 >= $$4) {
               $$2.set(this.d($$3));
               this.n();
               return null;
            }

            return new fov.a($$0, $$4);
         }
      }

      return null;
   }

   private fld d(fld $$0) {
      return new fld($$0.b(), h, null, fle.a());
   }

   public void b() {
      this.d();
      this.n();
   }

   private void n() {
      this.l.clear();

      for (fld $$0 : Lists.reverse(this.k)) {
         this.b($$0);
      }
   }

   public axm<String> c() {
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
         this.i.bd().a($$0);
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
      if (this.e() && !this.i.n.X && !this.l()) {
         ggu $$2 = this.i.aZ();
         if ($$2.c() == 0L) {
            return false;
         } else {
            double $$3 = $$0 - 2.0;
            double $$4 = (double)this.i.aO().p() - $$1 - 40.0;
            if ($$3 <= (double)ayz.a((double)this.f() / this.h()) && $$4 < 0.0 && $$4 > (double)ayz.a(-9.0 * this.h())) {
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
   public xm b(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.e($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         fld.a $$5 = this.l.get($$4);
         return this.i.h.b().a($$5.b(), ayz.a($$2));
      } else {
         return null;
      }
   }

   @Nullable
   public fle c(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.d($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         fld.a $$5 = this.l.get($$4);
         fle $$6 = $$5.c();
         if ($$6 != null && this.a($$2, $$5, $$6)) {
            return $$6;
         }
      }

      return null;
   }

   private boolean a(double $$0, fld.a $$1, fle $$2) {
      if ($$0 < 0.0) {
         return true;
      } else {
         fle.a $$3 = $$2.f();
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
      double $$1 = (double)this.i.aO().p() - $$0 - 40.0;
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
         if (!($$0 < -4.0) && !($$0 > (double)ayz.a((double)this.f() / this.h()))) {
            int $$2 = Math.min(this.j(), this.l.size());
            if ($$1 >= 0.0 && $$1 < (double)$$2) {
               int $$3 = ayz.a($$1 + (double)this.m);
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
      return this.i.z instanceof fti;
   }

   public int f() {
      return a(this.i.n.z().c());
   }

   public int g() {
      return b(this.e() ? this.i.n.B().c() : this.i.n.A().c());
   }

   public double h() {
      return this.i.n.y().c();
   }

   public static int a(double $$0) {
      int $$1 = 320;
      int $$2 = 40;
      return ayz.a($$0 * 280.0 + 40.0);
   }

   public static int b(double $$0) {
      int $$1 = 180;
      int $$2 = 20;
      return ayz.a($$0 * 160.0 + 20.0);
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
      return (int)(9.0 * (this.i.n.p().c() + 1.0));
   }

   public fov.b k() {
      return new fov.b(List.copyOf(this.k), List.copyOf(this.j), List.copyOf(this.o));
   }

   public void a(fov.b $$0) {
      this.j.clear();
      this.j.addAll($$0.b);
      this.o.clear();
      this.o.addAll($$0.c);
      this.k.clear();
      this.k.addAll($$0.a);
      this.n();
   }

   static record a(xb a, int b) {
   }

   public static class b {
      final List<fld> a;
      final List<String> b;
      final List<fov.a> c;

      public b(List<fld> $$0, List<String> $$1, List<fov.a> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
