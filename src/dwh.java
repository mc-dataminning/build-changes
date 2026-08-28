import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwh extends dvn implements dtx {
   public static final MapCodec<dwh> a = b(dwh::new);
   public static final ebf c = ebe.I;

   @Override
   protected MapCodec<? extends dwh> a() {
      return a;
   }

   protected dwh(ean.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(eww.c)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }
}
