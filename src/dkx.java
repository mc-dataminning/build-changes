import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dkx extends dkw implements dhm {
   protected dkx(dun.d $$0, jj $$1, ezm $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dkx> a();

   protected duo a(duo $$0, duo $$1) {
      return $$1;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dky $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(this.c());
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      Optional<je> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      Optional<je> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         duo $$5 = $$0.a_($$4.get());
         ((dky)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<je> a(ddl $$0, je $$1, dhj $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().q()) ? false : $$2;
   }

   @Override
   protected dhj b() {
      return this;
   }
}
