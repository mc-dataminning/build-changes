import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djg extends dfa implements dmb {
   public static final MapCodec<djg> a = b(djg::new);
   public static final dsx b = diw.aE;
   public static final dsu c = dst.C;
   protected static final float d = 3.0F;
   protected static final ewl e = dfa.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewl f = dfa.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewl g = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewl h = dfa.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   protected djg(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      switch ((je)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dbf $$0, iz $$1, je $$2) {
      dsd $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      je $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfc.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      if (!$$0.c()) {
         dsd $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsd $$2 = this.o();
      dcc $$3 = $$0.q();
      iz $$4 = $$0.a();
      enw $$5 = $$0.q().b_($$0.a());

      for (je $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == enx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }
}
