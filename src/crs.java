import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class crs extends cso {
   private final chz a;

   protected crs(chz $$0, dfc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends crs> a();

   @Override
   public boolean a(dfd $$0) {
      return true;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcp($$0, $$1, this.a);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      if ($$0.B) {
         $$0.a($$1, ddb.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, ddb.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      dcz $$3 = $$0.c_($$1);
      return $$3 instanceof dcp ? ((dcp)$$3).f() : super.a($$0, $$1, $$2);
   }

   public chz b() {
      return this.a;
   }
}
