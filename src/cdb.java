import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdb extends bxx implements bmh, bna {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bno bU = new bno(bT, "Strider suffocating modifier", -0.34F, bno.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cpy bY = cpy.a(cna.dC);
   private static final cpy bZ = cpy.a(cna.dC, cna.nR);
   private static final agm<Integer> ca = agp.a(cdb.class, ago.b);
   private static final agm<Boolean> cb = agp.a(cdb.class, ago.k);
   private static final agm<Boolean> cc = agp.a(cdb.class, ago.k);
   private final bmg cd = new bmg(this.an, ca, cc);
   @Nullable
   private buo ce;

   public cdb(bly<? extends cdb> $$0, cto $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(efb.j, -1.0F);
      this.a(efb.i, 0.0F);
      this.a(efb.n, 0.0F);
      this.a(efb.o, 0.0F);
   }

   public static boolean c(bly<cdb> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      hx.a $$5 = $$3.j();

      do {
         $$5.c(ic.b);
      } while ($$1.b_($$5).a(asl.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(agm<?> $$0) {
      if (ca.equals($$0) && this.dM().B) {
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
   public void b(sn $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sn $$0) {
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
   public void a(@Nullable ars $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, arr.xh, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new btz(this, 1.65));
      this.bO.a(2, new bss(this, 1.0));
      this.ce = new buo(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cdb.a(this, 1.0));
      this.bO.a(5, new btf(this, 1.0));
      this.bO.a(7, new bud(this, 1.0, 60));
      this.bO.a(8, new bto(this, cfh.class, 8.0F));
      this.bO.a(8, new bub(this));
      this.bO.a(9, new bto(this, cdb.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bnm $$1 = this.a(bnq.m);
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
   public boolean a(eeq $$0) {
      return $$0.a(asl.b);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * aun.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(ctr $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bmk cN() {
      return (bmk)(this.i() && this.cQ() instanceof cfh $$0 && $$0.b(cna.nR) ? $$0 : super.cN());
   }

   @Override
   public els b(bmk $$0) {
      els[] $$1 = new els[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<hx> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hx.a $$5 = new hx.a();

      for (els $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ic.a);
         }
      }

      for (hx $$8 : $$2) {
         if (!this.dM().b_($$8).a(asl.b)) {
            double $$9 = this.dM().j($$8);
            if (che.a($$9)) {
               els $$10 = els.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bmw $$11 = (bmw)var14.next();
                  eln $$12 = $$0.e($$11);
                  if (che.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new els(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cfh $$0, els $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected els b(cfh $$0, els $$1) {
      return new els(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfh $$0) {
      return (float)(this.b(bnq.m) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(this.bn() ? arr.xf : arr.xe, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eg());
   }

   @Override
   protected void a(double $$0, boolean $$1, djg $$2, hx $$3) {
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
         this.a(arr.xa, 1.0F, this.eX());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(arr.xb, 1.0F, this.eX());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            djg $$0 = this.dM().a_(this.dm());
            djg $$1 = this.bj();
            $$2 = $$0.a(asg.aT) || $$1.a(asg.aT) || this.b(asl.b) > 0.0;
            if (this.cZ() instanceof cdb $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.ge();
      this.aQ();
   }

   private boolean A() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void ge() {
      if (this.bn()) {
         elx $$0 = elx.a(this);
         if ($$0.a(dbe.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(asl.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bnp.a w() {
      return bmm.C().a(bnq.m, 0.175F).a(bnq.g, 16.0);
   }

   @Override
   protected arq y() {
      return !this.gb() && !this.A() ? arr.wZ : null;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.xd;
   }

   @Override
   protected arq n_() {
      return arr.xc;
   }

   @Override
   protected boolean r(blu $$0) {
      return !this.bP() && !this.a(asl.b);
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected bvu b(cto $$0) {
      return new cdb.b(this, $$0);
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      if ($$1.a_($$0).u().a(asl.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cdb b(and $$0, blp $$1) {
      return bly.aW.a((cto)$$0);
   }

   @Override
   public boolean m(cmx $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.i()) {
         this.a(cna.nK);
      }
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bka.a(this.dM().B);
      } else {
         bka $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmx $$4 = $$0.b($$1);
            return $$4.a(cna.nK) ? $$4.a($$0, this, $$1) : bka.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.xg, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public els cJ() {
      return new els(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         auu $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            bmm $$6 = bly.bu.a((cto)$$0.E());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cdh.b(cdh.a($$5), false));
               $$6.a(blz.a, new cmx(cna.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            blp $$7 = bly.aW.a((cto)$$0.E());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new blp.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bnd a(cud $$0, bjy $$1, bmm $$2, @Nullable bnd $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bmo.g, $$3, null);
      $$2.a(this, true);
      return new blp.a(0.0F);
   }

   static class a extends btt {
      private final cdb g;

      a(cdb $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hx k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dM(), this.e);
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
      protected boolean a(ctr $$0, hx $$1) {
         return $$0.a_($$1).a(cwr.H) && $$0.a_($$1.c()).a($$0, $$1, efg.a);
      }
   }

   static class b extends bvt {
      b(cdb $$0, cto $$1) {
         super($$0, $$1);
      }

      @Override
      protected efh a(int $$0) {
         this.o = new efk();
         this.o.a(true);
         return new efh(this.o, $$0);
      }

      @Override
      protected boolean a(efb $$0) {
         return $$0 != efb.i && $$0 != efb.o && $$0 != efb.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hx $$0) {
         return this.b.a_($$0).a(cwr.H) || super.a($$0);
      }
   }
}
