import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxh extends ctc implements dab {
   public static final MapCodec<cxh> a = b(cxh::new);
   public static final dfu b = dft.j;
   public static final dfu c = dft.C;
   protected static final eia d = ehx.a(ctc.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), ctc.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eia e = ehx.a(ctc.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), ctc.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<cxh> a() {
      return a;
   }

   public cxh(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());

      for (ha $$2 : $$0.f()) {
         if ($$2.o() == ha.a.b) {
            dfd $$3 = this.o().a(b, Boolean.valueOf($$2 == ha.b));
            if ($$3.a((cqe)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eah.c));
            }
         }
      }

      return null;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = h($$0).g();
      return ctc.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ha h(dfd $$0) {
      return $$0.c(b) ? ha.a : ha.b;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
