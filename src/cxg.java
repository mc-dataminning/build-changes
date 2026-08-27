import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxg extends ctc implements dab {
   public static final MapCodec<cxg> a = b(cxg::new);
   public static final dfx b = cww.aE;
   public static final dfu c = dft.C;
   protected static final float d = 3.0F;
   protected static final eia e = ctc.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eia f = ctc.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eia g = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eia h = ctc.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<cxg> a() {
      return a;
   }

   protected cxg(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cph $$0, gw $$1, ha $$2) {
      dfd $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cte.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      if (!$$0.c()) {
         dfd $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dfd $$2 = this.o();
      cqe $$3 = $$0.q();
      gw $$4 = $$0.a();
      eag $$5 = $$0.q().b_($$0.a());

      for (ha $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eah.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }
}
