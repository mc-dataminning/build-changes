import com.mojang.serialization.MapCodec;

public class dck extends cvz {
   public static final MapCodec<dck> h = b(dck::new);
   public static final djn<ia.a> i = djf.I;

   @Override
   public MapCodec<? extends dck> a() {
      return h;
   }

   public dck(dio.d $$0) {
      super($$0);
      this.k(this.o().a(i, ia.a.b));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return b($$0, $$1);
   }

   public static dip b(dip $$0, dcl $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ia.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ia.a.c);
               case c:
                  return $$0.a(i, ia.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(i);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
