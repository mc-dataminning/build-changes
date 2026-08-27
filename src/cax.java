import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cax extends caw {
   private static final Logger f = LogUtils.getLogger();
   private static final afz<cmh> g = agc.a(cax.class, agb.h);
   private static final afz<Integer> h = agc.a(cax.class, agb.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cax(blj<? extends cax> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cax(csy $$0, hv $$1, ia $$2) {
      this(blj.ag, $$0, $$1, $$2);
   }

   public cax(blj<? extends cax> $$0, csy $$1, hv $$2, ia $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(bmh $$0, blg $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      this.an().a(g, cmh.f);
      this.an().a(h, 0);
   }

   @Override
   protected void a(ia $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dE();
      this.N = this.dC();
      this.z();
   }

   @Override
   protected void z() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.B();
         double $$5 = (double)this.C();
         double $$6 = (double)this.B();
         ia.a $$7 = this.d.o();
         switch ($$7) {
            case a:
               $$4 = 1.0;
               break;
            case b:
               $$5 = 1.0;
               break;
            case c:
               $$6 = 1.0;
         }

         $$4 /= 32.0;
         $$5 /= 32.0;
         $$6 /= 32.0;
         this.a(new ekw($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean A() {
      if (this.j) {
         return true;
      } else if (!this.dM().g(this)) {
         return false;
      } else {
         dip $$0 = this.dM().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && cyb.h($$0) ? this.dM().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bmb $$0, elb $$1) {
      if (!this.j) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.j) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void al() {
      this.c(this.G());
      super.al();
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.j) {
         return !$$0.a(art.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(art.m) && !this.G().b()) {
         if (!this.dM().B) {
            this.b($$0.d(), false);
            this.a(dmz.c, $$0.d());
            this.a(this.q(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public arb q() {
      return arc.mL;
   }

   @Override
   public int B() {
      return 12;
   }

   @Override
   public int C() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable blf $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dmz.c, $$0);
   }

   public arb s() {
      return arc.mJ;
   }

   @Override
   public void D() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public arb u() {
      return arc.mK;
   }

   private void b(@Nullable blf $$0, boolean $$1) {
      if (!this.j) {
         cmh $$2 = this.G();
         this.a(cmh.f);
         if (!this.dM().Y().b(csu.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cer $$3 && $$3.fT().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.y());
            }

            if (!$$2.b()) {
               $$2 = $$2.p();
               this.c($$2);
               if (this.ag.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cmh $$0) {
      this.H().ifPresent($$0x -> {
         efj $$1 = cmo.a($$0x, this.dM());
         if ($$1 != null) {
            $$1.a(this.c, this.aj());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public cmh G() {
      return this.an().b(g);
   }

   public OptionalInt H() {
      cmh $$0 = this.G();
      if ($$0.a(cmk.rR)) {
         Integer $$1 = cmo.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean I() {
      return this.H().isPresent();
   }

   public void a(cmh $$0) {
      this.a($$0, true);
   }

   public void a(cmh $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.w(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dM().c(this.c, cwb.a);
      }
   }

   public arb w() {
      return arc.mI;
   }

   @Override
   public bmn a_(int $$0) {
      return $$0 == 0 ? new bmn() {
         @Override
         public cmh a() {
            return cax.this.G();
         }

         @Override
         public boolean a(cmh $$0) {
            cax.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(afz<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.G());
      }
   }

   private void d(cmh $$0) {
      if (!$$0.b() && $$0.G() != this) {
         $$0.a(this);
      }

      this.z();
   }

   public int J() {
      return this.an().b(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.an().b(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dM().c(this.c, cwb.a);
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (!this.G().b()) {
         $$0.a("Item", this.G().b(new sj()));
         $$0.a("ItemRotation", (byte)this.J());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ce());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      sj $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         cmh $$2 = cmh.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cmh $$3 = this.G();
         if (!$$3.b() && !cmh.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ia.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      boolean $$3 = !this.G().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bjl.d;
      } else if (!this.dM().B) {
         if (!$$3) {
            if ($$4 && !this.dH()) {
               if ($$2.a(cmk.rR)) {
                  efj $$5 = cmo.b($$2, this.dM());
                  if ($$5 != null && $$5.b(256)) {
                     return bjl.e;
                  }
               }

               this.a($$2);
               this.a(dmz.c, $$0);
               if (!$$0.fT().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.x(), 1.0F, 1.0F);
            this.b(this.J() + 1);
            this.a(dmz.c, $$0);
         }

         return bjl.b;
      } else {
         return !$$3 && !$$4 ? bjl.d : bjl.a;
      }
   }

   public arb x() {
      return arc.mM;
   }

   public int K() {
      return this.G().b() ? 0 : this.J() % 8 + 1;
   }

   @Override
   public wu<yo> dj() {
      return new yp(this, this.d.d(), this.E());
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      this.a(ia.a($$0.o()));
   }

   @Override
   public cmh dz() {
      cmh $$0 = this.G();
      return $$0.b() ? this.y() : $$0.p();
   }

   protected cmh y() {
      return new cmh(cmk.tV);
   }

   @Override
   public float dD() {
      ia $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)aty.b(180 + $$0.e() * 90 + this.J() * 45 + $$1);
   }
}
