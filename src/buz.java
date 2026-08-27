import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class buz extends bfj {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bfj> b = $$0 -> $$0 instanceof buz;
   private int f;
   protected gu c;
   protected ha d;

   protected buz(bfn<? extends buz> $$0, cmm $$1) {
      super($$0, $$1);
      this.d = ha.d;
   }

   protected buz(bfn<? extends buz> $$0, cmm $$1, gu $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void a_() {
   }

   protected void a(ha $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.a_((float)(this.d.e() * 90));
      this.M = this.dy();
      this.s();
   }

   @Override
   protected void s() {
      if (this.d != null) {
         double $$0 = (double)this.c.u() + 0.5;
         double $$1 = (double)this.c.v() + 0.5;
         double $$2 = (double)this.c.w() + 0.5;
         double $$3 = 0.46875;
         double $$4 = this.b(this.v());
         double $$5 = this.b(this.w());
         $$0 -= (double)this.d.j() * 0.46875;
         $$2 -= (double)this.d.l() * 0.46875;
         $$1 += $$5;
         ha $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.v();
         double $$8 = (double)this.w();
         double $$9 = (double)this.v();
         if (this.d.o() == ha.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new eed($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double b(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void l() {
      if (!this.dI().B) {
         this.ap();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dD() && !this.t()) {
               this.ai();
               this.a(null);
            }
         }
      }
   }

   public boolean t() {
      if (!this.dI().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.v() / 16);
         int $$1 = Math.max(1, this.w() / 16);
         gu $$2 = this.c.a(this.d.g());
         ha $$3 = this.d.i();
         gu.a $$4 = new gu.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(ha.b, $$6 + $$8);
               dcb $$9 = this.dI().a_($$4);
               if (!$$9.e() && !crl.h($$9)) {
                  return false;
               }
            }
         }

         return this.dI().a(this, this.cE(), b).isEmpty();
      }
   }

   @Override
   public boolean bo() {
      return true;
   }

   @Override
   public boolean r(bfj $$0) {
      if ($$0 instanceof byo $$1) {
         return !this.dI().a($$1, this.c) ? true : this.a(this.dJ().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public ha cB() {
      return this.d;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dD() && !this.dI().B) {
            this.ah();
            this.bl();
            this.a($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bgf $$0, eei $$1) {
      if (!this.dI().B && !this.dD() && $$1.g() > 0.0) {
         this.ah();
         this.a(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dI().B && !this.dD() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.ah();
         this.a(null);
      }
   }

   @Override
   public void b(qr $$0) {
      gu $$1 = this.y();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(qr $$0) {
      gu $$1 = new gu($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.di(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int v();

   public abstract int w();

   public abstract void a(@Nullable bfj var1);

   public abstract void x();

   @Override
   public bvh a(cfz $$0, float $$1) {
      bvh $$2 = new bvh(
         this.dI(), this.dn() + (double)((float)this.d.j() * 0.15F), this.dp() + (double)$$1, this.dt() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.o();
      this.dI().b($$2);
      return $$2;
   }

   @Override
   protected boolean bq() {
      return false;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      this.c = gu.a($$0, $$1, $$2);
      this.s();
      this.at = true;
   }

   public gu y() {
      return this.c;
   }

   @Override
   public float a(cvz $$0) {
      if (this.d.o() != ha.a.b) {
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

      float $$1 = apa.g(this.dy());
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
   public float a(cui $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(aif $$0, bfy $$1) {
   }

   @Override
   public void d_() {
   }
}
