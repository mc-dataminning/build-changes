import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class ftp<T extends csf> implements fld, flx, fnv, ftu {
   public static final fln a = new fln(alb.b("recipe_book/button"), alb.b("recipe_book/button_highlighted"));
   protected static final alb b = alb.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xd j = xd.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final xd l = xd.c("gui.recipebook.toggleRecipes.all");
   private static final int m = 30;
   private int n;
   private int o;
   private int p;
   private float q;
   @Nullable
   private czv<?> r;
   private final ftn s;
   private final List<ftr> u = Lists.newArrayList();
   @Nullable
   private ftr v;
   protected flg e;
   protected final T f;
   protected fib g;
   @Nullable
   private fkj w;
   private String x = "";
   private fhm y;
   private final ftq z;
   private final cnu A = new cnu();
   private int B;
   private boolean C;
   private boolean D;
   private boolean E;

   public ftp(T $$0) {
      this.f = $$0;
      ftw $$1 = () -> azc.d(this.q / 30.0F);
      this.s = new ftn($$1);
      this.z = new ftq($$1, $$0 instanceof cqs);
   }

   public void a(int $$0, int $$1, fib $$2, boolean $$3) {
      this.g = $$2;
      this.o = $$0;
      this.p = $$1;
      this.E = $$3;
      this.y = $$2.t.j();
      this.B = $$2.t.gc().l();
      this.D = this.k();
      if (this.D) {
         this.i();
      }
   }

   private void i() {
      boolean $$0 = this.m();
      this.n = this.E ? 0 : 86;
      int $$1 = (this.o - 147) / 2 - this.n;
      int $$2 = (this.p - 166) / 2;
      this.A.a();
      this.g.t.gc().a(this.A);
      this.f.a(this.A);
      String $$3 = this.w != null ? this.w.a() : "";
      this.w = new fkj(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xd.c("itemGroup.search"));
      this.w.f(50);
      this.w.g(true);
      this.w.g(16777215);
      this.w.a($$3);
      this.w.c(j);
      this.z.a(this.g, $$1, $$2);
      this.z.a(this);
      this.e = new flg($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.j();
      this.a();
      this.u.clear();

      for (fii $$4 : fii.a(this.f.am_())) {
         this.u.add(new ftr($$4));
      }

      if (this.v != null) {
         this.v = this.u.stream().filter($$0x -> $$0x.b().equals(this.v.b())).findFirst().orElse(null);
      }

      if (this.v == null) {
         this.v = this.u.get(0);
      }

      this.v.b(true);
      this.a(false, $$0);
      this.c($$0);
   }

   private void j() {
      this.e.a(this.e.a() ? fll.a(this.b()) : fll.a(l));
   }

   protected abstract void a();

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.d() && !this.E) {
         $$2 = 177 + ($$0 - $$1 - 200) / 2;
      } else {
         $$2 = ($$0 - $$1) / 2;
      }

      return $$2;
   }

   public void c() {
      this.b(!this.d());
   }

   public boolean d() {
      return this.D;
   }

   private boolean k() {
      return this.y.a(this.f.am_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.D = $$0;
      this.y.a(this.f.am_(), $$0);
      if (!$$0) {
         this.z.c();
      }

      this.h();
   }

   protected abstract boolean a(csn var1);

   public void b(@Nullable csn $$0) {
      if ($$0 != null && this.a($$0)) {
         this.q();
         if (this.d()) {
            this.l();
         }
      }
   }

   protected abstract void a(ftt var1, cnu var2, awg var3);

   private void a(boolean $$0, boolean $$1) {
      List<ftt> $$2 = this.y.a(this.v.b());
      $$2.forEach($$0x -> this.a($$0x, this.A, this.y));
      List<ftt> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      $$3.removeIf($$0x -> !$$0x.d());
      String $$4 = this.w.a();
      if (!$$4.isEmpty()) {
         gay $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<ftt> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
            $$3.removeIf($$1x -> !$$6.contains($$1x));
         }
      }

      if ($$1) {
         $$3.removeIf($$0x -> !$$0x.c());
      }

      this.z.a($$3, $$0, $$1);
   }

   private void c(boolean $$0) {
      int $$1 = (this.o - 147) / 2 - this.n - 30;
      int $$2 = (this.p - 166) / 2 + 3;
      int $$3 = 27;
      int $$4 = 0;

      for (ftr $$5 : this.u) {
         fii $$6 = $$5.b();
         if ($$6 == fii.a || $$6 == fii.f) {
            $$5.k = true;
            $$5.c($$1, $$2 + 27 * $$4++);
         } else if ($$5.a(this.y)) {
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.y, $$0);
         }
      }
   }

   public void e() {
      boolean $$0 = this.k();
      if (this.d() != $$0) {
         this.b($$0);
      }

      if (this.d()) {
         if (this.B != this.g.t.gc().l()) {
            this.l();
            this.B = this.g.t.gc().l();
         }
      }
   }

   private void l() {
      this.A.a();
      this.g.t.gc().a(this.A);
      this.f.a(this.A);
      this.a(false, this.m());
   }

   private boolean m() {
      return this.y.b(this.f.am_());
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!fpt.s()) {
            this.q += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.o - 147) / 2 - this.n;
         int $$5 = (this.p - 166) / 2;
         $$0.a(ghe::C, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.w.a($$0, $$1, $$2, $$3);

         for (ftr $$6 : this.u) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.z.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(fjn $$0, int $$1, int $$2, @Nullable csn $$3) {
      if (this.d()) {
         this.z.a($$0, $$1, $$2);
         this.s.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xd b();

   public void a(fjn $$0, int $$1, int $$2, boolean $$3) {
      this.s.a($$0, this.g, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.P_()) {
         if (this.z.a($$0, $$1, $$2, (this.o - 147) / 2 - this.n, (this.p - 166) / 2, 147, 166)) {
            czv<?> $$3 = this.z.a();
            ftt $$4 = this.z.b();
            if ($$3 != null && $$4 != null) {
               if (!$$4.a($$3) && this.r == $$3) {
                  return false;
               }

               this.q();
               this.g.r.a(this.g.t.ca.l, $$3, fpt.t());
               if (!this.p()) {
                  this.b(false);
               }
            }

            return true;
         } else if (this.w.a($$0, $$1, $$2)) {
            this.w.a(true);
            return true;
         } else {
            this.w.a(false);
            if (this.e.a($$0, $$1, $$2)) {
               boolean $$5 = this.n();
               this.e.b($$5);
               this.j();
               this.h();
               this.a(false, $$5);
               return true;
            } else {
               for (ftr $$6 : this.u) {
                  if ($$6.a($$0, $$1, $$2)) {
                     if (this.v != $$6) {
                        if (this.v != null) {
                           this.v.b(false);
                        }

                        this.v = $$6;
                        this.v.b(true);
                        this.a(true, this.m());
                     }

                     return true;
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean n() {
      csg $$0 = this.f.am_();
      boolean $$1 = !this.y.b($$0);
      this.y.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.d()) {
         return true;
      } else {
         boolean $$7 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
         boolean $$8 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
         return $$7 && !$$8 && !this.v.B();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.C = false;
      if (!this.d() || this.g.t.P_()) {
         return false;
      } else if ($$0 == 256 && !this.p()) {
         this.b(false);
         return true;
      } else if (this.w.a($$0, $$1, $$2)) {
         this.o();
         return true;
      } else if (this.w.aO_() && this.w.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.w.aO_()) {
         this.C = true;
         this.w.a(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.C = false;
      return flx.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.C) {
         return false;
      } else if (!this.d() || this.g.t.P_()) {
         return false;
      } else if (this.w.a($$0, $$1)) {
         this.o();
         return true;
      } else {
         return flx.super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aO_() {
      return false;
   }

   private void o() {
      String $$0 = this.w.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.x)) {
         this.a(false, this.m());
         this.x = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         gxt $$1 = this.g.ag();
         String $$2 = "en_pt";
         gxs $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.n.ab = "en_pt";
         this.g.l();
         this.g.n.ay();
      }
   }

   private boolean p() {
      return this.n == 86;
   }

   public void f() {
      this.c(this.m());
      if (this.d()) {
         this.a(false, this.m());
      }
   }

   @Override
   public void a(List<czv<?>> $$0) {
      for (czv<?> $$1 : $$0) {
         this.g.t.a($$1);
      }
   }

   private void q() {
      this.r = null;
      this.s.a();
   }

   public void a(czv<?> $$0) {
      this.r = $$0;
      this.s.a();
      this.a(this.s, $$0);
   }

   protected abstract void a(ftn var1, czv<?> var2);

   protected void h() {
      if (this.g.L() != null) {
         csg $$0 = this.f.am_();
         boolean $$1 = this.y.a().a($$0);
         boolean $$2 = this.y.a().b($$0);
         this.g.L().b(new ahy($$0, $$1, $$2));
      }
   }

   @Override
   public fnv.a u() {
      return this.D ? fnv.a.b : fnv.a.a;
   }

   @Override
   public void b(fnx $$0) {
      List<fnv> $$1 = Lists.newArrayList();
      this.z.a($$1x -> {
         if ($$1x.C()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.w);
      $$1.add(this.e);
      $$1.addAll(this.u);
      fpt.b $$2 = fpt.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
