import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class div extends diu implements dfk {
   protected div(dsj.d $$0, jf $$1, ewy $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends div> a();

   protected dsk a(dsk $$0, dsk $$1) {
      return $$1;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      diw $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eoi.c, eoi.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(this.c());
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      Optional<ja> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      Optional<ja> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dsk $$5 = $$0.a_($$4.get());
         ((diw)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ja> a(dbl $$0, ja $$1, dfh $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dfh b() {
      return this;
   }
}
