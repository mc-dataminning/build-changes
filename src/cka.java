import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cka extends ceo implements bsv, bto {
   private static final UUID ca = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bue cb = new bue(ca, "Strider suffocating modifier", -0.34F, bue.a.b);
   private static final float cd = 0.35F;
   private static final float ce = 0.55F;
   private static final ajp<Integer> cf = ajt.a(cka.class, ajr.b);
   private static final ajp<Boolean> cg = ajt.a(cka.class, ajr.k);
   private static final ajp<Boolean> ch = ajt.a(cka.class, ajr.k);
   private final bsu ci = new bsu(this.ao, cf, ch);
   @Nullable
   private cbe cj;

   public cka(bsj<? extends cka> $$0, dcd $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eos.j, -1.0F);
      this.a(eos.i, 0.0F);
      this.a(eos.n, 0.0F);
      this.a(eos.o, 0.0F);
   }

   public static boolean c(bsj<cka> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      ja.a $$5 = $$3.j();

      do {
         $$5.c(jf.b);
      } while ($$1.b_($$5).a(awa.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cf.equals($$0) && this.dP().B) {
         this.ci.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.ci.a($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ci.b($$0);
   }

   @Override
   public boolean i() {
      return this.ci.d();
   }

   @Override
   public boolean f() {
      return this.bD() && !this.p_();
   }

   @Override
   public void a(@Nullable avg $$0) {
      this.ci.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avf.ye, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bU.a(1, new cap(this, 1.65));
      this.bU.a(2, new bzi(this, 1.0));
      this.cj = new cbe(this, 1.4, $$0 -> $$0.a(awd.au), false);
      this.bU.a(3, this.cj);
      this.bU.a(4, new cka.a(this, 1.0));
      this.bU.a(5, new bzv(this, 1.0));
      this.bU.a(7, new cat(this, 1.0, 60));
      this.bU.a(8, new cae(this, cmh.class, 8.0F));
      this.bU.a(8, new car(this));
      this.bU.a(9, new cae(this, cka.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(cg, $$0);
      buc $$1 = this.f(bug.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(cb);
         } else {
            $$1.e(cb);
         }
      }
   }

   public boolean s() {
      return this.ao.a(cg);
   }

   @Override
   public boolean a(eob $$0) {
      return $$0.a(awa.b);
   }

   @Override
   protected evz a(bsd $$0, bsg $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * aye.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcg $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bsy cQ() {
      return (bsy)(this.i() && this.cT() instanceof cmh $$0 && $$0.b(cud.nS) ? $$0 : super.cQ());
   }

   @Override
   public evz b(bsy $$0) {
      evz[] $$1 = new evz[]{
         a((double)this.dj(), (double)$$0.dj(), $$0.dF()),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 45.0F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 45.0F)
      };
      Set<ja> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cK().e;
      double $$4 = this.cK().b - 0.5;
      ja.a $$5 = new ja.a();

      for (evz $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(jf.a);
         }
      }

      for (ja $$8 : $$2) {
         if (!this.dP().b_($$8).a(awa.b)) {
            double $$9 = this.dP().j($$8);
            if (coh.a($$9)) {
               evz $$10 = evz.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fE().iterator();

               while (var14.hasNext()) {
                  btk $$11 = (btk)var14.next();
                  evu $$12 = $$0.f($$11);
                  if (coh.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new evz(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cmh $$0, evz $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.ci.b();
      super.a($$0, $$1);
   }

   @Override
   protected evz b(cmh $$0, evz $$1) {
      return new evz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmh $$0) {
      return (float)(this.g(bug.v) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.ci.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(this.bs() ? avf.yc : avf.yb, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ci.a(this.dS());
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
      this.aS();
      if (this.bs()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ah.a(140) == 0) {
         this.b(avf.xX);
      } else if (this.gk() && this.ah.a(60) == 0) {
         this.b(avf.xY);
      }

      if (!this.gc()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dsh $$0 = this.dP().a_(this.dp());
            dsh $$1 = this.bo();
            $$2 = $$0.a(avu.aU) || $$1.a(avu.aU) || this.b(awa.b) > 0.0;
            if (this.dc() instanceof cka $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gn();
      this.aS();
   }

   private boolean y() {
      return this.cj != null && this.cj.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gn() {
      if (this.bs()) {
         ewe $$0 = ewe.a(this);
         if ($$0.a(djv.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awa.b)) {
            this.d(true);
         } else {
            this.h(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static buf.a u() {
      return bta.A().a(bug.v, 0.175F).a(bug.m, 16.0);
   }

   @Override
   protected ave v() {
      return !this.gk() && !this.y() ? avf.xW : null;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.ya;
   }

   @Override
   protected ave o_() {
      return avf.xZ;
   }

   @Override
   protected boolean r(bsd $$0) {
      return !this.bS() && !this.a(awa.b);
   }

   @Override
   public boolean fl() {
      return true;
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   protected cck b(dcd $$0) {
      return new cka.b(this, $$0);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      if ($$1.a_($$0).u().a(awa.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cka b(aqk $$0, brx $$1) {
      return bsj.aZ.a((dcd)$$0);
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.at);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(cud.nL);
      }
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fN()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqd.a(this.dP().B);
      } else {
         bqd $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cua $$4 = $$0.b($$1);
            return $$4.a(cud.nL) ? $$4.a($$0, this, $$1) : bqd.e;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), avf.yd, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aym $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bta $$5 = bsj.bx.a((dcd)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckg.b(ckg.a($$4), false));
               $$5.a(bsk.a, new cua(cud.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            brx $$6 = bsj.aZ.a((dcd)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new brx.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private btr a(dcs $$0, bqb $$1, bta $$2, @Nullable btr $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, btc.g, $$3);
      $$2.a(this, true);
      return new brx.a(0.0F);
   }

   static class a extends caj {
      private final cka g;

      a(cka $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ja k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bs() && this.a(this.g.dP(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bs() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dcg $$0, ja $$1) {
         return $$0.a_($$1).a(dfh.H) && $$0.a_($$1.c()).a(eoq.a);
      }
   }

   static class b extends ccj {
      b(cka $$0, dcd $$1) {
         super($$0, $$1);
      }

      @Override
      protected eor a(int $$0) {
         this.o = new eox();
         this.o.a(true);
         return new eor(this.o, $$0);
      }

      @Override
      protected boolean a(eos $$0) {
         return $$0 != eos.i && $$0 != eos.o && $$0 != eos.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ja $$0) {
         return this.b.a_($$0).a(dfh.H) || super.a($$0);
      }
   }
}
