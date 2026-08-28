import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciu extends bsh {
   private static final Logger f = LogUtils.getLogger();
   private dsl g = dfk.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tx d;
   protected static final ajp<ja> e = ajt.a(ciu.class, ajr.o);

   public ciu(bsn<? extends ciu> $$0, dcg $$1) {
      super($$0, $$1);
   }

   private ciu(dcg $$0, double $$1, double $$2, double $$3, dsl $$4) {
      this(bsn.O, $$0);
      this.g = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.j(ewh.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dr());
   }

   public static ciu a(dcg $$0, ja $$1, dsl $$2) {
      ciu $$3 = new ciu($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dtb.C) ? $$2.a(dtb.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cv() {
      return false;
   }

   public void a(ja $$0) {
      this.ao.a(e, $$0);
   }

   public ja p() {
      return this.ao.a(e);
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(e, ja.c);
   }

   @Override
   public boolean bB() {
      return !this.dM();
   }

   @Override
   protected double ba() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.aq();
      } else {
         dfi $$0 = this.g.b();
         this.b++;
         this.bc();
         this.a(bth.a, this.du());
         if (!this.dR().B) {
            ja $$1 = this.dr();
            boolean $$2 = this.g.b() instanceof dgu;
            boolean $$3 = $$2 && this.dR().b_($$1).a(awc.a);
            double $$4 = this.du().g();
            if ($$2 && $$4 > 1.0) {
               ewd $$5 = this.dR().a(new dbp(new ewh(this.L, this.M, this.N), this.dp(), dbp.a.a, dbp.b.b, this));
               if ($$5.c() != ewf.a.a && this.dR().b_($$5.a()).a(awc.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aG() || $$3) {
               dsl $$6 = this.dR().a_($$1);
               this.j(this.du().d(0.7, -0.5, 0.7));
               if (!$$6.a(dfk.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cxo(this.dR(), $$1, jf.a, cud.l, jf.b));
                     boolean $$8 = die.m(this.dR().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((dcj)this.dR(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dtb.C) && this.dR().b_($$1).a() == eok.c) {
                           this.g = this.g.a(dtb.C, Boolean.valueOf(true));
                        }

                        if (this.dR().a($$1, this.g, 3)) {
                           ((aqm)this.dR()).l().a.a(this, new abw($$1, this.dR().a_($$1)));
                           this.aq();
                           if ($$0 instanceof did) {
                              ((did)$$0).a(this.dR(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dpq $$10 = this.dR().c_($$1);
                              if ($$10 != null) {
                                 tx $$11 = $$10.d(this.dR().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dR().H_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dR().ab().b(dcc.i)) {
                           this.aq();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.aq();
                        if (this.c && this.dR().ab().b(dcc.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.aq();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dR().B && (this.b > 100 && ($$1.v() <= this.dR().I_() || $$1.v() > this.dR().am()) || this.b > 600)) {
               if (this.c && this.dR().ab().b(dcc.i)) {
                  this.a($$0);
               }

               this.aq();
            }
         }

         this.j(this.du().a(0.98));
         this.bQ();
      }
   }

   public void a(dfi $$0, ja $$1) {
      if ($$0 instanceof did) {
         ((did)$$0).a(this.dR(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayg.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bsh> $$4 = bsm.e.and(bsm.b);
            bra $$6 = this.g.b() instanceof did $$5 ? $$5.a(this) : this.dS().a(this);
            float $$7 = (float)Math.min(ayg.d((float)$$3 * this.k), this.j);
            this.dR().a(this, this.cM(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(avw.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               dsl $$9 = dei.e(this.g);
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
   protected void b(tx $$0) {
      $$0.a("BlockState", um.a(this.g));
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
   protected void a(tx $$0) {
      this.g = um.a(this.dR().a(lr.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(avw.M)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").i();
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.i()) {
         this.g = dfk.I.o();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   public void s() {
      this.h = true;
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dsl t() {
      return this.g;
   }

   @Override
   protected wu ct() {
      return wu.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cR() {
      return true;
   }

   @Override
   public zb<abn> dn() {
      return new abo(this, dfi.i(this.t()));
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.g = dfi.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dr());
   }
}
