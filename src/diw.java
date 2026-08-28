import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class diw extends div implements dfl {
   protected diw(dsk.d $$0, jf $$1, exa $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends diw> a();

   protected dsl a(dsl $$0, dsl $$1) {
      return $$1;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dix $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eok.c, eok.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(this.c());
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      Optional<ja> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      Optional<ja> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dsl $$5 = $$0.a_($$4.get());
         ((dix)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ja> a(dbm $$0, ja $$1, dfi $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dfi b() {
      return this;
   }
}
