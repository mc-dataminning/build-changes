import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dnu implements dmj {
   public static final MapCodec<dom> a = b(dom::new);
   public static final dtc c = dtb.C;

   @Override
   protected MapCodec<? extends dom> a() {
      return a;
   }

   protected dom(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eok.c)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }
}
