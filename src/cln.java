import javax.annotation.Nullable;

public class cln extends cll {
   private static final akj<Integer> bG = akn.a(cln.class, akl.b);
   private static final bwl bH = bwr.al.n().a(bwk.a().a(bwj.a, 0.0F, bwr.al.m() + 0.125F, 0.0F)).a(0.5F);

   public cln(bwr<? extends cln> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byp.s).a((double)a($$0::a));
      this.g(byp.v).a(b($$0::j));
      this.g(byp.o).a(a($$0::j));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.f("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bG, $$0);
   }

   private int x() {
      return this.al.a(bG);
   }

   private void a(clu $$0, clp $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public clu q() {
      return clu.a(this.x() & 0xFF);
   }

   private void a(clu $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aK ? c((kj<T>)$$0, this.q()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aK) {
         this.a(c(kk.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public clp t() {
      return clp.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(duj $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awn.nl, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awm u() {
      return awn.ni;
   }

   @Override
   protected awm l_() {
      return awn.nm;
   }

   @Nullable
   @Override
   protected awm gv() {
      return awn.nn;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.np;
   }

   @Override
   protected awm gT() {
      return awn.nj;
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      boolean $$2 = !this.n_() && this.gK() && $$0.fX();
      if (!this.bY() && !$$2) {
         czk $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gK()) {
               this.gZ();
               return bug.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(ciz $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof clm) && !($$0 instanceof cln) ? false : this.hb() && ((cll)$$0).hb();
      }
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      if ($$1 instanceof clm) {
         clq $$2 = bwr.aF.a($$0, bwq.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cln $$3 = (cln)$$1;
         cln $$4 = bwr.al.a($$0, bwq.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            clu $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ag.a(clu.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            clp $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ag.a(clp.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bws $$0) {
      return true;
   }

   @Override
   protected void c(bux $$0, float $$1) {
      this.a($$0, $$1, new bws[]{bws.g});
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      clu $$5;
      if ($$3 instanceof cln.a) {
         $$5 = ((cln.a)$$3).a;
      } else {
         $$5 = ag.a(clu.values(), $$4);
         $$3 = new cln.a($$5);
      }

      this.a($$5, ag.a(clp.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bH : super.e($$0);
   }

   public static class a extends bvy.a {
      public final clu a;

      public a(clu $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
