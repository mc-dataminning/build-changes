import java.util.function.Predicate;

public class eab {
   public static final int a = 16;
   public static final int b = 16;
   public static final int c = 4096;
   public static final int d = 2;
   private short e;
   private short f;
   private short g;
   private final eai<dxv> h;
   private eaj<jq<dik>> i;

   private eab(eab $$0) {
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h.d();
      this.i = $$0.i.d();
   }

   public eab(eai<dxv> $$0, eaj<jq<dik>> $$1) {
      this.h = $$0;
      this.i = $$1;
      this.g();
   }

   public eab(kd<dik> $$0) {
      this.h = new eai<>(dkm.q, dko.a.m(), eai.d.d);
      this.i = new eai<>($$0.t(), $$0.b(dir.b), eai.d.e);
   }

   public dxv a(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2);
   }

   public etx b(int $$0, int $$1, int $$2) {
      return this.h.a($$0, $$1, $$2).y();
   }

   public void a() {
      this.h.a();
   }

   public void b() {
      this.h.b();
   }

   public dxv a(int $$0, int $$1, int $$2, dxv $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   public dxv a(int $$0, int $$1, int $$2, dxv $$3, boolean $$4) {
      dxv $$5;
      if ($$4) {
         $$5 = this.h.a($$0, $$1, $$2, $$3);
      } else {
         $$5 = this.h.b($$0, $$1, $$2, $$3);
      }

      etx $$7 = $$5.y();
      etx $$8 = $$3.y();
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
      class a implements eai.b<dxv> {
         public int a;
         public int b;
         public int c;

         public void a(dxv $$0, int $$1) {
            etx $$2 = $$0.y();
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

   public eai<dxv> h() {
      return this.h;
   }

   public eaj<jq<dik>> i() {
      return this.i;
   }

   public void a(ws $$0) {
      this.e = $$0.readShort();
      this.h.a($$0);
      eai<jq<dik>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void b(ws $$0) {
      eai<jq<dik>> $$1 = this.i.e();
      $$1.a($$0);
      this.i = $$1;
   }

   public void c(ws $$0) {
      $$0.m(this.e);
      this.h.b($$0);
      this.i.b($$0);
   }

   public int j() {
      return 2 + this.h.c() + this.i.c();
   }

   public boolean a(Predicate<dxv> $$0) {
      return this.h.a($$0);
   }

   public jq<dik> c(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2);
   }

   public void a(din $$0, dit.f $$1, int $$2, int $$3, int $$4) {
      eai<jq<dik>> $$5 = this.i.e();
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

   public eab k() {
      return new eab(this);
   }
}
