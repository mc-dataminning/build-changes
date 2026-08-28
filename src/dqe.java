import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqe extends dlu implements dtb {
   public static final MapCodec<dqe> a = b(dqe::new);
   public static final eaf b = eae.m;
   public static final eaf c = eae.I;
   private static final feq d = fen.a(dlu.b(4.0, 7.0, 9.0), dlu.b(6.0, 0.0, 7.0));
   private static final feq e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   public dqe(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());

      for (ja $$2 : $$0.f()) {
         if ($$2.o() == ja.a.b) {
            dzo $$3 = this.m().b(b, Boolean.valueOf($$2 == ja.b));
            if ($$3.a((dis)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == evw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = o($$0).g();
      return dlu.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ja o(dzo $$0) {
      return $$0.c(b) ? ja.a : ja.b;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
