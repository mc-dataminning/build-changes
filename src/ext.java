import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ext extends exr {
   private final ext.b c;
   private final List<ext.a> d = new ArrayList<>();
   private final exz e = exz.i();

   public ext(int $$0, int $$1, ext.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public ext(int $$0, int $$1, int $$2, int $$3, ext.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (ext.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<ext.a> $$5 = this.d.iterator();
         ext.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               ext.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (ext.a $$10 : this.d) {
            this.c.a($$10, $$9, $$1);
         }

         switch (this.c) {
            case a:
               this.b = $$1;
               break;
            case b:
               this.a = $$1;
         }
      }
   }

   @Override
   public void b(Consumer<exy> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public exz b() {
      return this.e.g();
   }

   public exz c() {
      return this.e;
   }

   public <T extends exy> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends exy> T a(T $$0, exz $$1) {
      this.d.add(new ext.a($$0, $$1));
      return $$0;
   }

   public <T extends exy> T a(T $$0, Consumer<exz> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends exr.a {
      protected a(exy $$0, exz $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(exy $$0) {
         return switch (this) {
            case a -> $$0.k();
            case b -> $$0.i();
         };
      }

      int a(ext.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(exy $$0) {
         return switch (this) {
            case a -> $$0.i();
            case b -> $$0.k();
         };
      }

      int b(ext.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(ext.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(ext.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(exy $$0) {
         return switch (this) {
            case a -> $$0.p();
            case b -> $$0.r();
         };
      }

      int d(exy $$0) {
         return switch (this) {
            case a -> $$0.r();
            case b -> $$0.p();
         };
      }
   }
}
