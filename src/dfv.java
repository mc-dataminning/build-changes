import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dfv extends dfu implements dck {
   protected dfv(dph.d $$0, ij $$1, etc $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dfv> a();

   protected dpi a(dpi $$0, dpi $$1) {
      return $$1;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dfw $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(this.c());
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      Optional<id> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      Optional<id> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dpi $$5 = $$0.a_($$4.get());
         ((dfw)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<id> a(cym $$0, id $$1, dch $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().p()) ? false : $$2;
   }

   @Override
   protected dch b() {
      return this;
   }
}
