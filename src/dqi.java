import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends dpz {
   public static final MapCodec<dqi> e = b(dqi::new);

   @Override
   public MapCodec<? extends dqi> a() {
      return e;
   }

   public dqi(eag.d $$0) {
      super($$0);
   }

   public static eah b() {
      return dmh.J.m();
   }

   @Override
   public void a(dja $$0, crc $$1, iu $$2, eah $$3, @Nullable dxf $$4, czd $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dfs.a($$5, axe.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         eah $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.a(djj.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eah $$0, dja $$1, iu $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
