import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djq extends dpc implements dpr {
   public static final MapCodec<djq> a = b(djq::new);
   public static final dwm b = dwl.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fas e = diq.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fas f = diq.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fas g = diq.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      switch ((jm.a)$$0.c(i)) {
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
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erw.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(b) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
