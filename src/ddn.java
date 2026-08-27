import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddn extends cyr implements cwm, ddj {
   public static final MapCodec<ddn> c = b(ddn::new);
   private static final djr g = djq.C;
   public static final dju d = djq.R;
   protected static final float e = 6.0F;
   protected static final emf f = cwj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddn> a() {
      return c;
   }

   public ddn(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djw.b).a(g, Boolean.valueOf(false)).a(d, ic.c));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return f;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(asb.bw) || $$1.b_($$2.c()).a(eel.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if (!$$0.y_()) {
         hx $$5 = $$1.c();
         dja $$6 = cyr.c($$0, $$5, this.o().a(b, djw.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(g) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      if ($$0.c(b) == djw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hx $$3 = $$2.d();
         dja $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return true;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      if ($$3.c(cyr.b) == djw.b) {
         hx $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cwg.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hx $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float av_() {
      return 0.1F;
   }
}
