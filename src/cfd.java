import java.util.Optional;
import javax.annotation.Nullable;

public class cfd extends bqa {
   private static final aja<Optional<id>> c = aje.a(cfd.class, ajc.o);
   private static final aja<Boolean> d = aje.a(cfd.class, ajc.k);
   public int b;

   public cfd(bqg<? extends cfd> $$0, czg $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public cfd(czg $$0, double $$1, double $$2, double $$3) {
      this(bqg.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.a;
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dM() instanceof apu) {
         id $$0 = this.dm();
         if (((apu)this.dM()).D() != null && this.dM().a_($$0).i()) {
            this.dM().b($$0, dbu.a(this.dM(), $$0));
         }
      }
   }

   @Override
   protected void b(to $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", ud.a(this.p()));
      }

      $$0.a("ShowBottom", this.r());
   }

   @Override
   protected void a(to $$0) {
      ud.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cfe) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.a(bqa.c.a);
            if (!$$0.a(avg.m)) {
               boy $$2 = $$0.d() != null ? this.dN().d(this, $$0.d()) : null;
               this.dM().a(this, $$2, null, this.dr(), this.dt(), this.dx(), 6.0F, false, czg.a.b);
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

   private void a(boy $$0) {
      if (this.dM() instanceof apu) {
         dtd $$1 = ((apu)this.dM()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable id $$0) {
      this.an().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public id p() {
      return this.an().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.an().a(d, $$0);
   }

   public boolean r() {
      return this.an().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public crs dz() {
      return new crs(crv.vd);
   }
}
