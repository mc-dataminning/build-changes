import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class ffq implements agg<cpi>, exk, eyc, ezy, ffv {
   public static final exu a = new exu(new agt("recipe_book/button"), new agt("recipe_book/button_highlighted"));
   private static final exu i = new exu(
      new agt("recipe_book/filter_enabled"),
      new agt("recipe_book/filter_disabled"),
      new agt("recipe_book/filter_enabled_highlighted"),
      new agt("recipe_book/filter_disabled_highlighted")
   );
   protected static final agt b = new agt("textures/gui/recipe_book.png");
   private static final vb j = vb.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final vb l = vb.c("gui.recipebook.toggleRecipes.craftable");
   private static final vb m = vb.c("gui.recipebook.toggleRecipes.all");
   private int n;
   private int o;
   private int p;
   protected final ffo e = new ffo();
   private final List<ffs> q = Lists.newArrayList();
   @Nullable
   private ffs r;
   protected exn f;
   protected cix<?> g;
   protected euk h;
   @Nullable
   private ewq t;
   private String u = "";
   private etx v;
   private final ffr w = new ffr();
   private final cev x = new cev();
   private int y;
   private boolean z;
   private boolean A;
   private boolean B;

   public void a(int $$0, int $$1, euk $$2, boolean $$3, cix<?> $$4) {
      this.h = $$2;
      this.o = $$0;
      this.p = $$1;
      this.g = $$4;
      this.B = $$3;
      $$2.s.bS = $$4;
      this.v = $$2.s.m();
      this.y = $$2.s.fS().l();
      this.A = this.k();
      if (this.A) {
         this.e();
      }
   }

   public void e() {
      this.n = this.B ? 0 : 86;
      int $$0 = (this.o - 147) / 2 - this.n;
      int $$1 = (this.p - 166) / 2;
      this.x.a();
      this.h.s.fS().a(this.x);
      this.g.a(this.x);
      String $$2 = this.t != null ? this.t.a() : "";
      this.t = new ewq(this.h.h, $$0 + 25, $$1 + 13, 81, 9 + 5, vb.c("itemGroup.search"));
      this.t.l(50);
      this.t.g(true);
      this.t.m(16777215);
      this.t.a($$2);
      this.t.c(j);
      this.w.a(this.h, $$0, $$1);
      this.w.a(this);
      this.f = new exn($$0 + 110, $$1 + 12, 26, 16, this.v.a(this.g));
      this.b();
      this.a();
      this.q.clear();

      for (eut $$3 : eut.a(this.g.t())) {
         this.q.add(new ffs($$3));
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
      this.f.a(this.f.a() ? exs.a(this.c()) : exs.a(m));
   }

   protected void a() {
      this.f.a(i);
   }

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.g() && !this.B) {
         $$2 = 177 + ($$0 - $$1 - 200) / 2;
      } else {
         $$2 = ($$0 - $$1) / 2;
      }

      return $$2;
   }

   public void f() {
      this.b(!this.g());
   }

   public boolean g() {
      return this.A;
   }

   private boolean k() {
      return this.v.a(this.g.t());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.e();
      }

      this.A = $$0;
      this.v.a(this.g.t(), $$0);
      if (!$$0) {
         this.w.c();
      }

      this.j();
   }

   public void a(@Nullable cjf $$0) {
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
         if (this.g()) {
            this.m();
         }
      }
   }

   private void c(boolean $$0) {
      List<ffu> $$1 = this.v.a(this.r.b());
      $$1.forEach($$0x -> $$0x.a(this.x, this.g.n(), this.g.o(), this.v));
      List<ffu> $$2 = Lists.newArrayList($$1);
      $$2.removeIf($$0x -> !$$0x.b());
      $$2.removeIf($$0x -> !$$0x.d());
      String $$3 = this.t.a();
      if (!$$3.isEmpty()) {
         ObjectSet<ffu> $$4 = new ObjectLinkedOpenHashSet(this.h.a(ghi.c).search($$3.toLowerCase(Locale.ROOT)));
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

      for (ffs $$4 : this.q) {
         eut $$5 = $$4.b();
         if ($$5 == eut.a || $$5 == eut.f) {
            $$4.j = true;
            $$4.b($$0, $$1 + 27 * $$3++);
         } else if ($$4.a(this.v)) {
            $$4.b($$0, $$1 + 27 * $$3++);
            $$4.a(this.h);
         }
      }
   }

   public void h() {
      boolean $$0 = this.k();
      if (this.g() != $$0) {
         this.b($$0);
      }

      if (this.g()) {
         if (this.y != this.h.s.fS().l()) {
            this.m();
            this.y = this.h.s.fS().l();
         }
      }
   }

   private void m() {
      this.x.a();
      this.h.s.fS().a(this.x);
      this.g.a(this.x);
      this.c(false);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      if (this.g()) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.o - 147) / 2 - this.n;
         int $$5 = (this.p - 166) / 2;
         $$0.a(b, $$4, $$5, 1, 1, 147, 166);
         this.t.a($$0, $$1, $$2, $$3);

         for (ffs $$6 : this.q) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.f.a($$0, $$1, $$2, $$3);
         this.w.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(evw $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.g()) {
         this.w.a($$0, $$3, $$4);
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected vb c() {
      return l;
   }

   private void b(evw $$0, int $$1, int $$2, int $$3, int $$4) {
      cmh $$5 = null;

      for (int $$6 = 0; $$6 < this.e.b(); $$6++) {
         ffo.a $$7 = this.e.a($$6);
         int $$8 = $$7.a() + $$1;
         int $$9 = $$7.b() + $$2;
         if ($$3 >= $$8 && $$4 >= $$9 && $$3 < $$8 + 16 && $$4 < $$9 + 16) {
            $$5 = $$7.c();
         }
      }

      if ($$5 != null && this.h.y != null) {
         $$0.a(this.h.h, fcc.a(this.h, $$5), $$3, $$4);
      }
   }

   public void a(evw $$0, int $$1, int $$2, boolean $$3, float $$4) {
      this.e.a($$0, this.h, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.g() && !this.h.s.P_()) {
         if (this.w.a($$0, $$1, $$2, (this.o - 147) / 2 - this.n, (this.p - 166) / 2, 147, 166)) {
            cpn<?> $$3 = this.w.a();
            ffu $$4 = this.w.b();
            if ($$3 != null && $$4 != null) {
               if (!$$4.a($$3) && this.e.c() == $$3) {
                  return false;
               }

               this.e.a();
               this.h.q.a(this.h.s.bS.j, $$3, fcc.q());
               if (!this.r()) {
                  this.b(false);
               }
            }

            return true;
         } else if (this.t.a($$0, $$1, $$2)) {
            this.t.a(true);
            return true;
         } else {
            this.t.a(false);
            if (this.f.a($$0, $$1, $$2)) {
               boolean $$5 = this.n();
               this.f.b($$5);
               this.b();
               this.j();
               this.c(false);
               return true;
            } else {
               for (ffs $$6 : this.q) {
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
      ciy $$0 = this.g.t();
      boolean $$1 = !this.v.b($$0);
      this.v.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.g()) {
         return true;
      } else {
         boolean $$7 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
         boolean $$8 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
         return $$7 && !$$8 && !this.r.n();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.z = false;
      if (!this.g() || this.h.s.P_()) {
         return false;
      } else if ($$0 == 256 && !this.r()) {
         this.b(false);
         return true;
      } else if (this.t.a($$0, $$1, $$2)) {
         this.p();
         return true;
      } else if (this.t.aJ_() && this.t.u() && $$0 != 256) {
         return true;
      } else if (this.h.m.K.a($$0, $$1) && !this.t.aJ_()) {
         this.z = true;
         this.t.a(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.z = false;
      return eyc.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.z) {
         return false;
      } else if (!this.g() || this.h.s.P_()) {
         return false;
      } else if (this.t.a($$0, $$1)) {
         this.p();
         return true;
      } else {
         return eyc.super.a($$0, $$1);
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   private void p() {
      String $$0 = this.t.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.u)) {
         this.c(false);
         this.u = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         gew $$1 = this.h.ad();
         String $$2 = "en_pt";
         gev $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.h.m.ad = "en_pt";
         this.h.k();
         this.h.m.as();
      }
   }

   private boolean r() {
      return this.n == 86;
   }

   public void i() {
      this.l();
      if (this.g()) {
         this.c(false);
      }
   }

   @Override
   public void a(List<cpn<?>> $$0) {
      for (cpn<?> $$1 : $$0) {
         this.h.s.a($$1);
      }
   }

   public void a(cpn<?> $$0, List<cjf> $$1) {
      cmh $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cpi.a($$2), $$1.get(0).f, $$1.get(0).g);
      this.a(this.g.n(), this.g.o(), this.g.m(), $$0, $$0.b().a().iterator(), 0);
   }

   @Override
   public void a(Iterator<cpi> $$0, int $$1, int $$2, int $$3, int $$4) {
      cpi $$5 = $$0.next();
      if (!$$5.c()) {
         cjf $$6 = this.g.i.get($$1);
         this.e.a($$5, $$6.f, $$6.g);
      }
   }

   protected void j() {
      if (this.h.I() != null) {
         ciy $$0 = this.g.t();
         boolean $$1 = this.v.a().a($$0);
         boolean $$2 = this.v.a().b($$0);
         this.h.I().b(new aec($$0, $$1, $$2));
      }
   }

   @Override
   public ezy.a q() {
      return this.A ? ezy.a.b : ezy.a.a;
   }

   @Override
   public void b(faa $$0) {
      List<ezy> $$1 = Lists.newArrayList();
      this.w.a($$1x -> {
         if ($$1x.aL_()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.t);
      $$1.add(this.f);
      $$1.addAll(this.q);
      fcc.b $$2 = fcc.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
