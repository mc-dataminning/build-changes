import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgt extends dby implements diy {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final dpq b = dpp.C;

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   protected dgt(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(doz $$0, doz $$1, ih $$2) {
      return $$1.a(dca.ac) && $$2.o() == ih.a.b;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ekt.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(b) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
