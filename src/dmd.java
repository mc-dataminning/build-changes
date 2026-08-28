import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dmd extends dmc implements dit {
   protected dmd(dvu.d $$0, jm $$1, fas $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dmd> a();

   protected dvv a(dvv $$0, dvv $$1) {
      return $$1;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dme $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, erw.c, erw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(this.c());
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      Optional<jh> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      Optional<jh> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dvv $$5 = $$0.a_($$4.get());
         ((dme)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jh> a(der $$0, jh $$1, diq $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected diq b() {
      return this;
   }
}
