import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fiq extends fim {
   private final List<fit> c = new ArrayList<>();
   private final List<fiq.a> d = new ArrayList<>();
   private final fiu e = fiu.i();
   private int f = 0;
   private int g = 0;

   public fiq() {
      this(0, 0);
   }

   public fiq(int $$0, int $$1) {
      super($$0, $$1, 0, 0);
   }

   @Override
   public void a() {
      super.a();
      int $$0 = 0;
      int $$1 = 0;

      for (fiq.a $$2 : this.d) {
         $$0 = Math.max($$2.c(), $$0);
         $$1 = Math.max($$2.d(), $$1);
      }

      int[] $$3 = new int[$$1 + 1];
      int[] $$4 = new int[$$0 + 1];

      for (fiq.a $$5 : this.d) {
         int $$6 = $$5.a() - ($$5.e - 1) * this.f;
         c $$7 = new c($$6, $$5.e);

         for (int $$8 = $$5.c; $$8 <= $$5.c(); $$8++) {
            $$4[$$8] = Math.max($$4[$$8], $$7.nextInt());
         }

         int $$9 = $$5.b() - ($$5.f - 1) * this.g;
         c $$10 = new c($$9, $$5.f);

         for (int $$11 = $$5.d; $$11 <= $$5.d(); $$11++) {
            $$3[$$11] = Math.max($$3[$$11], $$10.nextInt());
         }
      }

      int[] $$12 = new int[$$1 + 1];
      int[] $$13 = new int[$$0 + 1];
      $$12[0] = 0;

      for (int $$14 = 1; $$14 <= $$1; $$14++) {
         $$12[$$14] = $$12[$$14 - 1] + $$3[$$14 - 1] + this.g;
      }

      $$13[0] = 0;

      for (int $$15 = 1; $$15 <= $$0; $$15++) {
         $$13[$$15] = $$13[$$15 - 1] + $$4[$$15 - 1] + this.f;
      }

      for (fiq.a $$16 : this.d) {
         int $$17 = 0;

         for (int $$18 = $$16.d; $$18 <= $$16.d(); $$18++) {
            $$17 += $$3[$$18];
         }

         $$17 += this.g * ($$16.f - 1);
         $$16.a(this.C() + $$12[$$16.d], $$17);
         int $$19 = 0;

         for (int $$20 = $$16.c; $$20 <= $$16.c(); $$20++) {
            $$19 += $$4[$$20];
         }

         $$19 += this.f * ($$16.e - 1);
         $$16.b(this.D() + $$13[$$16.c], $$19);
      }

      this.a = $$12[$$1] + $$3[$$1];
      this.b = $$13[$$0] + $$4[$$0];
   }

   public <T extends fit> T a(T $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2, this.b());
   }

   public <T extends fit> T a(T $$0, int $$1, int $$2, fiu $$3) {
      return this.a($$0, $$1, $$2, 1, 1, $$3);
   }

   public <T extends fit> T a(T $$0, int $$1, int $$2, Consumer<fiu> $$3) {
      return this.a($$0, $$1, $$2, 1, 1, ac.a(this.b(), $$3));
   }

   public <T extends fit> T a(T $$0, int $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b());
   }

   public <T extends fit> T a(T $$0, int $$1, int $$2, int $$3, int $$4, fiu $$5) {
      if ($$3 < 1) {
         throw new IllegalArgumentException("Occupied rows must be at least 1");
      } else if ($$4 < 1) {
         throw new IllegalArgumentException("Occupied columns must be at least 1");
      } else {
         this.d.add(new fiq.a($$0, $$1, $$2, $$3, $$4, $$5));
         this.c.add($$0);
         return $$0;
      }
   }

   public <T extends fit> T a(T $$0, int $$1, int $$2, int $$3, int $$4, Consumer<fiu> $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, ac.a(this.b(), $$5));
   }

   public fiq a(int $$0) {
      this.g = $$0;
      return this;
   }

   public fiq b(int $$0) {
      this.f = $$0;
      return this;
   }

   public fiq c(int $$0) {
      return this.a($$0).b($$0);
   }

   @Override
   public void b(Consumer<fit> $$0) {
      this.c.forEach($$0);
   }

   public fiu b() {
      return this.e.g();
   }

   public fiu c() {
      return this.e;
   }

   public fiq.b d(int $$0) {
      return new fiq.b($$0);
   }

   static class a extends fim.a {
      final int c;
      final int d;
      final int e;
      final int f;

      a(fit $$0, int $$1, int $$2, int $$3, int $$4, fiu $$5) {
         super($$0, $$5.h());
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
      }

      public int c() {
         return this.c + this.e - 1;
      }

      public int d() {
         return this.d + this.f - 1;
      }
   }

   public final class b {
      private final int b;
      private int c;

      b(int $$1) {
         this.b = $$1;
      }

      public <T extends fit> T a(T $$0) {
         return this.a($$0, 1);
      }

      public <T extends fit> T a(T $$0, int $$1) {
         return this.a($$0, $$1, this.c());
      }

      public <T extends fit> T a(T $$0, fiu $$1) {
         return this.a($$0, 1, $$1);
      }

      public <T extends fit> T a(T $$0, int $$1, fiu $$2) {
         int $$3 = this.c / this.b;
         int $$4 = this.c % this.b;
         if ($$4 + $$1 > this.b) {
            $$3++;
            $$4 = 0;
            this.c = axz.d(this.c, this.b);
         }

         this.c += $$1;
         return fiq.this.a($$0, $$3, $$4, 1, $$1, $$2);
      }

      public fiq a() {
         return fiq.this;
      }

      public fiu b() {
         return fiq.this.b();
      }

      public fiu c() {
         return fiq.this.c();
      }
   }
}
