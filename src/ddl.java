import com.mojang.serialization.MapCodec;

public abstract class ddl extends deg {
   private final ctd a;

   protected ddl(ctd $$0, drw.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddl> a();

   @Override
   public boolean a(drx $$0) {
      return true;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dor($$0, $$1, this.a);
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return $$0.c_($$1) instanceof dor $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public ctd b() {
      return this.a;
   }
}
