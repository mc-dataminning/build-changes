import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dge extends dby implements diy {
   public static final MapCodec<dge> a = b(dge::new);
   public static final dpq b = dpp.j;
   public static final dpq c = dpp.C;
   protected static final est d = esq.a(dby.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dby.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final est e = esq.a(dby.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dby.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());

      for (ih $$2 : $$0.f()) {
         if ($$2.o() == ih.a.b) {
            doz $$3 = this.n().a(b, Boolean.valueOf($$2 == ih.b));
            if ($$3.a((cza)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ekt.c));
            }
         }
      }

      return null;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ih $$3 = m($$0).g();
      return dby.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ih m(doz $$0) {
      return $$0.c(b) ? ih.a : ih.b;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
