import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjg extends bsr {
   private static final Logger g = LogUtils.getLogger();
   private dtc h = dga.I.o();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public ub d;
   public boolean e;
   protected static final ajw<jd> f = aka.a(cjg.class, ajy.o);

   public cjg(bsx<? extends cjg> $$0, dcw $$1) {
      super($$0, $$1);
   }

   private cjg(dcw $$0, double $$1, double $$2, double $$3, dtc $$4) {
      this(bsx.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.i(exa.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dp());
   }

   public static cjg a(dcw $$0, jd $$1, dtc $$2) {
      cjg $$3 = new cjg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dts.C) ? $$2.a(dts.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cu() {
      return false;
   }

   public void a(jd $$0) {
      this.ao.a(f, $$0);
   }

   public jd p() {
      return this.ao.a(f);
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(f, jd.c);
   }

   @Override
   public boolean bA() {
      return !this.dK();
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.h.i()) {
         this.aq();
      } else {
         dfy $$0 = this.h.b();
         this.b++;
         this.bb();
         this.a(bts.a, this.ds());
         this.bP();
         if (!this.dP().B && (this.bE() || this.e)) {
            jd $$1 = this.dp();
            boolean $$2 = this.h.b() instanceof dhk;
            boolean $$3 = $$2 && this.dP().b_($$1).a(awk.a);
            double $$4 = this.ds().g();
            if ($$2 && $$4 > 1.0) {
               eww $$5 = this.dP().a(new dcf(new exa(this.L, this.M, this.N), this.dn(), dcf.a.a, dcf.b.b, this));
               if ($$5.c() != ewy.a.a && this.dP().b_($$5.a()).a(awk.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aF() || $$3) {
               dtc $$6 = this.dP().a_($$1);
               this.i(this.ds().d(0.7, -0.5, 0.7));
               if (!$$6.a(dga.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new cye(this.dP(), $$1, ji.a, cuq.l, ji.b));
                     boolean $$8 = diu.m(this.dP().a_($$1.e())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((dcz)this.dP(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(dts.C) && this.dP().b_($$1).a() == epd.c) {
                           this.h = this.h.a(dts.C, Boolean.valueOf(true));
                        }

                        if (this.dP().a($$1, this.h, 3)) {
                           ((aqu)this.dP()).l().a.a(this, new acd($$1, this.dP().a_($$1)));
                           this.aq();
                           if ($$0 instanceof dit) {
                              ((dit)$$0).a(this.dP(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.t()) {
                              dqh $$10 = this.dP().c_($$1);
                              if ($$10 != null) {
                                 ub $$11 = $$10.d(this.dP().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dP().H_());
                                 } catch (Exception var15) {
                                    g.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dP().ab().b(dcs.i)) {
                           this.aq();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.aq();
                        if (this.c && this.dP().ab().b(dcs.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.aq();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dP().B && (this.b > 100 && ($$1.v() <= this.dP().I_() || $$1.v() > this.dP().am()) || this.b > 600)) {
               if (this.c && this.dP().ab().b(dcs.i)) {
                  this.a($$0);
               }

               this.aq();
            }
         }

         this.i(this.ds().a(0.98));
      }
   }

   public void a(dfy $$0, jd $$1) {
      if ($$0 instanceof dit) {
         ((dit)$$0).a(this.dP(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = ayo.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bsr> $$4 = bsw.e.and(bsw.b);
            brk $$6 = this.h.b() instanceof dit $$5 ? $$5.a(this) : this.dQ().a(this);
            float $$7 = (float)Math.min(ayo.d((float)$$3 * this.l), this.k);
            this.dP().a(this, this.cL(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(awe.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               dtc $$9 = dey.e(this.h);
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
   protected void b(ub $$0) {
      $$0.a("BlockState", uq.a(this.h));
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
   protected void a(ub $$0) {
      this.h = uq.a(this.dP().a(lu.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(awe.M)) {
         this.j = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").i();
      }

      this.i = $$0.q("CancelDrop");
      if (this.h.i()) {
         this.h = dga.I.o();
      }
   }

   public void b(float $$0, int $$1) {
      this.j = true;
      this.l = $$0;
      this.k = $$1;
   }

   public void s() {
      this.i = true;
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.h.toString());
   }

   public dtc t() {
      return this.h;
   }

   @Override
   protected wz cs() {
      return wz.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cQ() {
      return true;
   }

   @Override
   public zg<abu> a(aqt $$0) {
      return new abv(this, $$0, dfy.i(this.t()));
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.h = dfy.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dp());
   }

   @Nullable
   @Override
   public bsr a(eqa $$0) {
      akq<dcw> $$1 = $$0.a().af();
      akq<dcw> $$2 = this.dP().af();
      boolean $$3 = ($$2 == dcw.j || $$1 == dcw.j) && $$2 != $$1;
      bsr $$4 = super.a($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
