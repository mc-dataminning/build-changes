import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dna extends dmz implements djo {
   protected dna(dwv.d $$0, jn $$1, fbt $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dna> a();

   protected dww a(dww $$0, dww $$1) {
      return $$1;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dnb $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(this.c());
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      Optional<ji> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      Optional<ji> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dww $$5 = $$0.a_($$4.get());
         ((dnb)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ji> a(dfm $$0, ji $$1, djl $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dww $$0, daf $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected djl b() {
      return this;
   }
}
