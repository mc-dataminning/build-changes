import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckg extends btr {
   private static final Logger g = LogUtils.getLogger();
   private dus h = dho.I.n();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public ug d;
   public boolean e;
   protected static final akh<jf> f = akl.a(ckg.class, akj.o);

   public ckg(bty<? extends ckg> $$0, dej $$1) {
      super($$0, $$1);
   }

   private ckg(dej $$0, double $$1, double $$2, double $$3, dus $$4) {
      this(bty.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(eyw.c);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.ds());
   }

   public static ckg a(dej $$0, jf $$1, dus $$2) {
      ckg $$3 = new ckg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dvi.C) ? $$2.b(dvi.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cy() {
      return false;
   }

   public void a(jf $$0) {
      this.am.a(f, $$0);
   }

   public jf m() {
      return this.am.a(f);
   }

   @Override
   protected btr.b bf() {
      return btr.b.a;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(f, jf.c);
   }

   @Override
   public boolean bE() {
      return !this.dN();
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.h.l()) {
         this.as();
      } else {
         dhm $$0 = this.h.b();
         this.b++;
         this.be();
         this.a(bur.a, this.dv());
         this.aI();
         this.bT();
         if (!this.dS().B && (this.bI() || this.e)) {
            jf $$1 = this.ds();
            boolean $$2 = this.h.b() instanceof diy;
            boolean $$3 = $$2 && this.dS().b_($$1).a(axb.a);
            double $$4 = this.dv().h();
            if ($$2 && $$4 > 1.0) {
               eys $$5 = this.dS().a(new ddr(new eyw(this.L, this.M, this.N), this.dq(), ddr.a.a, ddr.b.b, this));
               if ($$5.d() != eyu.a.a && this.dS().b_($$5.b()).a(axb.a)) {
                  $$1 = $$5.b();
                  $$3 = true;
               }
            }

            if (this.aH() || $$3) {
               dus $$6 = this.dS().a_($$1);
               this.h(this.dv().d(0.7, -0.5, 0.7));
               if (!$$6.a(dho.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new czo(this.dS(), $$1, jk.a, cvs.k, jk.b));
                     boolean $$8 = dki.n(this.dS().a_($$1.e())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((dem)this.dS(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(dvi.C) && this.dS().b_($$1).a() == equ.c) {
                           this.h = this.h.b(dvi.C, Boolean.valueOf(true));
                        }

                        if (this.dS().a($$1, this.h, 3)) {
                           ((arj)this.dS()).l().a.a(this, new acj($$1, this.dS().a_($$1)));
                           this.as();
                           if ($$0 instanceof dkh) {
                              ((dkh)$$0).a(this.dS(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.x()) {
                              drv $$10 = this.dS().c_($$1);
                              if ($$10 != null) {
                                 ug $$11 = $$10.d(this.dS().G_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dS().G_());
                                 } catch (Exception var15) {
                                    g.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dS().ac().b(def.i)) {
                           this.as();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.as();
                        if (this.c && this.dS().ac().b(def.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.as();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dS().B && (this.b > 100 && ($$1.v() <= this.dS().H_() || $$1.v() > this.dS().an()) || this.b > 600)) {
               if (this.c && this.dS().ac().b(def.i)) {
                  this.a($$0);
               }

               this.as();
            }
         }

         this.h(this.dv().c(0.98));
      }
   }

   public void a(dhm $$0, jf $$1) {
      if ($$0 instanceof dkh) {
         ((dkh)$$0).a(this.dS(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = azf.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<btr> $$4 = btw.e.and(btw.b);
            bsj $$6 = this.h.b() instanceof dkh $$5 ? $$5.a(this) : this.dT().a(this);
            float $$7 = (float)Math.min(azf.d((float)$$3 * this.l), this.k);
            this.dS().a(this, this.cO(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(awv.N);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dus $$9 = dgm.e(this.h);
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
   protected void b(ug $$0) {
      $$0.a("BlockState", uv.a(this.h));
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
   protected void a(ug $$0) {
      this.h = uv.a(this.dS().a(lw.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(awv.N)) {
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
         this.h = dho.I.n();
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
   public boolean cC() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.h.toString());
   }

   public dus q() {
      return this.h;
   }

   @Override
   protected xe cw() {
      return xe.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cT() {
      return true;
   }

   @Override
   public zl<aca> a(ari $$0) {
      return new acb(this, $$0, dhm.j(this.q()));
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      this.h = dhm.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.ds());
   }

   @Nullable
   @Override
   public btr b(err $$0) {
      ald<dej> $$1 = $$0.a().ag();
      ald<dej> $$2 = this.dS().ag();
      boolean $$3 = ($$2 == dej.j || $$1 == dej.j) && $$2 != $$1;
      btr $$4 = super.b($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
