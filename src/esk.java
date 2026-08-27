import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class esk extends esd {
   private final esk.b c;
   private final List<esk.a> d = new ArrayList<>();
   private final esj e = esj.i();

   public esk(int $$0, int $$1, esk.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public esk(int $$0, int $$1, int $$2, int $$3, esk.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void c() {
      super.c();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (esk.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<esk.a> $$5 = this.d.iterator();
         esk.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               esk.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (esk.a $$10 : this.d) {
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
   public void b(Consumer<esi> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public esj a() {
      return this.e.g();
   }

   public esj b() {
      return this.e;
   }

   public <T extends esi> T a(T $$0) {
      return this.a($$0, this.a());
   }

   public <T extends esi> T a(T $$0, esj $$1) {
      this.d.add(new esk.a($$0, $$1));
      return $$0;
   }

   static class a extends esd.a {
      protected a(esi $$0, esj $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(esi $$0) {
         return switch (this) {
            case a -> $$0.k();
            case b -> $$0.h();
         };
      }

      int a(esk.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(esi $$0) {
         return switch (this) {
            case a -> $$0.h();
            case b -> $$0.k();
         };
      }

      int b(esk.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(esk.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(esk.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(esi $$0) {
         return switch (this) {
            case a -> $$0.p();
            case b -> $$0.r();
         };
      }

      int d(esi $$0) {
         return switch (this) {
            case a -> $$0.r();
            case b -> $$0.p();
         };
      }
   }
}
