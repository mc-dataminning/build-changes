import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czq extends cvz implements dcz {
   public static final MapCodec<czq> a = b(czq::new);
   private static final djg c = djf.C;
   protected static final elu b = cvz.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<czq> a() {
      return a;
   }

   protected czq(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = super.a($$0);
      if ($$1 != null) {
         edz $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eea.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.c();
      dip $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ia.a);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.b && !this.a($$0, $$3, $$4)) {
         return cwb.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
