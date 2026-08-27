import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfn extends cfg {
   @Nullable
   private cfn.b b;

   public cfn(bol<? extends cfn> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new cfn.b(this);
      this.bP.a(1, new bvo(this));
      this.bP.a(1, new bvj(this, this.dJ()));
      this.bP.a(3, this.b);
      this.bP.a(4, new bwe(this, 1.0, false));
      this.bP.a(5, new cfn.a(this));
      this.bQ.a(1, new bxm(this).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 8.0).a(bqe.o, 0.25).a(bqe.c, 1.0);
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   protected ato y() {
      return atp.wq;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.ws;
   }

   @Override
   protected ato n_() {
      return atp.wr;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.wt, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(aug.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aV = this.dz();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return ddd.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bol<cfn> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cia $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends bwr {
      @Nullable
      private ih i;
      private boolean j;

      public a(cfn $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            awt $$0 = this.b.ef();
            if (this.b.dJ().Z().b(cwa.c) && $$0.a(b(10)) == 0) {
               this.i = ih.b($$0);
               ib $$1 = ib.a(this.b.do(), this.b.dq() + 0.5, this.b.du()).a(this.i);
               dme $$2 = this.b.dJ().a_($$1);
               if (ddd.m($$2)) {
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
            cwf $$0 = this.b.dJ();
            ib $$1 = ib.a(this.b.do(), this.b.dq() + 0.5, this.b.du()).a(this.i);
            dme $$2 = $$0.a_($$1);
            if (ddd.m($$2)) {
               $$0.a($$1, ddd.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bvu {
      private final cfn a;
      private int b;

      public b(cfn $$0) {
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
            cwe $$0 = this.a.dJ();
            awt $$1 = this.a.ef();
            ib $$2 = this.a.dj();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ib $$6 = $$2.b($$4, $$3, $$5);
                     dme $$7 = $$0.a_($$6);
                     czf $$8 = $$7.b();
                     if ($$8 instanceof ddd) {
                        if ($$0.Z().b(cwa.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((ddd)$$8).o($$0.a_($$6)), 3);
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
