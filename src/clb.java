import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clb extends bul {
   private static final Logger f = LogUtils.getLogger();
   private dvv g = dis.I.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public ul c;
   public boolean d;
   protected static final akm<jh> e = akq.a(clb.class, ako.o);

   public clb(bus<? extends clb> $$0, dfm $$1) {
      super($$0, $$1);
   }

   private clb(dfm $$0, double $$1, double $$2, double $$3, dvv $$4) {
      this(bus.W, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.h(ezy.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dv());
   }

   public static clb a(dfm $$0, jh $$1, dvv $$2) {
      clb $$3 = new clb($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dwl.C) ? $$2.b(dwl.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   public void a(jh $$0) {
      this.al.a(e, $$0);
   }

   public jh j() {
      return this.al.a(e);
   }

   @Override
   protected bul.b bg() {
      return bul.b.a;
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(e, jh.c);
   }

   @Override
   public boolean bH() {
      return !this.dQ();
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.g.l()) {
         this.at();
      } else {
         diq $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bvl.a, this.dy());
         this.aK();
         this.bW();
         if (this.dV() instanceof arp $$1 && (this.bL() || this.d)) {
            jh $$2 = this.dv();
            boolean $$3 = this.g.b() instanceof dkc;
            boolean $$4 = $$3 && this.dV().b_($$2).a(axi.a);
            double $$5 = this.dy().h();
            if ($$3 && $$5 > 1.0) {
               ezu $$6 = this.dV().a(new deu(new ezy(this.K, this.L, this.M), this.dt(), deu.a.a, deu.b.b, this));
               if ($$6.d() != ezw.a.a && this.dV().b_($$6.b()).a(axi.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dV().K_() || $$2.v() > this.dV().al()) || this.a > 600) {
                  if (this.b && $$1.N().b(dfi.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dvv $$7 = this.dV().a_($$2);
               this.h(this.dy().d(0.7, -0.5, 0.7));
               if (!$$7.a(dis.bQ)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new dae(this.dV(), $$2, jm.a, cwm.k, jm.b));
                     boolean $$9 = dll.n(this.dV().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dfp)this.dV(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(dwl.C) && this.dV().b_($$2).a() == erw.c) {
                           this.g = this.g.b(dwl.C, Boolean.valueOf(true));
                        }

                        if (this.dV().a($$2, this.g, 3)) {
                           ((arp)this.dV()).m().a.a(this, new aco($$2, this.dV().a_($$2)));
                           this.at();
                           if ($$0 instanceof dlk) {
                              ((dlk)$$0).a(this.dV(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dsy $$11 = this.dV().c_($$2);
                              if ($$11 != null) {
                                 ul $$12 = $$11.d(this.dV().J_());

                                 for (String $$13 : this.c.e()) {
                                    $$12.a($$13, this.c.c($$13).d());
                                 }

                                 try {
                                    $$11.c($$12, this.dV().J_());
                                 } catch (Exception var16) {
                                    f.error("Failed to load block entity from falling block", var16);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.N().b(dfi.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.N().b(dfi.i)) {
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     }
                  } else {
                     this.at();
                     this.a($$0, $$2);
                  }
               }
            }
         }

         this.h(this.dy().c(0.98));
      }
   }

   public void a(diq $$0, jh $$1) {
      if ($$0 instanceof dlk) {
         ((dlk)$$0).a(this.dV(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = azm.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bul> $$4 = buq.e.and(buq.b);
            btb $$6 = this.g.b() instanceof dlk $$5 ? $$5.a(this) : this.dW().a(this);
            float $$7 = (float)Math.min(azm.d((float)$$3 * this.k), this.j);
            this.dV().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(axc.N);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dvv $$9 = dhq.e(this.g);
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
   protected void b(ul $$0) {
      $$0.a("BlockState", va.a(this.g));
      $$0.a("Time", this.a);
      $$0.a("DropItem", this.b);
      $$0.a("HurtEntities", this.i);
      $$0.a("FallHurtAmount", this.k);
      $$0.a("FallHurtMax", this.j);
      if (this.c != null) {
         $$0.a("TileEntityData", this.c);
      }

      $$0.a("CancelDrop", this.h);
   }

   @Override
   protected void a(ul $$0) {
      this.g = va.a(this.dV().a(ma.f), $$0.p("BlockState"));
      this.a = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(axc.N)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.b = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.c = $$0.p("TileEntityData").i();
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.l()) {
         this.g = dis.I.m();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void l() {
      this.h = true;
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dvv n() {
      return this.g;
   }

   @Override
   protected xj cz() {
      return xj.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cW() {
      return true;
   }

   @Override
   public zq<acf> a(arn $$0) {
      return new acg(this, $$0, diq.j(this.n()));
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.g = diq.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dv());
   }

   @Nullable
   @Override
   public bul b(est $$0) {
      ali<dfm> $$1 = $$0.a().ag();
      ali<dfm> $$2 = this.dV().ag();
      boolean $$3 = ($$2 == dfm.k || $$1 == dfm.k) && $$2 != $$1;
      bul $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
