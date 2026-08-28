import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class fpp extends fpn {
   private final fpp.b c;
   private final List<fpp.a> d = new ArrayList<>();
   private final fpv e = fpv.i();

   public fpp(int $$0, int $$1, fpp.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public fpp(int $$0, int $$1, int $$2, int $$3, fpp.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (fpp.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<fpp.a> $$5 = this.d.iterator();
         fpp.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               fpp.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (fpp.a $$10 : this.d) {
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
   public void b(Consumer<fpu> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public fpv b() {
      return this.e.g();
   }

   public fpv c() {
      return this.e;
   }

   public <T extends fpu> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fpu> T a(T $$0, fpv $$1) {
      this.d.add(new fpp.a($$0, $$1));
      return $$0;
   }

   public <T extends fpu> T a(T $$0, Consumer<fpv> $$1) {
      return this.a($$0, ae.a(this.b(), $$1));
   }

   static class a extends fpn.a {
      protected a(fpu $$0, fpv $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(fpu $$0) {
         return switch (this) {
            case a -> $$0.y();
            case b -> $$0.w();
         };
      }

      int a(fpp.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(fpu $$0) {
         return switch (this) {
            case a -> $$0.w();
            case b -> $$0.y();
         };
      }

      int b(fpp.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(fpp.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(fpp.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(fpu $$0) {
         return switch (this) {
            case a -> $$0.D();
            case b -> $$0.E();
         };
      }

      int d(fpu $$0) {
         return switch (this) {
            case a -> $$0.E();
            case b -> $$0.D();
         };
      }
   }
}
