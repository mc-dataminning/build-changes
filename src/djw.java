import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends djo {
   public static final MapCodec<djw> e = b(djw::new);

   @Override
   public MapCodec<? extends djw> a() {
      return e;
   }

   public djw(dtb.d $$0) {
      super($$0);
   }

   public static dtc b() {
      return dga.G.o();
   }

   @Override
   public void a(dcw $$0, cmx $$1, jd $$2, dtc $$3, @Nullable dqh $$4, cuq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dae.a($$5, awh.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dtc $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.a(ddf.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dtc $$0, dcw $$1, jd $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
