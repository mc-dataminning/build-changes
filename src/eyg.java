import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class eyg extends eye {
   private final eyg.b c;
   private final List<eyg.a> d = new ArrayList<>();
   private final eym e = eym.i();

   public eyg(int $$0, int $$1, eyg.b $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public eyg(int $$0, int $$1, int $$2, int $$3, eyg.b $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
   }

   @Override
   public void a() {
      super.a();
      if (!this.d.isEmpty()) {
         int $$0 = 0;
         int $$1 = this.c.b(this);

         for (eyg.a $$2 : this.d) {
            $$0 += this.c.a($$2);
            $$1 = Math.max($$1, this.c.b($$2));
         }

         int $$3 = this.c.a(this) - $$0;
         int $$4 = this.c.c(this);
         Iterator<eyg.a> $$5 = this.d.iterator();
         eyg.a $$6 = $$5.next();
         this.c.a($$6, $$4);
         $$4 += this.c.a($$6);
         if (this.d.size() >= 2) {
            c $$7 = new c($$3, this.d.size() - 1);

            while ($$7.hasNext()) {
               $$4 += $$7.nextInt();
               eyg.a $$8 = $$5.next();
               this.c.a($$8, $$4);
               $$4 += this.c.a($$8);
            }
         }

         int $$9 = this.c.d(this);

         for (eyg.a $$10 : this.d) {
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
   public void b(Consumer<eyl> $$0) {
      this.d.forEach($$1 -> $$0.accept($$1.a));
   }

   public eym b() {
      return this.e.g();
   }

   public eym c() {
      return this.e;
   }

   public <T extends eyl> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends eyl> T a(T $$0, eym $$1) {
      this.d.add(new eyg.a($$0, $$1));
      return $$0;
   }

   public <T extends eyl> T a(T $$0, Consumer<eym> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   static class a extends eye.a {
      protected a(eyl $$0, eym $$1) {
         super($$0, $$1);
      }
   }

   public static enum b {
      a,
      b;

      int a(eyl $$0) {
         return switch (this) {
            case a -> $$0.k();
            case b -> $$0.i();
         };
      }

      int a(eyg.a $$0) {
         return switch (this) {
            case a -> $$0.b();
            case b -> $$0.a();
         };
      }

      int b(eyl $$0) {
         return switch (this) {
            case a -> $$0.i();
            case b -> $$0.k();
         };
      }

      int b(eyg.a $$0) {
         return switch (this) {
            case a -> $$0.a();
            case b -> $$0.b();
         };
      }

      void a(eyg.a $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1, $$0.b());
               break;
            case b:
               $$0.b($$1, $$0.a());
         }
      }

      void a(eyg.a $$0, int $$1, int $$2) {
         switch (this) {
            case a:
               $$0.b($$1, $$2);
               break;
            case b:
               $$0.a($$1, $$2);
         }
      }

      int c(eyl $$0) {
         return switch (this) {
            case a -> $$0.p();
            case b -> $$0.r();
         };
      }

      int d(eyl $$0) {
         return switch (this) {
            case a -> $$0.r();
            case b -> $$0.p();
         };
      }
   }
}
