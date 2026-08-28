import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class frz implements fjp, fki {
   private static final akr b = akr.b("recipe_book/overlay_recipe");
   static final akr c = akr.b("recipe_book/furnace_overlay_highlighted");
   static final akr d = akr.b("recipe_book/furnace_overlay");
   static final akr e = akr.b("recipe_book/crafting_overlay_highlighted");
   static final akr f = akr.b("recipe_book/crafting_overlay");
   static final akr g = akr.b("recipe_book/furnace_overlay_disabled_highlighted");
   static final akr h = akr.b("recipe_book/furnace_overlay_disabled");
   static final akr i = akr.b("recipe_book/crafting_overlay_disabled_highlighted");
   static final akr j = akr.b("recipe_book/crafting_overlay_disabled");
   private static final int k = 4;
   private static final int l = 5;
   private static final float m = 0.375F;
   public static final int a = 25;
   private final List<frz.a> n = Lists.newArrayList();
   private boolean o;
   private int p;
   private int q;
   private fgo r;
   private fse s;
   @Nullable
   private czb<?> u;
   float v;
   boolean w;

   public void a(fgo $$0, fse $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.r = $$0;
      this.s = $$1;
      if ($$0.s.cd instanceof cpv) {
         this.w = true;
      }

      boolean $$7 = $$0.s.m().a((cri<?, ?>)$$0.s.cd);
      List<czb<?>> $$8 = $$1.b(true);
      List<czb<?>> $$9 = $$7 ? Collections.emptyList() : $$1.b(false);
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
         this.q = (int)((float)this.q - $$6 * (float)ayo.f(($$16 - $$17) / $$6));
      }

      float $$18 = (float)this.q;
      float $$19 = (float)($$5 - 100);
      if ($$18 < $$19) {
         this.q = (int)((float)this.q - $$6 * (float)ayo.f(($$18 - $$19) / $$6));
      }

      this.o = true;
      this.n.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         czb<?> $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.p + 4 + 25 * ($$20 % $$12);
         int $$24 = this.q + 5 + 25 * ($$20 / $$12);
         if (this.w) {
            this.n.add(new frz.b($$23, $$24, $$22, $$21));
         } else {
            this.n.add(new frz.a($$23, $$24, $$22, $$21));
         }
      }

      this.u = null;
   }

   public fse a() {
      return this.s;
   }

   @Nullable
   public czb<?> b() {
      return this.u;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (frz.a $$3 : this.n) {
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
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.o) {
         this.v += $$3;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.n.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.n.size(), $$4);
         int $$6 = ayo.f((float)this.n.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(b, this.p, this.q, $$5 * 25 + 8, $$6 * 25 + 8);
         RenderSystem.disableBlend();

         for (frz.a $$8 : this.n) {
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
   public boolean aO_() {
      return false;
   }

   class a extends fik implements ake<cyw> {
      final czb<?> c;
      private final boolean d;
      protected final List<frz.a.a> a = Lists.newArrayList();

      public a(final int $$0, final int $$1, final czb<?> $$2, final boolean $$3) {
         super($$0, $$1, 200, 20, wy.a);
         this.g = 24;
         this.h = 24;
         this.c = $$2;
         this.d = $$3;
         this.a($$2);
      }

      protected void a(czb<?> $$0) {
         this.a(3, 3, -1, $$0, $$0.b().a().iterator(), 0);
      }

      @Override
      public void a(fmi $$0) {
         this.c($$0);
      }

      public void a(cyw $$0, int $$1, int $$2, int $$3, int $$4) {
         cuq[] $$5 = $$0.a();
         if ($$5.length != 0) {
            this.a.add(new frz.a.a(3 + $$3 * 7, 3 + $$4 * 7, $$5));
         }
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
         akr $$4;
         if (this.d) {
            if (frz.this.w) {
               $$4 = this.B() ? frz.c : frz.d;
            } else {
               $$4 = this.B() ? frz.e : frz.f;
            }
         } else if (frz.this.w) {
            $$4 = this.B() ? frz.g : frz.h;
         } else {
            $$4 = this.B() ? frz.i : frz.j;
         }

         $$0.a($$4, this.D(), this.E(), this.g, this.h);
         $$0.c().a();
         $$0.c().a((double)(this.D() + 2), (double)(this.E() + 2), 150.0);

         for (frz.a.a $$8 : this.a) {
            $$0.c().a();
            $$0.c().a((double)$$8.b, (double)$$8.c, 0.0);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0, -8.0, 0.0);
            if ($$8.a.length > 0) {
               $$0.a($$8.a[ayo.d(frz.this.v / 30.0F) % $$8.a.length], 0, 0);
            }

            $$0.c().b();
         }

         $$0.c().b();
      }

      protected class a {
         public final cuq[] a;
         public final int b;
         public final int c;

         public a(final int $$1, final int $$2, final cuq[] $$3) {
            this.b = $$1;
            this.c = $$2;
            this.a = $$3;
         }
      }
   }

   class b extends frz.a {
      public b(final int $$0, final int $$1, final czb<?> $$2, final boolean $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      protected void a(czb<?> $$0) {
         cyw $$1 = $$0.b().a().get(0);
         cuq[] $$2 = $$1.a();
         this.a.add(new frz.a.a(10, 10, $$2));
      }
   }
}
