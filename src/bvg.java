import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvg extends bfj {
   private static final Logger f = LogUtils.getLogger();
   private dcb g = cpo.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qr d;
   protected static final aby<gu> e = acb.a(bvg.class, aca.n);

   public bvg(bfn<? extends bvg> $$0, cmm $$1) {
      super($$0, $$1);
   }

   private bvg(cmm $$0, double $$1, double $$2, double $$3, dcb $$4) {
      this(bfn.L, $$0);
      this.g = $$4;
      this.H = true;
      this.e($$1, $$2, $$3);
      this.f(eei.b);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.a(this.di());
   }

   public static bvg a(cmm $$0, gu $$1, dcb $$2) {
      bvg $$3 = new bvg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dcr.C) ? $$2.a(dcr.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cn() {
      return false;
   }

   public void a(gu $$0) {
      this.am.b(e, $$0);
   }

   public gu j() {
      return this.am.b(e);
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.a;
   }

   @Override
   protected void a_() {
      this.am.a(e, gu.b);
   }

   @Override
   public boolean bo() {
      return !this.dD();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ai();
      } else {
         cpn $$0 = this.g.b();
         this.b++;
         if (!this.aR()) {
            this.f(this.dl().b(0.0, -0.04, 0.0));
         }

         this.a(bgf.a, this.dl());
         if (!this.dI().B) {
            gu $$1 = this.di();
            boolean $$2 = this.g.b() instanceof cqx;
            boolean $$3 = $$2 && this.dI().b_($$1).a(anb.a);
            double $$4 = this.dl().g();
            if ($$2 && $$4 > 1.0) {
               eee $$5 = this.dI().a(new clv(new eei(this.J, this.K, this.L), this.dg(), clv.a.a, clv.b.b, this));
               if ($$5.c() != eeg.a.a && this.dI().b_($$5.a()).a(anb.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.ay() || $$3) {
               dcb $$6 = this.dI().a_($$1);
               this.f(this.dl().d(0.7, -0.5, 0.7));
               if (!$$6.a(cpo.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cii(this.dI(), $$1, ha.a, cfz.b, ha.b));
                     boolean $$8 = csf.h(this.dI().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cmp)this.dI(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dcr.C) && this.dI().b_($$1).a() == dxf.c) {
                           this.g = this.g.a(dcr.C, Boolean.valueOf(true));
                        }

                        if (this.dI().a($$1, this.g, 3)) {
                           ((aif)this.dI()).k().a.a(this, new vb($$1, this.dI().a_($$1)));
                           this.ai();
                           if ($$0 instanceof cse) {
                              ((cse)$$0).a(this.dI(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              czn $$10 = this.dI().c_($$1);
                              if ($$10 != null) {
                                 qr $$11 = $$10.o();

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.a($$11);
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dI().X().b(cmi.h)) {
                           this.ai();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ai();
                        if (this.c && this.dI().X().b(cmi.h)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ai();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dI().B && (this.b > 100 && ($$1.v() <= this.dI().C_() || $$1.v() > this.dI().aj()) || this.b > 600)) {
               if (this.c && this.dI().X().b(cmi.h)) {
                  this.a($$0);
               }

               this.ai();
            }
         }

         this.f(this.dl().a(0.98));
      }
   }

   public void a(cpn $$0, gu $$1) {
      if ($$0 instanceof cse) {
         ((cse)$$0).a(this.dI(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, ben $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = apa.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bfj> $$4 = bfm.e.and(bfm.b);
            ben $$6 = this.g.b() instanceof cse $$5 ? $$5.a(this) : this.dJ().a(this);
            float $$7 = (float)Math.min(apa.d((float)$$3 * this.k), this.j);
            this.dI().a(this, this.cE(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(amw.M);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dcb $$9 = coo.e(this.g);
               if ($$9 == null) {
                  this.h = true;
               } else {
                  this.g = $$9;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("BlockState", rd.a(this.g));
      $$0.a("Time", this.b);
      $$0.a("DropItem", this.c);
      $$0.a("HurtEntities", this.i);
      $$0.a("FallHurtAmount", this.k);
      $$0.a("FallHurtMax", this.j);
      if (this.d != null) {
         $$0.a("TileEntityData", this.d);
      }

      $$0.a("CancelDrop", this.h);
   }

   @Override
   protected void a(qr $$0) {
      this.g = rd.a(this.dI().a(jc.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(amw.M)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData");
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.i()) {
         this.g = cpo.I.n();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void k() {
      this.h = true;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dcb o() {
      return this.g;
   }

   @Override
   protected sw cl() {
      return sw.a("entity.minecraft.falling_block_type", this.g.b().e());
   }

   @Override
   public boolean cK() {
      return true;
   }

   @Override
   public uo<ur> S() {
      return new us(this, cpn.i(this.o()));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.g = cpn.a($$0.n());
      this.H = true;
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      this.e($$1, $$2, $$3);
      this.a(this.di());
   }
}
