import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dug extends dto implements dsb {
   public static final MapCodec<dug> a = b(dug::new);
   public static final dzd c = dzc.I;

   @Override
   protected MapCodec<? extends dug> a() {
      return a;
   }

   protected dug(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(euu.c)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }
}
