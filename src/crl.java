import java.util.List;

public abstract class crl extends csy {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final brr w;
   private final crv x;
   protected final dev r;
   private final dap<? extends czq> y;
   private final csz z;

   protected crl(css<?> $$0, dap<? extends czq> $$1, csz $$2, int $$3, cog $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bsf(3), new ctf(4));
   }

   protected crl(css<?> $$0, dap<? extends czq> $$1, csz $$2, int $$3, cog $$4, brr $$5, crv $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dX();
      this.a(new ctg($$5, 0, 56, 17));
      this.a(new csg(this, $$5, 1, 56, 53));
      this.a(new csi($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(com $$0) {
      if (this.w instanceof ctl) {
         ((ctl)this.w).fillStackedContents($$0);
      }
   }

   public ctg l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(coh $$0) {
      return this.w.a($$0);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvx.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cvx $$0) {
      return this.r.r().a(this.y, new daz($$0), this.r).isPresent();
   }

   protected boolean d(cvx $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azj.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azj.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public csz ao_() {
      return this.z;
   }

   @Override
   public csy.a a(boolean $$0, boolean $$1, dal<?> $$2, cog $$3) {
      final List<ctg> $$4 = List.of(this.b(0), this.b(2));
      return akt.a(new akt.a<czq>() {
         @Override
         public void a(com $$0) {
            crl.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cvx.k));
         }

         @Override
         public boolean a(dal<czq> $$0) {
            return $$0.b().a(new daz(crl.this.w.a(0)), crl.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (dal<czq>)$$2, $$0, $$1);
   }
}
