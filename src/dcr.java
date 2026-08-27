import com.mojang.serialization.MapCodec;

public abstract class dcr extends ddm {
   private final csj a;

   protected dcr(csj $$0, drc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dcr> a();

   @Override
   public boolean a(drd $$0) {
      return true;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dnx($$0, $$1, this.a);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return $$0.c_($$1) instanceof dnx $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public csj b() {
      return this.a;
   }
}
