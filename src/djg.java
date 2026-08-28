import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djg extends diy {
   public static final MapCodec<djg> e = b(djg::new);

   @Override
   public MapCodec<? extends djg> a() {
      return e;
   }

   public djg(dsk.d $$0) {
      super($$0);
   }

   public static dsl b() {
      return dfk.G.o();
   }

   @Override
   public void a(dcg $$0, cml $$1, ja $$2, dsl $$3, @Nullable dpq $$4, cud $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!czo.a($$5, avz.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsl $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.a(dcp.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsl $$0, dcg $$1, ja $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
