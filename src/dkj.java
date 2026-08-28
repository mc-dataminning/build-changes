import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dkj extends dki implements dgy {
   protected dkj(dtz.d $$0, jj $$1, eyx $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dkj> a();

   protected dua a(dua $$0, dua $$1) {
      return $$1;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dkk $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(this.c());
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      Optional<je> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      Optional<je> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dua $$5 = $$0.a_($$4.get());
         ((dkk)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<je> a(dcx $$0, je $$1, dgv $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dgv b() {
      return this;
   }
}
