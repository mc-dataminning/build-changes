import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dam extends daf {
   public static final MapCodec<dam> e = b(dam::new);

   @Override
   public MapCodec<? extends dam> a() {
      return e;
   }

   public dam(djf.d $$0) {
      super($$0);
   }

   public static djg b() {
      return cwr.G.o();
   }

   @Override
   public void a(cto $$0, cfh $$1, hx $$2, djg $$3, @Nullable dgu $$4, cmx $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (crk.a(crm.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         djg $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.a(ctx.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(djg $$0, cto $$1, hx $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
