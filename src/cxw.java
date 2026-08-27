import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxw extends ctc implements dab {
   public static final MapCodec<cxw> a = b(cxw::new);
   public static final dfu b = dft.C;

   @Override
   public MapCodec<cxw> a() {
      return a;
   }

   protected cxw(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dfd $$0, dfd $$1, ha $$2) {
      return $$1.a(cte.ac) && $$2.o() == ha.a.b;
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eah.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(b) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }
}
