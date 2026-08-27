import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daf extends cvi implements ctf, dab {
   public static final MapCodec<daf> c = b(daf::new);
   private static final dfu g = dft.C;
   public static final dfx d = dft.R;
   protected static final float e = 6.0F;
   protected static final eia f = ctc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<daf> a() {
      return c;
   }

   public daf(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dfz.b).a(g, Boolean.valueOf(false)).a(d, ha.c));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return f;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(apv.bw) || $$1.b_($$2.c()).a(eah.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if (!$$0.w_()) {
         gw $$5 = $$1.c();
         dfd $$6 = cvi.c($$0, $$5, this.o().a(b, dfz.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(g) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      if ($$0.c(b) == dfz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gw $$3 = $$2.d();
         dfd $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      if ($$3.c(cvi.b) == dfz.b) {
         gw $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         csz.a($$0, $$1, $$2, $$3.c(d));
      } else {
         gw $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float ar_() {
      return 0.1F;
   }
}
