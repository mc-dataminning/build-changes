import java.util.function.Predicate;

public class ebw {
   public static final int a = 16;
   public static final int b = 16;
   public static final int c = 4096;
   public static final int d = 2;
   private short e;
   private short f;
   private short g;
   private final ecd<dzo> h;
   private ece<je<djs>> i;

   private ebw(ebw $$0) {
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h.d();
      this.i = $$0.i.d();
   }

   public ebw(ecd<dzo> $$0, ece<je<djs>> $$1) {
      this.h = $$0;
      this.i = $$1;
      this.g();
   }

   public ebw(jr<djs> $$0) {
      this.h = new ecd<>(dlu.k, dlw.a.m(), ecd.d.d);
      this.i = new ecd<>($$0.t(), $$0.b(djz.b), ecd.d.e);
   }

   public dzo a(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2);
   }

   public evv b(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2).y();
   }

   public void a() {
      this.h.a();
   }

   public void b() {
      this.h.b();
   }

   public dzo a(int $$0, int $$1, int $$2, dzo $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   public dzo a(int $$0, int $$1, int $$2, dzo $$3, boolean $$4) {
      dzo $$5;
      if ($$4) {
         $$5 = this.h.a($$0, $$1, $$2, $$3);
      } else {
         $$5 = this.h.b($$0, $$1, $$2, $$3);
      }

      evv $$7 = $$5.y();
      evv $$8 = $$3.y();
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
      class a implements ecd.b<dzo> {
         public int a;
         public int b;
         public int c;

         public void a(dzo $$0, int $$1) {
            evv $$2 = $$0.y();
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

   public ecd<dzo> h() {
      return this.h;
   }

   public ece<je<djs>> i() {
      return this.i;
   }

   public void a(vs $$0) {
      this.e = $$0.readShort();
      this.h.a($$0);
      ecd<je<djs>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void b(vs $$0) {
      ecd<je<djs>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void c(vs $$0) {
      $$0.m(this.e);
      this.h.b($$0);
      this.i.b($$0);
   }

   public int j() {
      return 2 + this.h.c() + this.i.c();
   }

   public boolean a(Predicate<dzo> $$0) {
      return this.h.a($$0);
   }

   public je<djs> c(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2);
   }

   public void a(djv $$0, dkb.f $$1, int $$2, int $$3, int $$4) {
      ecd<je<djs>> $$5 = this.i.e();
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

   public ebw k() {
      return new ebw(this);
   }
}
