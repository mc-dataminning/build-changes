import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class eyc implements acf<ciz>, eqh, eqt, esn, eyh {
   protected static final acq a = new acq("textures/gui/recipe_book.png");
   private static final sw h = sw.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int b = 147;
   public static final int c = 166;
   private static final int i = 86;
   private static final sw j = sw.c("gui.recipebook.toggleRecipes.craftable");
   private static final sw k = sw.c("gui.recipebook.toggleRecipes.all");
   private int l;
   private int m;
   private int n;
   protected final eya d = new eya();
   private final List<eye> o = Lists.newArrayList();
   @Nullable
   private eye p;
   protected eqj e;
   protected ccp<?> f;
   protected enn g;
   @Nullable
   private epr q;
   private String r = "";
   private enb s;
   private final eyd t = new eyd();
   private final bys u = new bys();
   private int v;
   private boolean w;
   private boolean x;
   private boolean y;

   public void a(int $$0, int $$1, enn $$2, boolean $$3, ccp<?> $$4) {
      this.g = $$2;
      this.m = $$0;
      this.n = $$1;
      this.f = $$4;
      this.y = $$3;
      $$2.t.bR = $$4;
      this.s = $$2.t.x();
      this.v = $$2.t.fN().l();
      this.x = this.k();
      if (this.x) {
         this.e();
      }
   }

   public void e() {
      this.l = this.y ? 0 : 86;
      int $$0 = (this.m - 147) / 2 - this.l;
      int $$1 = (this.n - 166) / 2;
      this.u.a();
      this.g.t.fN().a(this.u);
      this.f.a(this.u);
      String $$2 = this.q != null ? this.q.b() : "";
      this.q = new epr(this.g.h, $$0 + 26, $$1 + 14, 79, 9 + 3, sw.c("itemGroup.search"));
      this.q.m(50);
      this.q.e(true);
      this.q.n(16777215);
      this.q.a($$2);
      this.q.c(h);
      this.t.a(this.g, $$0, $$1);
      this.t.a(this);
      this.e = new eqj($$0 + 110, $$1 + 12, 26, 16, this.s.a(this.f));
      this.b();
      this.a();
      this.o.clear();

      for (enw $$3 : enw.a(this.f.t())) {
         this.o.add(new eye($$3));
      }

      if (this.p != null) {
         this.p = this.o.stream().filter($$0x -> $$0x.b().equals(this.p.b())).findFirst().orElse(null);
      }

      if (this.p == null) {
         this.p = this.o.get(0);
      }

      this.p.b(true);
      this.c(false);
      this.l();
   }

   private void b() {
      this.e.a(this.e.a() ? eqp.a(this.d()) : eqp.a(k));
   }

   protected void a() {
      this.e.a(152, 41, 28, 18, a);
   }

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.g() && !this.y) {
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
      return this.x;
   }

   private boolean k() {
      return this.s.a(this.f.t());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.e();
      }

      this.x = $$0;
      this.s.a(this.f.t(), $$0);
      if (!$$0) {
         this.t.c();
      }

      this.j();
   }

   public void a(@Nullable ccx $$0) {
      if ($$0 != null && $$0.e < this.f.p()) {
         this.d.a();
         if (this.g()) {
            this.m();
         }
      }
   }

   private void c(boolean $$0) {
      List<eyg> $$1 = this.s.a(this.p.b());
      $$1.forEach($$0x -> $$0x.a(this.u, this.f.n(), this.f.o(), this.s));
      List<eyg> $$2 = Lists.newArrayList($$1);
      $$2.removeIf($$0x -> !$$0x.b());
      $$2.removeIf($$0x -> !$$0x.d());
      String $$3 = this.q.b();
      if (!$$3.isEmpty()) {
         ObjectSet<eyg> $$4 = new ObjectLinkedOpenHashSet(this.g.a(fyk.c).search($$3.toLowerCase(Locale.ROOT)));
         $$2.removeIf($$1x -> !$$4.contains($$1x));
      }

      if (this.s.a(this.f)) {
         $$2.removeIf($$0x -> !$$0x.c());
      }

      this.t.a($$2, $$0);
   }

   private void l() {
      int $$0 = (this.m - 147) / 2 - this.l - 30;
      int $$1 = (this.n - 166) / 2 + 3;
      int $$2 = 27;
      int $$3 = 0;

      for (eye $$4 : this.o) {
         enw $$5 = $$4.b();
         if ($$5 == enw.a || $$5 == enw.f) {
            $$4.s = true;
            $$4.b($$0, $$1 + 27 * $$3++);
         } else if ($$4.a(this.s)) {
            $$4.b($$0, $$1 + 27 * $$3++);
            $$4.a(this.g);
         }
      }
   }

   public void h() {
      boolean $$0 = this.k();
      if (this.g() != $$0) {
         this.b($$0);
      }

      if (this.g()) {
         if (this.v != this.g.t.fN().l()) {
            this.m();
            this.v = this.g.t.fN().l();
         }

         this.q.a();
      }
   }

   private void m() {
      this.u.a();
      this.g.t.fN().a(this.u);
      this.f.a(this.u);
      this.c(false);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.g()) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.m - 147) / 2 - this.l;
         int $$5 = (this.n - 166) / 2;
         $$0.a(a, $$4, $$5, 1, 1, 147, 166);
         this.q.a($$0, $$1, $$2, $$3);

         for (eye $$6 : this.o) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.t.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.g()) {
         this.t.a($$0, $$3, $$4);
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected sw d() {
      return j;
   }

   private void b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      cfz $$5 = null;

      for (int $$6 = 0; $$6 < this.d.b(); $$6++) {
         eya.a $$7 = this.d.a($$6);
         int $$8 = $$7.a() + $$1;
         int $$9 = $$7.b() + $$2;
         if ($$3 >= $$8 && $$4 >= $$9 && $$3 < $$8 + 16 && $$4 < $$9 + 16) {
            $$5 = $$7.c();
         }
      }

      if ($$5 != null && this.g.z != null) {
         $$0.a(this.g.h, euq.a(this.g, $$5), $$3, $$4);
      }
   }

   public void a(eox $$0, int $$1, int $$2, boolean $$3, float $$4) {
      this.d.a($$0, this.g, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.g() && !this.g.t.G_()) {
         if (this.t.a($$0, $$1, $$2, (this.m - 147) / 2 - this.l, (this.n - 166) / 2, 147, 166)) {
            cjc<?> $$3 = this.t.a();
            eyg $$4 = this.t.b();
            if ($$3 != null && $$4 != null) {
               if (!$$4.a($$3) && this.d.c() == $$3) {
                  return false;
               }

               this.d.a();
               this.g.r.a(this.g.t.bR.j, $$3, euq.q());
               if (!this.r()) {
                  this.b(false);
               }
            }

            return true;
         } else if (this.q.a($$0, $$1, $$2)) {
            this.q.b_(true);
            return true;
         } else {
            this.q.b_(false);
            if (this.e.a($$0, $$1, $$2)) {
               boolean $$5 = this.n();
               this.e.b($$5);
               this.b();
               this.j();
               this.c(false);
               return true;
            } else {
               for (eye $$6 : this.o) {
                  if ($$6.a($$0, $$1, $$2)) {
                     if (this.p != $$6) {
                        if (this.p != null) {
                           this.p.b(false);
                        }

                        this.p = $$6;
                        this.p.b(true);
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
      ccq $$0 = this.f.t();
      boolean $$1 = !this.s.b($$0);
      this.s.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.g()) {
         return true;
      } else {
         boolean $$7 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
         boolean $$8 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
         return $$7 && !$$8 && !this.p.n();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.w = false;
      if (!this.g() || this.g.t.G_()) {
         return false;
      } else if ($$0 == 256 && !this.r()) {
         this.b(false);
         return true;
      } else if (this.q.a($$0, $$1, $$2)) {
         this.p();
         return true;
      } else if (this.q.aB_() && this.q.x() && $$0 != 256) {
         return true;
      } else if (this.g.m.K.a($$0, $$1) && !this.q.aB_()) {
         this.w = true;
         this.q.b_(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      this.w = false;
      return eqt.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.w) {
         return false;
      } else if (!this.g() || this.g.t.G_()) {
         return false;
      } else if (this.q.a($$0, $$1)) {
         this.p();
         return true;
      } else {
         return eqt.super.a($$0, $$1);
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
   public boolean aB_() {
      return false;
   }

   private void p() {
      String $$0 = this.q.b().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.r)) {
         this.c(false);
         this.r = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         fwb $$1 = this.g.ad();
         String $$2 = "en_pt";
         fwa $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.m.ag = "en_pt";
         this.g.j();
         this.g.m.aq();
      }
   }

   private boolean r() {
      return this.l == 86;
   }

   public void i() {
      this.l();
      if (this.g()) {
         this.c(false);
      }
   }

   @Override
   public void a(List<cjc<?>> $$0) {
      for (cjc<?> $$1 : $$0) {
         this.g.t.a($$1);
      }
   }

   public void a(cjc<?> $$0, List<ccx> $$1) {
      cfz $$2 = $$0.a(this.g.s.B_());
      this.d.a($$0);
      this.d.a(ciz.a($$2), $$1.get(0).f, $$1.get(0).g);
      this.a(this.f.n(), this.f.o(), this.f.m(), $$0, $$0.a().iterator(), 0);
   }

   @Override
   public void a(Iterator<ciz> $$0, int $$1, int $$2, int $$3, int $$4) {
      ciz $$5 = $$0.next();
      if (!$$5.d()) {
         ccx $$6 = this.f.i.get($$1);
         this.d.a($$5, $$6.f, $$6.g);
      }
   }

   protected void j() {
      if (this.g.I() != null) {
         ccq $$0 = this.f.t();
         boolean $$1 = this.s.a().a($$0);
         boolean $$2 = this.s.a().b($$0);
         this.g.I().a(new aah($$0, $$1, $$2));
      }
   }

   @Override
   public esn.a q() {
      return this.x ? esn.a.b : esn.a.a;
   }

   @Override
   public void b(esp $$0) {
      List<esn> $$1 = Lists.newArrayList();
      this.t.a($$1x -> {
         if ($$1x.aD_()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.q);
      $$1.add(this.e);
      $$1.addAll(this.o);
      euq.b $$2 = euq.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
