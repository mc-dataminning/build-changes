import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dio extends din implements dfd {
   protected dio(dsc.d $$0, je $$1, ewl $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dio> a();

   protected dsd a(dsd $$0, dsd $$1) {
      return $$1;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dip $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(this.c());
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      Optional<iz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      Optional<iz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dsd $$5 = $$0.a_($$4.get());
         ((dip)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iz> a(dbf $$0, iz $$1, dfa $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dfa b() {
      return this;
   }
}
