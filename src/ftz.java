import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class ftz<T extends csl> implements fln, fmh, fof, fue {
   public static final flx a = new flx(alc.b("recipe_book/button"), alc.b("recipe_book/button_highlighted"));
   protected static final alc b = alc.b("textures/gui/recipe_book.png");
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
   private daj<?> r;
   private final ftx s;
   private final List<fub> u = Lists.newArrayList();
   @Nullable
   private fub v;
   protected flq e;
   protected final T f;
   protected fil g;
   @Nullable
   private fkt w;
   private String x = "";
   private fhw y;
   private final fua z;
   @Nullable
   private daj<?> A;
   @Nullable
   private fud B;
   private final cnz C = new cnz();
   private int D;
   private boolean E;
   private boolean F;
   private boolean G;

   public ftz(T $$0) {
      this.f = $$0;
      fug $$1 = () -> azd.d(this.q / 30.0F);
      this.s = new ftx($$1);
      this.z = new fua($$1, $$0 instanceof cqy);
   }

   public void a(int $$0, int $$1, fil $$2, boolean $$3) {
      this.g = $$2;
      this.o = $$0;
      this.p = $$1;
      this.G = $$3;
      this.y = $$2.t.j();
      this.D = $$2.t.gc().l();
      this.F = this.k();
      if (this.F) {
         this.i();
      }
   }

   private void i() {
      boolean $$0 = this.m();
      this.n = this.G ? 0 : 86;
      int $$1 = (this.o - 147) / 2 - this.n;
      int $$2 = (this.p - 166) / 2;
      this.C.a();
      this.g.t.gc().a(this.C);
      this.f.a(this.C);
      String $$3 = this.w != null ? this.w.a() : "";
      this.w = new fkt(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xd.c("itemGroup.search"));
      this.w.f(50);
      this.w.g(true);
      this.w.g(16777215);
      this.w.a($$3);
      this.w.c(j);
      this.z.a(this.g, $$1, $$2);
      this.z.a(this);
      this.e = new flq($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.j();
      this.a();
      this.u.clear();

      for (fis $$4 : fis.a(this.f.am_())) {
         this.u.add(new fub($$4));
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
      this.e.a(this.e.a() ? flv.a(this.b()) : flv.a(l));
   }

   protected abstract void a();

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.d() && !this.G) {
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
      return this.F;
   }

   private boolean k() {
      return this.y.a(this.f.am_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.F = $$0;
      this.y.a(this.f.am_(), $$0);
      if (!$$0) {
         this.z.c();
      }

      this.h();
   }

   protected abstract boolean a(cst var1);

   public void b(@Nullable cst $$0) {
      if ($$0 != null && this.a($$0)) {
         this.q();
         if (this.d()) {
            this.l();
         }
      }
   }

   protected abstract void a(fud var1, cnz var2, awh var3);

   private void a(boolean $$0, boolean $$1) {
      List<fud> $$2 = this.y.a(this.v.b());
      $$2.forEach($$0x -> this.a($$0x, this.C, this.y));
      List<fud> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      $$3.removeIf($$0x -> !$$0x.d());
      String $$4 = this.w.a();
      if (!$$4.isEmpty()) {
         gbi $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<fud> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
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

      for (fub $$5 : this.u) {
         fis $$6 = $$5.b();
         if ($$6 == fis.a || $$6 == fis.f) {
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
         if (this.D != this.g.t.gc().l()) {
            this.l();
            this.D = this.g.t.gc().l();
         }
      }
   }

   private void l() {
      this.C.a();
      this.g.t.gc().a(this.C);
      this.f.a(this.C);
      this.a(false, this.m());
   }

   private boolean m() {
      return this.y.b(this.f.am_());
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!fqd.s()) {
            this.q += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.o - 147) / 2 - this.n;
         int $$5 = (this.p - 166) / 2;
         $$0.a(ghq::B, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.w.a($$0, $$1, $$2, $$3);

         for (fub $$6 : this.u) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.z.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(fjx $$0, int $$1, int $$2, @Nullable cst $$3) {
      if (this.d()) {
         this.z.a($$0, $$1, $$2);
         this.s.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xd b();

   public void a(fjx $$0, int $$1, int $$2, boolean $$3) {
      this.s.a($$0, this.g, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.P_()) {
         if (this.z.a($$0, $$1, $$2, (this.o - 147) / 2 - this.n, (this.p - 166) / 2, 147, 166)) {
            daj<?> $$3 = this.z.a();
            fud $$4 = this.z.b();
            if ($$3 != null && $$4 != null) {
               if (!this.a($$4, $$3)) {
                  return false;
               }

               this.B = $$4;
               this.A = $$3;
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
               for (fub $$6 : this.u) {
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

   private boolean a(fud $$0, daj<?> $$1) {
      if (!$$0.a($$1) && this.r == $$1) {
         return false;
      } else {
         this.q();
         this.g.r.a(this.g.t.bZ.l, $$1, fqd.t());
         return true;
      }
   }

   private boolean n() {
      csm $$0 = this.f.am_();
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
      this.E = false;
      if (!this.d() || this.g.t.P_()) {
         return false;
      } else if ($$0 == 256 && !this.p()) {
         this.b(false);
         return true;
      } else if (this.w.a($$0, $$1, $$2)) {
         this.o();
         return true;
      } else if (this.w.aM_() && this.w.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.w.aM_()) {
         this.E = true;
         this.w.a(true);
         return true;
      } else if (fom.a($$0) && this.B != null && this.A != null) {
         fki.b(fil.Q().ak());
         return this.a(this.B, this.A);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.E = false;
      return fmh.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.E) {
         return false;
      } else if (!this.d() || this.g.t.P_()) {
         return false;
      } else if (this.w.a($$0, $$1)) {
         this.o();
         return true;
      } else {
         return fmh.super.a($$0, $$1);
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
   public boolean aM_() {
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
         gyk $$1 = this.g.ah();
         String $$2 = "en_pt";
         gyj $$3 = $$1.b("en_pt");
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
   public void a(List<daj<?>> $$0) {
      for (daj<?> $$1 : $$0) {
         this.g.t.a($$1);
      }
   }

   private void q() {
      this.r = null;
      this.s.a();
   }

   public void a(daj<?> $$0) {
      this.r = $$0;
      this.s.a();
      this.a(this.s, $$0);
   }

   protected abstract void a(ftx var1, daj<?> var2);

   protected void h() {
      if (this.g.L() != null) {
         csm $$0 = this.f.am_();
         boolean $$1 = this.y.a().a($$0);
         boolean $$2 = this.y.a().b($$0);
         this.g.L().b(new ahy($$0, $$1, $$2));
      }
   }

   @Override
   public fof.a u() {
      return this.F ? fof.a.b : fof.a.a;
   }

   @Override
   public void b(foh $$0) {
      List<fof> $$1 = Lists.newArrayList();
      this.z.a($$1x -> {
         if ($$1x.C()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.w);
      $$1.add(this.e);
      $$1.addAll(this.u);
      fqd.b $$2 = fqd.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
