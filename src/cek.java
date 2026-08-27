import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cek extends bof {
   private static final Logger f = LogUtils.getLogger();
   private dme g = czh.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public sy d;
   protected static final aii<ib> e = ail.a(cek.class, aik.n);

   public cek(bol<? extends cek> $$0, cwe $$1) {
      super($$0, $$1);
   }

   private cek(cwe $$0, double $$1, double $$2, double $$3, dme $$4) {
      this(bol.N, $$0);
      this.g = $$4;
      this.H = true;
      this.a_($$1, $$2, $$3);
      this.g(eov.b);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.a(this.dj());
   }

   public static cek a(cwe $$0, ib $$1, dme $$2) {
      cek $$3 = new cek($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dmu.C) ? $$2.a(dmu.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cn() {
      return false;
   }

   public void a(ib $$0) {
      this.am.b(e, $$0);
   }

   public ib q() {
      return this.am.b(e);
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   protected void c_() {
      this.am.a(e, ib.c);
   }

   @Override
   public boolean bt() {
      return !this.dE();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.am();
      } else {
         czf $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.dm().b(0.0, -0.04, 0.0));
         }

         this.a(bpc.a, this.dm());
         if (!this.dJ().B) {
            ib $$1 = this.dj();
            boolean $$2 = this.g.b() instanceof dar;
            boolean $$3 = $$2 && this.dJ().b_($$1).a(auj.a);
            double $$4 = this.dm().g();
            if ($$2 && $$4 > 1.0) {
               eor $$5 = this.dJ().a(new cvn(new eov(this.J, this.K, this.L), this.dh(), cvn.a.a, cvn.b.b, this));
               if ($$5.c() != eot.a.a && this.dJ().b_($$5.a()).a(auj.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dme $$6 = this.dJ().a_($$1);
               this.g(this.dm().d(0.7, -0.5, 0.7));
               if (!$$6.a(czh.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cry(this.dJ(), $$1, ih.a, cpq.h, ih.b));
                     boolean $$8 = dcb.m(this.dJ().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cwh)this.dJ(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dmu.C) && this.dJ().b_($$1).a() == ehs.c) {
                           this.g = this.g.a(dmu.C, Boolean.valueOf(true));
                        }

                        if (this.dJ().a($$1, this.g, 3)) {
                           ((apa)this.dJ()).l().a.a(this, new aar($$1, this.dJ().a_($$1)));
                           this.am();
                           if ($$0 instanceof dca) {
                              ((dca)$$0).a(this.dJ(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              djl $$10 = this.dJ().c_($$1);
                              if ($$10 != null) {
                                 sy $$11 = $$10.d(this.dJ().I_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.a($$11, this.dJ().I_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dJ().Z().b(cwa.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dJ().Z().b(cwa.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dJ().B && (this.b > 100 && ($$1.v() <= this.dJ().J_() || $$1.v() > this.dJ().ak()) || this.b > 600)) {
               if (this.c && this.dJ().Z().b(cwa.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dm().a(0.98));
      }
   }

   public void a(czf $$0, ib $$1) {
      if ($$0 instanceof dca) {
         ((dca)$$0).a(this.dJ(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = awm.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bof> $$4 = bok.e.and(bok.b);
            bne $$6 = this.g.b() instanceof dca $$5 ? $$5.a(this) : this.dK().a(this);
            float $$7 = (float)Math.min(awm.d((float)$$3 * this.k), this.j);
            this.dJ().a(this, this.cE(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(aue.M);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dme $$9 = cyf.e(this.g);
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
   protected void b(sy $$0) {
      $$0.a("BlockState", tn.a(this.g));
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
   protected void a(sy $$0) {
      this.g = tn.a(this.dJ().a(ki.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(aue.M)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").h();
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.i()) {
         this.g = czh.I.o();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void s() {
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

   public dme u() {
      return this.g;
   }

   @Override
   protected vs cl() {
      return vs.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cJ() {
      return true;
   }

   @Override
   public xz<aai> df() {
      return new aaj(this, czf.i(this.u()));
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      this.g = czf.a($$0.p());
      this.H = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dj());
   }
}
