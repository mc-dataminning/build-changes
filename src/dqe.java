import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dqe extends dqd implements dmp {
   protected dqe(ean.d $$0, jb $$1, ffr $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dqe> a();

   protected eao a(eao $$0, eao $$1) {
      return $$1;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dqf $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(this.c());
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      Optional<iv> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      Optional<iv> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         eao $$5 = $$0.a_($$4.get());
         ((dqf)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iv> a(din $$0, iv $$1, dmm $$2) {
      return m.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dmm b() {
      return this;
   }
}
