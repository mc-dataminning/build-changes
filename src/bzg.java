import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzg extends byz {
   @Nullable
   private bzg.b b;

   public bzg(bik<? extends bzg> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.b = new bzg.b(this);
      this.bO.a(1, new bpm(this));
      this.bO.a(1, new bph(this, this.dK()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bqc(this, 1.0, false));
      this.bO.a(5, new bzg.a(this));
      this.bP.a(1, new brk(this).a());
      this.bP.a(2, new brl<>(this, cbl.class, true));
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.13F;
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 8.0).a(bkd.d, 0.25).a(bkd.f, 1.0);
   }

   @Override
   protected big.b aU() {
      return big.b.c;
   }

   @Override
   protected aot r() {
      return aou.vk;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.vm;
   }

   @Override
   protected aot h_() {
      return aou.vl;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.vn, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(apl.x)) && this.b != null) {
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
   public float a(gv $$0, cpn $$1) {
      return cwg.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bik<bzg> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbl $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjb eQ() {
      return bjb.c;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bqp {
      @Nullable
      private hb i;
      private boolean j;

      public a(bzg $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.j() != null) {
            return false;
         } else if (!this.b.H().l()) {
            return false;
         } else {
            art $$0 = this.b.ee();
            if (this.b.dK().X().b(cpg.c) && $$0.a(b(10)) == 0) {
               this.i = hb.b($$0);
               gv $$1 = gv.a(this.b.dp(), this.b.dr() + 0.5, this.b.dv()).a(this.i);
               dey $$2 = this.b.dK().a_($$1);
               if (cwg.h($$2)) {
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
            cpl $$0 = this.b.dK();
            gv $$1 = gv.a(this.b.dp(), this.b.dr() + 0.5, this.b.dv()).a(this.i);
            dey $$2 = $$0.a_($$1);
            if (cwg.h($$2)) {
               $$0.a($$1, cwg.n($$2), 3);
               this.b.N();
               this.b.ak();
            }
         }
      }
   }

   static class b extends bps {
      private final bzg a;
      private int b;

      public b(bzg $$0) {
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
            cpk $$0 = this.a.dK();
            art $$1 = this.a.ee();
            gv $$2 = this.a.dk();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gv $$6 = $$2.b($$4, $$3, $$5);
                     dey $$7 = $$0.a_($$6);
                     csk $$8 = $$7.b();
                     if ($$8 instanceof cwg) {
                        if ($$0.X().b(cpg.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cwg)$$8).o($$0.a_($$6)), 3);
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
