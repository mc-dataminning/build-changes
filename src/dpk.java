import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dpk extends dpj implements dlx {
   protected dpk(dzn.d $$0, ja $$1, feq $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dpk> a();

   protected dzo a(dzo $$0, dzo $$1) {
      return $$1;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dpl $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, evw.c, evw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(this.c());
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      Optional<iu> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      Optional<iu> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dzo $$5 = $$0.a_($$4.get());
         ((dpl)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iu> a(dhv $$0, iu $$1, dlu $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dzo $$0, dcl $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dlu b() {
      return this;
   }
}
