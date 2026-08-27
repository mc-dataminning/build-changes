import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dhm extends dhl implements deb {
   protected dhm(dra.d $$0, it $$1, evd $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dhm> a();

   protected drb a(drb $$0, drb $$1) {
      return $$1;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dhn $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(this.c());
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      Optional<io> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      Optional<io> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         drb $$5 = $$0.a_($$4.get());
         ((dhn)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<io> a(dad $$0, io $$1, ddy $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().q()) ? false : $$2;
   }

   @Override
   protected ddy b() {
      return this;
   }
}
