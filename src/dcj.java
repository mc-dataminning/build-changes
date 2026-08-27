import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcj extends cxn implements cvi, dcf {
   public static final MapCodec<dcj> c = b(dcj::new);
   private static final die g = did.C;
   public static final dih d = did.R;
   protected static final float e = 6.0F;
   protected static final eks f = cvf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dcj> a() {
      return c;
   }

   public dcj(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dij.b).a(g, Boolean.valueOf(false)).a(d, ib.c));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return f;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(ark.bw) || $$1.b_($$2.c()).a(ecy.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if (!$$0.y_()) {
         hx $$5 = $$1.c();
         dhn $$6 = cxn.c($$0, $$5, this.o().a(b, dij.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(g) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      if ($$0.c(b) == dij.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hx $$3 = $$2.d();
         dhn $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      if ($$3.c(cxn.b) == dij.b) {
         hx $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cvc.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hx $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float aw_() {
      return 0.1F;
   }
}
