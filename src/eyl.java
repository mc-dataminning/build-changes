import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class eyl extends eyj {
   private final eyl.b c;
   private final List<eyl.a> d = new ArrayList<>();
   private final eyr e = eyr.i();

   public eyl(int $$0, int $$1, eyl.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public eyl(int $$0, int $$1, int $$2, int $$3, eyl.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (eyl.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<eyl.a> $$5 = this.d.iterator();
         eyl.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               eyl.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (eyl.a $$10 : this.d) {
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
   public void b(Consumer<eyq> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public eyr b() {
      return this.e.g();
   }

   public eyr c() {
      return this.e;
   }

   public <T extends eyq> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends eyq> T a(T $$0, eyr $$1) {
      this.d.add(new eyl.a($$0, $$1));
      return $$0;
   }

   public <T extends eyq> T a(T $$0, Consumer<eyr> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends eyj.a {
      protected a(eyq $$0, eyr $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(eyq $$0) {
         return switch (this) {
            case a -> $$0.k();
            case b -> $$0.i();
         };
      }

      int a(eyl.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(eyq $$0) {
         return switch (this) {
            case a -> $$0.i();
            case b -> $$0.k();
         };
      }

      int b(eyl.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(eyl.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(eyl.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(eyq $$0) {
         return switch (this) {
            case a -> $$0.p();
            case b -> $$0.r();
         };
      }

      int d(eyq $$0) {
         return switch (this) {
            case a -> $$0.r();
            case b -> $$0.p();
         };
      }
   }
}
