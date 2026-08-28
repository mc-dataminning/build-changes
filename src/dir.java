import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends dfa implements dmb {
   public static final MapCodec<dir> a = b(dir::new);
   private static final dsu c = dst.C;
   protected static final ewl b = dfa.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   protected dir(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = super.a($$0);
      if ($$1 != null) {
         enw $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == enx.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsd $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, je.a);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !this.a($$0, $$3, $$4)) {
         return dfc.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
