import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dqw extends dqv implements dnh {
   protected dqw(ebf.d $$0, jc $$1, fgm $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dqw> a();

   protected ebg a(ebg $$0, ebg $$1) {
      return $$1;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dqx $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(this.c());
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      Optional<iw> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      Optional<iw> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         ebg $$5 = $$0.a_($$4.get());
         ((dqx)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iw> a(djd $$0, iw $$1, dne $$2) {
      return m.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dne b() {
      return this;
   }
}
