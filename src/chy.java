import java.util.EnumSet;
import javax.annotation.Nullable;

public class chy extends chr {
   @Nullable
   private chy.b b;

   public chy(bqr<? extends chy> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new chy.b(this);
      this.bS.a(1, new bxv(this));
      this.bS.a(1, new bxq(this, this.dN()));
      this.bS.a(3, this.b);
      this.bS.a(4, new byl(this, 1.0, false));
      this.bS.a(5, new chy.a(this));
      this.bT.a(1, new bzt(this).a());
      this.bT.a(2, new bzu<>(this, ckl.class, true));
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 8.0).a(bsl.r, 0.25).a(bsl.c, 1.0);
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }

   @Override
   protected auy v() {
      return auz.wI;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.wK;
   }

   @Override
   protected auy o_() {
      return auz.wJ;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.wL, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(avq.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aZ = this.dD();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(im $$0, czx $$1) {
      return dgu.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bqr<chy> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         ckl $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends byy {
      @Nullable
      private ir i;
      private boolean j;

      public a(chy $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            ayd $$0 = this.b.ej();
            if (this.b.dN().aa().b(czq.c) && $$0.a(b(10)) == 0) {
               this.i = ir.b($$0);
               im $$1 = im.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
               dpy $$2 = this.b.dN().a_($$1);
               if (dgu.m($$2)) {
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
            czv $$0 = this.b.dN();
            im $$1 = im.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
            dpy $$2 = $$0.a_($$1);
            if (dgu.m($$2)) {
               $$0.a($$1, dgu.n($$2), 3);
               this.b.Q();
               this.b.am();
            }
         }
      }
   }

   static class b extends byb {
      private final chy a;
      private int b;

      public b(chy $$0) {
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
            czu $$0 = this.a.dN();
            ayd $$1 = this.a.ej();
            im $$2 = this.a.dn();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     im $$6 = $$2.b($$4, $$3, $$5);
                     dpy $$7 = $$0.a_($$6);
                     dcv $$8 = $$7.b();
                     if ($$8 instanceof dgu) {
                        if ($$0.aa().b(czq.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dgu)$$8).o($$0.a_($$6)), 3);
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
