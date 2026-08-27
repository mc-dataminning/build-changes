import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class fcx extends fcv {
   private final fcx.b c;
   private final List<fcx.a> d = new ArrayList<>();
   private final fdd e = fdd.i();

   public fcx(int $$0, int $$1, fcx.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public fcx(int $$0, int $$1, int $$2, int $$3, fcx.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (fcx.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<fcx.a> $$5 = this.d.iterator();
         fcx.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               fcx.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (fcx.a $$10 : this.d) {
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
   public void b(Consumer<fdc> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public fdd b() {
      return this.e.g();
   }

   public fdd c() {
      return this.e;
   }

   public <T extends fdc> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fdc> T a(T $$0, fdd $$1) {
      this.d.add(new fcx.a($$0, $$1));
      return $$0;
   }

   public <T extends fdc> T a(T $$0, Consumer<fdd> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends fcv.a {
      protected a(fdc $$0, fdd $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(fdc $$0) {
         return switch (this) {
            case a -> $$0.w();
            case b -> $$0.u();
         };
      }

      int a(fcx.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(fdc $$0) {
         return switch (this) {
            case a -> $$0.u();
            case b -> $$0.w();
         };
      }

      int b(fcx.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(fcx.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(fcx.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(fdc $$0) {
         return switch (this) {
            case a -> $$0.B();
            case b -> $$0.C();
         };
      }

      int d(fdc $$0) {
         return switch (this) {
            case a -> $$0.C();
            case b -> $$0.B();
         };
      }
   }
}
