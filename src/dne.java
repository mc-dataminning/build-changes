import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends dmm implements dlb {
   public static final MapCodec<dne> a = b(dne::new);
   public static final dru c = drt.C;

   @Override
   protected MapCodec<? extends dne> a() {
      return a;
   }

   protected dne(drc.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(emx.c)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }
}
