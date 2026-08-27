import java.util.function.Predicate;

public class dom {
   public static final int a = 16;
   public static final int b = 16;
   public static final int c = 4096;
   public static final int d = 2;
   private short e;
   private short f;
   private short g;
   private final dot<dme> h;
   private dou<il<cxd>> i;

   public dom(dot<dme> $$0, dou<il<cxd>> $$1) {
      this.h = $$0;
      this.i = $$1;
      this.g();
   }

   public dom(ix<cxd> $$0) {
      this.h = new dot<>(czf.q, czh.a.o(), dot.d.d);
      this.i = new dot<>($$0.t(), $$0.f(cxk.b), dot.d.e);
   }

   public dme a(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2);
   }

   public ehr b(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2).u();
   }

   public void a() {
      this.h.a();
   }

   public void b() {
      this.h.b();
   }

   public dme a(int $$0, int $$1, int $$2, dme $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   public dme a(int $$0, int $$1, int $$2, dme $$3, boolean $$4) {
      dme $$5;
      if ($$4) {
         $$5 = this.h.a($$0, $$1, $$2, $$3);
      } else {
         $$5 = this.h.b($$0, $$1, $$2, $$3);
      }

      ehr $$7 = $$5.u();
      ehr $$8 = $$3.u();
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
      class a implements dot.b<dme> {
         public int a;
         public int b;
         public int c;

         public void a(dme $$0, int $$1) {
            ehr $$2 = $$0.u();
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

   public dot<dme> h() {
      return this.h;
   }

   public dou<il<cxd>> i() {
      return this.i;
   }

   public void a(us $$0) {
      this.e = $$0.readShort();
      this.h.a($$0);
      dot<il<cxd>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void b(us $$0) {
      dot<il<cxd>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void c(us $$0) {
      $$0.l(this.e);
      this.h.b($$0);
      this.i.b($$0);
   }

   public int j() {
      return 2 + this.h.c() + this.i.c();
   }

   public boolean a(Predicate<dme> $$0) {
      return this.h.a($$0);
   }

   public il<cxd> c(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2);
   }

   public void a(cxg $$0, cxm.f $$1, int $$2, int $$3, int $$4) {
      dot<il<cxd>> $$5 = this.i.e();
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
