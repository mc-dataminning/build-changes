import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class fkq extends fko {
   private final fkq.b c;
   private final List<fkq.a> d = new ArrayList<>();
   private final fkw e = fkw.i();

   public fkq(int $$0, int $$1, fkq.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public fkq(int $$0, int $$1, int $$2, int $$3, fkq.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (fkq.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<fkq.a> $$5 = this.d.iterator();
         fkq.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               fkq.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (fkq.a $$10 : this.d) {
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
   public void b(Consumer<fkv> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public fkw b() {
      return this.e.g();
   }

   public fkw c() {
      return this.e;
   }

   public <T extends fkv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fkv> T a(T $$0, fkw $$1) {
      this.d.add(new fkq.a($$0, $$1));
      return $$0;
   }

   public <T extends fkv> T a(T $$0, Consumer<fkw> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends fko.a {
      protected a(fkv $$0, fkw $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(fkv $$0) {
         return switch (this) {
            case a -> $$0.x();
            case b -> $$0.v();
         };
      }

      int a(fkq.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(fkv $$0) {
         return switch (this) {
            case a -> $$0.v();
            case b -> $$0.x();
         };
      }

      int b(fkq.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(fkq.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(fkq.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(fkv $$0) {
         return switch (this) {
            case a -> $$0.C();
            case b -> $$0.D();
         };
      }

      int d(fkv $$0) {
         return switch (this) {
            case a -> $$0.D();
            case b -> $$0.C();
         };
      }
   }
}
