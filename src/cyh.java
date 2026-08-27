import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class cyh extends cyg implements cuw {
   protected cyh(dgv.d $$0, hx $$1, ekb $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends cyh> a();

   protected dgw a(dgw $$0, dgw $$1) {
      return $$1;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cyi $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(this.c());
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      Optional<ht> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      Optional<ht> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dgw $$5 = $$0.a_($$4.get());
         ((cyi)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ht> a(cqy $$0, ht $$1, cut $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cut b() {
      return this;
   }
}
