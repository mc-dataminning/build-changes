import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends dey implements dlz {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dsv b = diu.aE;
   public static final dss c = dsr.C;
   protected static final float d = 3.0F;
   protected static final ewj e = dey.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewj f = dey.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewj g = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewj h = dey.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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

   private boolean a(dbd $$0, iz $$1, je $$2) {
      dsb $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      je $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfa.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      if (!$$0.c()) {
         dsb $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsb $$2 = this.o();
      dca $$3 = $$0.q();
      iz $$4 = $$0.a();
      enu $$5 = $$0.q().b_($$0.a());

      for (je $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == env.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(c) ? env.c.a(false) : super.b_($$0);
   }
}
