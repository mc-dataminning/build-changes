import java.util.Optional;
import javax.annotation.Nullable;

public class bzx extends blf {
   private static final afz<Optional<hv>> c = agc.a(bzx.class, agb.o);
   private static final afz<Boolean> d = agc.a(bzx.class, agb.k);
   public int b;

   public bzx(blj<? extends bzx> $$0, csy $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bzx(csy $$0, double $$1, double $$2, double $$3) {
      this(blj.C, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected blf.b aW() {
      return blf.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dM() instanceof amp) {
         hv $$0 = this.dm();
         if (((amp)this.dM()).C() != null && this.dM().a_($$0).i()) {
            this.dM().b($$0, cvm.a(this.dM(), $$0));
         }
      }
   }

   @Override
   protected void b(sj $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", sy.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(sj $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(sy.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bzy) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.a(blf.c.a);
            if (!$$0.a(art.m)) {
               bkd $$2 = $$0.d() != null ? this.dN().d(this, $$0.d()) : null;
               this.dM().a(this, $$2, null, this.dr(), this.dt(), this.dx(), 6.0F, false, csy.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void al() {
      this.a(this.dN().n());
      super.al();
   }

   private void a(bkd $$0) {
      if (this.dM() instanceof amp) {
         dmb $$1 = ((amp)this.dM()).C();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable hv $$0) {
      this.an().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public hv q() {
      return this.an().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.an().b(d, $$0);
   }

   public boolean s() {
      return this.an().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.q() != null;
   }

   @Override
   public cmh dz() {
      return new cmh(cmk.uY);
   }
}
