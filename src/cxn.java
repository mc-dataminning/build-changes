import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class cxn extends cxm implements cud {
   protected cxn(dga.d $$0, hx $$1, eiy $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends cxn> a();

   protected dgb a(dgb $$0, dgb $$1) {
      return $$1;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cxo $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(this.c());
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      Optional<ht> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      Optional<ht> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dgb $$5 = $$0.a_($$4.get());
         ((cxo)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ht> a(cqf $$0, ht $$1, cua $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cua b() {
      return this;
   }
}
