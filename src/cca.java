import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cca extends bww implements bli, bmb {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bmp bU = new bmp(bT, "Strider suffocating modifier", -0.34F, bmp.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final coq bY = coq.a(clr.dC);
   private static final coq bZ = coq.a(clr.dC, clr.nR);
   private static final afs<Integer> ca = afv.a(cca.class, afu.b);
   private static final afs<Boolean> cb = afv.a(cca.class, afu.k);
   private static final afs<Boolean> cc = afv.a(cca.class, afu.k);
   private final blh cd = new blh(this.an, ca, cc);
   @Nullable
   private bto ce;

   public cca(bkz<? extends cca> $$0, csf $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(edi.j, -1.0F);
      this.a(edi.i, 0.0F);
      this.a(edi.n, 0.0F);
      this.a(edi.o, 0.0F);
   }

   public static boolean c(bkz<cca> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      hx.a $$5 = $$3.j();

      do {
         $$5.c(ib.b);
      } while ($$1.b_($$5).a(arp.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(afs<?> $$0) {
      if (ca.equals($$0) && this.dN().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   public void a(@Nullable aqw $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, aqv.wM, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsz(this, 1.65));
      this.bO.a(2, new brs(this, 1.0));
      this.ce = new bto(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cca.a(this, 1.0));
      this.bO.a(5, new bsf(this, 1.0));
      this.bO.a(7, new btd(this, 1.0, 60));
      this.bO.a(8, new bso(this, cdz.class, 8.0F));
      this.bO.a(8, new btb(this));
      this.bO.a(9, new bso(this, cca.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bmn $$1 = this.a(bmr.m);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   @Override
   public boolean u() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(ecx $$0) {
      return $$0.a(arp.b);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * atq.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bll cO() {
      return (bll)(this.i() && this.cR() instanceof cdz $$0 && $$0.b(clr.nR) ? $$0 : super.cO());
   }

   @Override
   public ejz b(bll $$0) {
      ejz[] $$1 = new ejz[]{
         a((double)this.dh(), (double)$$0.dh(), $$0.dD()),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 45.0F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 45.0F)
      };
      Set<hx> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hx.a $$5 = new hx.a();

      for (ejz $$6 : $$1) {
         $$5.b(this.ds() + $$6.c, $$3, this.dy() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ib.a);
         }
      }

      for (hx $$8 : $$2) {
         if (!this.dN().b_($$8).a(arp.b)) {
            double $$9 = this.dN().i($$8);
            if (cfv.a($$9)) {
               ejz $$10 = ejz.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fB().iterator();

               while (var14.hasNext()) {
                  blx $$11 = (blx)var14.next();
                  eju $$12 = $$0.e($$11);
                  if (cfv.a(this.dN(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ejz(this.ds(), this.cH().e, this.dy());
   }

   @Override
   protected void a(cdz $$0, ejz $$1) {
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.N = this.aU = this.aW = this.dD();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ejz b(cdz $$0, ejz $$1) {
      return new ejz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cdz $$0) {
      return (float)(this.b(bmr.m) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(this.bn() ? aqv.wK : aqv.wJ, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eh());
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
      this.aQ();
      if (this.bn()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.A() && this.ag.a(140) == 0) {
         this.a(aqv.wF, 1.0F, this.eY());
      } else if (this.gc() && this.ag.a(60) == 0) {
         this.a(aqv.wG, 1.0F, this.eY());
      }

      if (!this.fV()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dhn $$0 = this.dN().a_(this.dn());
            dhn $$1 = this.bj();
            $$2 = $$0.a(ark.aT) || $$1.a(ark.aT) || this.b(arp.b) > 0.0;
            if (this.da() instanceof cca $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gf();
      this.aQ();
   }

   private boolean A() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gf() {
      if (this.bn()) {
         eke $$0 = eke.a(this);
         if ($$0.a(czu.d, this.dn(), true) && !this.dN().b_(this.dn().c()).a(arp.b)) {
            this.c(true);
         } else {
            this.g(this.dq().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bmq.a w() {
      return bln.C().a(bmr.m, 0.175F).a(bmr.g, 16.0);
   }

   @Override
   protected aqu y() {
      return !this.gc() && !this.A() ? aqv.wE : null;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.wI;
   }

   @Override
   protected aqu n_() {
      return aqv.wH;
   }

   @Override
   protected boolean r(bkv $$0) {
      return !this.bP() && !this.a(arp.b);
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected buu b(csf $$0) {
      return new cca.b(this, $$0);
   }

   @Override
   public float a(hx $$0, csi $$1) {
      if ($$1.a_($$0).u().a(arp.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cca b(ami $$0, bkq $$1) {
      return bkz.aV.a((csf)$$0);
   }

   @Override
   public boolean m(clo $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(clr.nK);
      }
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
            if ($$2 && !this.aU()) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.wL, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         atw $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            bln $$6 = bkz.bs.a((csf)$$0.D());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new ccg.b(ccg.a($$5), false));
               $$6.a(bla.a, new clo(clr.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bkq $$7 = bkz.aV.a((csf)$$0.D());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bkq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bme a(csu $$0, biz $$1, bln $$2, @Nullable bme $$3) {
      $$2.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
      $$2.a($$0, $$1, blp.g, $$3, null);
      $$2.a(this, true);
      return new bkq.a(0.0F);
   }

   static class a extends bst {
      private final cca g;

      a(cca $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hx k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dN(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bn() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(csi $$0, hx $$1) {
         return $$0.a_($$1).a(cvh.H) && $$0.a_($$1.c()).a($$0, $$1, edn.a);
      }
   }

   static class b extends but {
      b(cca $$0, csf $$1) {
         super($$0, $$1);
      }

      @Override
      protected edo a(int $$0) {
         this.o = new edr();
         this.o.a(true);
         return new edo(this.o, $$0);
      }

      @Override
      protected boolean a(edi $$0) {
         return $$0 != edi.i && $$0 != edi.o && $$0 != edi.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hx $$0) {
         return this.b.a_($$0).a(cvh.H) || super.a($$0);
      }
   }
}
