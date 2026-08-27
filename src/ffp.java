import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class ffp implements exk, eyc {
   private static final agt b = new agt("recipe_book/overlay_recipe");
   static final agt c = new agt("recipe_book/furnace_overlay_highlighted");
   static final agt d = new agt("recipe_book/furnace_overlay");
   static final agt e = new agt("recipe_book/crafting_overlay_highlighted");
   static final agt f = new agt("recipe_book/crafting_overlay");
   static final agt g = new agt("recipe_book/furnace_overlay_disabled_highlighted");
   static final agt h = new agt("recipe_book/furnace_overlay_disabled");
   static final agt i = new agt("recipe_book/crafting_overlay_disabled_highlighted");
   static final agt j = new agt("recipe_book/crafting_overlay_disabled");
   private static final int k = 4;
   private static final int l = 5;
   private static final float m = 0.375F;
   public static final int a = 25;
   private final List<ffp.a> n = Lists.newArrayList();
   private boolean o;
   private int p;
   private int q;
   private euk r;
   private ffu t;
   @Nullable
   private cpn<?> u;
   float v;
   boolean w;

   public void a(euk $$0, ffu $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.r = $$0;
      this.t = $$1;
      if ($$0.s.bS instanceof chl) {
         this.w = true;
      }

      boolean $$7 = $$0.s.m().a((cix<?>)$$0.s.bS);
      List<cpn<?>> $$8 = $$1.b(true);
      List<cpn<?>> $$9 = $$7 ? Collections.emptyList() : $$1.b(false);
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
         this.q = (int)((float)this.q - $$6 * (float)aty.f(($$16 - $$17) / $$6));
      }

      float $$18 = (float)this.q;
      float $$19 = (float)($$5 - 100);
      if ($$18 < $$19) {
         this.q = (int)((float)this.q - $$6 * (float)aty.f(($$18 - $$19) / $$6));
      }

      this.o = true;
      this.n.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         cpn<?> $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.p + 4 + 25 * ($$20 % $$12);
         int $$24 = this.q + 5 + 25 * ($$20 / $$12);
         if (this.w) {
            this.n.add(new ffp.b($$23, $$24, $$22, $$21));
         } else {
            this.n.add(new ffp.a($$23, $$24, $$22, $$21));
         }
      }

      this.u = null;
   }

   public ffu a() {
      return this.t;
   }

   @Nullable
   public cpn<?> b() {
      return this.u;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (ffp.a $$3 : this.n) {
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      if (this.o) {
         this.v += $$3;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.n.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.n.size(), $$4);
         int $$6 = aty.f((float)this.n.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(b, this.p, this.q, $$5 * 25 + 8, $$6 * 25 + 8);
         RenderSystem.disableBlend();

         for (ffp.a $$8 : this.n) {
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
   public boolean aJ_() {
      return false;
   }

   class a extends ewf implements agg<cpi> {
      final cpn<?> c;
      private final boolean d;
      protected final List<ffp.a.a> a = Lists.newArrayList();

      public a(int $$0, int $$1, cpn<?> $$2, boolean $$3) {
         super($$0, $$1, 200, 20, va.a);
         this.f = 24;
         this.g = 24;
         this.c = $$2;
         this.d = $$3;
         this.a($$2);
      }

      protected void a(cpn<?> $$0) {
         this.a(3, 3, -1, $$0, $$0.b().a().iterator(), 0);
      }

      @Override
      public void a(faa $$0) {
         this.c($$0);
      }

      @Override
      public void a(Iterator<cpi> $$0, int $$1, int $$2, int $$3, int $$4) {
         cmh[] $$5 = $$0.next().a();
         if ($$5.length != 0) {
            this.a.add(new ffp.a.a(3 + $$4 * 7, 3 + $$3 * 7, $$5));
         }
      }

      @Override
      public void b(evw $$0, int $$1, int $$2, float $$3) {
         agt $$4;
         if (this.d) {
            if (ffp.this.w) {
               $$4 = this.n() ? ffp.c : ffp.d;
            } else {
               $$4 = this.n() ? ffp.e : ffp.f;
            }
         } else if (ffp.this.w) {
            $$4 = this.n() ? ffp.g : ffp.h;
         } else {
            $$4 = this.n() ? ffp.i : ffp.j;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         $$0.c().a();
         $$0.c().a((double)(this.p() + 2), (double)(this.r() + 2), 150.0);

         for (ffp.a.a $$8 : this.a) {
            $$0.c().a();
            $$0.c().a((double)$$8.b, (double)$$8.c, 0.0);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0, -8.0, 0.0);
            if ($$8.a.length > 0) {
               $$0.a($$8.a[aty.d(ffp.this.v / 30.0F) % $$8.a.length], 0, 0);
            }

            $$0.c().b();
         }

         $$0.c().b();
      }

      protected class a {
         public final cmh[] a;
         public final int b;
         public final int c;

         public a(int $$1, int $$2, cmh[] $$3) {
            this.b = $$1;
            this.c = $$2;
            this.a = $$3;
         }
      }
   }

   class b extends ffp.a {
      public b(int $$0, int $$1, cpn<?> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      protected void a(cpn<?> $$0) {
         cpi $$1 = $$0.b().a().get(0);
         cmh[] $$2 = $$1.a();
         this.a.add(new ffp.a.a(10, 10, $$2));
      }
   }
}
