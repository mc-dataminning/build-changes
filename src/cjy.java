import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjy extends btj {
   private static final Logger g = LogUtils.getLogger();
   private dua h = dgx.I.o();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public uf d;
   public boolean e;
   protected static final akg<je> f = akk.a(cjy.class, aki.o);

   public cjy(btq<? extends cjy> $$0, dds $$1) {
      super($$0, $$1);
   }

   private cjy(dds $$0, double $$1, double $$2, double $$3, dua $$4) {
      this(btq.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(eye.c);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.ds());
   }

   public static cjy a(dds $$0, je $$1, dua $$2) {
      cjy $$3 = new cjy($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(duq.C) ? $$2.b(duq.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cy() {
      return false;
   }

   public void a(je $$0) {
      this.am.a(f, $$0);
   }

   public je m() {
      return this.am.a(f);
   }

   @Override
   protected btj.b bf() {
      return btj.b.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, je.c);
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
         dgv $$0 = this.h.b();
         this.b++;
         this.be();
         this.a(buj.a, this.dv());
         this.aI();
         this.bT();
         if (!this.dS().B && (this.bI() || this.e)) {
            je $$1 = this.ds();
            boolean $$2 = this.h.b() instanceof dih;
            boolean $$3 = $$2 && this.dS().b_($$1).a(awy.a);
            double $$4 = this.dv().h();
            if ($$2 && $$4 > 1.0) {
               eya $$5 = this.dS().a(new dda(new eye(this.L, this.M, this.N), this.dq(), dda.a.a, dda.b.b, this));
               if ($$5.c() != eyc.a.a && this.dS().b_($$5.a()).a(awy.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aH() || $$3) {
               dua $$6 = this.dS().a_($$1);
               this.h(this.dv().d(0.7, -0.5, 0.7));
               if (!$$6.a(dgx.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new cyx(this.dS(), $$1, jj.a, cvl.k, jj.b));
                     boolean $$8 = djr.n(this.dS().a_($$1.e())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((ddv)this.dS(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(duq.C) && this.dS().b_($$1).a() == eqc.c) {
                           this.h = this.h.b(duq.C, Boolean.valueOf(true));
                        }

                        if (this.dS().a($$1, this.h, 3)) {
                           ((arg)this.dS()).l().a.a(this, new aci($$1, this.dS().a_($$1)));
                           this.as();
                           if ($$0 instanceof djq) {
                              ((djq)$$0).a(this.dS(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.x()) {
                              dre $$10 = this.dS().c_($$1);
                              if ($$10 != null) {
                                 uf $$11 = $$10.d(this.dS().F_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dS().F_());
                                 } catch (Exception var15) {
                                    g.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dS().ac().b(ddo.i)) {
                           this.as();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.as();
                        if (this.c && this.dS().ac().b(ddo.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.as();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dS().B && (this.b > 100 && ($$1.v() <= this.dS().G_() || $$1.v() > this.dS().an()) || this.b > 600)) {
               if (this.c && this.dS().ac().b(ddo.i)) {
                  this.a($$0);
               }

               this.as();
            }
         }

         this.h(this.dv().c(0.98));
      }
   }

   public void a(dgv $$0, je $$1) {
      if ($$0 instanceof djq) {
         ((djq)$$0).a(this.dS(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = azc.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<btj> $$4 = bto.e.and(bto.b);
            bsb $$6 = this.h.b() instanceof djq $$5 ? $$5.a(this) : this.dT().a(this);
            float $$7 = (float)Math.min(azc.d((float)$$3 * this.l), this.k);
            this.dS().a(this, this.cO(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(aws.N);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dua $$9 = dfv.e(this.h);
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
   protected void b(uf $$0) {
      $$0.a("BlockState", uu.a(this.h));
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
   protected void a(uf $$0) {
      this.h = uu.a(this.dS().a(lv.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(aws.N)) {
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
         this.h = dgx.I.o();
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

   public dua q() {
      return this.h;
   }

   @Override
   protected xd cw() {
      return xd.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cT() {
      return true;
   }

   @Override
   public zk<abz> a(arf $$0) {
      return new aca(this, $$0, dgv.j(this.q()));
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      this.h = dgv.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.ds());
   }

   @Nullable
   @Override
   public btj b(eqz $$0) {
      ala<dds> $$1 = $$0.a().ag();
      ala<dds> $$2 = this.dS().ag();
      boolean $$3 = ($$2 == dds.j || $$1 == dds.j) && $$2 != $$1;
      btj $$4 = super.b($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
