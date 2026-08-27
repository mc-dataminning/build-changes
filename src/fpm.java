import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class fpm implements aka<cxt>, fhd, fhw, fju, fpr {
   public static final fhn a = new fhn(new akn("recipe_book/button"), new akn("recipe_book/button_highlighted"));
   private static final fhn i = new fhn(
      new akn("recipe_book/filter_enabled"),
      new akn("recipe_book/filter_disabled"),
      new akn("recipe_book/filter_enabled_highlighted"),
      new akn("recipe_book/filter_disabled_highlighted")
   );
   protected static final akn b = new akn("textures/gui/recipe_book.png");
   private static final wx j = wx.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final wx l = wx.c("gui.recipebook.toggleRecipes.craftable");
   private static final wx m = wx.c("gui.recipebook.toggleRecipes.all");
   private int n;
   private int o;
   private int p;
   protected final fpk e = new fpk();
   private final List<fpo> q = Lists.newArrayList();
   @Nullable
   private fpo r;
   protected fhg f;
   protected cqi<?> g;
   protected feb h;
   @Nullable
   private fgj s;
   private String u = "";
   private fdo v;
   private final fpn w = new fpn();
   private final cmc x = new cmc();
   private int y;
   private boolean z;
   private boolean A;
   private boolean B;

   public void a(int $$0, int $$1, feb $$2, boolean $$3, cqi<?> $$4) {
      this.h = $$2;
      this.o = $$0;
      this.p = $$1;
      this.g = $$4;
      this.B = $$3;
      $$2.s.cb = $$4;
      this.v = $$2.s.m();
      this.y = $$2.s.gc().l();
      this.A = this.k();
      if (this.A) {
         this.d();
      }
   }

   public void d() {
      this.n = this.B ? 0 : 86;
      int $$0 = (this.o - 147) / 2 - this.n;
      int $$1 = (this.p - 166) / 2;
      this.x.a();
      this.h.s.gc().a(this.x);
      this.g.a(this.x);
      String $$2 = this.s != null ? this.s.a() : "";
      this.s = new fgj(this.h.h, $$0 + 25, $$1 + 13, 81, 9 + 5, wx.c("itemGroup.search"));
      this.s.f(50);
      this.s.g(true);
      this.s.g(16777215);
      this.s.a($$2);
      this.s.c(j);
      this.w.a(this.h, $$0, $$1);
      this.w.a(this);
      this.f = new fhg($$0 + 110, $$1 + 12, 26, 16, this.v.a(this.g));
      this.b();
      this.a();
      this.q.clear();

      for (fej $$3 : fej.a(this.g.t())) {
         this.q.add(new fpo($$3));
      }

      if (this.r != null) {
         this.r = this.q.stream().filter($$0x -> $$0x.b().equals(this.r.b())).findFirst().orElse(null);
      }

      if (this.r == null) {
         this.r = this.q.get(0);
      }

      this.r.b(true);
      this.c(false);
      this.l();
   }

   private void b() {
      this.f.a(this.f.a() ? fhl.a(this.c()) : fhl.a(m));
   }

   protected void a() {
      this.f.a(i);
   }

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.f() && !this.B) {
         $$2 = 177 + ($$0 - $$1 - 200) / 2;
      } else {
         $$2 = ($$0 - $$1) / 2;
      }

      return $$2;
   }

   public void e() {
      this.b(!this.f());
   }

   public boolean f() {
      return this.A;
   }

   private boolean k() {
      return this.v.a(this.g.t());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.d();
      }

      this.A = $$0;
      this.v.a(this.g.t(), $$0);
      if (!$$0) {
         this.w.c();
      }

      this.j();
   }

   public void a(@Nullable cqq $$0) {
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
         if (this.f()) {
            this.m();
         }
      }
   }

   private void c(boolean $$0) {
      List<fpq> $$1 = this.v.a(this.r.b());
      $$1.forEach($$0x -> $$0x.a(this.x, this.g.n(), this.g.o(), this.v));
      List<fpq> $$2 = Lists.newArrayList($$1);
      $$2.removeIf($$0x -> !$$0x.b());
      $$2.removeIf($$0x -> !$$0x.d());
      String $$3 = this.s.a();
      if (!$$3.isEmpty()) {
         ObjectSet<fpq> $$4 = new ObjectLinkedOpenHashSet(this.h.a(grv.c).search($$3.toLowerCase(Locale.ROOT)));
         $$2.removeIf($$1x -> !$$4.contains($$1x));
      }

      if (this.v.a(this.g)) {
         $$2.removeIf($$0x -> !$$0x.c());
      }

      this.w.a($$2, $$0);
   }

   private void l() {
      int $$0 = (this.o - 147) / 2 - this.n - 30;
      int $$1 = (this.p - 166) / 2 + 3;
      int $$2 = 27;
      int $$3 = 0;

      for (fpo $$4 : this.q) {
         fej $$5 = $$4.b();
         if ($$5 == fej.a || $$5 == fej.f) {
            $$4.k = true;
            $$4.c($$0, $$1 + 27 * $$3++);
         } else if ($$4.a(this.v)) {
            $$4.c($$0, $$1 + 27 * $$3++);
            $$4.a(this.h);
         }
      }
   }

   public void h() {
      boolean $$0 = this.k();
      if (this.f() != $$0) {
         this.b($$0);
      }

      if (this.f()) {
         if (this.y != this.h.s.gc().l()) {
            this.m();
            this.y = this.h.s.gc().l();
         }
      }
   }

   private void m() {
      this.x.a();
      this.h.s.gc().a(this.x);
      this.g.a(this.x);
      this.c(false);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      if (this.f()) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.o - 147) / 2 - this.n;
         int $$5 = (this.p - 166) / 2;
         $$0.a(b, $$4, $$5, 1, 1, 147, 166);
         this.s.a($$0, $$1, $$2, $$3);

         for (fpo $$6 : this.q) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.f.a($$0, $$1, $$2, $$3);
         this.w.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.f()) {
         this.w.a($$0, $$3, $$4);
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected wx c() {
      return l;
   }

   private void b(ffn $$0, int $$1, int $$2, int $$3, int $$4) {
      ctq $$5 = null;

      for (int $$6 = 0; $$6 < this.e.b(); $$6++) {
         fpk.a $$7 = this.e.a($$6);
         int $$8 = $$7.a() + $$1;
         int $$9 = $$7.b() + $$2;
         if ($$3 >= $$8 && $$4 >= $$9 && $$3 < $$8 + 16 && $$4 < $$9 + 16) {
            $$5 = $$7.c();
         }
      }

      if ($$5 != null && this.h.y != null) {
         $$0.a(this.h.h, flz.a(this.h, $$5), $$3, $$4);
      }
   }

   public void a(ffn $$0, int $$1, int $$2, boolean $$3, float $$4) {
      this.e.a($$0, this.h, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.f() && !this.h.s.N_()) {
         if (this.w.a($$0, $$1, $$2, (this.o - 147) / 2 - this.n, (this.p - 166) / 2, 147, 166)) {
            cxy<?> $$3 = this.w.a();
            fpq $$4 = this.w.b();
            if ($$3 != null && $$4 != null) {
               if (!$$4.a($$3) && this.e.c() == $$3) {
                  return false;
               }

               this.e.a();
               this.h.q.a(this.h.s.cb.j, $$3, flz.s());
               if (!this.p()) {
                  this.b(false);
               }
            }

            return true;
         } else if (this.s.a($$0, $$1, $$2)) {
            this.s.a(true);
            return true;
         } else {
            this.s.a(false);
            if (this.f.a($$0, $$1, $$2)) {
               boolean $$5 = this.n();
               this.f.b($$5);
               this.b();
               this.j();
               this.c(false);
               return true;
            } else {
               for (fpo $$6 : this.q) {
                  if ($$6.a($$0, $$1, $$2)) {
                     if (this.r != $$6) {
                        if (this.r != null) {
                           this.r.b(false);
                        }

                        this.r = $$6;
                        this.r.b(true);
                        this.c(true);
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
      cqj $$0 = this.g.t();
      boolean $$1 = !this.v.b($$0);
      this.v.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.f()) {
         return true;
      } else {
         boolean $$7 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
         boolean $$8 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
         return $$7 && !$$8 && !this.r.A();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.z = false;
      if (!this.f() || this.h.s.N_()) {
         return false;
      } else if ($$0 == 256 && !this.p()) {
         this.b(false);
         return true;
      } else if (this.s.a($$0, $$1, $$2)) {
         this.o();
         return true;
      } else if (this.s.aJ_() && this.s.i() && $$0 != 256) {
         return true;
      } else if (this.h.m.J.a($$0, $$1) && !this.s.aJ_()) {
         this.z = true;
         this.s.a(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.z = false;
      return fhw.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.z) {
         return false;
      } else if (!this.f() || this.h.s.N_()) {
         return false;
      } else if (this.s.a($$0, $$1)) {
         this.o();
         return true;
      } else {
         return fhw.super.a($$0, $$1);
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
   public boolean aJ_() {
      return false;
   }

   private void o() {
      String $$0 = this.s.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.u)) {
         this.c(false);
         this.u = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         gpd $$1 = this.h.ag();
         String $$2 = "en_pt";
         gpc $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.h.m.ac = "en_pt";
         this.h.l();
         this.h.m.av();
      }
   }

   private boolean p() {
      return this.n == 86;
   }

   public void i() {
      this.l();
      if (this.f()) {
         this.c(false);
      }
   }

   @Override
   public void a(List<cxy<?>> $$0) {
      for (cxy<?> $$1 : $$0) {
         this.h.s.a($$1);
      }
   }

   public void a(cxy<?> $$0, List<cqq> $$1) {
      ctq $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cxt.a($$2), $$1.get(0).e, $$1.get(0).f);
      this.a(this.g.n(), this.g.o(), this.g.m(), $$0, $$0.b().a().iterator(), 0);
   }

   @Override
   public void a(Iterator<cxt> $$0, int $$1, int $$2, int $$3, int $$4) {
      cxt $$5 = $$0.next();
      if (!$$5.c()) {
         cqq $$6 = this.g.i.get($$1);
         this.e.a($$5, $$6.e, $$6.f);
      }
   }

   protected void j() {
      if (this.h.L() != null) {
         cqj $$0 = this.g.t();
         boolean $$1 = this.v.a().a($$0);
         boolean $$2 = this.v.a().b($$0);
         this.h.L().b(new ahl($$0, $$1, $$2));
      }
   }

   @Override
   public fju.a t() {
      return this.A ? fju.a.b : fju.a.a;
   }

   @Override
   public void b(fjw $$0) {
      List<fju> $$1 = Lists.newArrayList();
      this.w.a($$1x -> {
         if ($$1x.B()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.s);
      $$1.add(this.f);
      $$1.addAll(this.q);
      flz.b $$2 = flz.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
