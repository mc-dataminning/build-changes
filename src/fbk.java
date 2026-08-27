import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class fbk implements eti, eua {
   private static final aer b = new aer("recipe_book/overlay_recipe");
   static final aer c = new aer("recipe_book/furnace_overlay_highlighted");
   static final aer d = new aer("recipe_book/furnace_overlay");
   static final aer e = new aer("recipe_book/crafting_overlay_highlighted");
   static final aer f = new aer("recipe_book/crafting_overlay");
   static final aer g = new aer("recipe_book/furnace_overlay_disabled_highlighted");
   static final aer h = new aer("recipe_book/furnace_overlay_disabled");
   static final aer i = new aer("recipe_book/crafting_overlay_disabled_highlighted");
   static final aer j = new aer("recipe_book/crafting_overlay_disabled");
   private static final int k = 4;
   private static final int l = 5;
   private static final float m = 0.375F;
   public static final int a = 25;
   private final List<fbk.a> n = Lists.newArrayList();
   private boolean o;
   private int p;
   private int q;
   private eqm s;
   private fbp t;
   @Nullable
   private cmb<?> u;
   float v;
   boolean w;

   public void a(eqm $$0, fbp $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.s = $$0;
      this.t = $$1;
      if ($$0.v.bQ instanceof cef) {
         this.w = true;
      }

      boolean $$7 = $$0.v.m().a((cfo<?>)$$0.v.bQ);
      List<cmb<?>> $$8 = $$1.b(true);
      List<cmb<?>> $$9 = $$7 ? Collections.emptyList() : $$1.b(false);
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
         this.q = (int)((float)this.q - $$6 * (float)arp.f(($$16 - $$17) / $$6));
      }

      float $$18 = (float)this.q;
      float $$19 = (float)($$5 - 100);
      if ($$18 < $$19) {
         this.q = (int)((float)this.q - $$6 * (float)arp.f(($$18 - $$19) / $$6));
      }

      this.o = true;
      this.n.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         cmb<?> $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.p + 4 + 25 * ($$20 % $$12);
         int $$24 = this.q + 5 + 25 * ($$20 / $$12);
         if (this.w) {
            this.n.add(new fbk.b($$23, $$24, $$22, $$21));
         } else {
            this.n.add(new fbk.a($$23, $$24, $$22, $$21));
         }
      }

      this.u = null;
   }

   public fbp a() {
      return this.t;
   }

   @Nullable
   public cmb<?> b() {
      return this.u;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (fbk.a $$3 : this.n) {
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      if (this.o) {
         this.v += $$3;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.n.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.n.size(), $$4);
         int $$6 = arp.f((float)this.n.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(b, this.p, this.q, $$5 * 25 + 8, $$6 * 25 + 8);
         RenderSystem.disableBlend();

         for (fbk.a $$8 : this.n) {
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
   public void c_(boolean $$0) {
   }

   @Override
   public boolean ax_() {
      return false;
   }

   class a extends esf implements aeg<cly> {
      final cmb<?> c;
      private final boolean d;
      protected final List<fbk.a.a> a = Lists.newArrayList();

      public a(int $$0, int $$1, cmb<?> $$2, boolean $$3) {
         super($$0, $$1, 200, 20, te.a);
         this.f = 24;
         this.g = 24;
         this.c = $$2;
         this.d = $$3;
         this.a($$2);
      }

      protected void a(cmb<?> $$0) {
         this.a(3, 3, -1, $$0, $$0.a().iterator(), 0);
      }

      @Override
      public void a(evx $$0) {
         this.c($$0);
      }

      @Override
      public void a(Iterator<cly> $$0, int $$1, int $$2, int $$3, int $$4) {
         ciy[] $$5 = $$0.next().a();
         if ($$5.length != 0) {
            this.a.add(new fbk.a.a(3 + $$4 * 7, 3 + $$3 * 7, $$5));
         }
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         aer $$4;
         if (this.d) {
            if (fbk.this.w) {
               $$4 = this.n() ? fbk.c : fbk.d;
            } else {
               $$4 = this.n() ? fbk.e : fbk.f;
            }
         } else if (fbk.this.w) {
            $$4 = this.n() ? fbk.g : fbk.h;
         } else {
            $$4 = this.n() ? fbk.i : fbk.j;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         $$0.c().a();
         $$0.c().a((double)(this.p() + 2), (double)(this.r() + 2), 150.0);

         for (fbk.a.a $$8 : this.a) {
            $$0.c().a();
            $$0.c().a((double)$$8.b, (double)$$8.c, 0.0);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0, -8.0, 0.0);
            if ($$8.a.length > 0) {
               $$0.a($$8.a[arp.d(fbk.this.v / 30.0F) % $$8.a.length], 0, 0);
            }

            $$0.c().b();
         }

         $$0.c().b();
      }

      protected class a {
         public final ciy[] a;
         public final int b;
         public final int c;

         public a(int $$1, int $$2, ciy[] $$3) {
            this.b = $$1;
            this.c = $$2;
            this.a = $$3;
         }
      }
   }

   class b extends fbk.a {
      public b(int $$0, int $$1, cmb<?> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      protected void a(cmb<?> $$0) {
         ciy[] $$1 = $$0.a().get(0).a();
         this.a.add(new fbk.a.a(10, 10, $$1));
      }
   }
}
