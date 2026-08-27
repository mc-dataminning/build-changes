import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class bzy extends bzx {
   private static final Logger f = LogUtils.getLogger();
   private static final afm<clb> g = afp.a(bzy.class, afo.h);
   private static final afm<Integer> h = afp.a(bzy.class, afo.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public bzy(bkm<? extends bzy> $$0, crs $$1) {
      super($$0, $$1);
   }

   public bzy(crs $$0, ht $$1, hx $$2) {
      this(bkm.af, $$0, $$1, $$2);
   }

   public bzy(bkm<? extends bzy> $$0, crs $$1, ht $$2, hx $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(blk $$0, bkj $$1) {
      return 0.0F;
   }

   @Override
   protected void b_() {
      this.al().a(g, clb.b);
      this.al().a(h, 0);
   }

   @Override
   protected void a(hx $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dD();
      this.N = this.dB();
      this.y();
   }

   @Override
   protected void y() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.A();
         double $$5 = (double)this.B();
         double $$6 = (double)this.A();
         hx.a $$7 = this.d.o();
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
         this.a(new ejd($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dL().g(this)) {
         return false;
      } else {
         dgw $$0 = this.dL().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && cwu.h($$0) ? this.dL().a(this, this.cG(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(ble $$0, eji $$1) {
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
   public void aj() {
      this.c(this.F());
      super.aj();
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.j) {
         return !$$0.a(are.d) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(are.l) && !this.F().b()) {
         if (!this.dL().B) {
            this.b($$0.d(), false);
            this.a(dlg.c, $$0.d());
            this.a(this.q(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public aqm q() {
      return aqn.mb;
   }

   @Override
   public int A() {
      return 12;
   }

   @Override
   public int B() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable bki $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dlg.c, $$0);
   }

   public aqm s() {
      return aqn.lZ;
   }

   @Override
   public void C() {
      this.a(this.t(), 1.0F, 1.0F);
   }

   public aqm t() {
      return aqn.ma;
   }

   private void b(@Nullable bki $$0, boolean $$1) {
      if (!this.j) {
         clb $$2 = this.F();
         this.a(clb.b);
         if (!this.dL().X().b(cro.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cdm $$3 && $$3.fT().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.x());
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

   private void c(clb $$0) {
      this.G().ifPresent($$0x -> {
         edq $$1 = cli.a($$0x, this.dL());
         if ($$1 != null) {
            $$1.a(this.c, this.ah());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public clb F() {
      return this.al().b(g);
   }

   public OptionalInt G() {
      clb $$0 = this.F();
      if ($$0.a(cle.rg)) {
         Integer $$1 = cli.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean H() {
      return this.G().isPresent();
   }

   public void a(clb $$0) {
      this.a($$0, true);
   }

   public void a(clb $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.al().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dL().c(this.c, cuv.a);
      }
   }

   public aqm v() {
      return aqn.lY;
   }

   @Override
   public blq a_(int $$0) {
      return $$0 == 0 ? new blq() {
         @Override
         public clb a() {
            return bzy.this.F();
         }

         @Override
         public boolean a(clb $$0) {
            bzy.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(afm<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.F());
      }
   }

   private void d(clb $$0) {
      if (!$$0.b() && $$0.G() != this) {
         $$0.a(this);
      }

      this.y();
   }

   public int I() {
      return this.al().b(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.al().b(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dL().c(this.c, cuv.a);
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (!this.F().b()) {
         $$0.a("Item", this.F().b(new rz()));
         $$0.a("ItemRotation", (byte)this.I());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cd());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      rz $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         clb $$2 = clb.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         clb $$3 = this.F();
         if (!$$3.b() && !clb.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(hx.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      boolean $$3 = !this.F().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return biq.d;
      } else if (!this.dL().B) {
         if (!$$3) {
            if ($$4 && !this.dG()) {
               if ($$2.a(cle.rg)) {
                  edq $$5 = cli.b($$2, this.dL());
                  if ($$5 != null && $$5.b(256)) {
                     return biq.e;
                  }
               }

               this.a($$2);
               this.a(dlg.c, $$0);
               if (!$$0.fT().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dlg.c, $$0);
         }

         return biq.b;
      } else {
         return !$$3 && !$$4 ? biq.d : biq.a;
      }
   }

   public aqm w() {
      return aqn.mc;
   }

   public int K() {
      return this.F().b() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public wk<yd> di() {
      return new ye(this, this.d.d(), this.E());
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.a(hx.a($$0.o()));
   }

   @Override
   public clb dy() {
      clb $$0 = this.F();
      return $$0.b() ? this.x() : $$0.p();
   }

   protected clb x() {
      return new clb(cle.tj);
   }

   @Override
   public float dC() {
      hx $$0 = this.cD();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ati.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
