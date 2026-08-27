import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddd extends cyh implements cwc, dcz {
   public static final MapCodec<ddd> c = b(ddd::new);
   private static final djg g = djf.C;
   public static final djj d = djf.R;
   protected static final float e = 6.0F;
   protected static final elu f = cvz.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddd> a() {
      return c;
   }

   public ddd(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djl.b).a(g, Boolean.valueOf(false)).a(d, ia.c));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return f;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(arr.bw) || $$1.b_($$2.c()).a(eea.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if (!$$0.y_()) {
         hv $$5 = $$1.c();
         dip $$6 = cyh.c($$0, $$5, this.o().a(b, djl.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(g) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      if ($$0.c(b) == djl.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hv $$3 = $$2.d();
         dip $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      if ($$3.c(cyh.b) == djl.b) {
         hv $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cvw.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hv $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float av_() {
      return 0.1F;
   }
}
