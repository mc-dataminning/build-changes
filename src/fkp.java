import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class fkp extends fkn {
   private final fkp.b c;
   private final List<fkp.a> d = new ArrayList<>();
   private final fkv e = fkv.i();

   public fkp(int $$0, int $$1, fkp.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public fkp(int $$0, int $$1, int $$2, int $$3, fkp.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (fkp.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<fkp.a> $$5 = this.d.iterator();
         fkp.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               fkp.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (fkp.a $$10 : this.d) {
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
   public void b(Consumer<fku> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public fkv b() {
      return this.e.g();
   }

   public fkv c() {
      return this.e;
   }

   public <T extends fku> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fku> T a(T $$0, fkv $$1) {
      this.d.add(new fkp.a($$0, $$1));
      return $$0;
   }

   public <T extends fku> T a(T $$0, Consumer<fkv> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends fkn.a {
      protected a(fku $$0, fkv $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(fku $$0) {
         return switch (this) {
            case a -> $$0.x();
            case b -> $$0.v();
         };
      }

      int a(fkp.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(fku $$0) {
         return switch (this) {
            case a -> $$0.v();
            case b -> $$0.x();
         };
      }

      int b(fkp.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(fkp.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(fkp.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(fku $$0) {
         return switch (this) {
            case a -> $$0.C();
            case b -> $$0.D();
         };
      }

      int d(fku $$0) {
         return switch (this) {
            case a -> $$0.D();
            case b -> $$0.C();
         };
      }
   }
}
