import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dit extends dis implements dfi {
   protected dit(dsg.d $$0, jf $$1, ews $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dit> a();

   protected dsh a(dsh $$0, dsh $$1) {
      return $$1;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      diu $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(this.c());
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      Optional<ja> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      Optional<ja> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dsh $$5 = $$0.a_($$4.get());
         ((diu)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ja> a(dbj $$0, ja $$1, dff $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dff b() {
      return this;
   }
}
