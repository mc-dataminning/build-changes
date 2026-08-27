import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwz extends dck implements dcz {
   public static final MapCodec<cwz> a = b(cwz::new);
   public static final djg b = djf.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final elu e = cvz.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final elu f = cvz.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final elu g = cvz.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cwz> a() {
      return a;
   }

   public cwz(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ia.a.b));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eea.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(b) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
