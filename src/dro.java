import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends dmm implements dtx {
   public static final MapCodec<dro> a = b(dro::new);
   public static final ebf b = ebe.I;

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   protected dro(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(eao $$0, eao $$1, jb $$2) {
      return $$1.a(dmo.ag) && $$2.o() == jb.a.b;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eww.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}
