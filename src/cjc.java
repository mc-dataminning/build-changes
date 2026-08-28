import java.util.List;
import javax.annotation.Nullable;

public class cjc extends cja {
   public static final double e = 0.375;

   public cjc(btb<? extends cjc> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cjc(dbz $$0, iz $$1) {
      super(btb.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ak().l() / 2.0;
      double $$1 = (double)this.ak().m();
      this.a(new evn(this.du() - $$0, this.dw(), this.dA() - $$0, this.du() + $$0, this.dw() + $$1, this.dA() + $$0));
   }

   @Override
   public void a(je $$0) {
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
   public void b(@Nullable bsv $$0) {
      this.a(awa.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(us $$0) {
   }

   @Override
   public void a(us $$0) {
   }

   @Override
   public bqv a(cmy $$0, bqu $$1) {
      if (this.dP().B) {
         return bqv.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bts> $$4 = this.dP().a(bts.class, new evn(this.du() - 7.0, this.dw() - 7.0, this.dA() - 7.0, this.du() + 7.0, this.dw() + 7.0, this.dA() + 7.0));

         for (bts $$5 : $$4) {
            if ($$5.gf() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ao();
            if ($$0.gd().d) {
               for (bts $$7 : $$4) {
                  if ($$7.gd() && $$7.gf() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dww.b, $$0);
         }

         return bqv.c;
      }
   }

   @Override
   public boolean z() {
      return this.dP().a_(this.c).a(awp.S);
   }

   public static cjc b(dbz $$0, iz $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cjc $$6 : $$0.a(cjc.class, new evn((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cjc $$7 = new cjc($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(awa.nT, 1.0F, 1.0F);
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, 0, this.D());
   }

   @Override
   public evs q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cuq dC() {
      return new cuq(cut.uK);
   }
}
