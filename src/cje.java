import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cje extends bsq {
   private static final Logger g = LogUtils.getLogger();
   private dta h = dfy.I.o();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public ua d;
   public boolean e;
   protected static final ajv<jd> f = ajz.a(cje.class, ajx.o);

   public cje(bsw<? extends cje> $$0, dcu $$1) {
      super($$0, $$1);
   }

   private cje(dcu $$0, double $$1, double $$2, double $$3, dta $$4) {
      this(bsw.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.i(eww.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dq());
   }

   public static cje a(dcu $$0, jd $$1, dta $$2) {
      cje $$3 = new cje($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dtq.C) ? $$2.a(dtq.C, Boolean.valueOf(false)) : $$2);
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
   protected bsq.b bc() {
      return bsq.b.a;
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(f, jd.c);
   }

   @Override
   public boolean bA() {
      return !this.dL();
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
         dfw $$0 = this.h.b();
         this.b++;
         this.bb();
         this.a(btq.a, this.dt());
         this.bP();
         if (!this.dQ().B && (this.bE() || this.e)) {
            jd $$1 = this.dq();
            boolean $$2 = this.h.b() instanceof dhi;
            boolean $$3 = $$2 && this.dQ().b_($$1).a(awj.a);
            double $$4 = this.dt().g();
            if ($$2 && $$4 > 1.0) {
               ews $$5 = this.dQ().a(new dcd(new eww(this.L, this.M, this.N), this.do(), dcd.a.a, dcd.b.b, this));
               if ($$5.c() != ewu.a.a && this.dQ().b_($$5.a()).a(awj.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aF() || $$3) {
               dta $$6 = this.dQ().a_($$1);
               this.i(this.dt().d(0.7, -0.5, 0.7));
               if (!$$6.a(dfy.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new cyc(this.dQ(), $$1, ji.a, cuo.l, ji.b));
                     boolean $$8 = dis.m(this.dQ().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((dcx)this.dQ(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(dtq.C) && this.dQ().b_($$1).a() == eoz.c) {
                           this.h = this.h.a(dtq.C, Boolean.valueOf(true));
                        }

                        if (this.dQ().a($$1, this.h, 3)) {
                           ((aqt)this.dQ()).l().a.a(this, new acc($$1, this.dQ().a_($$1)));
                           this.aq();
                           if ($$0 instanceof dir) {
                              ((dir)$$0).a(this.dQ(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.t()) {
                              dqf $$10 = this.dQ().c_($$1);
                              if ($$10 != null) {
                                 ua $$11 = $$10.d(this.dQ().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dQ().H_());
                                 } catch (Exception var15) {
                                    g.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dQ().ab().b(dcq.i)) {
                           this.aq();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.aq();
                        if (this.c && this.dQ().ab().b(dcq.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.aq();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dQ().B && (this.b > 100 && ($$1.v() <= this.dQ().I_() || $$1.v() > this.dQ().am()) || this.b > 600)) {
               if (this.c && this.dQ().ab().b(dcq.i)) {
                  this.a($$0);
               }

               this.aq();
            }
         }

         this.i(this.dt().a(0.98));
      }
   }

   public void a(dfw $$0, jd $$1) {
      if ($$0 instanceof dir) {
         ((dir)$$0).a(this.dQ(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = ayn.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bsq> $$4 = bsv.e.and(bsv.b);
            brj $$6 = this.h.b() instanceof dir $$5 ? $$5.a(this) : this.dR().a(this);
            float $$7 = (float)Math.min(ayn.d((float)$$3 * this.l), this.k);
            this.dQ().a(this, this.cL(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(awd.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               dta $$9 = dew.e(this.h);
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
   protected void b(ua $$0) {
      $$0.a("BlockState", up.a(this.h));
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
   protected void a(ua $$0) {
      this.h = up.a(this.dQ().a(lu.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(awd.M)) {
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
         this.h = dfy.I.o();
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

   public dta t() {
      return this.h;
   }

   @Override
   protected wy cs() {
      return wy.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cQ() {
      return true;
   }

   @Override
   public zf<abt> dm() {
      return new abu(this, dfw.i(this.t()));
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      this.h = dfw.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dq());
   }

   @Nullable
   @Override
   public bsq a(epw $$0) {
      akp<dcu> $$1 = $$0.a().af();
      akp<dcu> $$2 = this.dQ().af();
      boolean $$3 = ($$2 == dcu.j || $$1 == dcu.j) && $$2 != $$1;
      bsq $$4 = super.a($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
