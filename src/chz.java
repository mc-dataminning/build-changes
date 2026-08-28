import java.util.Optional;
import javax.annotation.Nullable;

public class chz extends bst {
   private static final akj<Optional<iz>> c = akn.a(chz.class, akl.p);
   private static final akj<Boolean> d = akn.a(chz.class, akl.k);
   public int b;

   public chz(bsz<? extends chz> $$0, dbx $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chz(dbx $$0, double $$1, double $$2, double $$3) {
      this(bsz.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bst.b bb() {
      return bst.b.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dP() instanceof are) {
         iz $$0 = this.dp();
         if (((are)this.dP()).D() != null && this.dP().a_($$0).i()) {
            this.dP().b($$0, del.a(this.dP(), $$0));
         }
      }
   }

   @Override
   protected void b(ur $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", vg.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(ur $$0) {
      vg.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cia) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.a(bst.c.a);
            if (!$$0.a(awq.m)) {
               brm $$2 = $$0.d() != null ? this.dQ().d(this, $$0.d()) : null;
               this.dP().a(this, $$2, null, this.du(), this.dw(), this.dA(), 6.0F, false, dbx.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void an() {
      this.a(this.dQ().n());
      super.an();
   }

   private void a(brm $$0) {
      if (this.dP() instanceof are) {
         dvw $$1 = ((are)this.dP()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable iz $$0) {
      this.ap().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public iz p() {
      return this.ap().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.ap().a(d, $$0);
   }

   public boolean s() {
      return this.ap().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cuo dC() {
      return new cuo(cur.vf);
   }
}
