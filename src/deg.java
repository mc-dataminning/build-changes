import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends daa implements dha {
   public static final MapCodec<deg> a = b(deg::new);
   public static final dnq b = dnp.j;
   public static final dnq c = dnp.C;
   protected static final eqk d = eqh.a(daa.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), daa.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eqk e = eqh.a(daa.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), daa.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());

      for (ih $$2 : $$0.f()) {
         if ($$2.o() == ih.a.b) {
            dmz $$3 = this.o().a(b, Boolean.valueOf($$2 == ih.b));
            if ($$3.a((cxc)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eio.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ih $$3 = m($$0).g();
      return daa.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ih m(dmz $$0) {
      return $$0.c(b) ? ih.a : ih.b;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
