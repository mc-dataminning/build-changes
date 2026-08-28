import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dls extends dpt implements dlx, dtb {
   public static final MapCodec<dls> a = b(dls::new);
   private static final eaf b = eae.I;
   private static final Map<ja, feq> c = fen.c(dlu.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   protected dls(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, ja.c));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzo $$4 = $$1.a_($$3);
      dzo $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axa.bA)) && ($$5.a(this) || $$5.a(dlw.tj));
   }

   protected static boolean a(diq $$0, iu $$1, evv $$2, ja $$3) {
      dzo $$4 = dlw.tk.m().b(b, Boolean.valueOf($$2.a(evw.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (($$4 == ja.a || $$4 == ja.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      Optional<iu> $$3 = l.a($$0, $$1, $$2.b(), ja.b, dlw.tj);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get().d();
         dzo $$5 = $$0.a_($$4);
         return dlr.a((dir)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      Optional<iu> $$4 = l.a($$0, $$2, $$3.b(), ja.b, dlw.tj);
      if (!$$4.isEmpty()) {
         iu $$5 = $$4.get();
         iu $$6 = $$5.d();
         ja $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dlr.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(dlw.tj);
   }
}
