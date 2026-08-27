import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class fbr implements aem<cmm>, etn, euf, ewb, fbw {
   public static final etx a = new etx(new aez("recipe_book/button"), new aez("recipe_book/button_highlighted"));
   private static final etx i = new etx(
      new aez("recipe_book/filter_enabled"),
      new aez("recipe_book/filter_disabled"),
      new aez("recipe_book/filter_enabled_highlighted"),
      new aez("recipe_book/filter_disabled_highlighted")
   );
   protected static final aez b = new aez("textures/gui/recipe_book.png");
   private static final tl j = tl.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final tl l = tl.c("gui.recipebook.toggleRecipes.craftable");
   private static final tl m = tl.c("gui.recipebook.toggleRecipes.all");
   private int n;
   private int o;
   private int p;
   protected final fbp e = new fbp();
   private final List<fbt> q = Lists.newArrayList();
   @Nullable
   private fbt s;
   protected etq f;
   protected cgb<?> g;
   protected eqp h;
   @Nullable
   private est t;
   private String u = "";
   private eqc v;
   private final fbs w = new fbs();
   private final cce x = new cce();
   private int y;
   private boolean z;
   private boolean A;
   private boolean B;

   public void a(int $$0, int $$1, eqp $$2, boolean $$3, cgb<?> $$4) {
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
      this.t = new est(this.h.h, $$0 + 25, $$1 + 13, 81, 9 + 5, tl.c("itemGroup.search"));
      this.t.l(50);
      this.t.g(true);
      this.t.m(16777215);
      this.t.a($$2);
      this.t.c(j);
      this.w.a(this.h, $$0, $$1);
      this.w.a(this);
      this.f = new etq($$0 + 110, $$1 + 12, 26, 16, this.v.a(this.g));
      this.b();
      this.a();
      this.q.clear();

      for (eqy $$3 : eqy.a(this.g.t())) {
         this.q.add(new fbt($$3));
      }

      if (this.s != null) {
         this.s = this.q.stream().filter($$0x -> $$0x.b().equals(this.s.b())).findFirst().orElse(null);
      }

      if (this.s == null) {
         this.s = this.q.get(0);
      }

      this.s.b(true);
      this.c(false);
      this.l();
   }

   private void b() {
      this.f.a(this.f.a() ? etv.a(this.d()) : etv.a(m));
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

   public void a(@Nullable cgj $$0) {
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
         if (this.g()) {
            this.m();
         }
      }
   }

   private void c(boolean $$0) {
      List<fbv> $$1 = this.v.a(this.s.b());
      $$1.forEach($$0x -> $$0x.a(this.x, this.g.n(), this.g.o(), this.v));
      List<fbv> $$2 = Lists.newArrayList($$1);
      $$2.removeIf($$0x -> !$$0x.b());
      $$2.removeIf($$0x -> !$$0x.d());
      String $$3 = this.t.a();
      if (!$$3.isEmpty()) {
         ObjectSet<fbv> $$4 = new ObjectLinkedOpenHashSet(this.h.a(gcu.c).search($$3.toLowerCase(Locale.ROOT)));
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

      for (fbt $$4 : this.q) {
         eqy $$5 = $$4.b();
         if ($$5 == eqy.a || $$5 == eqy.f) {
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
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      if (this.g()) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.o - 147) / 2 - this.n;
         int $$5 = (this.p - 166) / 2;
         $$0.a(b, $$4, $$5, 1, 1, 147, 166);
         this.t.a($$0, $$1, $$2, $$3);

         for (fbt $$6 : this.q) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.f.a($$0, $$1, $$2, $$3);
         this.w.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(erz $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.g()) {
         this.w.a($$0, $$3, $$4);
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected tl d() {
      return l;
   }

   private void b(erz $$0, int $$1, int $$2, int $$3, int $$4) {
      cjl $$5 = null;

      for (int $$6 = 0; $$6 < this.e.b(); $$6++) {
         fbp.a $$7 = this.e.a($$6);
         int $$8 = $$7.a() + $$1;
         int $$9 = $$7.b() + $$2;
         if ($$3 >= $$8 && $$4 >= $$9 && $$3 < $$8 + 16 && $$4 < $$9 + 16) {
            $$5 = $$7.c();
         }
      }

      if ($$5 != null && this.h.y != null) {
         $$0.a(this.h.h, eye.a(this.h, $$5), $$3, $$4);
      }
   }

   public void a(erz $$0, int $$1, int $$2, boolean $$3, float $$4) {
      this.e.a($$0, this.h, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.g() && !this.h.s.M_()) {
         if (this.w.a($$0, $$1, $$2, (this.o - 147) / 2 - this.n, (this.p - 166) / 2, 147, 166)) {
            cmq<?> $$3 = this.w.a();
            fbv $$4 = this.w.b();
            if ($$3 != null && $$4 != null) {
               if (!$$4.a($$3) && this.e.c() == $$3) {
                  return false;
               }

               this.e.a();
               this.h.q.a(this.h.s.bS.j, $$3, eye.q());
               if (!this.r()) {
                  this.b(false);
               }
            }

            return true;
         } else if (this.t.a($$0, $$1, $$2)) {
            this.t.b_(true);
            return true;
         } else {
            this.t.b_(false);
            if (this.f.a($$0, $$1, $$2)) {
               boolean $$5 = this.n();
               this.f.b($$5);
               this.b();
               this.j();
               this.c(false);
               return true;
            } else {
               for (fbt $$6 : this.q) {
                  if ($$6.a($$0, $$1, $$2)) {
                     if (this.s != $$6) {
                        if (this.s != null) {
                           this.s.b(false);
                        }

                        this.s = $$6;
                        this.s.b(true);
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
      cgc $$0 = this.g.t();
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
         return $$7 && !$$8 && !this.s.o();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.z = false;
      if (!this.g() || this.h.s.M_()) {
         return false;
      } else if ($$0 == 256 && !this.r()) {
         this.b(false);
         return true;
      } else if (this.t.a($$0, $$1, $$2)) {
         this.o();
         return true;
      } else if (this.t.aC_() && this.t.v() && $$0 != 256) {
         return true;
      } else if (this.h.m.K.a($$0, $$1) && !this.t.aC_()) {
         this.z = true;
         this.t.b_(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.z = false;
      return euf.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.z) {
         return false;
      } else if (!this.g() || this.h.s.M_()) {
         return false;
      } else if (this.t.a($$0, $$1)) {
         this.o();
         return true;
      } else {
         return euf.super.a($$0, $$1);
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void b_(boolean $$0) {
   }

   @Override
   public boolean aC_() {
      return false;
   }

   private void o() {
      String $$0 = this.t.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.u)) {
         this.c(false);
         this.u = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         gai $$1 = this.h.ae();
         String $$2 = "en_pt";
         gah $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.h.m.ad = "en_pt";
         this.h.k();
         this.h.m.ar();
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
   public void a(List<cmq<?>> $$0) {
      for (cmq<?> $$1 : $$0) {
         this.h.s.a($$1);
      }
   }

   public void a(cmq<?> $$0, List<cgj> $$1) {
      cjl $$2 = $$0.b().a(this.h.r.G_());
      this.e.a($$0);
      this.e.a(cmm.a($$2), $$1.get(0).f, $$1.get(0).g);
      this.a(this.g.n(), this.g.o(), this.g.m(), $$0, $$0.b().a().iterator(), 0);
   }

   @Override
   public void a(Iterator<cmm> $$0, int $$1, int $$2, int $$3, int $$4) {
      cmm $$5 = $$0.next();
      if (!$$5.c()) {
         cgj $$6 = this.g.i.get($$1);
         this.e.a($$5, $$6.f, $$6.g);
      }
   }

   protected void j() {
      if (this.h.J() != null) {
         cgc $$0 = this.g.t();
         boolean $$1 = this.v.a().a($$0);
         boolean $$2 = this.v.a().b($$0);
         this.h.J().b(new aci($$0, $$1, $$2));
      }
   }

   @Override
   public ewb.a q() {
      return this.A ? ewb.a.b : ewb.a.a;
   }

   @Override
   public void b(ewd $$0) {
      List<ewb> $$1 = Lists.newArrayList();
      this.w.a($$1x -> {
         if ($$1x.aD_()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.t);
      $$1.add(this.f);
      $$1.addAll(this.q);
      eye.b $$2 = eye.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
