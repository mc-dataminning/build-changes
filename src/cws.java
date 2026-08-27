import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cws extends ctc implements dab {
   public static final MapCodec<cws> a = b(cws::new);
   private static final dfu c = dft.C;
   protected static final eia b = ctc.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<cws> a() {
      return a;
   }

   protected cws(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = super.a($$0);
      if ($$1 != null) {
         eag $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eah.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfd $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ha.a);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
         return cte.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
