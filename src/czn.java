import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class czn extends czm implements cwc {
   protected czn(dio.d $$0, ia $$1, elu $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends czn> a();

   protected dip a(dip $$0, dip $$1) {
      return $$1;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      czo $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(this.c());
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      Optional<hv> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      Optional<hv> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dip $$5 = $$0.a_($$4.get());
         ((czo)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hv> a(cse $$0, hv $$1, cvz $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cvz b() {
      return this;
   }
}
