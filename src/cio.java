import java.util.List;
import javax.annotation.Nullable;

public class cio extends cik {
   public static final double c = 0.375;

   public cio(bsm<? extends cio> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cio(dcf $$0, ja $$1) {
      super(bsm.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void p() {
      this.p((double)this.b.u() + 0.5, (double)this.b.v() + 0.375, (double)this.b.w() + 0.5);
      double $$0 = (double)this.al().l() / 2.0;
      double $$1 = (double)this.al().m();
      this.a(new ewa(this.dv() - $$0, this.dx(), this.dB() - $$0, this.dv() + $$0, this.dx() + $$1, this.dB() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable bsg $$0) {
      this.a(avh.nS, 1.0F, 1.0F);
   }

   @Override
   public void b(tx $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      if (this.dQ().B) {
         return bqg.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<btd> $$4 = this.dQ().a(btd.class, new ewa(this.dv() - 7.0, this.dx() - 7.0, this.dB() - 7.0, this.dv() + 7.0, this.dx() + 7.0, this.dB() + 7.0));

         for (btd $$5 : $$4) {
            if ($$5.gc() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ap();
            if ($$0.ga().d) {
               for (btd $$7 : $$4) {
                  if ($$7.ga() && $$7.gc() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(dxg.b, $$0);
         }

         return bqg.c;
      }
   }

   @Override
   public boolean s() {
      return this.dQ().a_(this.b).a(avw.S);
   }

   public static cio b(dcf $$0, ja $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cio $$6 : $$0.a(cio.class, new ewa((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.u().equals($$1)) {
            return $$6;
         }
      }

      cio $$7 = new cio($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void v() {
      this.a(avh.nT, 1.0F, 1.0F);
   }

   @Override
   public zb<abn> dm() {
      return new abo(this, 0, this.u());
   }

   @Override
   public ewf r(float $$0) {
      return this.m($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cuc dD() {
      return new cuc(cuf.uK);
   }
}
