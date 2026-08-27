import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class fof implements ffx, fgq {
   private static final akf b = new akf("recipe_book/overlay_recipe");
   static final akf c = new akf("recipe_book/furnace_overlay_highlighted");
   static final akf d = new akf("recipe_book/furnace_overlay");
   static final akf e = new akf("recipe_book/crafting_overlay_highlighted");
   static final akf f = new akf("recipe_book/crafting_overlay");
   static final akf g = new akf("recipe_book/furnace_overlay_disabled_highlighted");
   static final akf h = new akf("recipe_book/furnace_overlay_disabled");
   static final akf i = new akf("recipe_book/crafting_overlay_disabled_highlighted");
   static final akf j = new akf("recipe_book/crafting_overlay_disabled");
   private static final int k = 4;
   private static final int l = 5;
   private static final float m = 0.375F;
   public static final int a = 25;
   private final List<fof.a> n = Lists.newArrayList();
   private boolean o;
   private int p;
   private int q;
   private fcu r;
   private fok s;
   @Nullable
   private cwi<?> u;
   float v;
   boolean w;

   public void a(fcu $$0, fok $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.r = $$0;
      this.s = $$1;
      if ($$0.s.cc instanceof cni) {
         this.w = true;
      }

      boolean $$7 = $$0.s.m().a((cov<?>)$$0.s.cc);
      List<cwi<?>> $$8 = $$1.b(true);
      List<cwi<?>> $$9 = $$7 ? Collections.emptyList() : $$1.b(false);
      int $$10 = $$8.size();
      int $$11 = $$10 + $$9.size();
      int $$12 = $$11 <= 16 ? 4 : 5;
      int $$13 = (int)Math.ceil((double)((float)$$11 / (float)$$12));
      this.p = $$2;
      this.q = $$3;
      float $$14 = (float)(this.p + Math.min($$11, $$12) * 25);
      float $$15 = (float)($$4 + 50);
      if ($$14 > $$15) {
         this.p = (int)((float)this.p - $$6 * (float)((int)(($$14 - $$15) / $$6)));
      }

      float $$16 = (float)(this.q + $$13 * 25);
      float $$17 = (float)($$5 + 50);
      if ($$16 > $$17) {
         this.q = (int)((float)this.q - $$6 * (float)axw.f(($$16 - $$17) / $$6));
      }

      float $$18 = (float)this.q;
      float $$19 = (float)($$5 - 100);
      if ($$18 < $$19) {
         this.q = (int)((float)this.q - $$6 * (float)axw.f(($$18 - $$19) / $$6));
      }

      this.o = true;
      this.n.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         cwi<?> $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.p + 4 + 25 * ($$20 % $$12);
         int $$24 = this.q + 5 + 25 * ($$20 / $$12);
         if (this.w) {
            this.n.add(new fof.b($$23, $$24, $$22, $$21));
         } else {
            this.n.add(new fof.a($$23, $$24, $$22, $$21));
         }
      }

      this.u = null;
   }

   public fok a() {
      return this.s;
   }

   @Nullable
   public cwi<?> b() {
      return this.u;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (fof.a $$3 : this.n) {
            if ($$3.a($$0, $$1, $$2)) {
               this.u = $$3.c;
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      if (this.o) {
         this.v += $$3;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.n.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.n.size(), $$4);
         int $$6 = axw.f((float)this.n.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(b, this.p, this.q, $$5 * 25 + 8, $$6 * 25 + 8);
         RenderSystem.disableBlend();

         for (fof.a $$8 : this.n) {
            $$8.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
      }
   }

   public void b(boolean $$0) {
      this.o = $$0;
   }

   public boolean c() {
      return this.o;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aI_() {
      return false;
   }

   class a extends fes implements ajs<cwd> {
      final cwi<?> c;
      private final boolean d;
      protected final List<fof.a.a> a = Lists.newArrayList();

      public a(int $$0, int $$1, cwi<?> $$2, boolean $$3) {
         super($$0, $$1, 200, 20, wr.a);
         this.g = 24;
         this.h = 24;
         this.c = $$2;
         this.d = $$3;
         this.a($$2);
      }

      protected void a(cwi<?> $$0) {
         this.a(3, 3, -1, $$0, $$0.b().a().iterator(), 0);
      }

      @Override
      public void a(fiq $$0) {
         this.c($$0);
      }

      @Override
      public void a(Iterator<cwd> $$0, int $$1, int $$2, int $$3, int $$4) {
         csd[] $$5 = $$0.next().a();
         if ($$5.length != 0) {
            this.a.add(new fof.a.a(3 + $$4 * 7, 3 + $$3 * 7, $$5));
         }
      }

      @Override
      public void b(feh $$0, int $$1, int $$2, float $$3) {
         akf $$4;
         if (this.d) {
            if (fof.this.w) {
               $$4 = this.A() ? fof.c : fof.d;
            } else {
               $$4 = this.A() ? fof.e : fof.f;
            }
         } else if (fof.this.w) {
            $$4 = this.A() ? fof.g : fof.h;
         } else {
            $$4 = this.A() ? fof.i : fof.j;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         $$0.c().a();
         $$0.c().a((double)(this.C() + 2), (double)(this.D() + 2), 150.0);

         for (fof.a.a $$8 : this.a) {
            $$0.c().a();
            $$0.c().a((double)$$8.b, (double)$$8.c, 0.0);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0, -8.0, 0.0);
            if ($$8.a.length > 0) {
               $$0.a($$8.a[axw.d(fof.this.v / 30.0F) % $$8.a.length], 0, 0);
            }

            $$0.c().b();
         }

         $$0.c().b();
      }

      protected class a {
         public final csd[] a;
         public final int b;
         public final int c;

         public a(int $$1, int $$2, csd[] $$3) {
            this.b = $$1;
            this.c = $$2;
            this.a = $$3;
         }
      }
   }

   class b extends fof.a {
      public b(int $$0, int $$1, cwi<?> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      protected void a(cwi<?> $$0) {
         cwd $$1 = $$0.b().a().get(0);
         csd[] $$2 = $$1.a();
         this.a.add(new fof.a.a(10, 10, $$2));
      }
   }
}
