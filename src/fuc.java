import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fuc implements flr, fml {
   private static final ale b = ale.b("recipe_book/overlay_recipe");
   private static final int c = 4;
   private static final int d = 5;
   private static final float e = 0.375F;
   public static final int a = 25;
   private final List<fuc.b> f = Lists.newArrayList();
   private boolean g;
   private int h;
   private int i;
   private fuh j;
   @Nullable
   private dam<?> k;
   final fuk l;
   private final boolean m;

   public fuc(fuk $$0, boolean $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public void a(fuh $$0, boolean $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.j = $$0;
      List<dam<?>> $$7 = $$0.a(fuh.a.b);
      List<dam<?>> $$8 = $$1 ? Collections.emptyList() : $$0.a(fuh.a.c);
      int $$9 = $$7.size();
      int $$10 = $$9 + $$8.size();
      int $$11 = $$10 <= 16 ? 4 : 5;
      int $$12 = (int)Math.ceil((double)((float)$$10 / (float)$$11));
      this.h = $$2;
      this.i = $$3;
      float $$13 = (float)(this.h + Math.min($$10, $$11) * 25);
      float $$14 = (float)($$4 + 50);
      if ($$13 > $$14) {
         this.h = (int)((float)this.h - $$6 * (float)((int)(($$13 - $$14) / $$6)));
      }

      float $$15 = (float)(this.i + $$12 * 25);
      float $$16 = (float)($$5 + 50);
      if ($$15 > $$16) {
         this.i = (int)((float)this.i - $$6 * (float)azf.f(($$15 - $$16) / $$6));
      }

      float $$17 = (float)this.i;
      float $$18 = (float)($$5 - 100);
      if ($$17 < $$18) {
         this.i = (int)((float)this.i - $$6 * (float)azf.f(($$17 - $$18) / $$6));
      }

      this.g = true;
      this.f.clear();

      for (int $$19 = 0; $$19 < $$10; $$19++) {
         boolean $$20 = $$19 < $$9;
         dam<?> $$21 = $$20 ? $$7.get($$19) : $$8.get($$19 - $$9);
         int $$22 = this.h + 4 + 25 * ($$19 % $$11);
         int $$23 = this.i + 5 + 25 * ($$19 / $$11);
         if (this.m) {
            this.f.add(new fuc.c($$22, $$23, $$21, $$20));
         } else {
            this.f.add(new fuc.a($$22, $$23, $$21, $$20));
         }
      }

      this.k = null;
   }

   public fuh a() {
      return this.j;
   }

   @Nullable
   public dam<?> b() {
      return this.k;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (fuc.b $$3 : this.f) {
            if ($$3.a($$0, $$1, $$2)) {
               this.k = $$3.b;
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
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      if (this.g) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1000.0F);
         int $$4 = this.f.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.f.size(), $$4);
         int $$6 = azf.f((float)this.f.size() / (float)$$4);
         int $$7 = 4;
         $$0.a(ghv::B, b, this.h, this.i, $$5 * 25 + 8, $$6 * 25 + 8);

         for (fuc.b $$8 : this.f) {
            $$8.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
      }
   }

   public void b(boolean $$0) {
      this.g = $$0;
   }

   public boolean c() {
      return this.g;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aN_() {
      return false;
   }

   class a extends fuc.b {
      private static final ale b = ale.b("recipe_book/crafting_overlay");
      private static final ale c = ale.b("recipe_book/crafting_overlay_highlighted");
      private static final ale d = ale.b("recipe_book/crafting_overlay_disabled");
      private static final ale e = ale.b("recipe_book/crafting_overlay_disabled_highlighted");

      public a(final int $$0, final int $$1, final dam<?> $$2, final boolean $$3) {
         super($$0, $$1, $$2, $$3, a($$2));
      }

      private static List<fuc.b.a> a(dam<?> $$0) {
         List<fuc.b.a> $$1 = new ArrayList<>();
         akp.a(3, 3, $$0, $$0.b().a().a(), ($$1x, $$2, $$3, $$4) -> $$1x.ifPresent($$3x -> $$1.add(a($$3, $$4, $$3x.a()))));
         return $$1;
      }

      @Override
      protected ale b(boolean $$0) {
         if ($$0) {
            return this.B() ? c : b;
         } else {
            return this.B() ? e : d;
         }
      }
   }

   abstract class b extends fkm {
      final dam<?> b;
      private final boolean c;
      private final List<fuc.b.a> d;

      public b(final int $$0, final int $$1, final dam<?> $$2, final boolean $$3, final List<fuc.b.a> $$4) {
         super($$0, $$1, 24, 24, xd.a);
         this.d = $$4;
         this.b = $$2;
         this.c = $$3;
      }

      protected static fuc.b.a a(int $$0, int $$1, List<cvs> $$2) {
         return new fuc.b.a(3 + $$0 * 7, 3 + $$1 * 7, $$2);
      }

      protected abstract ale b(boolean var1);

      @Override
      public void a(fol $$0) {
         this.c($$0);
      }

      @Override
      public void b(fkb $$0, int $$1, int $$2, float $$3) {
         $$0.a(ghv::B, this.b(this.c), this.D(), this.E(), this.g, this.h);
         float $$4 = (float)(this.D() + 2);
         float $$5 = (float)(this.E() + 2);
         float $$6 = 150.0F;

         for (fuc.b.a $$7 : this.d) {
            $$0.c().a();
            $$0.c().a($$4 + (float)$$7.a, $$5 + (float)$$7.b, 150.0F);
            $$0.c().b(0.375F, 0.375F, 1.0F);
            $$0.c().a(-8.0F, -8.0F, 0.0F);
            $$0.a($$7.a(fuc.this.l.currentIndex()), 0, 0);
            $$0.c().b();
         }
      }

      protected static record a(int a, int b, List<cvs> c) {

         public a(int a, int b, List<cvs> c) {
            if (c.isEmpty()) {
               throw new IllegalArgumentException("Ingredient list must be non-empty");
            } else {
               this.a = a;
               this.b = b;
               this.c = c;
            }
         }

         public cvs a(int $$0) {
            return this.c.get($$0 % this.c.size());
         }
      }
   }

   class c extends fuc.b {
      private static final ale b = ale.b("recipe_book/furnace_overlay");
      private static final ale c = ale.b("recipe_book/furnace_overlay_highlighted");
      private static final ale d = ale.b("recipe_book/furnace_overlay_disabled");
      private static final ale e = ale.b("recipe_book/furnace_overlay_disabled_highlighted");

      public c(final int $$0, final int $$1, final dam<?> $$2, final boolean $$3) {
         super($$0, $$1, $$2, $$3, a($$2));
      }

      private static List<fuc.b.a> a(dam<?> $$0) {
         return $$0.b().a().a().getFirst().<List<fuc.b.a>>map($$0x -> List.of(a(1, 1, $$0x.a()))).orElse(List.of());
      }

      @Override
      protected ale b(boolean $$0) {
         if ($$0) {
            return this.B() ? c : b;
         } else {
            return this.B() ? e : d;
         }
      }
   }
}
