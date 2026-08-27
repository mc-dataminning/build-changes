import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daf extends cvz implements dcz {
   public static final MapCodec<daf> a = b(daf::new);
   public static final djg b = djf.j;
   public static final djg c = djf.C;
   protected static final elu d = elr.a(cvz.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cvz.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final elu e = elr.a(cvz.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cvz.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public daf(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());

      for (ia $$2 : $$0.f()) {
         if ($$2.o() == ia.a.b) {
            dip $$3 = this.o().a(b, Boolean.valueOf($$2 == ia.b));
            if ($$3.a((ctb)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eea.c));
            }
         }
      }

      return null;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = h($$0).g();
      return cvz.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ia h(dip $$0) {
      return $$0.c(b) ? ia.a : ia.b;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
