import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends diq implements dpr {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final dwm b = dwl.j;
   public static final dwm c = dwl.C;
   protected static final fas d = fap.a(diq.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), diq.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fas e = fap.a(diq.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), diq.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dvv $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dfp)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == erw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return diq.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dvv $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
