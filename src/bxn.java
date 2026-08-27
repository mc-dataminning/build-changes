import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxn extends bww implements bli, bmb {
   private static final afs<Boolean> bT = afv.a(bxn.class, afu.k);
   private static final afs<Integer> bU = afv.a(bxn.class, afu.b);
   private static final coq bW = coq.a(clr.tX, clr.tY, clr.vc);
   private final blh bX = new blh(this.an, bU, bT);

   public bxn(bkz<? extends bxn> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new bsz(this, 1.25));
      this.bO.a(3, new brs(this, 1.0));
      this.bO.a(4, new bto(this, 1.2, coq.a(clr.nQ), false));
      this.bO.a(4, new bto(this, 1.2, bW, false));
      this.bO.a(5, new bsf(this, 1.1));
      this.bO.a(6, new btt(this, 1.0));
      this.bO.a(7, new bso(this, cdz.class, 6.0F));
      this.bO.a(8, new btb(this));
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 10.0).a(bmr.m, 0.25);
   }

   @Nullable
   @Override
   public bll cO() {
      return (bll)(this.i() && this.cR() instanceof cdz $$0 && $$0.b(clr.nQ) ? $$0 : super.cO());
   }

   @Override
   public void a(afs<?> $$0) {
      if (bU.equals($$0) && this.dN().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, false);
      this.an.a(bU, 0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected aqu y() {
      return aqv.si;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.sk;
   }

   @Override
   protected aqu n_() {
      return aqv.sj;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.sm, 0.15F, 1.0F);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fJ()) {
         if (!this.dN().B) {
            $$0.n(this);
         }

         return bjb.a(this.dN().B);
      } else {
         bjb $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            clo $$4 = $$0.b($$1);
            return $$4.a(clr.nK) ? $$4.a($$0, this, $$1) : bjb.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(clr.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aqw $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, aqv.sl, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ejz b(bll $$0) {
      ib $$1 = this.cF();
      if ($$1.o() == ib.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cfv.a($$1);
         hx $$3 = this.dn();
         hx.a $$4 = new hx.a();
         UnmodifiableIterator var6 = $$0.fB().iterator();

         while (var6.hasNext()) {
            blx $$5 = (blx)var6.next();
            eju $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dN().i($$4);
               if (cfv.a($$8)) {
                  ejz $$9 = ejz.a($$4, $$8);
                  if (cfv.a(this.dN(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(ami $$0, blk $$1) {
      if ($$0.aj() != biy.a) {
         cci $$2 = bkz.bs.a((csf)$$0);
         if ($$2 != null) {
            $$2.a(bla.a, new clo(clr.oS));
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.t(this.fV());
            $$2.a(this.o_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fK();
            $$0.b($$2);
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cdz $$0, ejz $$1) {
      super.a($$0, $$1);
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.N = this.aU = this.aW = this.dD();
      this.bX.b();
   }

   @Override
   protected ejz b(cdz $$0, ejz $$1) {
      return new ejz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cdz $$0) {
      return (float)(this.b(bmr.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eh());
   }

   @Nullable
   public bxn b(ami $$0, bkq $$1) {
      return bkz.av.a((csf)$$0);
   }

   @Override
   public boolean m(clo $$0) {
      return bW.a($$0);
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
