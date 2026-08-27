import com.mojang.serialization.MapCodec;

public class ddj extends cwy {
   public static final MapCodec<ddj> h = b(ddj::new);
   public static final dkn<ic.a> i = dkf.I;

   @Override
   public MapCodec<? extends ddj> a() {
      return h;
   }

   public ddj(djo.d $$0) {
      super($$0);
      this.k(this.o().a(i, ic.a.b));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return b($$0, $$1);
   }

   public static djp b(djp $$0, ddk $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ic.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ic.a.c);
               case c:
                  return $$0.a(i, ic.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(i);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
