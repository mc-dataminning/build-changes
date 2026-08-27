import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzk extends bzd {
   @Nullable
   private bzk.b b;

   public bzk(bip<? extends bzk> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.b = new bzk.b(this);
      this.bO.a(1, new bpq(this));
      this.bO.a(1, new bpl(this, this.dK()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bqg(this, 1.0, false));
      this.bO.a(5, new bzk.a(this));
      this.bP.a(1, new bro(this).a());
      this.bP.a(2, new brp<>(this, cbp.class, true));
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.13F;
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 8.0).a(bkh.d, 0.25).a(bkh.f, 1.0);
   }

   @Override
   protected bil.b aU() {
      return bil.b.c;
   }

   @Override
   protected aoy r() {
      return aoz.vk;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.vm;
   }

   @Override
   protected aoy h_() {
      return aoz.vl;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.vn, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(apq.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dA();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return cwm.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bip<bzk> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbp $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjg eQ() {
      return bjg.c;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bqt {
      @Nullable
      private hc i;
      private boolean j;

      public a(bzk $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.j() != null) {
            return false;
         } else if (!this.b.H().l()) {
            return false;
         } else {
            arx $$0 = this.b.ee();
            if (this.b.dK().X().b(cpm.c) && $$0.a(b(10)) == 0) {
               this.i = hc.b($$0);
               gw $$1 = gw.a(this.b.dp(), this.b.dr() + 0.5, this.b.dv()).a(this.i);
               dfe $$2 = this.b.dK().a_($$1);
               if (cwm.h($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.a();
         }
      }

      @Override
      public boolean b() {
         return this.j ? false : super.b();
      }

      @Override
      public void c() {
         if (!this.j) {
            super.c();
         } else {
            cpr $$0 = this.b.dK();
            gw $$1 = gw.a(this.b.dp(), this.b.dr() + 0.5, this.b.dv()).a(this.i);
            dfe $$2 = $$0.a_($$1);
            if (cwm.h($$2)) {
               $$0.a($$1, cwm.n($$2), 3);
               this.b.N();
               this.b.ak();
            }
         }
      }
   }

   static class b extends bpw {
      private final bzk a;
      private int b;

      public b(bzk $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean a() {
         return this.b > 0;
      }

      @Override
      public void e() {
         this.b--;
         if (this.b <= 0) {
            cpq $$0 = this.a.dK();
            arx $$1 = this.a.ee();
            gw $$2 = this.a.dk();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gw $$6 = $$2.b($$4, $$3, $$5);
                     dfe $$7 = $$0.a_($$6);
                     csq $$8 = $$7.b();
                     if ($$8 instanceof cwm) {
                        if ($$0.X().b(cpm.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cwm)$$8).o($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
