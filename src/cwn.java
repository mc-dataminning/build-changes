import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwn extends cvv {
   public static final MapCodec<cwn> a = b(cwn::new);
   public static final djr[] b = new djr[]{djq.k, djq.l, djq.m};
   protected static final emf c = emc.a(cwj.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cwj.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   public cwn(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? null : a($$2, dgq.l, dgr::a);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         dgo $$6 = $$1.c_($$2);
         if ($$6 instanceof dgr) {
            $$3.a((dgr)$$6);
            $$3.a(arw.aa);
         }

         return bjv.b;
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dgr) {
            ((dgr)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.a($$1.c_($$2));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
