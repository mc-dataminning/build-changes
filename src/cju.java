import java.util.EnumSet;
import javax.annotation.Nullable;

public class cju extends cjn {
   @Nullable
   private cju.b b;

   public cju(bsj<? extends cju> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cju.b(this);
      this.bU.a(1, new bzq(this));
      this.bU.a(1, new bzl(this, this.dP()));
      this.bU.a(3, this.b);
      this.bU.a(4, new cag(this, 1.0, false));
      this.bU.a(5, new cju.a(this));
      this.bV.a(1, new cbo(this).a());
      this.bV.a(2, new cbp<>(this, cmh.class, true));
   }

   public static buf.a s() {
      return cjn.gt().a(bug.s, 8.0).a(bug.v, 0.25).a(bug.c, 1.0);
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Override
   protected ave v() {
      return avf.wX;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.wZ;
   }

   @Override
   protected ave o_() {
      return avf.wY;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.xa, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(avw.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return dje.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsj<cju> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cat {
      @Nullable
      private jf i;
      private boolean j;

      public a(cju $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            aym $$0 = this.b.dS();
            if (this.b.dP().ab().b(dbz.c) && $$0.a(b(10)) == 0) {
               this.i = jf.b($$0);
               ja $$1 = ja.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               dsh $$2 = this.b.dP().a_($$1);
               if (dje.m($$2)) {
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
            dce $$0 = this.b.dP();
            ja $$1 = ja.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            dsh $$2 = $$0.a_($$1);
            if (dje.m($$2)) {
               $$0.a($$1, dje.n($$2), 3);
               this.b.R();
               this.b.ao();
            }
         }
      }
   }

   static class b extends bzw {
      private final cju a;
      private int b;

      public b(cju $$0) {
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
            dcd $$0 = this.a.dP();
            aym $$1 = this.a.dS();
            ja $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ja $$6 = $$2.b($$4, $$3, $$5);
                     dsh $$7 = $$0.a_($$6);
                     dff $$8 = $$7.b();
                     if ($$8 instanceof dje) {
                        if ($$0.ab().b(dbz.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dje)$$8).o($$0.a_($$6)), 3);
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
