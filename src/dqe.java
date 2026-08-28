import com.mojang.serialization.MapCodec;

public class dqe extends djn {
   public static final MapCodec<dqe> h = b(dqe::new);
   public static final dxv<jn.a> i = dxo.L;

   @Override
   public MapCodec<? extends dqe> a() {
      return h;
   }

   public dqe(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(i, jn.a.b));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return b($$0, $$1);
   }

   public static dwy b(dwy $$0, dqf $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jn.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jn.a.c);
               case c:
                  return $$0.b(i, jn.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(i);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
