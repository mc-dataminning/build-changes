import com.mojang.logging.LogUtils;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cob extends bwt {
   private static final Logger f = LogUtils.getLogger();
   private static final ebe g = dne.L.m();
   private static final int h = 0;
   private static final float i = 0.0F;
   private static final int j = 40;
   private static final boolean k = true;
   private static final boolean l = false;
   private ebe m = g;
   public int a = 0;
   public boolean b = true;
   private boolean n = false;
   private boolean o;
   private int p = 40;
   private float q = 0.0F;
   @Nullable
   public tz c;
   public boolean d;
   protected static final akl<iv> e = akp.a(cob.class, akn.o);

   public cob(bxc<? extends cob> $$0, djx $$1) {
      super($$0, $$1);
   }

   private cob(djx $$0, double $$1, double $$2, double $$3, ebe $$4) {
      this(bxc.Y, $$0);
      this.m = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.i(ffq.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dv());
   }

   public static cob a(djx $$0, iv $$1, ebe $$2) {
      cob $$3 = new cob($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(ebu.I) ? $$2.b(ebu.I, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      if (!this.d($$1)) {
         this.bB();
      }

      return false;
   }

   public void a(iv $$0) {
      this.al.a(e, $$0);
   }

   public iv f() {
      return this.al.a(e);
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.a;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(e, iv.c);
   }

   @Override
   public boolean bF() {
      return !this.dQ();
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.m.l()) {
         this.aq();
      } else {
         dnc $$0 = this.m.b();
         this.a++;
         this.be();
         this.a(bxy.a, this.dy());
         this.aI();
         this.bV();
         if (this.dV() instanceof ars $$1 && (this.bJ() || this.d)) {
            iv $$2 = this.dv();
            boolean $$3 = this.m.b() instanceof dop;
            boolean $$4 = $$3 && this.dV().b_($$2).a(axj.a);
            double $$5 = this.dy().h();
            if ($$3 && $$5 > 1.0) {
               ffm $$6 = this.dV().a(new dje(new ffq(this.K, this.L, this.M), this.dt(), dje.a.a, dje.b.b, this));
               if ($$6.d() != ffo.a.a && this.dV().b_($$6.b()).a(axj.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aH() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dV().K_() || $$2.v() > this.dV().ao()) || this.a > 600) {
                  if (this.b && $$1.O().c(djt.j)) {
                     this.a($$1, $$0);
                  }

                  this.aq();
               }
            } else {
               ebe $$7 = this.dV().a_($$2);
               this.i(this.dy().d(0.7, -0.5, 0.7));
               if (!$$7.a(dne.ca)) {
                  if (!this.n) {
                     boolean $$8 = $$7.a(new dds(this.dV(), $$2, jb.a, czy.k, jb.b));
                     boolean $$9 = dqa.n(this.dV().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.m.a((dka)this.dV(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.m.b(ebu.I) && this.dV().b_($$2).a() == exp.c) {
                           this.m = this.m.b(ebu.I, Boolean.valueOf(true));
                        }

                        if (this.dV().a($$2, this.m, 3)) {
                           ((ars)this.dV()).m().a.a(this, new ace($$2, this.dV().a_($$2)));
                           this.aq();
                           if ($$0 instanceof dpz) {
                              ((dpz)$$0).a(this.dV(), $$2, this.m, $$7, this);
                           }

                           if (this.c != null && this.m.x()) {
                              dyc $$11 = this.dV().c_($$2);
                              if ($$11 != null) {
                                 tz $$12 = $$11.d(this.dV().J_());
                                 this.c.a((BiConsumer<String, uy>)(($$1x, $$2x) -> $$12.a($$1x, $$2x.d())));

                                 try {
                                    $$11.c($$12, this.dV().J_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.O().c(djt.j)) {
                           this.aq();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.aq();
                        if (this.b && $$1.O().c(djt.j)) {
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     }
                  } else {
                     this.aq();
                     this.a($$0, $$2);
                  }
               }
            }
         }

         this.i(this.dy().c(0.98));
      }
   }

   public void a(dnc $$0, iv $$1) {
      if ($$0 instanceof dpz) {
         ((dpz)$$0).a(this.dV(), $$1, this);
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
      if (!this.o) {
         return false;
      } else {
         int $$3 = azo.c($$0 - 1.0);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bwt> $$4 = bxa.e.and(bxa.b);
            bvi $$6 = this.m.b() instanceof dpz $$5 ? $$5.a(this) : this.dW().a(this);
            float $$7 = (float)Math.min(azo.d((float)$$3 * this.q), this.p);
            this.dV().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.m.a(axe.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               ebe $$9 = dmc.e(this.m);
               if ($$9 == null) {
                  this.n = true;
               } else {
                  this.m = $$9;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void b(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("BlockState", ebe.a, $$1, this.m);
      $$0.a("Time", this.a);
      $$0.a("DropItem", this.b);
      $$0.a("HurtEntities", this.o);
      $$0.a("FallHurtAmount", this.q);
      $$0.a("FallHurtMax", this.p);
      if (this.c != null) {
         $$0.a("TileEntityData", this.c);
      }

      $$0.a("CancelDrop", this.n);
   }

   @Override
   protected void a(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      this.m = $$0.<ebe>a("BlockState", ebe.a, $$1).orElse(g);
      this.a = $$0.b("Time", 0);
      boolean $$2 = this.m.a(axe.O);
      this.o = $$0.b("HurtEntities", $$2);
      this.q = $$0.b("FallHurtAmount", 0.0F);
      this.p = $$0.b("FallHurtMax", 40);
      this.b = $$0.b("DropItem", true);
      this.c = $$0.m("TileEntityData").map(tz::l).orElse(null);
      this.n = $$0.b("CancelDrop", false);
   }

   public void b(float $$0, int $$1) {
      this.o = true;
      this.q = $$0;
      this.p = $$1;
   }

   public void g() {
      this.n = true;
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Override
   public void a(q $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.m.toString());
   }

   public ebe j() {
      return this.m;
   }

   @Override
   protected xa cz() {
      return xa.a("entity.minecraft.falling_block_type", this.m.b().f());
   }

   @Override
   public zh<abw> a(arq $$0) {
      return new abx(this, $$0, dnc.j(this.j()));
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.m = dnc.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dv());
   }

   @Nullable
   @Override
   public bwt b(eyo $$0) {
      alh<djx> $$1 = $$0.b().aj();
      alh<djx> $$2 = this.dV().aj();
      boolean $$3 = ($$2 == djx.k || $$1 == djx.k) && $$2 != $$1;
      bwt $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
