import com.mojang.serialization.MapCodec;

public class dbq extends cvf {
   public static final MapCodec<dbq> h = b(dbq::new);
   public static final dil<ib.a> i = did.I;

   @Override
   public MapCodec<? extends dbq> a() {
      return h;
   }

   public dbq(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(i, ib.a.b));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return b($$0, $$1);
   }

   public static dhn b(dhn $$0, dbr $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ib.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ib.a.c);
               case c:
                  return $$0.a(i, ib.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(i);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
