import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dmz extends dmy implements djn {
   protected dmz(dwu.d $$0, jn $$1, fbs $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dmz> a();

   protected dwv a(dwv $$0, dwv $$1) {
      return $$1;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dna $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(this.c());
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      Optional<ji> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      Optional<ji> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dwv $$5 = $$0.a_($$4.get());
         ((dna)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ji> a(dfl $$0, ji $$1, djk $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dwv $$0, dae $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected djk b() {
      return this;
   }
}
