import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhe extends dci implements dad, dha {
   public static final MapCodec<dhe> c = b(dhe::new);
   private static final dnq g = dnp.C;
   public static final dnt d = dnp.R;
   protected static final float e = 6.0F;
   protected static final eqk f = daa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhe> a() {
      return c;
   }

   public dhe(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dnv.b).a(g, Boolean.valueOf(false)).a(d, ih.c));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return f;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(aun.bx) || $$1.b_($$2.c()).a(eio.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if (!$$0.x_()) {
         ib $$5 = $$1.c();
         dmz $$6 = dci.c($$0, $$5, this.o().a(b, dnv.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(g) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      if ($$0.c(b) == dnv.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ib $$3 = $$2.d();
         dmz $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return true;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      if ($$3.c(dci.b) == dnv.b) {
         ib $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         czx.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ib $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float aw_() {
      return 0.1F;
   }
}
