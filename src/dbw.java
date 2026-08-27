import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbw extends cur {
   public static final MapCodec<dbw> a = b(dbw::new);
   public static final die b = did.E;
   private final big c = bid.a(5);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbw(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? null : a($$2, dfk.K, dgn::a);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
