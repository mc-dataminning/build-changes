import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends daa implements dha {
   public static final MapCodec<def> a = b(def::new);
   public static final dnt b = ddv.aE;
   public static final dnq c = dnp.C;
   protected static final float d = 3.0F;
   protected static final eqk e = daa.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eqk f = daa.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqk g = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eqk h = daa.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   protected def(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      switch ((ih)$$0.c(b)) {
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

   private boolean a(cwf $$0, ib $$1, ih $$2) {
      dmz $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dac.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eio.c, eio.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      if (!$$0.c()) {
         dmz $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dmz $$2 = this.o();
      cxc $$3 = $$0.q();
      ib $$4 = $$0.a();
      ein $$5 = $$0.q().b_($$0.a());

      for (ih $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eio.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }
}
