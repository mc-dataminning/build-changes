import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dqu extends dqt implements dnf {
   protected dqu(ebd.d $$0, jb $$1, fgk $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dqu> a();

   protected ebe a(ebe $$0, ebe $$1) {
      return $$1;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dqv $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, exp.c, exp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(this.c());
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      Optional<iv> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      Optional<iv> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         ebe $$5 = $$0.a_($$4.get());
         ((dqv)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iv> a(djb $$0, iv $$1, dnc $$2) {
      return m.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dnc b() {
      return this;
   }
}
