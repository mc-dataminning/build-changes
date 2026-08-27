import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dgi implements ded, dlb {
   public static final MapCodec<dlf> c = b(dlf::new);
   private static final dru g = drt.C;
   public static final drx d = drt.R;
   protected static final float e = 6.0F;
   protected static final evf f = dea.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlf> a() {
      return c;
   }

   public dlf(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drz.b).a(g, Boolean.valueOf(false)).a(d, it.c));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return f;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(avx.bx) || $$1.b_($$2.c()).a(emx.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
      if (!$$0.x_()) {
         io $$5 = $$1.c();
         drd $$6 = dgi.c($$0, $$5, this.n().a(b, drz.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(g) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      if ($$0.c(b) == drz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         io $$3 = $$2.d();
         drd $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      if ($$3.c(dgi.b) == drz.b) {
         io $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         ddx.a($$0, $$1, $$2, $$3.c(d));
      } else {
         io $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
