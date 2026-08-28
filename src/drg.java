import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class drg extends drf implements dnr {
   protected drg(ebp.d $$0, jc $$1, fgw $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends drg> a();

   protected ebq a(ebq $$0, ebq $$1) {
      return $$1;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      drh $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(this.c());
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      Optional<iw> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      Optional<iw> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         ebq $$5 = $$0.a_($$4.get());
         ((drh)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iw> a(djn $$0, iw $$1, dno $$2) {
      return m.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dno b() {
      return this;
   }
}
