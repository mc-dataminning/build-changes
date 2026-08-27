import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class fan extends fal {
   private final fan.b c;
   private final List<fan.a> d = new ArrayList<>();
   private final fat e = fat.i();

   public fan(int $$0, int $$1, fan.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public fan(int $$0, int $$1, int $$2, int $$3, fan.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (fan.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<fan.a> $$5 = this.d.iterator();
         fan.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               fan.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (fan.a $$10 : this.d) {
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
   public void b(Consumer<fas> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public fat b() {
      return this.e.g();
   }

   public fat c() {
      return this.e;
   }

   public <T extends fas> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fas> T a(T $$0, fat $$1) {
      this.d.add(new fan.a($$0, $$1));
      return $$0;
   }

   public <T extends fas> T a(T $$0, Consumer<fat> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends fal.a {
      protected a(fas $$0, fat $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(fas $$0) {
         return switch (this) {
            case a -> $$0.w();
            case b -> $$0.u();
         };
      }

      int a(fan.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(fas $$0) {
         return switch (this) {
            case a -> $$0.u();
            case b -> $$0.w();
         };
      }

      int b(fan.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(fan.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(fan.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(fas $$0) {
         return switch (this) {
            case a -> $$0.B();
            case b -> $$0.C();
         };
      }

      int d(fas $$0) {
         return switch (this) {
            case a -> $$0.C();
            case b -> $$0.B();
         };
      }
   }
}
