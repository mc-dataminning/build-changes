import java.util.function.Predicate;

public class dzc {
   public static final int a = 16;
   public static final int b = 16;
   public static final int c = 4096;
   public static final int d = 2;
   private short e;
   private short f;
   private short g;
   private final dzj<dww> h;
   private dzk<jr<dhj>> i;

   private dzc(dzc $$0) {
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h.d();
      this.i = $$0.i.d();
   }

   public dzc(dzj<dww> $$0, dzk<jr<dhj>> $$1) {
      this.h = $$0;
      this.i = $$1;
      this.g();
   }

   public dzc(ke<dhj> $$0) {
      this.h = new dzj<>(djl.q, djn.a.m(), dzj.d.d);
      this.i = new dzj<>($$0.t(), $$0.b(dhq.b), dzj.d.e);
   }

   public dww a(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2);
   }

   public esy b(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2).y();
   }

   public void a() {
      this.h.a();
   }

   public void b() {
      this.h.b();
   }

   public dww a(int $$0, int $$1, int $$2, dww $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   public dww a(int $$0, int $$1, int $$2, dww $$3, boolean $$4) {
      dww $$5;
      if ($$4) {
         $$5 = this.h.a($$0, $$1, $$2, $$3);
      } else {
         $$5 = this.h.b($$0, $$1, $$2, $$3);
      }

      esy $$7 = $$5.y();
      esy $$8 = $$3.y();
      if (!$$5.l()) {
         this.e--;
         if ($$5.z()) {
            this.f--;
         }
      }

      if (!$$7.c()) {
         this.g--;
      }

      if (!$$3.l()) {
         this.e++;
         if ($$3.z()) {
            this.f++;
         }
      }

      if (!$$8.c()) {
         this.g++;
      }

      return $$5;
   }

   public boolean c() {
      return this.e == 0;
   }

   public boolean d() {
      return this.e() || this.f();
   }

   public boolean e() {
      return this.f > 0;
   }

   public boolean f() {
      return this.g > 0;
   }

   public void g() {
      class a implements dzj.b<dww> {
         public int a;
         public int b;
         public int c;

         public void a(dww $$0, int $$1) {
            esy $$2 = $$0.y();
            if (!$$0.l()) {
               this.a += $$1;
               if ($$0.z()) {
                  this.b += $$1;
               }
            }

            if (!$$2.c()) {
               this.a += $$1;
               if ($$2.f()) {
                  this.c += $$1;
               }
            }
         }
      }

      a $$0 = new a();
      this.h.a($$0);
      this.e = (short)$$0.a;
      this.f = (short)$$0.b;
      this.g = (short)$$0.c;
   }

   public dzj<dww> h() {
      return this.h;
   }

   public dzk<jr<dhj>> i() {
      return this.i;
   }

   public void a(vl $$0) {
      this.e = $$0.readShort();
      this.h.a($$0);
      dzj<jr<dhj>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void b(vl $$0) {
      dzj<jr<dhj>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void c(vl $$0) {
      $$0.m(this.e);
      this.h.b($$0);
      this.i.b($$0);
   }

   public int j() {
      return 2 + this.h.c() + this.i.c();
   }

   public boolean a(Predicate<dww> $$0) {
      return this.h.a($$0);
   }

   public jr<dhj> c(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2);
   }

   public void a(dhm $$0, dhs.f $$1, int $$2, int $$3, int $$4) {
      dzj<jr<dhj>> $$5 = this.i.e();
      int $$6 = 4;

      for (int $$7 = 0; $$7 < 4; $$7++) {
         for (int $$8 = 0; $$8 < 4; $$8++) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               $$5.b($$7, $$8, $$9, $$0.getNoiseBiome($$2 + $$7, $$3 + $$8, $$4 + $$9, $$1));
            }
         }
      }

      this.i = $$5;
   }

   public dzc k() {
      return new dzc(this);
   }
}
