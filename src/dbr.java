import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbr extends cum {
   public static final MapCodec<dbr> a = b(dbr::new);
   public static final dhz b = dhy.E;
   private final bic c = bhz.a(5);

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? null : a($$2, dff.K, dgi::a);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
