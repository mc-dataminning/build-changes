import java.util.List;
import javax.annotation.Nullable;

public class cia extends chy {
   public static final double e = 0.375;

   public cia(bsa<? extends cia> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cia(dax $$0, io $$1) {
      super(bsa.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ak().l() / 2.0;
      double $$1 = (double)this.ak().m();
      this.a(new euf(this.du() - $$0, this.dw(), this.dA() - $$0, this.du() + $$0, this.dw() + $$1, this.dA() + $$0));
   }

   @Override
   public void a(it $$0) {
   }

   @Override
   public int A() {
      return 9;
   }

   @Override
   public int B() {
      return 9;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bru $$0) {
      this.a(avh.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(ud $$0) {
   }

   @Override
   public void a(ud $$0) {
   }

   @Override
   public bpu a(clw $$0, bpt $$1) {
      if (this.dP().B) {
         return bpu.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bsq> $$4 = this.dP().a(bsq.class, new euf(this.du() - 7.0, this.dw() - 7.0, this.dA() - 7.0, this.du() + 7.0, this.dw() + 7.0, this.dA() + 7.0));

         for (bsq $$5 : $$4) {
            if ($$5.ge() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ao();
            if ($$0.gd().d) {
               for (bsq $$7 : $$4) {
                  if ($$7.gc() && $$7.ge() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dvu.b, $$0);
         }

         return bpu.b;
      }
   }

   @Override
   public boolean z() {
      return this.dP().a_(this.c).a(avw.S);
   }

   public static cia b(dax $$0, io $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cia $$6 : $$0.a(cia.class, new euf((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cia $$7 = new cia($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(avh.nT, 1.0F, 1.0F);
   }

   @Override
   public ze<abq> dl() {
      return new abr(this, 0, this.D());
   }

   @Override
   public euk q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cto dC() {
      return new cto(ctr.uK);
   }
}
