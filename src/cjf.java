import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjf extends bst {
   private static final Logger f = LogUtils.getLogger();
   private dsb g = dfa.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public ur d;
   protected static final akj<iz> e = akn.a(cjf.class, akl.o);

   public cjf(bsz<? extends cjf> $$0, dbx $$1) {
      super($$0, $$1);
   }

   private cjf(dbx $$0, double $$1, double $$2, double $$3, dsb $$4) {
      this(bsz.O, $$0);
      this.g = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(evq.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dp());
   }

   public static cjf a(dbx $$0, iz $$1, dsb $$2) {
      cjf $$3 = new cjf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dsr.C) ? $$2.a(dsr.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean ct() {
      return false;
   }

   public void a(iz $$0) {
      this.ao.a(e, $$0);
   }

   public iz p() {
      return this.ao.a(e);
   }

   @Override
   protected bst.b bb() {
      return bst.b.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, iz.c);
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ao();
      } else {
         dey $$0 = this.g.b();
         this.b++;
         this.ba();
         this.a(btt.a, this.ds());
         if (!this.dP().B) {
            iz $$1 = this.dp();
            boolean $$2 = this.g.b() instanceof dgk;
            boolean $$3 = $$2 && this.dP().b_($$1).a(awu.a);
            double $$4 = this.ds().g();
            if ($$2 && $$4 > 1.0) {
               evm $$5 = this.dP().a(new dbg(new evq(this.L, this.M, this.N), this.dn(), dbg.a.a, dbg.b.b, this));
               if ($$5.c() != evo.a.a && this.dP().b_($$5.a()).a(awu.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aE() || $$3) {
               dsb $$6 = this.dP().a_($$1);
               this.h(this.ds().d(0.7, -0.5, 0.7));
               if (!$$6.a(dfa.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cya(this.dP(), $$1, je.a, cuo.l, je.b));
                     boolean $$8 = dhu.m(this.dP().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((dca)this.dP(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dsr.C) && this.dP().b_($$1).a() == env.c) {
                           this.g = this.g.a(dsr.C, Boolean.valueOf(true));
                        }

                        if (this.dP().a($$1, this.g, 3)) {
                           ((are)this.dP()).l().a.a(this, new acq($$1, this.dP().a_($$1)));
                           this.ao();
                           if ($$0 instanceof dht) {
                              ((dht)$$0).a(this.dP(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dpg $$10 = this.dP().c_($$1);
                              if ($$10 != null) {
                                 ur $$11 = $$10.d(this.dP().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dP().H_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dP().ab().b(dbt.i)) {
                           this.ao();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ao();
                        if (this.c && this.dP().ab().b(dbt.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ao();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dP().B && (this.b > 100 && ($$1.v() <= this.dP().I_() || $$1.v() > this.dP().am()) || this.b > 600)) {
               if (this.c && this.dP().ab().b(dbt.i)) {
                  this.a($$0);
               }

               this.ao();
            }
         }

         this.h(this.ds().a(0.98));
      }
   }

   public void a(dey $$0, iz $$1) {
      if ($$0 instanceof dht) {
         ((dht)$$0).a(this.dP(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brm $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayy.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bst> $$4 = bsy.e.and(bsy.b);
            brm $$6 = this.g.b() instanceof dht $$5 ? $$5.a(this) : this.dQ().a(this);
            float $$7 = (float)Math.min(ayy.d((float)$$3 * this.k), this.j);
            this.dP().a(this, this.cK(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awo.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               dsb $$9 = ddy.e(this.g);
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
   protected void b(ur $$0) {
      $$0.a("BlockState", vg.a(this.g));
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
   protected void a(ur $$0) {
      this.g = vg.a(this.dP().a(lq.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(awo.M)) {
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
         this.g = dfa.I.o();
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
   public boolean cy() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dsb u() {
      return this.g;
   }

   @Override
   protected xo cr() {
      return xo.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cP() {
      return true;
   }

   @Override
   public zv<ach> dl() {
      return new aci(this, dey.i(this.u()));
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.g = dey.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dp());
   }
}
