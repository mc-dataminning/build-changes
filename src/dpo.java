import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpo extends dlu implements dtb {
   public static final MapCodec<dpo> a = b(dpo::new);
   private static final eaf b = eae.I;
   private static final feq c = dlu.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   protected dpo(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = super.a($$0);
      if ($$1 != null) {
         evv $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == evw.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.d();
      dzo $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, ja.a);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.b && !this.a($$0, $$1, $$3)) {
         return dlw.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, evw.c, evw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
