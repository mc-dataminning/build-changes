import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class bxx extends bxw {
   private static final Logger f = LogUtils.getLogger();
   private static final adx<ciw> g = aea.a(bxx.class, adz.h);
   private static final adx<Integer> h = aea.a(bxx.class, adz.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public bxx(bik<? extends bxx> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public bxx(cpk $$0, gv $$1, hb $$2) {
      this(bik.af, $$0, $$1, $$2);
   }

   public bxx(bik<? extends bxx> $$0, cpk $$1, gv $$2, hb $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(bji $$0, bih $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      this.al().a(g, ciw.b);
      this.al().a(h, 0);
   }

   @Override
   protected void a(hb $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dC();
      this.N = this.dA();
      this.s();
   }

   @Override
   protected void s() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.v();
         double $$5 = (double)this.w();
         double $$6 = (double)this.v();
         hb.a $$7 = this.d.o();
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
         this.a(new eha($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean t() {
      if (this.j) {
         return true;
      } else if (!this.dK().g(this)) {
         return false;
      } else {
         dey $$0 = this.dK().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && cui.h($$0) ? this.dK().a(this, this.cG(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bjc $$0, ehf $$1) {
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
   public float bD() {
      return 0.0F;
   }

   @Override
   public void aj() {
      this.c(this.z());
      super.aj();
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.j) {
         return !$$0.a(apl.d) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(apl.l) && !this.z().b()) {
         if (!this.dK().B) {
            this.b($$0.d(), false);
            this.a(dji.c, $$0.d());
            this.a(this.j(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public aot j() {
      return aou.lX;
   }

   @Override
   public int v() {
      return 12;
   }

   @Override
   public int w() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable big $$0) {
      this.a(this.m(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dji.c, $$0);
   }

   public aot m() {
      return aou.lV;
   }

   @Override
   public void x() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public aot o() {
      return aou.lW;
   }

   private void b(@Nullable big $$0, boolean $$1) {
      if (!this.j) {
         ciw $$2 = this.z();
         this.a(ciw.b);
         if (!this.dK().X().b(cpg.h)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cbl $$3 && $$3.fR().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.r());
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

   private void c(ciw $$0) {
      this.A().ifPresent($$0x -> {
         ebl $$1 = cjd.a($$0x, this.dK());
         if ($$1 != null) {
            $$1.a(this.c, this.ah());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public ciw z() {
      return this.al().b(g);
   }

   public OptionalInt A() {
      ciw $$0 = this.z();
      if ($$0.a(ciz.rf)) {
         Integer $$1 = cjd.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean B() {
      return this.A().isPresent();
   }

   public void a(ciw $$0) {
      this.a($$0, true);
   }

   public void a(ciw $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.al().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.p(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dK().c(this.c, csl.a);
      }
   }

   public aot p() {
      return aou.lU;
   }

   @Override
   public bjp a_(int $$0) {
      return $$0 == 0 ? new bjp() {
         @Override
         public ciw a() {
            return bxx.this.z();
         }

         @Override
         public boolean a(ciw $$0) {
            bxx.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(adx<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.z());
      }
   }

   private void d(ciw $$0) {
      if (!$$0.b() && $$0.G() != this) {
         $$0.a(this);
      }

      this.s();
   }

   public int D() {
      return this.al().b(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.al().b(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dK().c(this.c, csl.a);
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (!this.z().b()) {
         $$0.a("Item", this.z().b(new qs()));
         $$0.a("ItemRotation", (byte)this.D());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cd());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      qs $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         ciw $$2 = ciw.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         ciw $$3 = this.z();
         if (!$$3.b() && !ciw.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(hb.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      boolean $$3 = !this.z().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bgo.d;
      } else if (!this.dK().B) {
         if (!$$3) {
            if ($$4 && !this.dF()) {
               if ($$2.a(ciz.rf)) {
                  ebl $$5 = cjd.a($$2, this.dK());
                  if ($$5 != null && $$5.b(256)) {
                     return bgo.e;
                  }
               }

               this.a($$2);
               this.a(dji.c, $$0);
               if (!$$0.fR().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.q(), 1.0F, 1.0F);
            this.b(this.D() + 1);
            this.a(dji.c, $$0);
         }

         return bgo.b;
      } else {
         return !$$3 && !$$4 ? bgo.d : bgo.a;
      }
   }

   public aot q() {
      return aou.lY;
   }

   public int E() {
      return this.z().b() ? 0 : this.D() % 8 + 1;
   }

   @Override
   public uw<wo> U() {
      return new wp(this, this.d.d(), this.y());
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      this.a(hb.a($$0.o()));
   }

   @Override
   public ciw dx() {
      ciw $$0 = this.z();
      return $$0.b() ? this.r() : $$0.p();
   }

   protected ciw r() {
      return new ciw(ciz.ti);
   }

   @Override
   public float dB() {
      hb $$0 = this.cD();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)aro.b(180 + $$0.e() * 90 + this.D() * 45 + $$1);
   }
}
