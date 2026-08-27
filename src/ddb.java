import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddb extends cvf {
   public static final MapCodec<ddb> a = b(ddb::new);
   private static final uv d = uv.c("container.stonecutter");
   public static final dih b = cza.aE;
   protected static final eks c = cvf.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ddb(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c));
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arf.ay);
         return bjb.b;
      }
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return new bjk(($$2x, $$3, $$4) -> new ciq($$2x, $$3, chc.a($$1, $$2)), d);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
