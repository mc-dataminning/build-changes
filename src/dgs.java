import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dgs extends dgr implements ddh {
   protected dgs(dqg.d $$0, is $$1, eui $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dgs> a();

   protected dqh a(dqh $$0, dqh $$1) {
      return $$1;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dgt $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(this.c());
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      Optional<in> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      Optional<in> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dqh $$5 = $$0.a_($$4.get());
         ((dgt)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<in> a(czj $$0, in $$1, dde $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().q()) ? false : $$2;
   }

   @Override
   protected dde b() {
      return this;
   }
}
