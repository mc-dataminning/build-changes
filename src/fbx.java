import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class fbx implements etu, eum {
   private static final aey b = new aey("recipe_book/overlay_recipe");
   static final aey c = new aey("recipe_book/furnace_overlay_highlighted");
   static final aey d = new aey("recipe_book/furnace_overlay");
   static final aey e = new aey("recipe_book/crafting_overlay_highlighted");
   static final aey f = new aey("recipe_book/crafting_overlay");
   static final aey g = new aey("recipe_book/furnace_overlay_disabled_highlighted");
   static final aey h = new aey("recipe_book/furnace_overlay_disabled");
   static final aey i = new aey("recipe_book/crafting_overlay_disabled_highlighted");
   static final aey j = new aey("recipe_book/crafting_overlay_disabled");
   private static final int k = 4;
   private static final int l = 5;
   private static final float m = 0.375F;
   public static final int a = 25;
   private final List<fbx.a> n = Lists.newArrayList();
   private boolean o;
   private int p;
   private int q;
   private eqx s;
   private fcc t;
   @Nullable
   private cmm<?> u;
   float v;
   boolean w;

   public void a(eqx $$0, fcc $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.s = $$0;
      this.t = $$1;
      if ($$0.s.bS instanceof ceo) {
         this.w = true;
      }

      boolean $$7 = $$0.s.m().a((cfx<?>)$$0.s.bS);
      List<cmm<?>> $$8 = $$1.b(true);
      List<cmm<?>> $$9 = $$7 ? Collections.emptyList() : $$1.b(false);
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
         this.q = (int)((float)this.q - $$6 * (float)ary.f(($$16 - $$17) / $$6));
      }

      float $$18 = (float)this.q;
      float $$19 = (float)($$5 - 100);
      if ($$18 < $$19) {
         this.q = (int)((float)this.q - $$6 * (float)ary.f(($$18 - $$19) / $$6));
      }

      this.o = true;
      this.n.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         cmm<?> $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.p + 4 + 25 * ($$20 % $$12);
         int $$24 = this.q + 5 + 25 * ($$20 / $$12);
         if (this.w) {
            this.n.add(new fbx.b($$23, $$24, $$22, $$21));
         } else {
            this.n.add(new fbx.a($$23, $$24, $$22, $$21));
         }
      }

      this.u = null;
   }

   public fcc a() {
      return this.t;
   }

   @Nullable
   public cmm<?> b() {
      return this.u;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (fbx.a $$3 : this.n) {
            if ($$3.a($$0, $$1, $$2)) {
               this.u = $$3.c;
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      if (this.o) {
         this.v += $$3;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.n.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.n.size(), $$4);
         int $$6 = ary.f((float)this.n.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(b, this.p, this.q, $$5 * 25 + 8, $$6 * 25 + 8);
         RenderSystem.disableBlend();

         for (fbx.a $$8 : this.n) {
            $$8.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
      }
   }

   public void b(boolean $$0) {
      this.o = $$0;
   }

   public boolean d() {
      return this.o;
   }

   @Override
   public void b_(boolean $$0) {
   }

   @Override
   public boolean aC_() {
      return false;
   }

   class a extends esq implements aen<cmi> {
      final cmm<?> c;
      private final boolean d;
      protected final List<fbx.a.a> a = Lists.newArrayList();

      public a(int $$0, int $$1, cmm<?> $$2, boolean $$3) {
         super($$0, $$1, 200, 20, tm.a);
         this.f = 24;
         this.g = 24;
         this.c = $$2;
         this.d = $$3;
         this.a($$2);
      }

      protected void a(cmm<?> $$0) {
         this.a(3, 3, -1, $$0, $$0.b().a().iterator(), 0);
      }

      @Override
      public void a(ewk $$0) {
         this.c($$0);
      }

      @Override
      public void a(Iterator<cmi> $$0, int $$1, int $$2, int $$3, int $$4) {
         cjh[] $$5 = $$0.next().a();
         if ($$5.length != 0) {
            this.a.add(new fbx.a.a(3 + $$4 * 7, 3 + $$3 * 7, $$5));
         }
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         aey $$4;
         if (this.d) {
            if (fbx.this.w) {
               $$4 = this.o() ? fbx.c : fbx.d;
            } else {
               $$4 = this.o() ? fbx.e : fbx.f;
            }
         } else if (fbx.this.w) {
            $$4 = this.o() ? fbx.g : fbx.h;
         } else {
            $$4 = this.o() ? fbx.i : fbx.j;
         }

         $$0.a($$4, this.r(), this.t(), this.f, this.g);
         $$0.c().a();
         $$0.c().a((double)(this.r() + 2), (double)(this.t() + 2), 150.0);

         for (fbx.a.a $$8 : this.a) {
            $$0.c().a();
            $$0.c().a((double)$$8.b, (double)$$8.c, 0.0);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0, -8.0, 0.0);
            if ($$8.a.length > 0) {
               $$0.a($$8.a[ary.d(fbx.this.v / 30.0F) % $$8.a.length], 0, 0);
            }

            $$0.c().b();
         }

         $$0.c().b();
      }

      protected class a {
         public final cjh[] a;
         public final int b;
         public final int c;

         public a(int $$1, int $$2, cjh[] $$3) {
            this.b = $$1;
            this.c = $$2;
            this.a = $$3;
         }
      }
   }

   class b extends fbx.a {
      public b(int $$0, int $$1, cmm<?> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      protected void a(cmm<?> $$0) {
         cmi $$1 = $$0.b().a().get(0);
         cjh[] $$2 = $$1.a();
         this.a.add(new fbx.a.a(10, 10, $$2));
      }
   }
}
