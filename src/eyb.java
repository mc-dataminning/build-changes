import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class eyb implements eqh, eqt {
   static final acq b = new acq("textures/gui/recipe_book.png");
   private static final int c = 4;
   private static final int d = 5;
   private static final float e = 0.375F;
   public static final int a = 25;
   private final List<eyb.a> f = Lists.newArrayList();
   private boolean g;
   private int h;
   private int i;
   private enn j;
   private eyg k;
   @Nullable
   private cjc<?> l;
   float m;
   boolean n;

   public void a(enn $$0, eyg $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.j = $$0;
      this.k = $$1;
      if ($$0.t.bR instanceof cbg) {
         this.n = true;
      }

      boolean $$7 = $$0.t.x().a((ccp<?>)$$0.t.bR);
      List<cjc<?>> $$8 = $$1.b(true);
      List<cjc<?>> $$9 = $$7 ? Collections.emptyList() : $$1.b(false);
      int $$10 = $$8.size();
      int $$11 = $$10 + $$9.size();
      int $$12 = $$11 <= 16 ? 4 : 5;
      int $$13 = (int)Math.ceil((double)((float)$$11 / (float)$$12));
      this.h = $$2;
      this.i = $$3;
      float $$14 = (float)(this.h + Math.min($$11, $$12) * 25);
      float $$15 = (float)($$4 + 50);
      if ($$14 > $$15) {
         this.h = (int)((float)this.h - $$6 * (float)((int)(($$14 - $$15) / $$6)));
      }

      float $$16 = (float)(this.i + $$13 * 25);
      float $$17 = (float)($$5 + 50);
      if ($$16 > $$17) {
         this.i = (int)((float)this.i - $$6 * (float)apa.f(($$16 - $$17) / $$6));
      }

      float $$18 = (float)this.i;
      float $$19 = (float)($$5 - 100);
      if ($$18 < $$19) {
         this.i = (int)((float)this.i - $$6 * (float)apa.f(($$18 - $$19) / $$6));
      }

      this.g = true;
      this.f.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         cjc<?> $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.h + 4 + 25 * ($$20 % $$12);
         int $$24 = this.i + 5 + 25 * ($$20 / $$12);
         if (this.n) {
            this.f.add(new eyb.b($$23, $$24, $$22, $$21));
         } else {
            this.f.add(new eyb.a($$23, $$24, $$22, $$21));
         }
      }

      this.l = null;
   }

   public eyg a() {
      return this.k;
   }

   @Nullable
   public cjc<?> b() {
      return this.l;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (eyb.a $$3 : this.f) {
            if ($$3.a($$0, $$1, $$2)) {
               this.l = $$3.c;
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
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.g) {
         this.m += $$3;
         RenderSystem.enableBlend();
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.f.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.f.size(), $$4);
         int $$6 = apa.f((float)this.f.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(b, this.h, this.i, $$5 * 25 + 8, $$6 * 25 + 8, 4, 32, 32, 82, 208);
         RenderSystem.disableBlend();

         for (eyb.a $$8 : this.f) {
            $$8.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
      }
   }

   public void b(boolean $$0) {
      this.g = $$0;
   }

   public boolean d() {
      return this.g;
   }

   @Override
   public void b_(boolean $$0) {
   }

   @Override
   public boolean aB_() {
      return false;
   }

   class a extends epf implements acf<ciz> {
      final cjc<?> c;
      private final boolean d;
      protected final List<eyb.a.a> a = Lists.newArrayList();

      public a(int $$0, int $$1, cjc<?> $$2, boolean $$3) {
         super($$0, $$1, 200, 20, sv.a);
         this.o = 24;
         this.p = 24;
         this.c = $$2;
         this.d = $$3;
         this.a($$2);
      }

      protected void a(cjc<?> $$0) {
         this.a(3, 3, -1, $$0, $$0.a().iterator(), 0);
      }

      @Override
      public void a(esp $$0) {
         this.c($$0);
      }

      @Override
      public void a(Iterator<ciz> $$0, int $$1, int $$2, int $$3, int $$4) {
         cfz[] $$5 = $$0.next().a();
         if ($$5.length != 0) {
            this.a.add(new eyb.a.a(3 + $$4 * 7, 3 + $$3 * 7, $$5));
         }
      }

      @Override
      public void b(eox $$0, int $$1, int $$2, float $$3) {
         int $$4 = 152;
         if (!this.d) {
            $$4 += 26;
         }

         int $$5 = eyb.this.n ? 130 : 78;
         if (this.n()) {
            $$5 += 26;
         }

         $$0.a(eyb.b, this.p(), this.r(), $$4, $$5, this.o, this.p);
         $$0.c().a();
         $$0.c().a((double)(this.p() + 2), (double)(this.r() + 2), 150.0);

         for (eyb.a.a $$6 : this.a) {
            $$0.c().a();
            $$0.c().a((double)$$6.b, (double)$$6.c, 0.0);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0, -8.0, 0.0);
            if ($$6.a.length > 0) {
               $$0.a($$6.a[apa.d(eyb.this.m / 30.0F) % $$6.a.length], 0, 0);
            }

            $$0.c().b();
         }

         $$0.c().b();
      }

      protected class a {
         public final cfz[] a;
         public final int b;
         public final int c;

         public a(int $$1, int $$2, cfz[] $$3) {
            this.b = $$1;
            this.c = $$2;
            this.a = $$3;
         }
      }
   }

   class b extends eyb.a {
      public b(int $$0, int $$1, cjc<?> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      protected void a(cjc<?> $$0) {
         cfz[] $$1 = $$0.a().get(0).a();
         this.a.add(new eyb.a.a(10, 10, $$1));
      }
   }
}
