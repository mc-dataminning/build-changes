import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class cev extends bow {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bow> b = $$0 -> $$0 instanceof cev;
   private int f;
   protected ib c;
   protected ih d;

   protected cev(bpc<? extends cev> $$0, cwz $$1) {
      super($$0, $$1);
      this.d = ih.d;
   }

   protected cev(bpc<? extends cev> $$0, cwz $$1, ib $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void a(aiq.a $$0) {
   }

   protected void a(ih $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.N = this.dC();
      this.y();
   }

   protected void y() {
      if (this.d != null) {
         double $$0 = (double)this.c.u() + 0.5;
         double $$1 = (double)this.c.v() + 0.5;
         double $$2 = (double)this.c.w() + 0.5;
         double $$3 = 0.46875;
         double $$4 = this.b(this.A());
         double $$5 = this.b(this.B());
         $$0 -= (double)this.d.j() * 0.46875;
         $$2 -= (double)this.d.l() * 0.46875;
         $$1 += $$5;
         ih $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.A();
         double $$8 = (double)this.B();
         double $$9 = (double)this.A();
         if (this.d.o() == ih.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new epm($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double b(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void l() {
      if (!this.dM().B) {
         this.at();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dH() && !this.z()) {
               this.am();
               this.b(null);
            }
         }
      }
   }

   public boolean z() {
      if (!this.dM().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.A() / 16);
         int $$1 = Math.max(1, this.B() / 16);
         ib $$2 = this.c.a(this.d.g());
         ih $$3 = this.d.i();
         ib.a $$4 = new ib.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(ih.b, $$6 + $$8);
               dmz $$9 = this.dM().a_($$4);
               if (!$$9.e() && !dcc.m($$9)) {
                  return false;
               }
            }
         }

         return this.dM().a(this, this.cH(), b).isEmpty();
      }
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public boolean u(bow $$0) {
      if ($$0 instanceof cis $$1) {
         return !this.dM().a($$1, this.c) ? true : this.a(this.dN().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public ih cE() {
      return this.d;
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.al();
            this.bt();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bpt $$0, epr $$1) {
      if (!this.dM().B && !this.dH() && $$1.g() > 0.0) {
         this.al();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dM().B && !this.dH() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.al();
         this.b(null);
      }
   }

   @Override
   public void b(ta $$0) {
      ib $$1 = this.D();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(ta $$0) {
      ib $$1 = new ib($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dm(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int A();

   public abstract int B();

   public abstract void b(@Nullable bow var1);

   public abstract void C();

   @Override
   public cfd a(cqk $$0, float $$1) {
      cfd $$2 = new cfd(
         this.dM(), this.dr() + (double)((float)this.d.j() * 0.15F), this.dt() + (double)$$1, this.dx() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.s();
      this.dM().b($$2);
      return $$2;
   }

   @Override
   protected boolean by() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.c = ib.a($$0, $$1, $$2);
      this.y();
      this.au = true;
   }

   public ib D() {
      return this.c;
   }

   @Override
   public float a(dgm $$0) {
      if (this.d.o() != ih.a.b) {
         switch ($$0) {
            case c:
               this.d = this.d.g();
               break;
            case d:
               this.d = this.d.i();
               break;
            case b:
               this.d = this.d.h();
         }
      }

      float $$1 = aww.g(this.dC());
      switch ($$0) {
         case c:
            return $$1 + 180.0F;
         case d:
            return $$1 + 90.0F;
         case b:
            return $$1 + 270.0F;
         default:
            return $$1;
      }
   }

   @Override
   public float a(dew $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(apf $$0, bpn $$1) {
   }

   @Override
   public void j_() {
   }
}
