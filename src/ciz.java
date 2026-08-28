import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class ciz extends ciy {
   private static final Logger f = LogUtils.getLogger();
   private static final akj<cuo> g = akn.a(ciz.class, akl.h);
   private static final akj<Integer> h = akn.a(ciz.class, akl.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public ciz(bsz<? extends ciz> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public ciz(dbx $$0, iz $$1, je $$2) {
      this(bsz.ai, $$0, $$1, $$2);
   }

   public ciz(bsz<? extends ciz> $$0, dbx $$1, iz $$2, je $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(g, cuo.l);
      $$0.a(h, 0);
   }

   @Override
   protected void a(je $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.P = this.dH();
      this.O = this.dF();
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
         je.a $$7 = this.d.o();
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
         this.a(new evl($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dP().g(this)) {
         return false;
      } else {
         dsb $$0 = this.dP().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dha.m($$0) ? this.dP().a(this, this.cK(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(btt $$0, evq $$1) {
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
   public void an() {
      this.c(this.E());
      super.an();
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.j) {
         return !$$0.a(awq.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(awq.m) && !this.E().e()) {
         if (!this.dP().B) {
            this.b($$0.d(), false);
            this.a(dwu.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public avy p() {
      return avz.nz;
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
      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bst $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dwu.c, $$0);
   }

   public avy s() {
      return avz.nx;
   }

   @Override
   public void C() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public avy u() {
      return avz.ny;
   }

   private void b(@Nullable bst $$0, boolean $$1) {
      if (!this.j) {
         cuo $$2 = this.E();
         this.a(cuo.l);
         if (!this.dP().ab().b(dbt.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cmw $$3 && $$3.fP()) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.x());
            }

            if (!$$2.e()) {
               $$2 = $$2.s();
               this.c($$2);
               if (this.ah.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cuo $$0) {
      eph $$1 = this.G();
      if ($$1 != null) {
         epj $$2 = cuw.a($$1, this.dP());
         if ($$2 != null) {
            $$2.a(this.c, this.al());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cuo E() {
      return this.ap().a(g);
   }

   @Nullable
   public eph G() {
      return this.E().a(km.B);
   }

   public boolean H() {
      return this.E().b(km.B);
   }

   public void a(cuo $$0) {
      this.a($$0, true);
   }

   public void a(cuo $$0, boolean $$1) {
      if (!$$0.e()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.ap().a(g, $$0);
      if (!$$0.e()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dP().c(this.c, dfa.a);
      }
   }

   public avy v() {
      return avz.nw;
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::E, this::a) : super.a_($$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(cuo $$0) {
      if (!$$0.e() && $$0.E() != this) {
         $$0.a(this);
      }

      this.y();
   }

   public int I() {
      return this.ap().a(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ap().a(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dP().c(this.c, dfa.a);
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (!this.E().e()) {
         $$0.a("Item", this.E().a(this.dR()));
         $$0.a("ItemRotation", (byte)this.I());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ch());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      cuo $$2;
      if ($$0.b("Item", 10)) {
         ur $$1 = $$0.p("Item");
         $$2 = cuo.a(this.dR(), (vo)$$1).orElse(cuo.l);
      } else {
         $$2 = cuo.l;
      }

      cuo $$4 = this.E();
      if (!$$4.e() && !cuo.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.e()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(je.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bqt a(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      boolean $$3 = !this.E().e();
      boolean $$4 = !$$2.e();
      if (this.j) {
         return bqt.e;
      } else if (!this.dP().B) {
         if (!$$3) {
            if ($$4 && !this.dK()) {
               if ($$2.a(cur.rU)) {
                  epj $$5 = cuw.b($$2, this.dP());
                  if ($$5 != null && $$5.a(256)) {
                     return bqt.f;
                  }
               }

               this.a($$2);
               this.a(dwu.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dwu.c, $$0);
         }

         return bqt.c;
      } else {
         return !$$3 && !$$4 ? bqt.e : bqt.a;
      }
   }

   public avy w() {
      return avz.nA;
   }

   public int J() {
      return this.E().e() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public zv<ach> dl() {
      return new aci(this, this.d.d(), this.D());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.a(je.a($$0.p()));
   }

   @Override
   public cuo dC() {
      cuo $$0 = this.E();
      return $$0.e() ? this.x() : $$0.s();
   }

   protected cuo x() {
      return new cuo(cur.uc);
   }

   @Override
   public float dG() {
      je $$0 = this.cH();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayy.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
