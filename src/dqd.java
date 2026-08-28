import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqd extends dlu implements dtb {
   public static final MapCodec<dqd> a = b(dqd::new);
   public static final eam<ja> b = dpt.e;
   public static final eaf c = eae.I;
   public static final Map<ja, feq> d = fen.c(dlu.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   protected dqd(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(dhv $$0, iu $$1, ja $$2) {
      dzo $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dlw.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, evw.c, evw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      if (!$$0.c()) {
         dzo $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dzo $$2 = this.m();
      dis $$3 = $$0.q();
      iu $$4 = $$0.a();
      evv $$5 = $$0.q().b_($$0.a());

      for (ja $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == evw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }
}
