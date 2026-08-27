import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bye extends bii {
   private static final Logger f = LogUtils.getLogger();
   private dez g = csm.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qr d;
   protected static final adz<gu> e = aec.a(bye.class, aeb.n);

   public bye(bim<? extends bye> $$0, cpl $$1) {
      super($$0, $$1);
   }

   private bye(cpl $$0, double $$1, double $$2, double $$3, dez $$4) {
      this(bim.L, $$0);
      this.g = $$4;
      this.I = true;
      this.e($$1, $$2, $$3);
      this.f(ehd.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dk());
   }

   public static bye a(cpl $$0, gu $$1, dez $$2) {
      bye $$3 = new bye($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dfp.C) ? $$2.a(dfp.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cp() {
      return false;
   }

   public void a(gu $$0) {
      this.an.b(e, $$0);
   }

   public gu j() {
      return this.an.b(e);
   }

   @Override
   protected bii.b aU() {
      return bii.b.a;
   }

   @Override
   protected void a_() {
      this.an.a(e, gu.b);
   }

   @Override
   public boolean br() {
      return !this.dF();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ak();
      } else {
         csl $$0 = this.g.b();
         this.b++;
         if (!this.aT()) {
            this.f(this.dn().b(0.0, -0.04, 0.0));
         }

         this.a(bje.a, this.dn());
         if (!this.dK().B) {
            gu $$1 = this.dk();
            boolean $$2 = this.g.b() instanceof ctv;
            boolean $$3 = $$2 && this.dK().b_($$1).a(apq.a);
            double $$4 = this.dn().g();
            if ($$2 && $$4 > 1.0) {
               egz $$5 = this.dK().a(new cou(new ehd(this.K, this.L, this.M), this.di(), cou.a.a, cou.b.b, this));
               if ($$5.c() != ehb.a.a && this.dK().b_($$5.a()).a(apq.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aA() || $$3) {
               dez $$6 = this.dK().a_($$1);
               this.f(this.dn().d(0.7, -0.5, 0.7));
               if (!$$6.a(csm.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new clg(this.dK(), $$1, ha.a, cix.b, ha.b));
                     boolean $$8 = cvd.h(this.dK().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cpo)this.dK(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dfp.C) && this.dK().b_($$1).a() == ead.c) {
                           this.g = this.g.a(dfp.C, Boolean.valueOf(true));
                        }

                        if (this.dK().a($$1, this.g, 3)) {
                           ((akk)this.dK()).k().a.a(this, new wz($$1, this.dK().a_($$1)));
                           this.ak();
                           if ($$0 instanceof cvc) {
                              ((cvc)$$0).a(this.dK(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dcl $$10 = this.dK().c_($$1);
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
                        } else if (this.c && this.dK().X().b(cph.h)) {
                           this.ak();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ak();
                        if (this.c && this.dK().X().b(cph.h)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ak();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dK().B && (this.b > 100 && ($$1.v() <= this.dK().C_() || $$1.v() > this.dK().aj()) || this.b > 600)) {
               if (this.c && this.dK().X().b(cph.h)) {
                  this.a($$0);
               }

               this.ak();
            }
         }

         this.f(this.dn().a(0.98));
      }
   }

   public void a(csl $$0, gu $$1) {
      if ($$0 instanceof cvc) {
         ((cvc)$$0).a(this.dK(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhg $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = arp.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bii> $$4 = bil.e.and(bil.b);
            bhg $$6 = this.g.b() instanceof cvc $$5 ? $$5.a(this) : this.dL().a(this);
            float $$7 = (float)Math.min(arp.d((float)$$3 * this.k), this.j);
            this.dK().a(this, this.cG(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(apl.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dez $$9 = crm.e(this.g);
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
      this.g = rd.a(this.dK().a(jc.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(apl.M)) {
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
         this.g = csm.I.n();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void m() {
      this.h = true;
   }

   @Override
   public boolean cu() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dez o() {
      return this.g;
   }

   @Override
   protected tf cn() {
      return tf.a("entity.minecraft.falling_block_type", this.g.b().e());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public ux<wp> U() {
      return new wq(this, csl.i(this.o()));
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      this.g = csl.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.e($$1, $$2, $$3);
      this.a(this.dk());
   }
}
