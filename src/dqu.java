import com.mojang.serialization.MapCodec;

public class dqu extends dkd {
   public static final MapCodec<dqu> h = b(dqu::new);
   public static final dyl<jm.a> i = dye.L;

   @Override
   public MapCodec<? extends dqu> a() {
      return h;
   }

   public dqu(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return b($$0, $$1);
   }

   public static dxo b(dxo $$0, dqv $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jm.a.c);
               case c:
                  return $$0.b(i, jm.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(i);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
