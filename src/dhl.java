import java.util.function.Predicate;

public class dhl {
   public static final int a = 16;
   public static final int b = 16;
   public static final int c = 4096;
   public static final int d = 2;
   private short e;
   private short f;
   private short g;
   private final dhs<dfd> h;
   private dht<he<cqz>> i;

   public dhl(dhs<dfd> $$0, dht<he<cqz>> $$1) {
      this.h = $$0;
      this.i = $$1;
      this.g();
   }

   public dhl(hq<cqz> $$0) {
      this.h = new dhs<>(ctc.q, cte.a.o(), dhs.d.d);
      this.i = new dhs<>($$0.t(), $$0.f(crg.b), dhs.d.e);
   }

   public dfd a(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2);
   }

   public eag b(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2).u();
   }

   public void a() {
      this.h.a();
   }

   public void b() {
      this.h.b();
   }

   public dfd a(int $$0, int $$1, int $$2, dfd $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   public dfd a(int $$0, int $$1, int $$2, dfd $$3, boolean $$4) {
      dfd $$5;
      if ($$4) {
         $$5 = this.h.a($$0, $$1, $$2, $$3);
      } else {
         $$5 = this.h.b($$0, $$1, $$2, $$3);
      }

      eag $$7 = $$5.u();
      eag $$8 = $$3.u();
      if (!$$5.i()) {
         this.e--;
         if ($$5.v()) {
            this.f--;
         }
      }

      if (!$$7.c()) {
         this.g--;
      }

      if (!$$3.i()) {
         this.e++;
         if ($$3.v()) {
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
      class a implements dhs.b<dfd> {
         public int a;
         public int b;
         public int c;

         public void a(dfd $$0, int $$1) {
            eag $$2 = $$0.u();
            if (!$$0.i()) {
               this.a += $$1;
               if ($$0.v()) {
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

   public dhs<dfd> h() {
      return this.h;
   }

   public dht<he<cqz>> i() {
      return this.i;
   }

   public void a(so $$0) {
      this.e = $$0.readShort();
      this.h.a($$0);
      dhs<he<cqz>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void b(so $$0) {
      dhs<he<cqz>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void c(so $$0) {
      $$0.l(this.e);
      this.h.b($$0);
      this.i.b($$0);
   }

   public int j() {
      return 2 + this.h.c() + this.i.c();
   }

   public boolean a(Predicate<dfd> $$0) {
      return this.h.a($$0);
   }

   public he<cqz> c(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2);
   }

   public void a(crc $$0, cri.f $$1, int $$2, int $$3, int $$4) {
      dhs<he<cqz>> $$5 = this.i.e();
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
}
