import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class evy extends evw {
   private final evy.b c;
   private final List<evy.a> d = new ArrayList<>();
   private final ewe e = ewe.i();

   public evy(int $$0, int $$1, evy.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public evy(int $$0, int $$1, int $$2, int $$3, evy.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (evy.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<evy.a> $$5 = this.d.iterator();
         evy.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               evy.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (evy.a $$10 : this.d) {
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
   public void b(Consumer<ewd> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public ewe b() {
      return this.e.g();
   }

   public ewe c() {
      return this.e;
   }

   public <T extends ewd> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends ewd> T a(T $$0, ewe $$1) {
      this.d.add(new evy.a($$0, $$1));
      return $$0;
   }

   public <T extends ewd> T a(T $$0, Consumer<ewe> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends evw.a {
      protected a(ewd $$0, ewe $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(ewd $$0) {
         return switch (this) {
            case a -> $$0.l();
            case b -> $$0.i();
         };
      }

      int a(evy.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(ewd $$0) {
         return switch (this) {
            case a -> $$0.i();
            case b -> $$0.l();
         };
      }

      int b(evy.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(evy.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(evy.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(ewd $$0) {
         return switch (this) {
            case a -> $$0.r();
            case b -> $$0.t();
         };
      }

      int d(ewd $$0) {
         return switch (this) {
            case a -> $$0.t();
            case b -> $$0.r();
         };
      }
   }
}
