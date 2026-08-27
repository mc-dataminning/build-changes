import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class fio extends fim {
   private final fio.b c;
   private final List<fio.a> d = new ArrayList<>();
   private final fiu e = fiu.i();

   public fio(int $$0, int $$1, fio.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public fio(int $$0, int $$1, int $$2, int $$3, fio.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (fio.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<fio.a> $$5 = this.d.iterator();
         fio.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               fio.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (fio.a $$10 : this.d) {
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
   public void b(Consumer<fit> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public fiu b() {
      return this.e.g();
   }

   public fiu c() {
      return this.e;
   }

   public <T extends fit> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fit> T a(T $$0, fiu $$1) {
      this.d.add(new fio.a($$0, $$1));
      return $$0;
   }

   public <T extends fit> T a(T $$0, Consumer<fiu> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends fim.a {
      protected a(fit $$0, fiu $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(fit $$0) {
         return switch (this) {
            case a -> $$0.x();
            case b -> $$0.v();
         };
      }

      int a(fio.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(fit $$0) {
         return switch (this) {
            case a -> $$0.v();
            case b -> $$0.x();
         };
      }

      int b(fio.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(fio.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(fio.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(fit $$0) {
         return switch (this) {
            case a -> $$0.C();
            case b -> $$0.D();
         };
      }

      int d(fit $$0) {
         return switch (this) {
            case a -> $$0.D();
            case b -> $$0.C();
         };
      }
   }
}
