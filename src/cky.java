import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cky extends bui {
   private static final Logger g = LogUtils.getLogger();
   private dvo h = dil.I.m();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public un d;
   public boolean e;
   protected static final ako<jh> f = aks.a(cky.class, akq.o);

   public cky(bup<? extends cky> $$0, dff $$1) {
      super($$0, $$1);
   }

   private cky(dff $$0, double $$1, double $$2, double $$3, dvo $$4) {
      this(bup.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(ezr.c);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dy());
   }

   public static cky a(dff $$0, jh $$1, dvo $$2) {
      cky $$3 = new cky($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dwe.C) ? $$2.b(dwe.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cD() {
      return false;
   }

   public void a(jh $$0) {
      this.am.a(f, $$0);
   }

   public jh m() {
      return this.am.a(f);
   }

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(f, jh.c);
   }

   @Override
   public boolean bJ() {
      return !this.dT();
   }

   @Override
   protected double bf() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.h.l()) {
         this.av();
      } else {
         dij $$0 = this.h.b();
         this.b++;
         this.bh();
         this.a(bvi.a, this.dB());
         this.aM();
         this.bY();
         if (!this.dY().C && (this.bN() || this.e)) {
            jh $$1 = this.dy();
            boolean $$2 = this.h.b() instanceof djv;
            boolean $$3 = $$2 && this.dY().b_($$1).a(axj.a);
            double $$4 = this.dB().h();
            if ($$2 && $$4 > 1.0) {
               ezn $$5 = this.dY().a(new den(new ezr(this.L, this.M, this.N), this.dw(), den.a.a, den.b.b, this));
               if ($$5.d() != ezp.a.a && this.dY().b_($$5.b()).a(axj.a)) {
                  $$1 = $$5.b();
                  $$3 = true;
               }
            }

            if (this.aL() || $$3) {
               dvo $$6 = this.dY().a_($$1);
               this.h(this.dB().d(0.7, -0.5, 0.7));
               if (!$$6.a(dil.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new czx(this.dY(), $$1, jm.a, cwf.k, jm.b));
                     boolean $$8 = dle.n(this.dY().a_($$1.e())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((dfi)this.dY(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(dwe.C) && this.dY().b_($$1).a() == erp.c) {
                           this.h = this.h.b(dwe.C, Boolean.valueOf(true));
                        }

                        if (this.dY().a($$1, this.h, 3)) {
                           ((arq)this.dY()).l().a.a(this, new acq($$1, this.dY().a_($$1)));
                           this.av();
                           if ($$0 instanceof dld) {
                              ((dld)$$0).a(this.dY(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.x()) {
                              dsr $$10 = this.dY().c_($$1);
                              if ($$10 != null) {
                                 un $$11 = $$10.d(this.dY().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dY().H_());
                                 } catch (Exception var15) {
                                    g.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dY().ac().b(dfb.i)) {
                           this.av();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.av();
                        if (this.c && this.dY().ac().b(dfb.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.av();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dY().C && (this.b > 100 && ($$1.v() <= this.dY().I_() || $$1.v() > this.dY().al()) || this.b > 600)) {
               if (this.c && this.dY().ac().b(dfb.i)) {
                  this.a($$0);
               }

               this.av();
            }
         }

         this.h(this.dB().c(0.98));
      }
   }

   public void a(dij $$0, jh $$1) {
      if ($$0 instanceof dld) {
         ((dld)$$0).a(this.dY(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = azn.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bui> $$4 = bun.e.and(bun.b);
            bsy $$6 = this.h.b() instanceof dld $$5 ? $$5.a(this) : this.dZ().a(this);
            float $$7 = (float)Math.min(azn.d((float)$$3 * this.l), this.k);
            this.dY().a(this, this.cT(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(axd.N);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dvo $$9 = dhj.e(this.h);
               if ($$9 == null) {
                  this.i = true;
               } else {
                  this.h = $$9;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void b(un $$0) {
      $$0.a("BlockState", vc.a(this.h));
      $$0.a("Time", this.b);
      $$0.a("DropItem", this.c);
      $$0.a("HurtEntities", this.j);
      $$0.a("FallHurtAmount", this.l);
      $$0.a("FallHurtMax", this.k);
      if (this.d != null) {
         $$0.a("TileEntityData", this.d);
      }

      $$0.a("CancelDrop", this.i);
   }

   @Override
   protected void a(un $$0) {
      this.h = vc.a(this.dY().a(ma.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(axd.N)) {
         this.j = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").i();
      }

      this.i = $$0.q("CancelDrop");
      if (this.h.l()) {
         this.h = dil.I.m();
      }
   }

   public void b(float $$0, int $$1) {
      this.j = true;
      this.l = $$0;
      this.k = $$1;
   }

   @Override
   public void o() {
      this.i = true;
   }

   @Override
   public boolean cH() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.h.toString());
   }

   public dvo q() {
      return this.h;
   }

   @Override
   protected xl cB() {
      return xl.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public zs<ach> a(arp $$0) {
      return new aci(this, $$0, dij.j(this.q()));
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.h = dij.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dy());
   }

   @Nullable
   @Override
   public bui b(esm $$0) {
      alk<dff> $$1 = $$0.a().ag();
      alk<dff> $$2 = this.dY().ag();
      boolean $$3 = ($$2 == dff.k || $$1 == dff.k) && $$2 != $$1;
      bui $$4 = super.b($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
